package edu.nf.ch02.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 0.0
 */
public class MybatisUtil {

    /**
     * 创建工厂对象
     */
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            //解析核心文件获取输入流
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            //解析输入流获取工厂对象
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回一个SqlSessioon对象给调用的人
     * @param a
     * @return
     */
    public static SqlSession getSqlSession(boolean a){
        return sqlSessionFactory.openSession(a);
    }
}
