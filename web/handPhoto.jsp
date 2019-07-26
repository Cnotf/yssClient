<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>报表拍照界面</title>
  <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/default/easyui.css" />
  <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/icon.css" />
  <script type="text/javascript" src="js/jquery-easyui-1.5/jquery.min.js?v=1.1.1"></script>
  <script type="text/javascript" src="js/jquery-easyui-1.5/jquery.easyui.min.js?v=1.1.3"></script>
  <script type="text/javascript" src="common.js?v=1.5.9"></script>
</head>
<body>
    <table id="grid">
    </table>
    <%--data-options="iconCls:'icon-save',modal:true"--%>
    <div id="win" class="easyui-window" title="拍照时间信息" style="width:600px;height:400px"
         minimizable="false"  modal="true" closed="true" closable="false"
         buttons="#dlg-buttons">
        <form id="fm" method="post" style="margin-top: 20px; margin-left: 20px;">
            <div class="fitem" align="center">
                <input id="id" name="id" class="easyui-textbox" type="hidden"/>
                <table style="margin: 80px">
                    <tr>
                        <td>
                            拍照日期：<span style="color:red;">*</span>
                        </td>
                        <td>

                            <input id="photo1" name="photoOperationDate" class="easyui-datebox" style="width: 200px;height: 30px;"  data-options="onSelect:valicationDateEquals1,formatter:myformatter,parser:myparser,editable:false,required: true"  >
                        </td>
                    </tr>
                    <tr style="margin: 40px;">
                        <td>
                            账务日期：<span style="color:red;">*</span>
                        </td>
                        <td>
                            <input id="photo2" name="photoDate" class="easyui-datebox" style="width: 200px;height: 30px;"  data-options="onSelect:valicationDateEquals2,formatter:myformatter,parser:myparser,editable:false,required: true">
                        </td>
                    </tr>
                    <tr></tr>
                </table>
                <div id="dlg-buttons" style="display: block">
                    <a id="hand"  href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" onclick="saveData('handPhoto')">手工拍照</a>
                    <a id="save" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" onclick="saveData('save')">保存</a>
                    <a href="javascript:void(0)" class="easyui-linkbutton" iconcls="icon-cancel" onclick="closeWin()">取消</a>
                    <%--javascript:$('#win').dialog('close')--%>
                </div>
            </div>
        </form>
    </div>
    <%--<div id="edit-window"  title="编辑"  style="width: 400px; padding: 10px 20px; height: 410px;"
         closed="true" buttons="#dlg-buttons">
    </div>--%>
    <div id="tb">
        <label>
            拍照日期：<input id="photoOperationDate" class="easyui-datebox" style="width: 150px;"  data-options="formatter:myformatter,parser:myparser,editable:false"  >
        </label>
        <label>
            账务日期：<input id="photoDate" class="easyui-datebox" style="width: 150px;"  data-options="formatter:myformatter,parser:myparser,editable:false">
        </label>
        <label>
            拍照状态：<input  id="photoStatus"  data-options="url:'json/photostatus.json?v=1.4.7',
                valueField:'id',
                textField:'name'" class="easyui-combobox" >
        </label>
        <label>
            拍照类型：<input  id="photoType"  data-options="url:'json/phototype.json?v=1.4.7',
                valueField:'id',
                textField:'name'" class="easyui-combobox" >
        </label>
        <label>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="doSearch()">查询</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-undo" plain="true" onclick="history.go(-1);">返回</a>
        </label>
        <label style="padding-left: 15%;">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="openWin('hand')">手工拍照</a>
        <%--<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="reportServer('save')">保存</a>--%>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editPhoto()">编辑</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="openWin('add')">新建</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="deletePhoto()">删除</a>
        </label>
    </div>
