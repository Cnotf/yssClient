<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>报表拍照界面</title>
  <!--easyui-->
  <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/default/easyui.css" />
  <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/icon.css" />
  <script type="text/javascript" src="js/jquery-easyui-1.5/jquery.min.js"></script>
  <script type="text/javascript" src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
  <%--<script type="text/javascript" src="<%=request.getContextPath()%>/js/common.js"></script>--%>
  <script type="text/javascript">
      $(function () {
          var IsCheckFlag = true;
          $("#tt").datagrid({
              title: "关联信息",
              url: "<%=request.getContextPath()%>/trusteeFee",
              width: "100%",
              height: "628px",
              striped: true,     //交替行换色
              rownumbers: true,  //行号
              pagination: true,  //显示底部分页
              fitColumns: true,//自动适应。先给列随便加个宽度
              toolbar: "#tb",
              checkOnSelect: false, //true，当用户点击行的时候该复选框就会被选中或取消选中。
              selectOnCheck: true, //true，单击复选框将永远选择行。
              onClickRow: function (index, row) {
                  var d_id = row["d_id"];
              },
              onClickCell: function (rowIndex, field, value) {
                  IsCheckFlag = false;
              },
              onSelect: function (rowIndex, rowData) {
                  if (!IsCheckFlag) {
                      IsCheckFlag = true;
                      $("#tt").datagrid("unselectRow", rowIndex);
                  }
              },
              onUnselect: function (rowIndex, rowData) {
                  if (!IsCheckFlag) {
                      IsCheckFlag = true;
                      $("#tt").datagrid("selectRow", rowIndex);
                  }
              }
          });

          var p = $('#tt').datagrid('getPager');
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

      //搜索
      function doSearch() {
          $('#tt').datagrid('load', {
              dname: $('#d_name').val(),
              delse: $('#d_else').val()
          });
      };


      //格式化列数据
      function formatPrice(val, row, index) {
          if (row.d_amount < 1010) {
              return '<span style="color:red;">' + val + '</span>';
          } else {
              return val;
          }
      }


      //自定义操作列
      function formatOper(val, row, index) {
          var str = "";
          str += '<a href="javascript:void(0);" onclick="doEdit(' + row.d_id + ')">修改</a>';
          str += '  ';
          str += '<a href="javascript:void(0);" onclick="doDelete(' + row.d_id + ')">删除</a>';
          return str;
      }
      //编辑
      function doEdit(id) {
          alert(id);
      }
  </script>
</head>
<body>
<form id="form1" runat="server">
  <div>
    <table id="tt">
      <thead>
      <tr>
        <th field="ck" width="100" align="center" checkbox="true"></th>
        <th field="d_id" width="100" align="center">编号</th>
        <th field="d_name" width="100" align="center" sortable="true">用户名</th>
        <th field="d_password" width="100" align="center" sortable="true">用户密码</th>
        <th field="d_else" width="100" align="center" sortable="true">备注信息</th>
        <th field="d_amount" width="100" align="center" sortable="true" formatter="formatPrice">账户余额</th>
        <th field="_operate" width="100" align="center" formatter="formatOper">操作</th>
      </tr>
      </thead>
    </table>
  </div>

  <!--查询区域-->
  <div id="tb" style="padding: 3px">
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="doSearch()">批量关联</a>
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-undo'" onclick="history.go(-1);">返回</a>
  </div>
</form>
</body>
</html>