<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>报表下载</title>
  <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/default/easyui.css" />
  <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/icon.css" />
  <script type="text/javascript" src="js/jquery-easyui-1.5/jquery.min.js?v=1.1.1"></script>
  <script type="text/javascript" src="js/jquery-easyui-1.5/jquery.easyui.min.js?v=1.1.3"></script>
  <script type="text/javascript" src="common.js?v=1.5.9"></script>
</head>
<body>
    <table id="grid">
    </table>
    <div id="tb">
        <label>
            报表名称：<input id="biName" class="easyui-textbox" data-options="prompt:'请输入报表名称...'">
        </label>
        <label>
            拍照开始日期：<input id="startPhotoDate" class="easyui-datebox" style="width: 150px;"  data-options="formatter:myformatter,parser:myparser,editable:false"  >
        </label>
        <label>
            拍照结束日期：<input id="endPhotoDate" class="easyui-datebox" style="width: 150px;"  data-options="formatter:myformatter,parser:myparser,editable:false">
        </label>
        <label>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="doSearch()">查询</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-undo" plain="true" onclick="history.go(-1);">返回</a>
        </label>
    </div>
</body>
<script type="text/javascript">
    $(function () {
        $("#grid").datagrid({
            title: "报表下载",
            url: "<%=request.getContextPath()%>/biPhoto?query",
            width: "100%",
            height: "613px",
            striped: true,     //交替行换色
            rownumbers: true,  //行号
            pagination: true,  //显示底部分页
            fitColumns: true, //自动适应。先给列随便加个宽度
            toolbar: "#tb",
            checkOnSelect: true, //true，当用户点击行的时候该复选框就会被选中或取消选中。
            selectOnCheck: true, //true，单击复选框将永远选择行。
            columns: [[
                {field: 'biName', title: '报表名称', width: 150,
                    formatter: function(value,row,index){
                        return getJsonValue('json/reportdata.json',row.biName);
                    }},
                {field: 'startPhotoDate', title: '拍照开始日期', width: 150},
                {field: 'endPhotoDate', title: '拍照结束日期', width: 150},
                { field: 'createDate', title: '创建时间', width: 100,
                    formatter: function (value, row, index) {
                        return formatDate(value);
                    }},
                {field: 'operate', title: '操作', width: 150}
            ]]
        });

        var p = $("#grid").datagrid('getPager');
        $(p).pagination({
            beforePageText: '第',
            afterPageText: '页    共 {pages} 页',
            displayMsg: '当前显示 {from}-{to} 条记录,共 {total} 条记录'
        });
    });



    //给datebox选择框增加 清除按钮 添加在页面渲染之后
    var buttons = $.extend([], $.fn.datebox.defaults.buttons);
    buttons.splice(1, 0, {
        text: 'Clear',
        handler: function (target) {
            $(target).datebox("setValue","");
        }
    });
    $('.easyui-datebox').datebox({
        buttons: buttons
    });


    /**
     * 查询
     * */
    function doSearch(){
        $('#grid').datagrid('reload',{
            biName: $('#biName').textbox("getValue"),
            startPhotoDate: $('#startPhotoDate').datebox("getValue"),
            endPhotoDate: $('#endPhotoDate').datebox("getValue"),
        });
    }

</script>
</html>