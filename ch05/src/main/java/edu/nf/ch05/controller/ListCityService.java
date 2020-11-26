package edu.nf.ch05.controller;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import edu.nf.ch05.entity.City;
import edu.nf.ch05.service.CityService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 0.0
 */
@WebServlet("/list_city")
public class ListCityService extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer pageNum = Integer.parseInt(request.getParameter("pageNum"));
        Integer pageSize = Integer.parseInt(request.getParameter("pageSize"));
        System.out.println(pageNum+pageSize);
        //创建业务层
        CityService service = new CityService();
        //查询并返回PageInfo对象
        PageInfo<City> pageInfo = service.listCity(pageNum,pageSize);
        //将PageInfo对象转换成json字符串
        String json = new Gson().toJson(pageInfo);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().println(json);
    }
}
