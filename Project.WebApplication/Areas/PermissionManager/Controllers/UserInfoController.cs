﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Web.Security;
using Project.Infrastructure.FrameworkCore.DataNhibernate.Helpers;
using Project.Infrastructure.FrameworkCore.ToolKit;
using Project.Infrastructure.FrameworkCore.ToolKit.JsonHandler;
using Project.Infrastructure.FrameworkCore.ToolKit.LinqExpansion;
using Project.Infrastructure.FrameworkCore.WebMvc.Controllers.Results;
using Project.Infrastructure.FrameworkCore.WebMvc.Models;
using Project.Model.PermissionManager;

using Project.Service.PermissionManager;

using Project.WebApplication.Controllers;

namespace Project.WebApplication.Areas.PermissionManager.Controllers
{
    public class UserInfoController : BaseController
    {
        public ActionResult WeiXinLogin()
        {
            return View();
        }
        public ActionResult Hd(int pkId = 0)
        {
            var roleList = RoleService.GetInstance().GetList(new RoleEntity());
            var departmentList = DepartmentService.GetInstance().GetList(new DepartmentEntity());
            //var riverList = RiverService.GetInstance().GetList(new RiverEntity());
            if (pkId > 0)
            {
                var entity = UserInfoService.GetInstance().GetModel(pkId);

                ViewBag.BindEntity = JsonHelper.JsonSerializer(entity, new NHibernateContractResolver());

                if (entity.UserRoleList.Count > 0)
                {
                    roleList.Where(p => entity.UserRoleList.Any(x => x.RoleId == p.PkId)).ForEach(p =>
                    {
                        p.Attr_UserRolePkId = entity.UserRoleList.FirstOrDefault(x => x.RoleId == p.PkId).PkId;
                        p.Attr_IsCheck = true;
                    });
                }

                //if (entity.RiverOwerList.Count > 0)
                //{
                //    riverList.Where(p => entity.RiverOwerList.Any(x => x.RiverId == p.PkId)).ForEach(p =>
                //    {
                //        p.Attr_RiverOwerPkId = entity.RiverOwerList.FirstOrDefault(x => x.RiverId == p.PkId).PkId;
                //        p.Attr_IsCheck = true;
                //    });
                //}

                if (entity.UserDepartmentList.Count > 0)
                {
                    departmentList.Where(p => entity.UserDepartmentList.Any(x => x.DepartmentCode == p.DepartmentCode))
                        .ForEach(p =>
                        {
                            p.Attr_UserDepartmentPkId =
                                entity.UserDepartmentList.FirstOrDefault(x => x.DepartmentCode == p.DepartmentCode)
                                    .PkId;
                            p.Attr_IsCheck = true;
                        });
                }


                //ViewBag.RiverList = JsonHelper.JsonSerializer(new DataGridResponse()
                //{
                //    total = entity.RiverOwerList.Count,
                //    rows = entity.RiverOwerList
                //}, new NHibernateContractResolver());
            }

            ViewBag.RoleList = JsonHelper.JsonSerializer(new DataGridResponse()
            {
                total = roleList.Count,
                rows = roleList
            }, new NHibernateContractResolver());




            ViewBag.DepartmentList = JsonHelper.JsonSerializer(new DataGridTreeResponse<DepartmentEntity>(departmentList.Count, departmentList), new NHibernateContractResolver());

            return View();
        }

        public ActionResult ViewHd(int pkId = 0)
        {
            return Hd(pkId);
        }


        public ActionResult List()
        {
            return View();
        }

        public ActionResult ViewList()
        {
            return View();
        }

        public ActionResult AddressList()
        {
            return View();
        }


        public MvcJsonResult GetList()
        {
            var pIndex = this.Request["page"].ConvertTo<int>();
            var pSize = this.Request["rows"].ConvertTo<int>();
            var where = new UserInfoEntity();
            where.UserCode = RequestHelper.GetString("UserCode");
            where.Search_UserCodes= RequestHelper.GetString("UserCodes");
            where.UserName = RequestHelper.GetString("UserName");
            where.Mobile = RequestHelper.GetString("Mobile");
            where.IsActive = RequestHelper.GetInt("IsActive");


            if (UserInfoService.GetInstance().IsDepartmentRole(LoginUserInfo.UserCode))
            {
                where.Attr_DepartmentCodes = LoginUserInfo.UserDepartmentIntList;
            }
            var searchList = UserInfoService.GetInstance().Search(where, (pIndex - 1) * pSize, pSize);

            var dataGridEntity = new DataGridResponse()
            {
                total = searchList.Item2,
                rows = searchList.Item1
            };
            return new MvcJsonResult(dataGridEntity, new NHibernateContractResolver());
        }


        public ActionResult UserFunctionDetailList()
        {
            return View();
        }

