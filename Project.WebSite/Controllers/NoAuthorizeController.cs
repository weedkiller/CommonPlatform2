﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Web;
using System.Web.Mvc;
using System.Web.Mvc.Filters;
using System.Web.Security;
using Newtonsoft.Json;
using Project.Application.Service.OrderManager;
using Project.Infrastructure.FrameworkCore.Domain.Entities;
using Project.Infrastructure.FrameworkCore.Logging;
using Project.Infrastructure.FrameworkCore.ToolKit;
using Project.Infrastructure.FrameworkCore.ToolKit.LinqExpansion;
using Project.Infrastructure.FrameworkCore.WebMvc.Controllers.Results;
using Project.Infrastructure.FrameworkCore.WebMvc.Models;
using Project.Model.PermissionManager;
using Project.Service.CustomerManager.Dto;
using Project.Service.PermissionManager;
using Project.Service.PermissionManager.DTO;

namespace Project.WebSite.Controllers
{
    /// <summary>
    /// 已登录页
    /// </summary>
    public class NoAuthorizeController : BaseController
    {
      



        /// <summary>
        /// 在调用操作方法前调用。
        /// </summary>
        /// <param name="filterContext">有关当前请求和操作的信息。</param>
        protected override void OnActionExecuting(ActionExecutingContext filterContext)
        {
            if (filterContext == null)
            {
                throw new ArgumentNullException("filterContext");
            }

            base.OnActionExecuting(filterContext);

            try
            {
                    var userData = ((FormsIdentity)User.Identity).Ticket.UserData;
                if (userData != "")
                {
                    CustomerDto = JsonConvert.DeserializeObject<CustomerDto>(userData);
                    ViewBag.Nickname = CustomerDto.Mobilephone;
                    ViewBag.CartNum = new OrderServiceImpl().GetShopCartList(CustomerDto.CustomerId).Count();
                }
            }
            catch (Exception ex)
            {
              
            }
            //}
        }


        ///// <summary>
        ///// 在进行授权时调用。
        ///// </summary>
        ///// <param name="filterContext">有关当前请求和操作的信息。</param>
        //protected override void OnAuthentication(AuthenticationContext filterContext)
        //{
        //    if (!HttpContext.User.Identity.IsAuthenticated)
        //    {
        //        filterContext.Result = new ContentResult { Content = @"<script>window.top.location='/Login/Index3'</script>" };
        //        base.OnAuthentication(filterContext);
        //        return;
        //    }

        //    //身份验证
        //    ViewBag.ShowInfo += "OnAuthentication<br/>";
        //    base.OnAuthentication(filterContext);
        //}


    }
}