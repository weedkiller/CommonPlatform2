﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Project.Application.Service.AccountManager;
using Project.Application.Service.OrderManager;
using Project.Infrastructure.FrameworkCore.Logging;
using Project.Infrastructure.FrameworkCore.WebMvc.Controllers.Results;
using Project.Infrastructure.FrameworkCore.WebMvc.Models;
using Project.WebSite.Models.ShopCart;

namespace Project.WebSite.Controllers
{
    public class ShopCartController : AuthorizeController
    {
        #region 视图
        // GET: ShopCat
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult List()
        {
            new OrderServiceImpl().UpdateCartState(CustomerDto.CustomerId);

            var list = new OrderServiceImpl().GetShopCartList(CustomerDto.CustomerId);

            return View(list);
        }
        #endregion



        #region 操作方法

        /// <summary>
        /// 加入购物车
        /// </summary>
        /// <param name="goodsId"></param>
        /// <param name="num"></param>
        /// <returns></returns>
        [HttpPost]
        public ActionResult AddCart(int goodsId, int num)
        {
            var registResult = new OrderServiceImpl().AddCart(goodsId, num, CustomerDto.CustomerId);

            var result = new AjaxResponse<object>()
            {
                Success = registResult.Item1,
                Error = new ErrorInfo(registResult.Item2)
            };


            return new MvcJsonResult(result);
        }

        /// <summary>
        /// 删除购物车行项目
        /// </summary>
        /// <param name="pkId"></param>
        /// <returns></returns>
        [HttpPost]
        public ActionResult DelCart(int pkId)
        {
            var registResult = new OrderServiceImpl().DelCart(pkId, CustomerDto.CustomerId);

            var result = new AjaxResponse<object>()
            {
                Success = registResult.Item1,
                Error = new ErrorInfo(registResult.Item2)
            };

            return new MvcJsonResult(result);
        }

        /// <summary>
        /// 更新购物车数量
        /// </summary>
        /// <param name="pkId"></param>
        /// <param name="num"></param>
        /// <returns></returns>
        [HttpPost]
        public ActionResult UpdateCartNum(int pkId, int num)
        {
            var registResult = new OrderServiceImpl().UpdateCartNum(pkId, num, CustomerDto.CustomerId);

            var result = new AjaxResponse<object>()
            {
                Success = registResult.Item1,
                Error = new ErrorInfo(registResult.Item2)
            };

            return new MvcJsonResult(result);
        }


        /// <summary>
        /// 更新购物车数量
        /// </summary>
        /// <param name="pkId"></param>
        /// <param name="isCheck"></param>
        /// <returns></returns>
        [HttpPost]
        public ActionResult UpdateCartCheck(int pkId, int isCheck)
        {
            var registResult = new OrderServiceImpl().UpdateCartCheck(pkId, isCheck, CustomerDto.CustomerId);
            var list = new OrderServiceImpl().GetShopCartCheckList(CustomerDto.CustomerId);
            //var outPut=new ShopCartOutPut();
            //outPut.CheckNum = list.Where(p => p.IsCheck == 1).Sum(p => p.Num);
            //outPut.TotalAmount = list.Where(p => p.IsCheck == 1).Sum(p => p.TotalAmount).ToString("0.00");

            var result = new AjaxResponse<ShopCartOutPut>()
            {
                Success = registResult.Item1,
                //result = outPut
            };
            return new MvcJsonResult(result);
        }


       /// <summary>
       /// 批量更新
       /// </summary>
       /// <param name="isCheck"></param>
       /// <returns></returns>
        [HttpPost]
        public ActionResult CheckBatch(int isCheck)
        {
            var registResult = new OrderServiceImpl().CheckBatch(isCheck, CustomerDto.CustomerId);

            var result = new AjaxResponse<object>()
            {
                Success = registResult.Item1,
                Error = new ErrorInfo(registResult.Item2)
            };

            return new MvcJsonResult(result);
        }



        #endregion


    }
}