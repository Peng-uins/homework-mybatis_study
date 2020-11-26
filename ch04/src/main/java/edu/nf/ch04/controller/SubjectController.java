package edu.nf.ch04.controller;

import com.google.gson.Gson;
import edu.nf.ch04.dao.StuDao;
import edu.nf.ch04.dao.impl.StudentDaoImpl;
import edu.nf.ch04.entity.Student;
import edu.nf.ch04.entity.Subject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 0.0
 */
@WebServlet("/lists")
public class SubjectController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取到网页提交的要查询的学生id
        int num = Integer.parseInt(request.getParameter("cx"));
        //创建一个实现类
        StuDao dao = new StudentDaoImpl();
        //调用实现类的方法，获取一个学生集合
        List<Student> student = dao.getStudentById2(num);
        //创建一个集合
        List<String> list = new ArrayList<>();
        //循环学生集合
        for(Student s1 :student){
            //获取学生集合中课程集合
            for (Subject s : s1.getSubjects()){
                //拿到当前课程存入
                list.add(s.getSubName());
            }
        }
        String json = new Gson().toJson(list);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().println(json);
    }
}
