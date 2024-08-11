package com.example.accounts;

import com.example.accounts.entities.UserEntity;
import com.example.accounts.entities.UserSessionBean;
import jakarta.ejb.EJB;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Logger;

import org.mindrot.jbcrypt.BCrypt;

@WebServlet(name="registerServlet", value="/register-servlet")
public class RegisterServlet extends HttpServlet{

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @EJB
    private UserSessionBean userSB;

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        int age = Integer.parseInt(req.getParameter("age"));
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        String role = req.getParameter("role");
        String birthdate = req.getParameter("birthdate");

        logger.info(req.getRequestURI());
        logger.info(req.getQueryString());
        logger.info(req.getServletPath());
        logger.info(req.getParameterNames().toString());
        logger.info(req.getMethod());

        if(age < 0 || age > 100){
            res.sendError(HttpServletResponse.SC_BAD_REQUEST, "Age must be between 0 and 100");
        }

        try {
            LocalDate dob = LocalDate.parse(birthdate);
            UserEntity userEntity = new UserEntity();
            userEntity.setEmail(email);
            userEntity.setPassword(hashedPassword);
            userEntity.setFirstname(firstname);
            userEntity.setLastname(lastname);
            userEntity.setAge(age);
            userEntity.setRole(role.toUpperCase());
            userEntity.setDob(dob);

            logger.info("User created : " + userEntity.getEmail());
            userSB.createUser(userEntity);
            logger.info("User persisted");

            req.getRequestDispatcher("success.jsp").forward(req, res);

        } catch (Exception e) {
            e.printStackTrace();
            res.sendError(HttpServletResponse.SC_BAD_REQUEST, "Failed to register user: " + e.getMessage());
        }
    }
}
