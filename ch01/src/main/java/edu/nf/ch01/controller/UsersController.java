package edu.nf.ch01.controller;

import edu.nf.ch01.service.UsersService;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.View;

/**
 * @author 0.0
 */
public class UsersController {

    /**
     * 使用mvc把拿到的值写回到网页
     * @return
     *WebRequest标识符和网页跳转的地址匹配
     */
    @WebRequest("/list")
    public View listUsers(){
        //创建一个业务对象
        UsersService service = new UsersService();
        //把拿到集合给mvc的JsonView对象写回到到用的网页上
        return new JsonView(service.listUser());
    }

}
