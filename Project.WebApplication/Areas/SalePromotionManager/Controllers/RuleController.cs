﻿

using System;
using System.Collections.Generic;
using System.Linq;
using System.Web.Mvc;
using Aspose.Cells;
using AutoMapper;
using Project.Infrastructure.FrameworkCore.DataNhibernate.Helpers;
using Project.Infrastructure.FrameworkCore.ToolKit;
using Project.Infrastructure.FrameworkCore.ToolKit.JsonHandler;
using Project.Infrastructure.FrameworkCore.ToolKit.LinqExpansion;
using Project.Infrastructure.FrameworkCore.WebMvc.Controllers.Results;
using Project.Infrastructure.FrameworkCore.WebMvc.Models;
using Project.Model.HRManager;
using Project.Model.SalePromotionManager;
using Project.Service.HRManager;
using Project.Service.SalePromotionManager;
using Project.WebApplication.Controllers;

namespace Project.WebApplication.Areas.SalePromotionManager.Controllers
{
    public class RuleController : BaseController
    {

        #region 视图

        public ActionResult Hd(int pkId = 0)
        {
            if (pkId > 0)
            {
                var entity = RuleService.GetInstance().GetModelByPk(pkId);
                ViewBag.BindEntity = JsonHelper.JsonSerializer(entity);
            }
            return View();
        }

        public ActionResult RuleRaHd(int pkId = 0)
        {
            if (pkId > 0)
            {
                var entity = RuleService.GetInstance().GetModelByPk(pkId);
                ViewBag.BindEntity = JsonHelper.JsonSerializer(entity);
            }
            return View();
        }

        public ActionResult RuleRbHd(int pkId = 0)
        {
            if (pkId > 0)
            {
                var entity = RuleService.GetInstance().GetModelByPk(pkId);
                ViewBag.BindEntity = JsonHelper.JsonSerializer(entity);
            }
            return View();
        }

        public ActionResult RuleRcHd(int pkId = 0)
        {
            if (pkId > 0)
            {
                var entity = RuleService.GetInstance().GetModelByPk(pkId);
                ViewBag.BindEntity = JsonHelper.JsonSerializer(entity);
            }
            return View();
        }

        public ActionResult RuleTypeList()
        {
            return View();
        }

        #endregion

        #region 列表搜索
        public ActionResult List()
        {
            return View();
        }

        public MvcJsonResult GetList()
        {
            //var pIndex = this.Request["page"].ConvertTo<int>();
            //var pSize = this.Request["rows"].ConvertTo<int>();
            var where = new RuleEntity();
            //where.PkId = RequestHelper.GetFormString("PkId");
            where.ActivityId = RequestHelper.GetInt("ActivityId");
            //where.RuleType = RequestHelper.GetFormString("RuleType");
            //where.Title = RequestHelper.GetFormString("Title");
            var searchList = RuleService.GetInstance().GetList(where);

            var dataGridEntity = new DataGridResponse()
            {
                total = searchList.Count(),
                rows = searchList
            };
            return new MvcJsonResult(dataGridEntity, new NHibernateContractResolver());
        }


        public MvcJsonResult GetPromotionGoodsList()
        {
            //var pIndex = this.Request["page"].ConvertTo<int>();
            //var pSize = this.Request["rows"].ConvertTo<int>();
            var where = new RulePromotionGoodsEntity();
            //where.PkId = RequestHelper.GetFormString("PkId");
            //where.ActivityId = RequestHelper.GetFormString("ActivityId");
            where.RuleId = RequestHelper.GetInt("RuleId");
            //where.ProductId = RequestHelper.GetFormString("ProductId");
            //where.ProductCode = RequestHelper.GetFormString("ProductCode");
            //where.GoodsCode = RequestHelper.GetFormString("GoodsCode");
            //where.GoodsId = RequestHelper.GetFormString("GoodsId");
            //where.Price = RequestHelper.GetFormString("Price");
            //where.PromotionPrice = RequestHelper.GetFormString("PromotionPrice");
            var searchList = RuleService.GetInstance().GetRulePromotionGoodsEntityList(where);

            var dataGridEntity = new DataGridResponse()
            {
                total = searchList.Count(),
                rows = searchList
            };
            return new MvcJsonResult(dataGridEntity, new NHibernateContractResolver());
        }

