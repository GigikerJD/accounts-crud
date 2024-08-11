package com.example.accounts;

import com.example.accounts.entities.UserEntity;
import com.example.accounts.entities.UserSessionBean;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.*;

@WebServlet(name="usersServlet", value="users-servlet")
public class UsersServlet extends HttpServlet {

    @EJB
    private UserSessionBean usb;

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<UserEntity> users = usb.getUsers();
        req.setAttribute("users", users);
        req.getRequestDispatcher("tableau.jsp").forward(req, res);
    }
}
