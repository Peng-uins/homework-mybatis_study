package edu.nf.ch04test;

import edu.nf.ch04.dao.StuDao;
import edu.nf.ch04.dao.impl.StudentDaoImpl;

import org.junit.Test;

import java.util.List;
import java.util.Map;

public class UsersDaoTest {

    @Test
    public void testGetUserById(){
        StuDao dao = new StudentDaoImpl();
        System.out.println(dao.deleteStudent(7)+":"+dao.deleteIdCard(4)+":"+dao.deleteStu_Sub(4));
    }


}
