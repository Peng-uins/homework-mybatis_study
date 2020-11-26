package edu.nf.ch02.controller;

import com.google.gson.Gson;
import edu.nf.ch02.dao.UserDao;
import edu.nf.ch02.dao.impl.UserDaoImpl;
import edu.nf.ch02.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list")
public class UsersController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users users = new Users();

        if(request.getParameter("age") != null && request.getParameter("age") != ""){
            users.setAge(Integer.parseInt(request.getParameter("age")));
        }
        if(request.getParameter("uid") != null && request.getParameter("uid") != ""){
            users.setUid(Integer.parseInt(request.getParameter("uid")));
        }
        if(request.getParameter("userName") != null && request.getParameter("userName") != ""){
            users.setUserName(request.getParameter("userName"));
        }

        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listUsers(users);
        String json = new Gson().toJson(list);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().println(json);
    }
}
