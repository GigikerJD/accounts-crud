package com.example.accounts;

import com.example.accounts.entities.UserEntity;
import com.example.accounts.entities.UserSessionBean;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(HelloServlet.class.getName());

    @EJB
    private UserSessionBean usb;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<UserEntity> allUsers = usb.getUsers();
        request.setAttribute("users", allUsers);
        for(UserEntity user : allUsers){
            logger.info(user.getFirstname() + " " + user.getLastname());
        }

    }
}
