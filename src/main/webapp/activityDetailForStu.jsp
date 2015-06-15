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
    <s:if test="#session.student!=null">
        <h5>
            <s:property value="#session.student.studentId"/>
        </h5>
        <h5>
            <s:property value="#session.student.studentName"/>
        </h5>
    </s:if>
    <s:if test="#session.activity!=null">
        <h2> <s:property value="#session.activity.activityName"/></h2>
        <h4> <s:property value="#session.activity.activityId" /></h4>
        <h4> <s:property value="#session.activity.organizerName" /></h4>
        <h4>time: <s:property value="#session.activity.time" /></h4>
        <h4>place: <s:property value="#session.activity.place" /></h4>
        <h6>description: <s:property value="#session.activity.description" /></h6>
    </s:if>

    <s:if test="#session.link.activityId!=''">
        <button type="button">You have joined it</button>
    </s:if>
    <s:if test="#session.link.activityId==''">
        <form name="join_activity" method="post" action="join_activity" validate="true">
            <p>
                <input type="hidden" value=${session.student.studentId} name="student.studentId">
                <input type="hidden" value=${session.student.studentPassword} name="student.studentPassword">
                <input type="hidden" value=${session.activity.activityId} name="activity.activityId">
                <input type="hidden" value=${session.student.studentId} name="link.studentId">
                <input type="hidden" value=${session.activity.activityId} name="link.activityId">
            </p>
            <p>
                <input type="Submit" value="Join it">
            </p>
        </form>
    </s:if>
</body>
</html>