        //public AbpJsonResult GetUserFunctionDetailList()
        //{
        //    var pIndex = this.Request["page"].ConvertTo<int>();
        //    var pSize = this.Request["rows"].ConvertTo<int>();
        //    var where = new UserFunctionDetailEntity();
        //    //where.PkId = RequestHelper.GetFormString("PkId");
        //    //where.UserCode = RequestHelper.GetFormString("UserCode");
        //    //where.FunctionId = RequestHelper.GetFormString("FunctionId");
        //    //where.FunctionDetailId = RequestHelper.GetFormString("FunctionDetailId");
        //    var searchList = UserFunctionDetailService.GetInstance().Search(where, (pIndex - 1) * pSize, pSize);

        //    var dataGridEntity = new DataGridResponse()
        //    {
        //        total = searchList.Item2,
        //        rows = searchList.Item1
        //    };
        //    return new AbpJsonResult(dataGridEntity, new NHibernateContractResolver());
        //}


        [HttpPost]
        public MvcJsonResult Add(AjaxRequest<UserInfoEntity> postData)
        {
            postData.RequestEntity.UserDepartmentList.ForEach(p => p.UserCode = postData.RequestEntity.UserCode);
            postData.RequestEntity.UserRoleList.ForEach(p => p.UserCode = postData.RequestEntity.UserCode);
            postData.RequestEntity.CreationTime = DateTime.Now;
            postData.RequestEntity.CreatorUserCode = "";
            postData.RequestEntity.Password = Encrypt.MD5Encrypt(postData.RequestEntity.Password);

            //postData.RequestEntity.RiverOwerList.ForEach(p =>
            //{
            //    p.UserCode = postData.RequestEntity.UserCode;
            //    p.RiverName = RiverService.GetInstance().GetModelByPk(p.RiverId.GetValueOrDefault()).RiverName;
            //    p.UserName = UserInfoService.GetInstance().GetUserInfo(p.UserCode).UserName;
            //});

            var addResult = UserInfoService.GetInstance().Add(postData.RequestEntity);
            var result = new AjaxResponse<UserInfoEntity>()
            {
                Success = addResult.Item1,
                Result = postData.RequestEntity,
                Error = addResult.Item1 ? null : new ErrorInfo(addResult.Item2)
            };
            return new MvcJsonResult(result, new NHibernateContractResolver());
        }


        [HttpPost]
        public MvcJsonResult Edit(AjaxRequest<UserInfoEntity> postData)
        {
           

            postData.RequestEntity.UserDepartmentList.ForEach(p => p.UserCode = postData.RequestEntity.UserCode);
            postData.RequestEntity.UserRoleList.ForEach(p => p.UserCode = postData.RequestEntity.UserCode);
            postData.RequestEntity.LastModificationTime = DateTime.Now;
            postData.RequestEntity.LastModifierUserCode = "";
            //postData.RequestEntity.RiverOwerList.ForEach(p =>
            //{
            //    p.UserCode = postData.RequestEntity.UserCode;
            //    p.RiverName = RiverService.GetInstance().GetModelByPk(p.RiverId.GetValueOrDefault()).RiverName;
            //    p.UserName = UserInfoService.GetInstance().GetUserInfo(p.UserCode).UserName;
            //});
            var updateResult = UserInfoService.GetInstance().Update(postData.RequestEntity);
            var result = new AjaxResponse<UserInfoEntity>()
            {
                Success = updateResult.Item1,
                Result = postData.RequestEntity,
                Error = updateResult.Item1 ? null : new ErrorInfo(updateResult.Item2)
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }

        [HttpPost]
        public MvcJsonResult Delete(int pkid)
        {
            var deleteResult = UserInfoService.GetInstance().Delete(pkid);
            var result = new AjaxResponse<UserInfoEntity>()
            {
                Success = deleteResult
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }


        [HttpPost]
        public MvcJsonResult ChangeSort(int pkid, int sort)
        {
            var deleteResult = UserInfoService.GetInstance().GetModel(pkid);
            deleteResult.Sort = sort;
            var updateResult = UserInfoService.GetInstance().Update(deleteResult);

            var result = new AjaxResponse<UserInfoEntity>()
            {
                Success = updateResult.Item1,
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }

        [HttpPost]
        public MvcJsonResult SetRowFunction()
        {
            var userCode = RequestHelper.GetString("UserCode");
            var functionPkId = RequestHelper.GetInt("FunctionPkId");
            var functionDetailPkId = RequestHelper.GetInt("FunctionDetailPkId");
            var isCheck = RequestHelper.GetInt("IsCheck") == 1;
            var addResult = UserInfoService.GetInstance().SetRowFunction(userCode, functionPkId, functionDetailPkId, isCheck);
            var result = new AjaxResponse<UserInfoEntity>()
            {
                Success = addResult,
                Result = null
            };
            return new MvcJsonResult(result, null);
        }



        public MvcJsonResult GetListNoPage()
        {

            var where = new UserInfoEntity();

            var searchList = UserInfoService.GetInstance().GetList(where);


            return new MvcJsonResult(searchList, new NHibernateContractResolver());
        }


    }
}