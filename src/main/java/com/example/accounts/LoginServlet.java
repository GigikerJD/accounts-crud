package com.example.accounts;

import com.example.accounts.entities.UserEntity;
import com.example.accounts.entities.UserSessionBean;
import jakarta.ejb.EJB;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(name= "loginServlet", value="/login-servlet")
public class LoginServlet extends HttpServlet {

    @EJB
    private UserSessionBean usb;
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserEntity savedUser = usb.getUser(email);
        if(savedUser != null){
            if(savedUser.getPassword().equals(password)) response.sendRedirect("success.jsp");
            else logger.info("Votre mot de passe est incorrect!");
        }else logger.info("Votre email semble ne pas être reconnu dans notre biblio");
    }

}
