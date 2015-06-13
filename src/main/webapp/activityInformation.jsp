<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/6/14
  Time: 0:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>activity information</title>
</head>
<body>
<s:if test="#session.activityList!=null">
        <s:iterator value="#session.activityList" id="activity">
            <h4>activity name: <s:property value="#activity.activityName"/></h4>
            <h4>activity id: <s:property value="#activity.getActivityId()"/></h4>
            <h4>organizer: <s:property value="#activity.organizer.organizerName"/></h4>
        </s:iterator>
    <%--<h4>activity name: <s:property value="#session.activityList.get(0).activityName"></s:property></h4>--%>
    <%--<h4>activity id: <s:property value="#session.activityList.get(0).activityId"></s:property></h4>--%>
    <%--<h4>activity organizer: <s:property value="#session.activityList.get(0).organizer.organizerName"></s:property></h4>--%>
</s:if>
</body>
</html>
