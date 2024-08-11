<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <link rel="stylesheet" href="../styles/register.css">
    <link rel="icon" href="../icons/register.png">
    <title>S'inscrire</title>
</head>
<body>
<div id="register-container">
    <form action="register-servlet" method="post">
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Votre email" required/>
        </div>

        <div class="form-group">
            <label for="password">Mot de passe:</label>
            <input type="password" id="password" name="password" placeholder="Votre mot de passe" required/>
        </div>

        <div class="form-group">
            <label for="firstname">Prénom:</label>
            <input type="text" id="firstname" name="firstname" placeholder="Votre prénom" required/>
        </div>

        <div class="form-group">
            <label for="lastname">Nom de famille:</label>
            <input type="text" id="lastname" name="lastname" placeholder="Votre nom de famille" required/>
        </div>

        <div class="form-group">
            <label for="age">Age:</label>
            <input type="number" id="age" name="age" min="0" max="100" placeholder="Veuillez indiquer votre age" required/>
        </div>

        <div class="form-group">
            <label for="role">Status:</label>
            <select id="role" name="role">
                <option value="USER">Utilisateur(trice)</option>
                <option value="ADMIN">Administrateur(trice)</option>
            </select>
        </div>

        <div class="form-group">
            <label for="birthdate">Date de naissance:</label>
            <input type="date" id="birthdate" name="birthdate" placeholder="Date de naissance" required/>
        </div>

        <button type="submit">S'inscrire</button>
        <span><a href="../bienvenue.jsp">Revenir à la page d'accueil</a></span>
    </form>
</div>
</body>
</html>
