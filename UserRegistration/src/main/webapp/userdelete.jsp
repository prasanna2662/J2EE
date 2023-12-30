<%@ page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${result eq 1 }">
<jsp:include page="userdelete.html"></jsp:include>
data deleted successfully.... with userId...<%=request.getParameter("userId") %>
</c:if>
<c:if test="${result eq 0 }">
<jsp:include page="userdelete.html"></jsp:include>
data deleted fail.... with userId...<%=request.getParameter("userId") %>
</c:if>



</body>
</html>