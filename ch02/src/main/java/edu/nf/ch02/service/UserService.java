package edu.nf.ch02.service;

import edu.nf.ch02.dao.UserDao;
import edu.nf.ch02.dao.impl.UserDaoImpl;
import edu.nf.ch02.entity.Users;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.View;

/**
 * @author 0.0
 */
public class UserService{

    public View listUsers(){
        UserDao dao = new UserDaoImpl();
        return new JsonView(dao.listUsers(new Users()));
    }
}