        #endregion

        #region 相关操作 
       /// <summary>
       /// 
       /// </summary>
       /// <param name="FileUrl"></param>
       /// <param name="FileName"></param>
       /// <param name="Title"></param>
       /// <param name="RuleType"></param>
       /// <returns></returns>
        [HttpPost]
        public MvcJsonResult RuleRaUpload(string FileUrl,string FileName,string Title,string RuleType)
        {
            var ruleEntity=new RuleEntity();
            ruleEntity.RuleType = RuleType;
            ruleEntity.Title = string.IsNullOrWhiteSpace(Title)?"未命名": Title;

            var path = Server.MapPath(FileUrl + "/" + FileName);

            Workbook workbook = new Workbook(path);
            Worksheet sheet = workbook.Worksheets[0];
            Cells cells = sheet.Cells;

            for (int i = 1; i < cells.MaxDataRow + 1; i++)
            {
                var goodsInfo=new RulePromotionGoodsEntity();
                goodsInfo.GoodsCode = cells[i, 0].StringValue.Trim();
                goodsInfo.PromotionPrice =decimal.Parse(cells[i, 1].StringValue.Trim()) ; ;
                ruleEntity.RulePromotionGoodsEntityList.Add(goodsInfo);
            }

            var addResult = RuleService.GetInstance().RuleRaAdd(ruleEntity);
            var result = new AjaxResponse<object>()
            {
                Success = addResult>0,
                Result = addResult
            };
            return new MvcJsonResult(result, new NHibernateContractResolver());
        }

        [HttpPost]
        public MvcJsonResult RuleRaAdd(AjaxRequest<RuleEntity> postData)
        {
            var addResult = RuleService.GetInstance().RuleRaAdd(postData.RequestEntity);
            var result = new AjaxResponse<RuleEntity>()
            {
                Success = addResult>0
            };
            return new MvcJsonResult(result, new NHibernateContractResolver());
        }


        [HttpPost]
        public MvcJsonResult RuleRaEdit(AjaxRequest<RuleEntity> postData)
        {

            var updateResult = RuleService.GetInstance().RuleRaEdit(postData.RequestEntity);

            var result = new AjaxResponse<RuleEntity>()
            {
                Success = updateResult
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }


        [HttpPost]
        public MvcJsonResult RuleRbAdd(AjaxRequest<RuleEntity> postData)
        {
            var addResult = RuleService.GetInstance().RuleRbAdd(postData.RequestEntity);
            var result = new AjaxResponse<RuleEntity>()
            {
                Success = true,
                Result = postData.RequestEntity
            };
            return new MvcJsonResult(result, new NHibernateContractResolver());
        }


        [HttpPost]
        public MvcJsonResult RuleRbEdit(AjaxRequest<RuleEntity> postData)
        {
            var updateResult = RuleService.GetInstance().RuleRbEdit(postData.RequestEntity);
            var result = new AjaxResponse<RuleEntity>()
            {
                Success = updateResult,
                Result = postData.RequestEntity
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }



        [HttpPost]
        public MvcJsonResult RuleRcAdd(AjaxRequest<RuleEntity> postData)
        {
            var addResult = RuleService.GetInstance().RuleRcAdd(postData.RequestEntity);
            var result = new AjaxResponse<RuleEntity>()
            {
                Success = true,
                Result = postData.RequestEntity
            };
            return new MvcJsonResult(result, new NHibernateContractResolver());
        }


        [HttpPost]
        public MvcJsonResult RuleRcEdit(AjaxRequest<RuleEntity> postData)
        {
            var updateResult = RuleService.GetInstance().RuleRcEdit(postData.RequestEntity);

            var result = new AjaxResponse<RuleEntity>()
            {
                Success = updateResult,
                Result = postData.RequestEntity
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }


        [HttpPost]
        public MvcJsonResult Delete(int pkid)
        {
            var deleteResult = RuleService.GetInstance().DeleteByPkId(pkid);
            var result = new AjaxResponse<RuleEntity>()
            {
                Success = deleteResult
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }

        #endregion
    }
}




