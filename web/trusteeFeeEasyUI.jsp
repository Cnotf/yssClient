<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>托管费关联维护界面</title>
  <!--easyui-->
  <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/default/easyui.css" />
  <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/icon.css" />
  <script type="text/javascript" src="js/jquery-easyui-1.5/jquery.min.js?v=1.1.0"></script>
  <script type="text/javascript" src="js/jquery-easyui-1.5/jquery.easyui.min.js?v=1.1.2"></script>
    <script type="text/javascript" src="common.js?v=1.5.9"></script>
  <script type="text/javascript">
      var editRow = undefined; //定义全局变量：当前编辑的行
      $(function () {
          var datagrid; //定义全局变量datagrid
          var IsCheckFlag = true;
          datagrid = $("#tt").datagrid({
              title: "托管费关联信息",
              url: "<%=request.getContextPath()%>/trusteeFee?query",
              width: "100%",
              height: "613px",
              striped: true,     //交替行换色
              rownumbers: true,  //行
              pagination: true,  //显示底部分页
              fitColumns: true,//自动适应。先给列随便加个宽度
              checkOnSelect: true, //true，当用户点击行的时候该复选框就会被选中或取消选中。
              selectOnCheck: true, //true，单击复选框将永远选择行。
              columns: [[
                  {field: 'id', title: '选择', width: 100, sortable: true, checkbox: true },
                  {
                      field: 'intGrpCd', title: '投资组合编号', width: 100,
                      editor: {type: 'textbox', options: { required: true} }
                  },
                  {
                      field: 'intGrpNm', title: '投资组合名称', width: 200,
                      editor: {type: 'textbox', options: { required: true} }
                  },
                  { field: 'pymAccNo', title: '付款账号', width: 100},
                  { field: 'pymDt', title: '付款日期', width: 100},
                  { field: 'rcptAccNo', title: '收款账号', width: 100},
                  { field: 'amt', title: '金额', width: 100},
                  { field: 'isRltv', title: '是否关联', width: 100,
                      formatter: function(value,row,index){
                          return getJsonValue('json/guanlianstatus.json',row.isRltv);
                      }},
              ]],
              toolbar: '#tb',
              onAfterEdit: function (rowIndex, rowData, changes) {
                  //endEdit该方法触发此事件
                  editRow = undefined;
              },
              onBeforeLoad: function (target, rows) {
                  $('#isRltv').addClass("easyui-combobox");
              },
              onDblClickRow: function (rowIndex, field, rowData) {
                  //双击开启编辑行
                  if (editRow != undefined) {
                      datagrid.datagrid("endEdit", editRow);
                  }
                  if (editRow == undefined) {
                      datagrid.datagrid("beginEdit", rowIndex);
                      // var ed = datagrid.datagrid('getEditor', {index:rowIndex,field:field});
                      // $(ed.target).focus();
                      editRow = rowIndex;
                  }
              },
              onSelect: function (rowIndex, rowData) {
                  if (editRow != undefined) {
                      datagrid.datagrid("endEdit", editRow);
                      datagrid.datagrid("selectRow", rowIndex);
                  }
                  if (!IsCheckFlag) {
                      IsCheckFlag = true;
                      datagrid.datagrid("unselectRow", rowIndex);
                  }
              },
              onUnselect: function (rowIndex, rowData) {
                  if (!IsCheckFlag) {
                      IsCheckFlag = true;
                      datagrid.datagrid("selectRow", rowIndex);
                  }
              }
          });

          var p = datagrid.datagrid('getPager');
          $(p).pagination({
              /*
                  页数文本框前显示的汉字 修改每页默认条数
                  搜索pageList在jquery.easyui.min.js中修改，
                  分页区下拉分页数量集合和默认每页分页条数
                  striped属性 交替行换色
              */
              beforePageText: '第',
              afterPageText: '页    共 {pages} 页',
              displayMsg: '当前显示 {from}-{to} 条记录,共 {total} 条记录'
          });
      });

      /**
       *
       * 关联数据
       **/
      function save(rows) {
          $.messager.progress();
          $.ajax({
              type: "post",
              url: "<%=request.getContextPath()%>/trusteeFee?save",
              data: JSON.stringify(rows),
              dataType: "text",
              success: function (result) {
                  $.messager.progress('close');
                  if (result == "1") {
                      $.messager.alert("提示", "关联成功！", "info");
                      doSearch();
                  } else if (result == "2"){
                      $.messager.alert("错误", "服务端处理异常！", "error");
                  } else {
                      $.messager.alert("错误", "关联失败！", "error");
                  }

              },
              error: function (result) {
                  $.messager.progress('close');
              }
          });

      }

      /**
       * 校验值是否为空
       **/
      function validation(data) {
          if (data == null || data == undefined || data == "" || data == "null") {
              return false;
          } else {
              return true;
          }
      }

      function doSearch(){
          $('#tt').datagrid('reload',{
              isRltv: $('#isRltv').combobox("getValue")
          });
      }

      function guanlian() {
          //修改时要获取选择到的行
          var rows = $('#tt').datagrid("getSelections");
          //如果只选择了一行则可以进行修改，否则不操作
          if (rows.length == 0) {
              $.messager.alert("提示", "请选择至少一条数据！", "info");
          } else {
              if (editRow != undefined) {
                  $('#tt').datagrid("endEdit", editRow);
              }
              for (var i in rows) {
                  if (validation(rows[i].intGrpCd) && validation(rows[i].intGrpNm)) {
                      save(rows);
                  } else {
                      $.messager.alert("提示", "投资组合编号和名称不能为空！", "info");
                  }
              }

          }
      }

  </script>
</head>
<body>
<form id="form1" runat="server">
    <table id="tt">
    </table>
    <div id="tb">
        <label>
            是否关联：<input  id="isRltv"  data-options="url:'json/guanlianstatus.json',
                valueField:'id',
                textField:'name'" class="easyui-combobox" >
            <%--  editable="false"--%>
        </label>
        <label>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="doSearch()">查询</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="guanlian()">关联</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-undo" plain="true" onclick="history.go(-1);">返回</a>
        </label>
    </div>
</form>
</body>
</html>