﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AutoMapper;
using Project.Infrastructure.FrameworkCore.AutoMapper;
using Project.Model.HRManager;
using Project.Model.PermissionManager;
using Project.Model.ProductManager;

using Project.Service.PermissionManager.DTO;

namespace Project.Service
{
    public static class BootstrapperService
    {
        public static void Init()
        {
            InitAutoMapper();
        }

        private static void InitAutoMapper()
        {

            Mapper.CreateMap<BrandEntity, BrandEntity>().IgnoreAllNull();
            Mapper.CreateMap<GoodsEntity, GoodsEntity>().IgnoreAllNull();
            Mapper.CreateMap<ProductCategoryEntity, ProductCategoryEntity>().IgnoreAllNull();
            Mapper.CreateMap<ProductEntity, ProductEntity>().IgnoreAllNull();
            Mapper.CreateMap<SpecEntity, SpecEntity>().IgnoreAllNull();


            //Mapper.CreateMap<RiverAttachEntity, RiverAttachEntity>().IgnoreAllNull();
            //Mapper.CreateMap<MsgNoticeEntity, MsgNoticeEntity>().IgnoreAllNull();
            //Mapper.CreateMap<RiverEntity, RiverEntity>().IgnoreAllNull();
            //Mapper.CreateMap<RiverCheckEntity, RiverCheckEntity>().IgnoreAllNull();
            //Mapper.CreateMap<RiverProblemApplyEntity, RiverProblemApplyEntity>().IgnoreAllNull();
            //Mapper.CreateMap<RiverOwerEntity, RiverOwerEntity>().IgnoreAllNull();

            Mapper.CreateMap<UserDepartmentEntity, UserDepartmentLoginModel>().IgnoreAllNull();
            //Mapper.CreateMap<EmployeeInfoEntity, TechnicalEntity>().IgnoreAllNull();
            //Mapper.CreateMap<EmployeeInfoEntity, EmployeeInfoEntity>().IgnoreAllNull();
            //Mapper.CreateMap<EmployeeInfoEntity, EmployeeInfoHisEntity>().IgnoreAllNull();
            //Mapper.CreateMap<EmployeeYearDetailEntity, EmployeeYearDetailEntity>().IgnoreAllNull();
            //Mapper.CreateMap<EmployeeYearMainEntity, EmployeeYearMainEntity>().IgnoreAllNull();
            //Mapper.CreateMap<ContractEntity, ContractEntity>().IgnoreAllNull();
            Mapper.CreateMap<DepartmentExtEntity, DepartmentEntity>().IgnoreAllNull();
            //Mapper.CreateMap<AttendanceEntity, AttendanceEntity>().IgnoreAllNull();
            //Mapper.CreateMap<AttendanceUploadRecordEntity, AttendanceUploadRecordEntity>().IgnoreAllNull();
            Mapper.CreateMap<FunctionDetailEntity, PermissionFunctionDetailDTO>();
            Mapper.CreateMap<UserInfoEntity, LoginUserInfoDTO>().ForMember(a=>a.PermissionCodeList,b=>b.MapFrom(src=>src.UserFunctionDetailList_Checked));
        }

    }
}
