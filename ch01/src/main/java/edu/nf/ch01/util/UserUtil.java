package edu.nf.ch01.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


/**
 * @author 0.0
 */
public class UserUtil {
    /**
     * 获取SqlSession操作jdbc
     */
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            //解析mybatis.xml获取一个输入流
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            //创建一个 SqlSessionFactoryBuilder解析输入流is
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //解析输入流获取一个SqlSessionFactory
            sqlSessionFactory = builder.build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建一个方法获取SqlSession
     * a是控制自动还是手动的布尔值
     */
    public static SqlSession getSqlSession(boolean a){

        return sqlSessionFactory.openSession(a);

    }
}
