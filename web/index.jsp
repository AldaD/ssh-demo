<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: alda
  Date: 18-3-13
  Time: 下午3:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<div style="font-size: 14px;font-weight: bold">user login </div>
  <div>
  <s:form action="add" namespace="/addresslist">

   <s:textfield name="name" style="font-size:12px;width:120px" label="username" />
   <s:textfield name="phone" style="font-size:12px;width:120px" label="phonenumber" />
   <s:submit value="add"/>

  </s:form>
  </div>
  
  </body>
</html>
