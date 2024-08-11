<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
    <head>
        <link rel="stylesheet" href="styles/login.css">
        <link rel="icon" href="icons/login.png">
        <title>Se connecter</title>
    </head>
    <body>
        <div id="form-container">
            <form action="login-servlet" method="get">
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" placeholder="Veuillez taper votre email..." required/>
                </div>
                <div class="form-group">
                    <label for="password">Mot de passe:</label>
                    <input type="password" id="password" name="password" placeholder="Veuillez saisir votre mot de passe" required/>
                </div>
                <button type="submit">Se connecter</button>
                <span><a href="bienvenue.jsp">Revenir à la page d'accueil</a></span>
            </form>
        </div>
    </body>
</html>
