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
using Project.Model.SystemSetManager;
using Project.Service.SystemSetManager;
using Project.WebApplication.Controllers;

namespace Project.WebApplication.Areas.SystemSetManager.Controllers
{
    public class CityController : BaseController
    {

        public ActionResult Hd(int pkId = 0)
        {
            if (pkId > 0)
            {
                var entity = CityService.GetInstance().GetModelByPk(pkId);
                ViewBag.BindEntity = JsonHelper.JsonSerializer(entity);
            }
            return View();
        }

 
        public ActionResult List()
        {
            return View();
        }

        public MvcJsonResult GetList()
        {
            var pIndex = this.Request["page"].ConvertTo<int>();
            var pSize = this.Request["rows"].ConvertTo<int>();
            var where = new CityEntity();
            //where.PkId = RequestHelper.GetFormString("PkId");
            where.CityId = RequestHelper.GetString("CityId");
            where.City = RequestHelper.GetString("City");
            //where.ProvinceId = RequestHelper.GetFormString("ProvinceId");
            var searchList = CityService.GetInstance().Search(where, (pIndex - 1) * pSize, pSize);

            var dataGridEntity = new DataGridResponse()
            {
                total = searchList.Item2,
                rows = searchList.Item1
            };
            return new MvcJsonResult(dataGridEntity, new NHibernateContractResolver());
        }


        [HttpPost]
        public MvcJsonResult Add(AjaxRequest<CityEntity> postData)
        {
            var addResult = CityService.GetInstance().Add(postData.RequestEntity);
            var result = new AjaxResponse<CityEntity>()
               {
                   Success = true,
                   Result = postData.RequestEntity
               };
            return new MvcJsonResult(result, new NHibernateContractResolver());
        }


        [HttpPost]
        public MvcJsonResult Edit( AjaxRequest<CityEntity> postData)
        {
            var newInfo = postData.RequestEntity;
            var orgInfo = CityService.GetInstance().GetModelByPk(postData.RequestEntity.PkId);
            var mergInfo = Mapper.Map(newInfo, orgInfo);
            var updateResult = CityService.GetInstance().Update(mergInfo);
            
            var result = new AjaxResponse<CityEntity>()
            {
                Success = updateResult,
                Result = postData.RequestEntity
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }

        [HttpPost]
        public MvcJsonResult Delete(int pkid)
        {
            var deleteResult = CityService.GetInstance().DeleteByPkId(pkid);
            var result = new AjaxResponse<CityEntity>()
            {
                Success = deleteResult
            };
            return new MvcJsonResult(result, new NHibernateContractResolver(new string[] { "result" }));
        }
    }
}




