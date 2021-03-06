﻿
var pro = pro || {};
(function () {
    pro.EmployeeYearMain = pro.EmployeeYearMain || {};
    pro.EmployeeYearMain.ListPage = pro.EmployeeYearMain.ListPage || {};
    pro.EmployeeYearMain.ListPage = {
        init: function () {
            return {
                tabObj: new pro.TabBase(),
                gridObj: new pro.GridBase("#datagrid", false)
            };
        },
        initPage: function () {
            var initObj = this.init();
            var tabObj = initObj.tabObj;
            var gridObj = initObj.gridObj;
            gridObj.grid({
                url: '/HRManager/EmployeeYearMain/GetList',
                fitColumns: false,
                nowrap: false,
                rownumbers: true, //行号
                singleSelect: true,
                frozenColumns: [[
                { field: 'EmployeeName', title: '员工姓名', width: 100 },
                {
                    field: 'DepartmentCode',
                    title: '部门名称',
                    width: 100,
                    formatter: function (value, row) {
                        return row.DepartmentEntity.DepartmentName;
                    },
                },
                {
                    field: 'DepartmentName', title: '机构名称', width: 100, formatter: function (value, row) {
                     
                        return row.DepartmentEntity.ParentDepartmentName;
                    }
                }
                ]],

                columns: [[
            { field: 'PkId', title: '', hidden: true, width: 100 },

            { field: 'LeftCount', title: '年休余数', width: 100 },
            //{ field: 'Remark', title: '备注', width: 100 },
            { field: 'CreatorUserName', title: '创建人', width: 100 },
            { field: 'CreationTime', title: '创建时间', width: 100 },
            { field: 'LastModificationTime', title: '最后修改时间', width: 100 },
                ]],
                pagination: true,
                pageSize: 20, //每页显示的记录条数，默认为10     
                pageList: [20, 30, 40] //可以设置每页记录条数的列表    
            }
               );

            $("#btnAdd").click(function () {
                tabObj.add("/HRManager/EmployeeYearMain/Hd", "新增");
            });

            $("#btnEdit").click(function () {
                if (!gridObj.isSelected()) {
                    $.alertExtend.infoOp();
                    return;
                }
                var PkId = gridObj.getSelectedRow().PkId;
                tabObj.add("/HRManager/EmployeeYearMain/Hd?PkId=" + PkId, "编辑" + PkId);
            });

            pro.DepartmentControl.init();
            //$('#DepartmentCode').combotree({
            //    required: true,
            //    editable: false,
            //    //multiple: true,//支持多选
            //    //checkbox: true,
            //    //cascadeCheck: false,
            //    //lines: true,
            //    valueField: 'DepartmentCode',
            //    textField: 'DepartmentName',
            //    url: '/PermissionManager/Department/GetList_Combotree'
            //}); //本可以链式onChange
            $('#DepartmentCode').combotree({
                onChange: function (newValue, oldValue) {
                    $('#EmployeeCode').combobox({
                        required: true,
                        editable: false,
                        valueField: 'EmployeeCode',
                        textField: 'EmployeeName',
                        url: '/HRManager/EmployeeInfo/GetAllList?DepartmentCode=' + $('#DepartmentCode').combotree("getValues")
                    });
                }
            });

            $("#btnSearch").click(function () {
                gridObj.search();
            });

            $("#btnDel").click(function () {
                if (!gridObj.isSelected()) {
                    $.alertExtend.infoOp();
                    return;
                }
                $.messager.confirm("确认操作", "是否确认删除", function (bl) {
                    if (!bl) return;
                    abp.ajax({
                        url: "/HRManager/EmployeeYearMain/Delete?PkId=" + gridObj.getSelectedRow().PkId
                    }).done(
                    function (dataresult, data) {
                        $.alertExtend.info();
                        gridObj.search();
                    }
                    ).fail(
                    function (errordetails, errormessage) {
                        $.alertExtend.error();
                    }
                    );
                });
            });

            $("#btnRefresh").click(function () {
                gridObj.refresh();
            });
        },
        closeTab: function () {
            this.init().tabObj.closeTab();
        }
    };
})();



$(function () {
    pro.EmployeeYearMain.ListPage.initPage();
});


