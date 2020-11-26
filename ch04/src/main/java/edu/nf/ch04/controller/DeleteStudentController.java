package edu.nf.ch04.controller;

import com.google.gson.Gson;
import edu.nf.ch04.dao.StuDao;
import edu.nf.ch04.dao.impl.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 0.0
 */
@WebServlet("/delete_Student")
public class DeleteStudentController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StuDao dao = new StudentDaoImpl();
        String[] chk =  request.getParameterValues("chk");
        int num = 0;
        if(chk != null){
            int[] a = new int[chk.length];
            for(int i = 0; i<chk.length;i++){
                a[i] = Integer.parseInt(chk[i]);
            }
            for (int i : a){
                num =  dao.deleteStudent(i);
                num =  dao.deleteIdCard(i);
                num = dao.deleteStu_Sub(i);
            }
        }
        String json = new Gson().toJson(num);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().println(json);
    }
}
