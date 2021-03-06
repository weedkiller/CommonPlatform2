﻿
/***************************************************************************
*       功能：     HREmployeeInfo业务处理层
*       作者：     ROY
*       日期：     2016-01-09
*       描述：     通过FSate字段进行过滤是还是历史记录
  人员基础信息，如需要增加多字段请使用扩展表
* *************************************************************************/
using System;
using System.Linq;
using NHibernate.Linq;
using System.Collections.Generic;
using System.Web.UI;
using System.Web.UI.WebControls;
using Project.Infrastructure.FrameworkCore.DataNhibernate.Helpers;
using Project.Model.HRManager;
using Project.Repository.HRManager;
using Project.Service.HRManager.Validate;
using Project.Infrastructure.FrameworkCore.DataNhibernate;
using AutoMapper;

namespace Project.Service.HRManager
{
    public class EmployeeInfoService
    {

        #region 构造函数
        private readonly EmployeeInfoRepository _employeeInfoRepository;
        private readonly WorkExperienceRepository _workExperienceRepository;
        private readonly LearningExperiencesRepository _learnExperienceRepository;
        private readonly ContinEducationRepository _continEducationRepository;
        private readonly TechnicalRepository _technicalRepository;
        private readonly ProfessionRepository _professionRepository;
        private readonly YearAssessmentRepository _yearAssessmentRepository;
        private readonly YGWageRepository _ygWageRepository;
        private readonly EmployeeInfoHisRepository _employeeInfoHisRepository;

        private static readonly EmployeeInfoService Instance = new EmployeeInfoService();

        public EmployeeInfoService()
        {
            this._employeeInfoRepository = new EmployeeInfoRepository();

            this._workExperienceRepository = new WorkExperienceRepository();
            this._learnExperienceRepository = new LearningExperiencesRepository();
            this._continEducationRepository = new ContinEducationRepository();
            this._technicalRepository = new TechnicalRepository();
            this._professionRepository = new ProfessionRepository();
            this._yearAssessmentRepository=new YearAssessmentRepository();
            this._employeeInfoHisRepository = new EmployeeInfoHisRepository();
            this._ygWageRepository=new YGWageRepository();
        }

        public static EmployeeInfoService GetInstance()
        {
            return Instance;
        }
        #endregion


        #region 基础方法
        /// <summary>
        /// 新增
        /// </summary>
        /// <param name="entity"></param>
        /// <returns></returns>
        public Tuple<bool, string> Add(EmployeeInfoEntity entity)
        {
            var validateResult = EmployeeInfoValidate.GetInstance().IsHasSameEmployeeCode(entity.EmployeeCode);
            if (!validateResult.Item1)
            {
                return validateResult;
            }
            //二代证验证
            var certnoValidateResult = EmployeeInfoValidate.GetInstance().IsHasSameCertNo(entity.CertNo);

            if (!certnoValidateResult.Item1)
            {
                return certnoValidateResult;
            }

            using (var tx = NhTransactionHelper.BeginTransaction())
            {
                try
                {
                    var pkId = _employeeInfoRepository.Save(entity);

                    var employeeHisEntity = Mapper.Map<EmployeeInfoEntity, EmployeeInfoHisEntity>(entity);
                    employeeHisEntity.EmployeeID = employeeHisEntity.PkId;
                    employeeHisEntity.PkId = 0;
                    employeeHisEntity.InDepartmentCode = entity.DepartmentCode;
                    employeeHisEntity.InDepartmentName = entity.DepartmentName;
                    employeeHisEntity.InWorkState = entity.WorkState;
                    employeeHisEntity.InWorkStateName = entity.WorkStateName;
                    employeeHisEntity.IsInsert = 1;
                    employeeHisEntity.CreateTime = DateTime.Now;
                    employeeHisEntity.CreatorUserName= entity.CreatorUserName;
                    
                    _employeeInfoHisRepository.Save(employeeHisEntity);

                    entity.WorkList.ToList().ForEach(p =>
                    {
                        p.EmployeeID = pkId;
                    });
                    entity.LearningList.ToList().ForEach(p =>
                    {
                        p.EmployeeID = pkId;
                    });
                    entity.ContinEducationList.ToList().ForEach(p =>
                    {
                        p.EmployeeID = pkId;
                    });
                    entity.TechnicalList.ToList().ForEach(p =>
                    {
                        p.EmployeeID = pkId;
                        p.EmployeeCode = entity.EmployeeCode;
                        p.DepartmentCode = entity.DepartmentCode;
                    });
                    entity.ProfessionList.ToList().ForEach(p =>
                    {
                        p.EmployeeID = pkId;
                        p.EmployeeCode = entity.EmployeeCode;
                        p.DepartmentCode = entity.DepartmentCode;
                    });
                    entity.YearAssessmentList.ToList().ForEach(p =>
                    {
                        p.EmployeeID = pkId;
                    });
                    entity.YearAssessmentList.ToList().ForEach(p =>
                    {
                        p.EmployeeID = pkId;
                    });
                    entity.EmployeeFileList.ToList().ForEach(p =>
                    {
                        p.EmployeeID = pkId;
                    });
                    entity.WageList.ToList().ForEach(p =>
                    {
                        p.EmployeeID = pkId;
                    });
                    tx.Commit();
                    return new Tuple<bool, string>(true, ""); ;
                }
                catch (Exception e)
                {
                    tx.Rollback();
                    throw;
                }
            }
            //var addResult = _employeeInfoRepository.Save(entity);



            //if (addResult > 0)
            //{

            //}
            //else
            //{
            //    return new Tuple<bool, string>(false, "");
            //}
        }