</body>
<script type="text/javascript">
    $(function () {
        $("#grid").datagrid({
            title: "报表拍照",
            url: "<%=request.getContextPath()%>/handPhoto?query",
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
                {field: 'id', title: '选择', width: 100, sortable: true, checkbox: true },
                {field: 'photoOperationDate', title: '拍照日期', width: 150},
                {field: 'photoDate', title: '账务日期', width: 150},
                { field: 'createDate', title: '创建时间', width: 100,
                    formatter: function (value, row, index) {
                        return formatDate(value);
                    }},
                { field: 'photoStatus', title: '拍照状态', width: 100,
                    formatter: function(value,row,index){
                        return getJsonValue('json/photostatus.json',row.photoStatus);
                    }},
                { field: 'photoType', title: '拍照类型', width: 100,
                    formatter: function(value,row,index){
                         return getJsonValue('json/phototype.json',row.photoType);
                    }}
            ]]
        });

        var p = $("#grid").datagrid('getPager');
        $(p).pagination({
            beforePageText: '第',
            afterPageText: '页    共 {pages} 页',
            displayMsg: '当前显示 {from}-{to} 条记录,共 {total} 条记录'
        });
    });


    /**
     * 比较两个日期大小
     * **/
    function valicationDateEquals1(target){

        //账务日期
        var photoDate = $('#photo2').datebox('getValue');
        if (photoDate !=null && photoDate !="" && myformatter(target) <= photoDate ) {
            $.messager.alert("提示", "该值必须大于【账务日期】！", "info");
            $('#photo1').datebox("setValue","");
        }
    }

    function valicationDateEquals2(target){

        //拍照日期
        var photoOperationDate = $('#photo1').datebox('getValue');
        if (photoOperationDate !=null && photoOperationDate !="" && myformatter(target) >= photoOperationDate ) {
            $.messager.alert("提示", "该值必须小于【拍照日期】！", "info");
            $('#photo2').datebox("setValue","");
        }

    }


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
     * 打开窗口
     * **/
    function openWin(type) {
        $('#win').window('open');
        $('#win').window('vcenter');
        if (type == "hand") {
            $('#save').hide();
            $('#hand').show();
        } else {
            $('#hand').hide();
            $('#save').show();
        }

    }


    /**
     * 清空表单内容并关闭窗口
     * */
    function closeWin() {
        //清空表单内容
        $('#fm').form('clear');
        $('#win').window('close');
    }

    /**
     * 查询
     * */
    function doSearch(){
        $('#grid').datagrid('reload',{
            photoOperationDate: $('#photoOperationDate').datebox("getValue"),
            photoDate: $('#photoDate').datebox("getValue"),
            photoStatus: $('#photoStatus').combobox("getValue"),
            photoType: $('#photoType').combobox("getValue")
        });
    }


    /**
     * 编辑拍照信息
     * **/
    function editPhoto() {
        var rows = $("#grid").datagrid("getSelections");
        if (rows.length == 0) {
            $.messager.alert("提示", "请选择一条数据编辑！", "info");
        } else if (rows.length > 1) {
            $.messager.alert("提示", "只能选择一条数据编辑！", "info");
        } else {
            if (rows[0].photoStatus == '1') {
                $.messager.alert("提示", "不能编辑已拍照的数据！", "info");
                return;
            }
            openWin('edit');
            $('#hand').hide();
            $('#win').window('refresh',setValue(rows[0]));
        }
    }

    /**
     * 给弹出框赋值
     * */
    function setValue(row) {
        $('#photo1').datebox("setValue",row.photoOperationDate);
        $('#photo2').datebox("setValue",row.photoDate);
        $('#id').textbox("setValue",row.id);
    }

    /**
     *  逻辑删除数据
     * */
    function deletePhoto() {
        var rows = $("#grid").datagrid("getSelections");
        if (rows.length == 0) {
            $.messager.alert("提示", "请选择至少一条数据！", "info");
        } else {
            //先删除新增的行
            //判断是否全部是新增的 如果全部新增则不发送请求到后端
            var addRowCount = 0;
            for(var i in rows){
                if (rows[i].id == undefined) {
                    var index = $('#grid').datagrid('getRowIndex', rows[i]);
                    $('#grid').datagrid('deleteRow', index);
                    addRowCount++;
                }
            }
            //如果全部是新增行，则直接提示即可
            if (addRowCount == rows.length) {
                $.messager.alert("提示", "操作成功！", "info");
            } else {
                $.messager.confirm("提示", "你确定要删除吗?", function (r) {
                    if (r) {
                        reportServer(rows, 'delete');
                    }
                });

            }
        }

    }

    /**
     *
     * 保存  手工拍照
     * @param type
     */
    function saveData(type){
        if($("#fm").form('validate')) {
            var json = [{
                "photoOperationDate": $('#photo1').datebox("getValue"),
                "photoDate": $('#photo2').datebox("getValue"),
                "id": $('#id').textbox("getValue")
            }];
            reportServer(json,type);
        }else {
            $.messager.alert('操作提示', '存在校验项未通过！', "warning");
        }
    }

    /**
     * 发送数据到服务端
     * @param json
     * @param type
     */
    function reportServer(json,type) {
            $.messager.progress();
            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/handPhoto?" + type,
                data: JSON.stringify(json),
                dataType: "text",
                success: function (result) {
                    $.messager.progress('close');
                    if (result == "1") {
                        $.messager.alert("提示", "操作成功！", "info");
                        closeWin();
                        doSearch();
                    } else {
                        $.messager.alert("错误", "操作失败！", "error");
                    }

                },
                error: function (result) {
                    $.messager.progress('close');
                }
            });

  }
</script>
</html>