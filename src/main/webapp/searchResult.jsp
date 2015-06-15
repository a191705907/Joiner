<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/6/16
  Time: 1:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>search result</title>
</head>
<body>
<s:if test="#session.activityList1!=null">
    <s:iterator value="#session.activityList1" id="activity1">
        <form name="activity_detail_stu" method="post" action="activity_detail_stu" validate="true">
            <p>
            <h4>activity name: <s:property value="#activity1.activityName"/></h4>
            <h4>activity id: <s:property value="#activity1.activityId"/> </h4>
            <h4>organizer: <s:property value="#activity1.organizerName"/></h4>
            <h4>time: <s:property value="#activity1.time" /></h4>
            <h4>place: <s:property value="#activity1.place" /></h4>
            <%--REMEMBER: here text should be hidden at last--%>
            <input type="text" value=${activity1.activityId} name="activity.activityId"/>
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
