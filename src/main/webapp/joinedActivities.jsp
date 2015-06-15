<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/6/16
  Time: 2:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>My Joins</title>
</head>
<body>
<s:if test="#session.student!=null">
    <h2><s:property value="#session.student.studentName"/></h2>
    <h3><s:property value="#session.student.studentId" /></h3>
</s:if>
<s:if test="#session.activityList2!=null">
    <s:iterator value="#session.activityList2" id="activity2">
        <form name="activity_detail_stu" method="post" action="activity_detail_stu" validate="true">
            <p>
            <h4>activity name: <s:property value="#activity2.activityName"/></h4>
            <h4>activity id: <s:property value="#activity2.activityId"/> </h4>
            <h4>organizer: <s:property value="#activity2.organizerName"/></h4>
            <h4>time: <s:property value="#activity2.time" /></h4>
            <h4>place: <s:property value="#activity2.place" /></h4>
                <%--REMEMBER: here text should be hidden at last--%>
            <input type="text" value=${activity2.activityId} name="activity.activityId"/>
            <input type="text" value=${student.studentId} name="student.studentId"/>
            <input type="text" value=${student.studentName} name="student.studentName"/>
            <input type="text" value=${student.studentPassword} name="student.studentPassword"/>
            <input type="Submit" value="see detail for activity"/>
            </p>
        </form>
    </s:iterator>
</s:if>
</body>
</html>
