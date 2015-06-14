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
    <s:if test="#session.activityList!=null">
        <s:iterator value="#session.activityList" id="activity">
            <h4>activity name: <s:property value="#activity.activityName"/></h4>
            <h4>activity id: <s:property value="#activity.activityId"/></h4>
            <h4>organizer: <s:property value="#activity.organizerName"/></h4>
            <h4>organizer: <s:property value="#activity.time"/></h4>
            <h4>organizer: <s:property value="#activity.place"/></h4>
        </s:iterator>
    </s:if>
</body>
</html>
