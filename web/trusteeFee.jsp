<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>报表拍照界面</title>
  <link href="css/hello.css?v=1.1.0" rel="stylesheet" type="text/css" />
</head>
<body>
<form action="<%=request.getContextPath()%>/trusteeFee" method="post">
  <div class='gcs-login'>
    <div class="gcs-login-panel">
      <div class="login-title">
        <h2>托管费信息录入</h2>
      </div>
      <div class="gcs-login-container">
        <table>

          <tr>
            <td>
              投资组合代码：<span style="color:red;">*</span>
            </td>
            <td>
              <input type="text" name="intGrpCd" class="text-input" required="required"/>
            </td>
            <td>
              投资组合名称：<span style="color:red;">*</span>
            </td>
            <td>
              <input type="text" name="intGrpNm" class="text-input" required="required"/>
            </td>

          </tr>
          <tr>
            <td>
              付款日期：<span style="color:red;">*</span>
            </td>
            <td>
              <input type="date" name = "pymDt" class="text-input" required="required">
            </td>
            <td>
              付款账号：<span style="color:red;">*</span>
            </td>
            <td>
              <input type="text" name="pymAccNo" class="text-input" required="required"/>
            </td>

          </tr>
          <tr>
            <td>
              金额：<span style="color:red;">*</span>
            </td>
            <td>
              <input type="number" name="amt" class="text-input" required="required"/>
            </td>
            <td>
              收款账号：<span style="color:red;">*</span>
            </td>
            <td>
              <input type="text" name="rcptAccNo" class="text-input" required="required"/>
            </td>

          </tr>
          <tr>
            <td>
              来源类型：<span style="color:red;">*</span>
            </td>
            <td>
              <select name="scrType" id="scrType" class="text-input" disabled>
                 <option value="4">手工关联</option>
              </select>
            </td>
            <td>
              是否关联：<span style="color:red;">*</span>
            </td>
            <td>
              <select name="isRltv" id="isRltv" class="text-input">
                <option value="0">未关联</option>
                <option value="1">已关联</option>
              </select>
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