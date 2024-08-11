<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
  <link rel="stylesheet" href="styles/tableau.css">
  <title>Mes utilisateurs</title>
</head>
<body>
<table border="1">
  <tr>
    <th>Email</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Age</th>
    <th>Date of Birth</th>
    <th>Role</th>
  </tr>

  <c:forEach var="user" items="${users}">
    <tr>
      <td>${user.email}</td>
      <td>${user.firstname}</td>
      <td>${user.lastname}</td>
      <td>${user.age}</td>
      <td>${user.dob}</td>
      <td>${user.role}</td>
    </tr>
  </c:forEach>

</table>
</body>
</html>
