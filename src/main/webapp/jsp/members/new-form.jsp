<%@ page contentType="text/html;charset=UTF-8" language="java" %>   <!--jsp 파일임을 명시-->
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/jsp/members/save.jsp" method="post"> <!--response 시 해당 url로 redirection-->
    username: <input type="text" name="username" />
    age: <input type="text" name="age" />
    <button type="submit">전송</button>
</form>
</body>
</html>
