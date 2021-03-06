﻿

using System;
using System.Collections.Generic;
using System.Linq;
using System.Web.Mvc;
using AutoMapper;
using Project.Infrastructure.FrameworkCore.DataNhibernate.Helpers;
using Project.Infrastructure.FrameworkCore.ToolKit;
using Project.Infrastructure.FrameworkCore.ToolKit.JsonHandler;
using Project.Infrastructure.FrameworkCore.ToolKit.LinqExpansion;
using Project.Infrastructure.FrameworkCore.WebMvc.Controllers.Results;
using Project.Infrastructure.FrameworkCore.WebMvc.Models;
using Project.Model.ContentManager;
using Project.Service.ContentManager;
using Project.WebApplication.Controllers;

namespace Project.WebApplication.Areas.ContentManager.Controllers
{
    public class PageContentCategoryController : BaseController
    {

        public ActionResult Hd(int pkId = 0)
        {
            if (pkId > 0)
            {
                var entity = PageContentCategoryService.GetInstance().GetModelByPk(pkId);
                ViewBag.BindEntity = JsonHelper.JsonSerializer(entity);
            }
            return View();
        }


        public ActionResult List()
        {
            return View();
        }

        public ActionResult List2()
        {
            return View();
        }

        public MvcJsonResult GetList()
        {
            var pIndex = this.Request["page"].ConvertTo<int>();
            var pSize = this.Request["rows"].ConvertTo<int>();
            var where = new PageContentCategoryEntity();
            //where.PkId = RequestHelper.GetFormString("PkId");
            where.PageContentCategoryName = RequestHelper.GetString("PageContentCategoryName");
            //where.ParentId = RequestHelper.GetFormString("ParentId");
            //where.Rank = RequestHelper.GetFormString("Rank");
            //where.Sort = RequestHelper.GetFormString("Sort");
            //where.Route = RequestHelper.GetFormString("Route");
            //where.CreatorUserCode = RequestHelper.GetFormString("CreatorUserCode");
            //where.CreationTime = RequestHelper.GetFormString("CreationTime");
            //where.LastModifierUserCode = RequestHelper.GetFormString("LastModifierUserCode");
            //where.LastModificationTime = RequestHelper.GetFormString("LastModificationTime");
            //where.IsDeleted = RequestHelper.GetFormString("IsDeleted");
            //where.DeleterUserCode = RequestHelper.GetFormString("DeleterUserCode");
            //where.DeletionTime = RequestHelper.GetFormString("DeletionTime");

            var searchList = new List<PageContentCategoryEntity>();
            if (!string.IsNullOrWhiteSpace(where.PageContentCategoryName))
            {
                searchList= PageContentCategoryService.GetInstance().GetList(where).ToList();
            }
            else
            {
                searchList = PageContentCategoryService.GetInstance().GetTopPageContentCategoryList().ToList();
            }
            
            var dataGridEntity = new DataGridTreeResponse<PageContentCategoryEntity>(searchList.Count, searchList);
            return new MvcJsonResult(dataGridEntity, new NHibernateContractResolver(new string[] { "children" }));
        }

        public MvcJsonResult GetList_Combotree()
        {
            var where = new PageContentCategoryEntity();
            //  where.PageContentCategoryName = RequestHelper.GetString("PageContentCategoryName");
            var list = PageContentCategoryService.GetInstance().GetTopPageContentCategoryList();

            return new MvcJsonResult(list, new NHibernateContractResolver(new string[] { "children" }));
        }


        public MvcJsonResult GetPageContentCategoryEntity()
        {
            var pageContentCategoryEntity = PageContentCategoryService.GetInstance().GetModelByPk(RequestHelper.GetInt("PkId"));
            return new MvcJsonResult(pageContentCategoryEntity,new NullToEmptyStringResolver());
        }


        [HttpPost]
        public MvcJsonResult Add(AjaxRequest<PageContentCategoryEntity> postData)
        {
            var addResult = PageContentCategoryService.GetInstance().Add(postData.RequestEntity);
            var result = new AjaxResponse<PageContentCategoryEntity>()
            {
                Success = true,
                Result = postData.RequestEntity
            };
            return new MvcJsonResult(result, new NHibernateContractResolver());
        }


        [HttpPost]
        public MvcJsonResult Edit(AjaxRequest<PageContentCategoryEntity> postData)
        {
            var newInfo = postData.RequestEntity;
            var orgInfo = PageContentCategoryService.GetInstance().GetModelByPk(postData.RequestEntity.PkId);
            var mergInfo = Mapper.Map(newInfo, orgInfo);
            var updateResult = PageContentCategoryService.GetInstance().Update(mergInfo);

            var result = new AjaxResponse<PageContentCategoryEntity>()
            {
                Success = updateResult,
                Result = postData.RequestEntity
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }

        [HttpPost]
        public MvcJsonResult Delete(int pkid)
        {
            var deleteResult = PageContentCategoryService.GetInstance().DeleteByPkId(pkid);
            var result = new AjaxResponse<PageContentCategoryEntity>()
            {
                Success = deleteResult
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }
    }
}




