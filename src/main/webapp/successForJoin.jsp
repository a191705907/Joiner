<%--
  Created by IntelliJ IDEA.
  User: zl
  Date: 1/23/2015
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
</head>
<body>
<h2>Success to join the activity!!</h2>
<form name="student_back" method="post" action="student_login" validate="true">
    <p>
        <input type="text" value=${session.student.studentId} name="student.studentId">
        <input type="text" value=${session.student.studentPassword}
                name="student.studentPassword">
    </p>
    <p>
        <input type="Submit" value="ok">
    </p>
</form>
</body>
</html>