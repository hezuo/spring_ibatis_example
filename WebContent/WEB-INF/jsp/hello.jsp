<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>lista ruc</title>
</head>
<body>
<h2>lista ruc</h2>

<ul>

	<c:forEach items="${lista}" var="myItem" varStatus="loopStatus">
	
<li><c:out value="${myItem.nombre} => ${myItem.ruc}"/></li>
</c:forEach>
</ul>
</body>
</html>