﻿
/***************************************************************************
*       功能：     PRMProductCategory业务处理层
*       作者：     李伟伟
*       日期：     2017/6/30
*       描述：     
* *************************************************************************/
using System.Linq;
using System.Collections.Generic;
using Project.Infrastructure.FrameworkCore.DataNhibernate.Helpers;
using Project.Model.ProductManager;
using Project.Repository.ProductManager;

namespace Project.Service.ProductManager
{
    public class ProductCategoryService
    {

        #region 构造函数
        private readonly ProductCategoryRepository _productCategoryRepository;
        private static readonly ProductCategoryService Instance = new ProductCategoryService();

        public ProductCategoryService()
        {
            this._productCategoryRepository = new ProductCategoryRepository();
        }

        public static ProductCategoryService GetInstance()
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
        public System.Int32 Add(ProductCategoryEntity entity)
        {
            entity.SystemCategoryName = SystemCategoryService.GetInstance().GetModelByPk(entity.SystemCategoryId).SystemCategoryName;
            if (entity.ParentId>0)
            {
                entity.Rank = _productCategoryRepository.GetById(entity.ParentId).Rank + 1;
            }
            return _productCategoryRepository.Save(entity);
        }


        /// <summary>
        /// 删除
        /// </summary>
        /// <param name="pkId"></param>
        public bool DeleteByPkId(System.Int32 pkId)
        {
            try
            {
                var entity = _productCategoryRepository.GetById(pkId);
                _productCategoryRepository.Delete(entity);
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
        public bool Delete(ProductCategoryEntity entity)
        {
            try
            {
                _productCategoryRepository.Delete(entity);
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
        public bool Update(ProductCategoryEntity entity)
        {
            try
            {
                entity.SystemCategoryName = SystemCategoryService.GetInstance().GetModelByPk(entity.SystemCategoryId).SystemCategoryName;
                if (entity.ParentId > 0)
                {
                    entity.Rank = _productCategoryRepository.GetById(entity.ParentId).Rank + 1;
                }
                _productCategoryRepository.Update(entity);
                return true;
            }
            catch
            {
                return false;
            }
        }


        /// <summary>
        /// 通过主键获取实体
        /// </summary>
        /// <param name="pkId">主键</param>
        /// <returns></returns>
        public ProductCategoryEntity GetModelByPk(System.Int32 pkId)
        {
            return _productCategoryRepository.GetById(pkId);
        }


        /// <summary>
        /// 分页
        /// </summary>
        /// <param name="entity">条件实体</param>
        /// <param name="skipResults">开始</param>
        /// <param name="maxResults">结束</param>
        /// <returns>获取当前页【】和总【】数</returns>
        public System.Tuple<IList<ProductCategoryEntity>, int> Search(ProductCategoryEntity where, int skipResults, int maxResults)
        {
            var expr = PredicateBuilder.True<ProductCategoryEntity>();
            #region
            // if (!string.IsNullOrEmpty(where.PkId))
            //  expr = expr.And(p => p.PkId == where.PkId);
            // if (!string.IsNullOrEmpty(where.ProductCategoryName))
            //  expr = expr.And(p => p.ProductCategoryName == where.ProductCategoryName);
            // if (!string.IsNullOrEmpty(where.ParentId))
            //  expr = expr.And(p => p.ParentId == where.ParentId);
            // if (!string.IsNullOrEmpty(where.Rank))
            //  expr = expr.And(p => p.Rank == where.Rank);
            // if (!string.IsNullOrEmpty(where.Sort))
            //  expr = expr.And(p => p.Sort == where.Sort);
            // if (!string.IsNullOrEmpty(where.SystemCategoryId))
            //  expr = expr.And(p => p.SystemCategoryId == where.SystemCategoryId);
            // if (!string.IsNullOrEmpty(where.SystemCategoryName))
            //  expr = expr.And(p => p.SystemCategoryName == where.SystemCategoryName);
            // if (!string.IsNullOrEmpty(where.Route))
            //  expr = expr.And(p => p.Route == where.Route);
            // if (!string.IsNullOrEmpty(where.CreatorUserCode))
            //  expr = expr.And(p => p.CreatorUserCode == where.CreatorUserCode);
            // if (!string.IsNullOrEmpty(where.CreationTime))
            //  expr = expr.And(p => p.CreationTime == where.CreationTime);
            // if (!string.IsNullOrEmpty(where.LastModifierUserCode))
            //  expr = expr.And(p => p.LastModifierUserCode == where.LastModifierUserCode);
            // if (!string.IsNullOrEmpty(where.LastModificationTime))
            //  expr = expr.And(p => p.LastModificationTime == where.LastModificationTime);
            // if (!string.IsNullOrEmpty(where.IsDeleted))
            //  expr = expr.And(p => p.IsDeleted == where.IsDeleted);
            // if (!string.IsNullOrEmpty(where.DeleterUserCode))
            //  expr = expr.And(p => p.DeleterUserCode == where.DeleterUserCode);
            // if (!string.IsNullOrEmpty(where.DeletionTime))
            //  expr = expr.And(p => p.DeletionTime == where.DeletionTime);
            #endregion
            var list = _productCategoryRepository.Query().Where(expr).OrderByDescending(p => p.PkId).Skip(skipResults).Take(maxResults).ToList();
            var count = _productCategoryRepository.Query().Where(expr).Count();
            return new System.Tuple<IList<ProductCategoryEntity>, int>(list, count);
        }

        /// <summary>
        /// 取列表
        /// </summary>
        /// <param name="entity">条件实体</param>
        /// <returns>返回列表</returns>
        public IList<ProductCategoryEntity> GetList(ProductCategoryEntity where)
        {
            var expr = PredicateBuilder.True<ProductCategoryEntity>();
            #region
            // if (!string.IsNullOrEmpty(where.PkId))
            //  expr = expr.And(p => p.PkId == where.PkId);
            if (!string.IsNullOrEmpty(where.ProductCategoryName))
                expr = expr.And(p => p.ProductCategoryName == where.ProductCategoryName);
            // if (!string.IsNullOrEmpty(where.ParentId))
            //  expr = expr.And(p => p.ParentId == where.ParentId);
            // if (!string.IsNullOrEmpty(where.Rank))
            //  expr = expr.And(p => p.Rank == where.Rank);
            // if (!string.IsNullOrEmpty(where.Sort))
            //  expr = expr.And(p => p.Sort == where.Sort);
            // if (!string.IsNullOrEmpty(where.SystemCategoryId))
            //  expr = expr.And(p => p.SystemCategoryId == where.SystemCategoryId);
            // if (!string.IsNullOrEmpty(where.SystemCategoryName))
            //  expr = expr.And(p => p.SystemCategoryName == where.SystemCategoryName);
            // if (!string.IsNullOrEmpty(where.Route))
            //  expr = expr.And(p => p.Route == where.Route);
            // if (!string.IsNullOrEmpty(where.CreatorUserCode))
            //  expr = expr.And(p => p.CreatorUserCode == where.CreatorUserCode);
            // if (!string.IsNullOrEmpty(where.CreationTime))
            //  expr = expr.And(p => p.CreationTime == where.CreationTime);
            // if (!string.IsNullOrEmpty(where.LastModifierUserCode))
            //  expr = expr.And(p => p.LastModifierUserCode == where.LastModifierUserCode);
            // if (!string.IsNullOrEmpty(where.LastModificationTime))
            //  expr = expr.And(p => p.LastModificationTime == where.LastModificationTime);
            // if (!string.IsNullOrEmpty(where.IsDeleted))
            //  expr = expr.And(p => p.IsDeleted == where.IsDeleted);
            // if (!string.IsNullOrEmpty(where.DeleterUserCode))
            //  expr = expr.And(p => p.DeleterUserCode == where.DeleterUserCode);
            // if (!string.IsNullOrEmpty(where.DeletionTime))
            //  expr = expr.And(p => p.DeletionTime == where.DeletionTime);
            #endregion
            var list = _productCategoryRepository.Query().Where(expr).OrderBy(p => p.PkId).ToList();
            return list;
        }
        #endregion


        #region 新增方法

        /// <summary>
        /// 获取顶级分类
        /// 
        /// </summary>
        /// <returns></returns>
        public IList<ProductCategoryEntity> GetTopProductCategoryList()
        {
            return _productCategoryRepository.Query().Where(p => p.ParentId == 0).ToList();
        }

        /// <summary>
        /// 查询第二级分类
        /// </summary>
        /// <param name="systemCategoryId"></param>
        /// <returns></returns>
        public IList<ProductCategoryEntity> GetTopProductCategoryList(int systemCategoryId)
        {
            return _productCategoryRepository.Query().Where(p => p.ParentId == 1 && p.SystemCategoryId == systemCategoryId).ToList();
        }


        /// <summary>
        /// 获取父级路径
        /// </summary>
        /// <param name="productCategoryId"></param>
        /// <param name="route"></param>
        public void GerParentProductCategoryRoute(int productCategoryId, ref string route)
        {
            var nowProductCategory = _productCategoryRepository.GetById(productCategoryId);
            if (nowProductCategory == null)
            {
                return;
            }

            route = "," + nowProductCategory.PkId + (route.StartsWith(",") ? "" : ",") + route;
            if (nowProductCategory.ParentId > 0)
            {
                GerParentProductCategoryRoute(nowProductCategory.ParentId, ref route);
            }
        }





        //public IList<ProductCategoryEntity> GetTreeList(string parentId)
        //{
        //    var topProductCategoryEntity=
        //}


        //private void GetChildList(IList<ProductCategoryEntity> allList, ProductCategoryEntity parentDepartmentEntity)
        //{

        //    var childList = allList.Where(p => p.ParentId == parentDepartmentEntity.DepartmentCode).ToList();
        //    if (childList.Any())
        //    {
        //        parentDepartmentEntity.children = childList;
        //        childList.ForEach(p =>
        //        {
        //            GetChildList(allList, p);
        //        });
        //    }

        //}

        #endregion
    }
}




