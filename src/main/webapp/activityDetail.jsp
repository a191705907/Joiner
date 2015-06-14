<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/6/14
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>single activity detail</title>
</head>
<body>
    <s:if test="#session.activity!=null">
        <h2> <s:property value="#session.activity.activityName"/></h2>
        <h4> <s:property value="#session.activity.activityId" /></h4>
        <h4> <s:property value="#session.activity.organizer.organizerName" /> </h4>
    </s:if>
</body>
</html>
