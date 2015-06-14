<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/6/14
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>scan activities</title>
</head>
<body>
    <s:if test="#session.activityList!=null">
        <s:iterator value="#session.activityList" id="activity">
            <form name="activity_detail" method="post" action="activity_detail" validate="true">
                <p>
                    <h4>activity name: <s:property value="#activity.activityName"/></h4>
                    <h4>  organizer: <s:property value="#activity.organizer.organizerName"/></h4>
                    <input type="text" value=${activity.activityId} name="activity.activityId">
                    <input type="Submit" value="see detail for activity">
                </p>
            </form>
        </s:iterator>
    </s:if>
</body>
</html>
