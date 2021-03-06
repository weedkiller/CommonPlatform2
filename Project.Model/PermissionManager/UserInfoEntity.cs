﻿
using System;
using System.Collections.Generic;
using System.Linq;
using Project.Infrastructure.FrameworkCore.Domain.Entities;
using Project.Infrastructure.FrameworkCore.Domain.Entities.Component;


namespace Project.Model.PermissionManager
{
    [Serializable]
    public class UserInfoEntity : AuditedEntity, ISoftDelete
    {
        public UserInfoEntity()
        {
            UserDepartmentList = new HashSet<UserDepartmentEntity>();
            UserRoleList = new HashSet<UserRoleEntity>();
            UserFunctionDetailList = new HashSet<UserFunctionDetailEntity>();

        }

        #region 属性

        /// <summary>
        /// 数据库类型：System.String   大小:36 
        /// 描述:员工号
        /// </summary>
        public virtual System.String UserCode { get; set; }
        /// <summary>
        /// 数据库类型：System.String   大小:32 
        /// 描述:密码
        /// </summary>
        public virtual System.String Password { get; set; }
        /// <summary>
        /// 数据库类型：System.String   大小:100 
        /// 描述:用户名
        /// </summary>
        public virtual System.String UserName { get; set; }
        /// <summary>
        /// 数据库类型：System.String   大小:100 
        /// 描述:电子邮件
        /// </summary>
        public virtual System.String Email { get; set; }
        /// <summary>
        /// 数据库类型：System.String   大小:32 
        /// 描述:手机号
        /// </summary>
        public virtual System.String Mobile { get; set; }
        /// <summary>
        /// 数据库类型：System.String   大小:32 
        /// 描述:家庭电话
        /// </summary>
        public virtual System.String Tel { get; set; }
        /// <summary>
        /// 数据库类型：System.Int32   大小:4 精度:10
        /// 描述:是否有效
        /// </summary>
        public virtual System.Int32? IsActive { get; set; }

        /// <summary>
        /// 数据库类型：System.String   大小:255 
        /// 描述:备注
        /// </summary>
        public virtual System.String Remark { get; set; }

        /// <summary>
        ///职务
        /// </summary>

        public virtual System.String Duty { get; set; }

        /// <summary>
        /// 等级
        /// </summary>
        public virtual System.String Lever { get; set; }
        #endregion


        public virtual bool IsDeleted { get; set; }

        public virtual int Sort { get; set; }


        public virtual ISet<UserDepartmentEntity> UserDepartmentList { get; set; }

      


        public virtual ISet<UserRoleEntity> UserRoleList { get; set; }

        ///// <summary>
        /////河流列表
        ///// </summary>
        //public virtual ISet<RiverOwerEntity> RiverOwerList { get; set; }


        /// <summary>
        /// 在角色基础上的增删详细模块功能
        /// </summary>
        public virtual ISet<UserFunctionDetailEntity> UserFunctionDetailList { get; set; }

        /// <summary>
        /// 有效权限
        /// </summary>
        public virtual IList<int> UserFunctionDetailList_Checked { get; set; }


        public virtual System.String Search_UserCodes { get; set; }

        public virtual System.String Attr_SelectRiverIds { get; set; }

        //public virtual System.String Att_RiverName
        //{
        //    get
        //    {
        //        if (RiverOwerList != null && RiverOwerList.Any())
        //        {
        //            return RiverOwerList.ToList().Select(p => p.RiverName).Aggregate((a, b) => { return a + "," + b; });
        //        }
        //        return "";
        //    }

        //}

        public virtual IList<string> Attr_DepartmentCodes { get; set; }

        /// <summary>
        /// 河长级别
        /// </summary>
        public virtual string Jb { get; set; }



        public virtual string LeverStr
        {
            get; set;
        }

        public virtual int Times {
            get; set;
        }

        public virtual string State
        {
            get; set;
        }

        public virtual DateTime? BeginDate
        {
            get; set;
        }
        public virtual DateTime? EndDate
        {
            get; set;
        }
        public virtual string RiverName
        {
            get; set;
        }
    }
}