        /// <summary>
        /// 删除
        /// </summary>
        /// <param name="pkId"></param>
        public bool DeleteByPkId(System.Int32 pkId)
        {
            try
            {
                var entity = _employeeInfoRepository.GetById(pkId);
                _employeeInfoRepository.Delete(entity);
                return true;
            }
            catch
            {
                return false;
            }
        }

        /// <summary>
        /// 删除
        /// </summary>
        /// <param name="entity"></param>
        public bool Delete(EmployeeInfoEntity entity)
        {
            try
            {
                //需要记录数据？
                _employeeInfoRepository.Delete(entity);
                return true;
            }
            catch
            {
                return false;
            }
        }

        /// <summary>
        /// 更新
        /// </summary>
        /// <param name="entity"></param>
        public Tuple<bool, string> Update(EmployeeInfoEntity entity)
        {
            var validateResult = EmployeeInfoValidate.GetInstance().IsHasSameEmployeeCode(entity.EmployeeCode, entity.PkId);
            if (!validateResult.Item1)
            {
                return validateResult;
            }
            //二代证验证
            var certnoValidateResult = EmployeeInfoValidate.GetInstance().IsHasSameCertNo(entity.CertNo, entity.PkId);
            if (!certnoValidateResult.Item1)
            {
                return certnoValidateResult;
            }

            var oldEntity = EmployeeInfoService.GetInstance().GetModelByPk(entity.PkId);
            var date = DateTime.Now;
            entity.WorkList.ToList().ForEach(item => item.EmployeeID = entity.PkId);
            entity.LearningList.ToList().ForEach(item => item.EmployeeID = entity.PkId);
            entity.TechnicalList.ToList().ForEach(item => item.EmployeeID = entity.PkId);
            entity.ContinEducationList.ToList().ForEach(item => item.EmployeeID = entity.PkId);
            entity.ProfessionList.ToList().ForEach(item => item.EmployeeID = entity.PkId);
            entity.YearAssessmentList.ToList().ForEach(item => item.EmployeeID = entity.PkId);
            entity.EmployeeFileList.ToList().ForEach(item => item.EmployeeID = entity.PkId);
            entity.WageList.ToList().ForEach(item => { item.EmployeeID = entity.PkId;  item.CreationTime=DateTime.Now; });
            var deleteList = oldEntity.WorkList.Where(
                    p => entity.WorkList.All(x => x.PkId != p.PkId)).ToList();
            var deleteLearningList = oldEntity.LearningList.Where(
                              p => entity.LearningList.All(x => x.PkId != p.PkId)).ToList();
            var deleteContinEducationList = oldEntity.ContinEducationList.Where(
                           p => entity.ContinEducationList.All(x => x.PkId != p.PkId)).ToList();

            var deleteTechnicalList = oldEntity.TechnicalList.Where(
                              p => entity.TechnicalList.All(x => x.PkId != p.PkId)).ToList();

            var deleteProfessionList = oldEntity.ProfessionList.Where(
                              p => entity.ProfessionList.All(x => x.PkId != p.PkId)).ToList();


            var deleteYearAssessmentList = oldEntity.YearAssessmentList.Where(
                              p => entity.YearAssessmentList.All(x => x.PkId != p.PkId)).ToList();
            var deleteWageList = oldEntity.WageList.Where(
                            p => entity.WageList.All(x => x.PkId != p.PkId)).ToList();

            using (var tx = NhTransactionHelper.BeginTransaction())
            {
                try
                {
                    //记录条件 哪些条件需要记录
                    //部门变动、类型变动、工作状态变动、单位职务、新增【岗位性质】、【岗位等级】、【手机号】、【家庭地址】 字段等需要加入
                    if (oldEntity.DepartmentCode != entity.DepartmentCode || oldEntity.EmployeeType != entity.EmployeeType || oldEntity.WorkState != entity.WorkState || oldEntity.Duties != entity.Duties
                        || oldEntity.MobileNO != entity.MobileNO|| oldEntity.HomeAddress != entity.HomeAddress||oldEntity.PostLevel!=entity.PostLevel|| oldEntity.PostProperty != entity.PostProperty)
                    {
                        var employeeHisEntity = Mapper.Map<EmployeeInfoEntity, EmployeeInfoHisEntity>(oldEntity);
                        employeeHisEntity.EmployeeID = employeeHisEntity.PkId;
                        employeeHisEntity.PkId = 0;
                        employeeHisEntity.InDepartmentCode = entity.DepartmentCode;
                        employeeHisEntity.InDepartmentName = entity.DepartmentName;
                        employeeHisEntity.InWorkState = entity.WorkState;
                        employeeHisEntity.InWorkStateName = entity.WorkStateName;
                        employeeHisEntity.CreateTime = DateTime.Now;
                        employeeHisEntity.CreatorUserName = entity.LastModifierUserName;
                        _employeeInfoHisRepository.Save(employeeHisEntity);
                    }
                    var mergInfo = Mapper.Map(entity, oldEntity);
                    _employeeInfoRepository.Merge(mergInfo);

                    deleteList.ForEach(p => { _workExperienceRepository.Delete(p); });
                    deleteLearningList.ForEach(p => { _learnExperienceRepository.Delete(p); });
                    deleteTechnicalList.ForEach(p => { _technicalRepository.Delete(p); });
                    deleteContinEducationList.ForEach(p => { _continEducationRepository.Delete(p); });
                    deleteProfessionList.ForEach(p => { _professionRepository.Delete(p); });
                    deleteYearAssessmentList.ForEach(p => { _yearAssessmentRepository.Delete(p); });
                    deleteWageList.ForEach(p => { _ygWageRepository.Delete(p); });
                    tx.Commit();
                    return new Tuple<bool, string>(true, "");
                }
                catch
                {
                    tx.Rollback();
                    throw;
                }
            }




        }


