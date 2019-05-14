<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>欢迎界面</title>
  <link href="css/hello.css" rel="stylesheet" type="text/css" />
</head>
<body>
  <div class='gcs-login'>
    <div class="gcs-login-panel">
      <div class="gcs-login-container">
      </div>
      <br><br><br><br><br>
      <div class="gcs-login-container">
        <button id="bi" onclick="tobijsp()" class="btn-login">报表拍照界面</button>
        <button id="photo" onclick="toPhotojsp()" class="btn-login">手工拍照界面</button>
      </div>
    </div>
  </div>
</body>
<script>
    function tobijsp(){
        window.location.href = "biPhoto.jsp";
    }
    function toPhotojsp() {
        window.location.href = "handPhoto.jsp";
    }
</script>
</html>