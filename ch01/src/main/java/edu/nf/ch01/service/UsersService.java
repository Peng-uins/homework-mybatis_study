package edu.nf.ch01.service;

import edu.nf.ch01.dao.impl.UsersDaoImpl;
import edu.nf.ch01.entity.Users;
import edu.nf.ch01.util.UserUtil;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.View;

import java.util.List;

/**
 * @author 0.0
 */
public class UsersService {

    /**
     * 调用Dao的查询方法
     * @return
     */
    public List<Users> listUser(){
        UsersDaoImpl dao = new UsersDaoImpl();
        //把拿到的值返回给调用的人
        return dao.listUser();
    }
}
