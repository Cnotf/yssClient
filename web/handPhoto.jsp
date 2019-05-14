<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>手工拍照界面</title>
  <link href="css/hello.css" rel="stylesheet" type="text/css" />
</head>
<body>
<form action="<%=request.getContextPath()%>/handPhoto" method="post">
  <div class='gcs-login'>
    <div class="gcs-login-panel">
      <div class="login-title">
        <h2>手工拍照</h2>
      </div>
      <div class="gcs-login-container">
        <table>
          <tr>
            <td>
              什么时间拍照：<span style="color:red;">*</span>
            </td>
            <td>
              <input id="datenow" type="date" name = "beginHandDate" class="data-input" readonly="readonly" required="required" >
            </td>

          </tr>
          <tr>
            <td>
              拍什么时间的：<span style="color:red;">*</span>
            </td>
            <td>
              <input type="date" name = "endHandDate" class="data-input" width="80%" required="required" >
            </td>
          </tr>
        </table>
      </div>
      <br />
      <div class="gcs-login-container">
        <input type="submit" value="保存" class="btn-login" />
        <input type="button" value="返回" class="btn-login" onclick="history.go(-1);" />
      </div>
    </div>
  </div>
</form>

</body>
<script>
    var now = new Date();
    //格式化日，如果小于9，前面补0
    var day = ("0" + now.getDate()).slice(-2);
    //格式化月，如果小于9，前面补0
    var month = ("0" + (now.getMonth() + 1)).slice(-2);
    //拼装完整日期格式
    var today = now.getFullYear()+"-"+(month)+"-"+(day);
    document.getElementById("datenow").value=(today);
</script>
</html>