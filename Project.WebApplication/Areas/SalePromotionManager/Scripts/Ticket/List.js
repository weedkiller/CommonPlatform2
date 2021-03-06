﻿
var pro = pro || {};
(function () {
    pro.Ticket = pro.Ticket || {};
    pro.Ticket.ListPage = pro.Ticket.ListPage || {};
    pro.Ticket.ListPage = {
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
                url: '/SalePromotionManager/Ticket/GetList',
                fitColumns: false,
                nowrap: false,
                rownumbers: true, //行号
                singleSelect: true,
                columns: [[
         { field: 'TicketCode', title: '券号', width: 200 },
         { field: 'Status', title: '状态', width: 100 },
         { field: 'AvaildateStart', title: '有效时间开始', width: 100 },
         { field: 'AvaildateEnd', title: '有效时间结束', width: 100 },
         { field: 'IsUse', title: '是否已使用', width: 100 },
         { field: 'UseOrderNo', title: '使用订单号', width: 100 },
         { field: 'UseDate', title: '使用日期', width: 100 },
         { field: 'CustomerId', title: '归属会员号', width: 100 },
          { field: 'CustomerName', title: '归属会员名称', width: 100 },
         { field: 'CreateDate', title: '创建时间', width: 100 }
                ]],
                pagination: true,
                pageSize: 20, //每页显示的记录条数，默认为10     
                pageList: [20, 30, 40] //可以设置每页记录条数的列表    
            }
               );

            $("#btnAdd").click(function () {
                tabObj.add("/SalePromotionManager/Ticket/Hd", "新增");
            });

            $("#btnEdit").click(function () {
                if (!gridObj.isSelected()) {
                    $.alertExtend.infoOp();
                    return;
                }
                var PkId = gridObj.getSelectedRow().PkId;
                tabObj.add("/SalePromotionManager/Ticket/Hd?PkId=" + PkId, "编辑" + PkId);
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
                        url: "/SalePromotionManager/Ticket/Delete?PkId=" + gridObj.getSelectedRow().PkId
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
    pro.Ticket.ListPage.initPage();
});


