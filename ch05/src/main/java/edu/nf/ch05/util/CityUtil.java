package edu.nf.ch05.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 0.0
 */
public class CityUtil {

    //创建一个工厂类
    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            //解析核心类获取一个输入流
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            //解析输入流获取一个工厂类
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建一个静态方法获取SQLSession对象
     * @param a 开关设置，设置是手动还是自动访问数据库
     * @return
     */
    public static SqlSession getSqlSession(boolean a){
        //返回一个SqlSession对象
        return sqlSessionFactory.openSession(a);
    }
}
