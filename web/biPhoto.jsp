<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>报表拍照界面</title>
  <link href="css/hello.css?v=1.1.3" rel="stylesheet" type="text/css" />
  <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/default/easyui.css" />
  <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.5/themes/icon.css" />
  <script type="text/javascript" src="js/jquery-easyui-1.5/jquery.min.js?v=1.1.0"></script>
  <script type="text/javascript" src="js/jquery-easyui-1.5/jquery.easyui.min.js?v=1.1.0"></script>
  <script type="text/javascript" src="common.js?v=1.1.0"></script>
</head>
<body>
<form id="ff" name="ff" action="<%=request.getContextPath()%>/biPhoto" method="post">
  <div class='gcs-login'>
    <div class="gcs-login-panel">
      <div class="login-title">
        <h2>报表创建</h2>
      </div>
      <div class="gcs-login-container">
        <div>
          <table>
            <tr>
              <td>
                报表名称：<span style="color:red;">*</span>
              </td>
              <td colspan="3">
                <input id="biName" name="biName"  data-options="url:'json/reportdata.json',
			    valueField:'id',
			    textField:'name'"
                       class="easyui-combobox"   editable="false" style="width: 544px;">
              </td>
            </tr>
          </table>

        </div>
       <div id="rep1">
         <table>
          <tr>
            <td>
              开始拍照日期：<span style="color:red;">*</span>
            </td>
            <td>
                <input name="startPhotoDate" class="easyui-datebox"  data-options="formatter:myformatter,parser:myparser"  editable="false">
            </td>
            <td>
              结束拍照日期：<span style="color:red;">*</span>
            </td>
            <td>
              <%--<input type="date" name = "endPhotoDate" class="data-input"  editable="false">--%>
              <input name="endPhotoDate"  class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"  editable="false">
            </td>
          </tr>
          <tr>
            <td>
              开始账务日期：<span style="color:red;">*</span>
            </td>
            <td>
              <input name="startAccountDate"   class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"  editable="false">
            </td>
            <td>
              结束账务日期：<span style="color:red;">*</span>
            </td>
            <td>
              <input  name="endAccountDate"   class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"  editable="false">
            </td>
          </tr>
         </table>
       </div>
       <div id="rep2" style="display: none">
         <table>
         <tr>
           <td >
             年初拍照日期：<span style="color:red;">*</span>
           </td>
           <td>
             <input  name="startYearPhotoDate"   class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"  editable="false">
           </td>
           <td>
             年初账务日期：<span style="color:red;">*</span>
           </td>
           <td>
             <input  name="startYearAccDate"   class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"  editable="false">
           </td>
         </tr>
         <tr>
           <td>
             本季度拍照日期：<span style="color:red;">*</span>
           </td>
           <td>
             <input name="quarterPhotoDate"   class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"  editable="false">
           </td>
           <td>
             本季度账务日期：<span style="color:red;">*</span>
           </td>
           <td>
             <input name="quarterAccDate"   class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"  editable="false">
           </td>
         </tr>
         <tr>
           <td>
             上季度拍照日期：<span style="color:red;">*</span>
           </td>
           <td>
             <input  name="lastQuarterPhotoDate"   class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"  editable="false">
           </td>
           <td>
             上季度账务日期：<span style="color:red;">*</span>
           </td>
           <td>
             <input  name="lastQuarterAccDate"   class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"  editable="false">
           </td>
         </tr>
         <tr>
           <td>
             去年同期拍照日期：<span style="color:red;">*</span>
           </td>
           <td>
             <input  name="lastYearPhotoDate"   class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"  editable="false">
           </td>
           <td>
             去年同期账务日期：<span style="color:red;">*</span>
           </td>
           <td>
             <input  id="lastYearAccDate" name="lastYearAccDate"   class="easyui-datebox" data-options="formatter:myformatter,parser:myparser"  editable="false">
           </td>
         </tr>

         </table>
       </div>

      <br />
      <div class="gcs-login-container">
        <input type="button"  value="创建" class="btn-login" onclick="submitForm()"/>
        <input type="button" value="返回" class="btn-login" onclick="history.go(-1);" />
      </div>
    </div>
  </div>
</form>

</body>
<script>

    // $('#rep2').hide();
    // $('#rep1').show();
    $(function(){

        //设置时间
        var curr_time = new Date();
        $("input[class='easyui-datebox datebox-f combo-f textbox-f']").datebox("setValue",myformatter(curr_time));
    });

    function submitForm(){
        var isName = $("#biName").combobox("getValue");
        if (isName == '' || isName == null || isName ==0 || isName == "null") {
            alert("报表名称不能为空！");
        } else {
            $('#ff').submit();
        }
    }

    $('#biName').combobox({
        onChange: function(newValue,oldValue){
            if (newValue == 'Rpt03' || newValue == 'Rpt04') {
            //     // $('#rep1').removeAttr('required');
            //     $("#rep1 input[class='easyui-datebox datebox-f combo-f textbox-f']").each(function () {
            //         console.log(this);
            //         $(this).removeAttr('required');
            //         console.log(this);
            //
            //     })
                $('#rep1').hide();
                $('#rep2').show();
            } else {
                // $("input[name='lastYearPhotoDate']").removeAttr('required');
                // $("#rep2 input[class='easyui-datebox datebox-f combo-f textbox-f']").each(function () {
                //     $(this).removeAttr('required');
                //     console.log(this);
                // })
                $('#rep2').hide();
                // $('#rep2').removeAttr('required');
                $('#rep1').show();
            }
        }
    });
</script>
</html>