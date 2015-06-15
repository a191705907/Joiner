<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <style type="text/css">
        body {
            background-color: #99ccff;
        }
        div {
            display: inline-block;
        }
        .left {
            background-color: #004c99;
            margin: 10px;
            width: 300px;
            height: 1000px;
        }
        .right {
            background-color: #004c99;
            margin: 10px;
            width: 900px;
            height: 1000px;
            float: right;
        }
        .img {
            color: #004c99;
            border: 2px solid #99ccff;
            width: 130px;
            height: 130px;
            margin-left: 80px;
            margin-top: 40px;
        }
        .cut-line {
            border: 1px solid #99ccff;
            width: 280px;
            margin-top: 20px;
            margin-left: 10px;
        }
        .btn-1 {
            background-color: #0025BB;
            width: 300px;
            height: 50px;
            margin-top: 30px;
            text-align: center;
            line-height: 50px;
            font-size: larger;
            font-weight: bold;
            color: #99ccff;
        }
        .items {
            background-color: #007fff;
            width: 300px;
            height: 50px;
            margin-top: 10px;
            text-align: center;
            line-height: 50px;
            color: #99ccff;
            cursor: pointer;
        }
        .text-create {
            width: 900px;
            height: 100px;
            text-align: center;
            line-height: 100px;
            font-size: xx-large;
            color: #99ccff;
        }
        .line-right {
            border: 1px solid #99ccff;
            width: 890px;
            margin-top: 10px;
            margin-left: 5px;
        }
        .event-name {
            width: 800px;
            margin-left: 50px;
            margin-top: 20px;
            color: #99ccff;
        }
        .input-pic {

        }
    </style>
</head>
<body>
<div>
    <div class="container">
        <div class="left">
            <s:if test="#session.organizer!=null">
                <div class="items"><s:property value="#session.organizer.organizerName"/></div>
            </s:if>
            <div class="img">
                <img src="">
            </div>
            <div type="button" class="brn btn-1" type="button">
                Create
            </div>
            <div class="cut-line"></div>
            <s:if test="#session.activityList!=null">
                <s:iterator value="#session.activityList" id="activity">
                    <form action="activityInformation" method="post" name="activityInformation" validate="true">
                        <input type="hidden" name="activity.activityId" value="<s:property value="#activity.activityId"/>">
                        <input class="items" type="submit" value="<s:property value="#activity.activityName"/>">
                    </form>
                </s:iterator>
            </s:if>

        </div>
        <div class="right">
            <div class="text-create">Create Event</div>
            <div class="line-right"></div>
            <div class="event-name">
                <form  name="create_activity" method="post" action="create_activity" validate="true">
                <p>Event Name:</p>
                <input type="text" style="width: 800px;" name="activity.activityName">

                <p>Event Time:</p>
                <input type="text" style="width: 800px;" name="activity.organizer.organizerName">

                <p>Event detial:</p>
                <textarea type="text" style="width: 800px; height: 100px;"> </textarea>
                <p>
                    <input type="Submit" value="Submit">
                </p>
            </form>
        </div>
    </div>
    </div>
</div>
</body>
</html>