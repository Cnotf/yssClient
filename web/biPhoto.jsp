<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>报表拍照界面</title>
  <link href="css/hello.css?v=1.1.0" rel="stylesheet" type="text/css" />
</head>
<body>
<form action="<%=request.getContextPath()%>/biPhoto" method="post">
  <div class='gcs-login'>
    <div class="gcs-login-panel">
      <div class="login-title">
        <h2>报表拍照日期</h2>
      </div>
      <div class="gcs-login-container">
        <table>

          <tr>
            <td>
              开始拍照日期：<span style="color:red;">*</span>
            </td>
            <td>
              <input type="date" name = "startPhotoDate" class="data-input" required="required">
            </td>
            <td>
              结束拍照日期：<span style="color:red;">*</span>
            </td>
            <td>
              <input type="date" name = "endPhotoDate" class="data-input" required="required">
            </td>
          </tr>
          <tr>
            <td>
              开始账务日期：<span style="color:red;">*</span>
            </td>
            <td>
              <input type="date" name = "startAccountDate" class="data-input" required="required">
            </td>
            <td>
              结束账务日期：<span style="color:red;">*</span>
            </td>
            <td>
              <input type="date" name = "endAccountDate" class="data-input" required="required">
            </td>
          </tr>
          <tr>
            <td>
              报表名称：<span style="color:red;">*</span>
            </td>
            <td colspan="3">
              <input type="text" name="biName" class="text-input" required="required"/>
            </td>
          </tr>
        </table>
      </div>
      <br />
      <div class="gcs-login-container">
        <input type="submit"  value="确定" class="btn-login"/>
        <input type="button" value="返回" class="btn-login" onclick="history.go(-1);" />
      </div>
    </div>
  </div>
</form>

</body>
<script>
   /* function toHellojsp() {
        window.location.href = "hello.jsp";
    }*/
</script>
</html>