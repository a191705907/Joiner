<%--
  Created by IntelliJ IDEA.
  User: zl
  Date: 1/23/2015
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Hello Student</title>
</head>
<body>
    <s:if test="#session.student!=null">
        <h2><s:property value="#session.student.studentName"/></h2>
        <h3><s:property value="#session.student.studentId" /></h3>
        <%--<h3><s:property value="#session.student.studentPhone" /></h3>--%>
        <form name="see_joined" method="post" action="see_joined" validate="true">
            <input type="text" value=${student.studentId} name="student1.studentId"/>
            <input type="text" value=${student.studentName} name="student1.studentName"/>
            <input type="text" value=${student.studentPassword} name="student1.studentPassword"/>
            <input type="Submit" value="My Joins" />
        </form>
    </s:if>
    <form name="search_activity" method="post" action="search_activity" validate="true">
        <p>activity name:
            <input type="text" value=${student.studentId} name="student.studentId"/>
            <input type="text" value=${student.studentName} name="student.studentName"/>
            <input type="text" value=${student.studentPassword} name="student.studentPassword"/>
            <input type="text" name="activity.activityName">
            <input type="Submit" value="search activity by name">
        </p>
    </form>

    <s:if test="#session.activityList!=null">
        <s:iterator value="#session.activityList" id="activity">
            <form name="activity_detail_stu" method="post" action="activity_detail_stu" validate="true">
                <p>
                    <h4>activity name: <s:property value="#activity.activityName"/></h4>
                    <h4>organizer: <s:property value="#activity.organizerName"/></h4>
                    <h4>time: <s:property value="#activity.time" /></h4>
                    <h4>place: <s:property value="#activity.place" /></h4>
                    <%--REMEMBER: here text should be hidden at last--%>
                    <input type="hidden" value=${activity.activityId} name="activity.activityId"/>
                    <input type="hidden" value=${student.studentId} name="student.studentId"/>
                    <input type="hidden" value=${student.studentName} name="student.studentName"/>
                    <input type="hidden" value=${student.studentPassword} name="student.studentPassword"/>
                    <input type="Submit" value="see detail for activity"/>
                </p>
            </form>
        </s:iterator>
    </s:if>
</body>
</html>