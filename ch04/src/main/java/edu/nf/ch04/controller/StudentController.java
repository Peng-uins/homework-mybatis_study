package edu.nf.ch04.controller;

import com.google.gson.Gson;
import edu.nf.ch04.dao.StuDao;
import edu.nf.ch04.dao.impl.StudentDaoImpl;
import edu.nf.ch04.entity.Student;
import edu.nf.ch04.entity.Studentz;

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
@WebServlet("/list")
public class StudentController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StuDao dao = new StudentDaoImpl();
        //从数据库拿到学生对象
        List<Student> list = dao.getStudentById();
        List<Studentz> list1 = new ArrayList<>();
        for(Student s : list){
            list1.add(new Studentz(s.getStuId(),s.getStuName(),s.getStuAge(),s.getClassInfo().getClassName(),s.getIdCard().getCardNum()));
        }
        String json = new Gson().toJson(list1);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().println(json);
    }
}