        /// <summary>
        /// 通过主键获取实体
        /// </summary>
        /// <param name="pkId">主键</param>
        /// <returns></returns>
        public EmployeeInfoEntity GetModelByPk(System.Int32 pkId)
        {
            return _employeeInfoRepository.GetById(pkId);
        }


        /// <summary>
        /// 分页
        /// </summary>
        /// <param name="entity">条件实体</param>
        /// <param name="skipResults">开始</param>
        /// <param name="maxResults">结束</param>
        /// <returns>获取当前页【通过FSate字段进行过滤是还是历史记录
        ///人员基础信息，如需要增加多字段请使用扩展表】和总【通过FSate字段进行过滤是还是历史记录
        ///人员基础信息，如需要增加多字段请使用扩展表】数</returns>
        public System.Tuple<IList<EmployeeInfoEntity>, int> Search(EmployeeInfoEntity where, int skipResults, int maxResults)
        {
            var expr = PredicateBuilder.True<EmployeeInfoEntity>();
            #region
            //if (where.SexEntity == null)
            //{
            //    expr = expr.And(p => p.SexEntity.ParentKeyCode == "ZZTZ");

            //}
            if (!string.IsNullOrEmpty(where.EmployeeCode))
                expr = expr.And(p => p.EmployeeCode.Contains(where.EmployeeCode));
            if (!string.IsNullOrEmpty(where.EmployeeName))
                expr = expr.And(p => p.EmployeeName.Contains(where.EmployeeName));
            if (!string.IsNullOrEmpty(where.DepartmentCode))
                expr = expr.And(p => where.DepartmentCode.Split(',').Contains(p.DepartmentCode));
            //if (!string.IsNullOrEmpty(where.DepartmentCode))
            //    expr = expr.And(p => p.DepartmentCode == where.DepartmentCode);
            if (!string.IsNullOrEmpty(where.JobName))
                expr = expr.And(p => p.JobName.Contains(where.JobName));
            // if (!string.IsNullOrEmpty(where.PayCode))
            //  expr = expr.And(p => p.PayCode == where.PayCode);
            // if (!string.IsNullOrEmpty(where.Sex))
            //  expr = expr.And(p => p.Sex == where.Sex);
            // if (!string.IsNullOrEmpty(where.CertNo))
            //  expr = expr.And(p => p.CertNo == where.CertNo);
            // if (!string.IsNullOrEmpty(where.Birthday))
            //  expr = expr.And(p => p.Birthday == where.Birthday);
            // if (!string.IsNullOrEmpty(where.TechnicalTitle))
            //  expr = expr.And(p => p.TechnicalTitle == where.TechnicalTitle);
            // if (!string.IsNullOrEmpty(where.Duties))
            //  expr = expr.And(p => p.Duties == where.Duties);
            if (!string.IsNullOrEmpty(where.WorkState))
                expr = expr.And(p => p.WorkState == where.WorkState);
            if (!string.IsNullOrEmpty(where.EmployeeType))
                expr = expr.And(p => p.EmployeeType == where.EmployeeType);
            // if (!string.IsNullOrEmpty(where.HomeAddress))
            //  expr = expr.And(p => p.HomeAddress == where.HomeAddress);
            // if (!string.IsNullOrEmpty(where.MobileNO))
            //  expr = expr.And(p => p.MobileNO == where.MobileNO);
            // if (!string.IsNullOrEmpty(where.ImageUrl))
            //  expr = expr.And(p => p.ImageUrl == where.ImageUrl);
            // if (!string.IsNullOrEmpty(where.Sort))
            //  expr = expr.And(p => p.Sort == where.Sort);
            // if (!string.IsNullOrEmpty(where.State))
            //  expr = expr.And(p => p.State == where.State);
            // if (!string.IsNullOrEmpty(where.Remark))
            //  expr = expr.And(p => p.Remark == where.Remark);
            // if (!string.IsNullOrEmpty(where.CreatorUserCode))
            //  expr = expr.And(p => p.CreatorUserCode == where.CreatorUserCode);
            // if (!string.IsNullOrEmpty(where.CreatorUserName))
            //  expr = expr.And(p => p.CreatorUserName == where.CreatorUserName);
            // if (!string.IsNullOrEmpty(where.CreateTime))
            //  expr = expr.And(p => p.CreateTime == where.CreateTime);
            // if (!string.IsNullOrEmpty(where.LastModificationTime))
            //  expr = expr.And(p => p.LastModificationTime == where.LastModificationTime);
            #endregion
            var list = _employeeInfoRepository.Query().Where(expr).OrderByDescending(p => p.Sort).OrderByDescending(p => p.EmployeeCode).Skip(skipResults).Take(maxResults).ToList();
            var count = _employeeInfoRepository.Query().Where(expr).Count();
            return new System.Tuple<IList<EmployeeInfoEntity>, int>(list, count);
        }

