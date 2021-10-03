<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Overlord ${overlord.id}</title>
</head>
<body>
<h1>Overlord ${overlord.name}</h1>
<ul>
    <li>
        <a>Age ${overlord.age}</a><br/>
        <a>Power ${overlord.power}</a>
    </li>
    <h2>Planets</h2>
    <li>
        <c:forEach var="planet" items="${overlord.planets}">
            <a>Id   ${planet.id}</a><br/>
            <a>Name ${planet.name}</a><br/>
            <a>Type ${planet.type}</a><br/>
            <a>Age  ${planet.age}</a><br/>
            <br/><br/><br/>
        </c:forEach>
    </li>
</ul>
</body>
</html>