        /// <summary>
        /// 取列表
        /// </summary>
        /// <param name="entity">条件实体</param>
        /// <returns>返回列表</returns>
        public IList<EmployeeInfoEntity> GetList(EmployeeInfoEntity where, bool isShowTop = false)
        {
            var expr = PredicateBuilder.True<EmployeeInfoEntity>();
            #region
            // if (!string.IsNullOrEmpty(where.PkId))
            //  expr = expr.And(p => p.PkId == where.PkId);
            if (!string.IsNullOrEmpty(where.EmployeeCode))
                expr = expr.And(p => p.EmployeeCode == where.EmployeeCode);
            // if (!string.IsNullOrEmpty(where.EmployeeName))
            //  expr = expr.And(p => p.EmployeeName == where.EmployeeName);
            if (!string.IsNullOrEmpty(where.DepartmentCode))
            {
                expr = expr.And(p => where.DepartmentCode.Split(',').Contains(p.DepartmentCode));
            }
            // if (!string.IsNullOrEmpty(where.JobName))
            //  expr = expr.And(p => p.JobName == where.JobName);
            // if (!string.IsNullOrEmpty(where.PayCode))
            //  expr = expr.And(p => p.PayCode == where.PayCode);
            // if (!string.IsNullOrEmpty(where.Sex))
            //  expr = expr.And(p => p.Sex == where.Sex);
            if (!string.IsNullOrEmpty(where.CertNo))
                expr = expr.And(p => p.CertNo == where.CertNo);
            // if (!string.IsNullOrEmpty(where.Birthday))
            //  expr = expr.And(p => p.Birthday == where.Birthday);
            // if (!string.IsNullOrEmpty(where.TechnicalTitle))
            //  expr = expr.And(p => p.TechnicalTitle == where.TechnicalTitle);
            // if (!string.IsNullOrEmpty(where.Duties))
            //  expr = expr.And(p => p.Duties == where.Duties);
            // if (!string.IsNullOrEmpty(where.WorkState))
            //  expr = expr.And(p => p.WorkState == where.WorkState);
            // if (!string.IsNullOrEmpty(where.EmployeeType))
            //  expr = expr.And(p => p.EmployeeType == where.EmployeeType);
            // if (!string.IsNullOrEmpty(where.HomeAddress))
            //  expr = expr.And(p => p.HomeAddress == where.HomeAddress);
            // if (!string.IsNullOrEmpty(where.MobileNO))
            //  expr = expr.And(p => p.MobileNO == where.MobileNO);
            // if (!string.IsNullOrEmpty(where.ImageUrl))
            //  expr = expr.And(p => p.ImageUrl == where.ImageUrl);
            // if (!string.IsNullOrEmpty(where.Sort))
            //  expr = expr.And(p => p.Sort == where.Sort);
            // if (!string.IsNullOrEmpty(where.State))
            //  expr = expr.And(p => p.State == where.State);
            // if (!string.IsNullOrEmpty(where.Remark))
            //  expr = expr.And(p => p.Remark == where.Remark);
            // if (!string.IsNullOrEmpty(where.CreatorUserCode))
            //  expr = expr.And(p => p.CreatorUserCode == where.CreatorUserCode);
            // if (!string.IsNullOrEmpty(where.CreatorUserName))
            //  expr = expr.And(p => p.CreatorUserName == where.CreatorUserName);
            // if (!string.IsNullOrEmpty(where.CreateTime))
            //  expr = expr.And(p => p.CreateTime == where.CreateTime);
            // if (!string.IsNullOrEmpty(where.LastModificationTime))
            //  expr = expr.And(p => p.LastModificationTime == where.LastModificationTime);
            #endregion
            var list = _employeeInfoRepository.Query().Where(expr).OrderByDescending(p => p.Sort).ToList();

            if (isShowTop)
            {
                list.Insert(0, new EmployeeInfoEntity() { EmployeeCode = " ", EmployeeName = "全部" });
            }
            return list;
        }
        #endregion


        #region 新增方法
        public string GetMaxEmployeeCode()
        {
            string retStr = _employeeInfoRepository.GetMaxEmployeeCode();
            return retStr;
        }


        public string GetEmployeeNameByCode(string employeeCode)
        {
            var expr = PredicateBuilder.True<EmployeeInfoEntity>();
            expr = expr.And(p => p.EmployeeCode == employeeCode);
            var list = _employeeInfoRepository.Query().Where(expr).ToList();

            if (list.Any())
            {
                return list.FirstOrDefault().EmployeeName;
            }
            return "";
        }


        public EmployeeInfoEntity GetEmployeeNameByCode2(string employeeCode)
        {
            var expr = PredicateBuilder.True<EmployeeInfoEntity>();
            expr = expr.And(p => p.EmployeeCode == employeeCode);
            var list = _employeeInfoRepository.Query().Where(expr).ToList();

            if (list.Any())
            {
                return list.FirstOrDefault();
            }
            return null;
        }
        #endregion
    }
}




