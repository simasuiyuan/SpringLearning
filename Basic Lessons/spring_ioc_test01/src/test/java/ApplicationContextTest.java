import ds.yuanma.beans.OtherBean;
import ds.yuanma.beans.XxxBean;
import ds.yuanma.dao.PersonDao;
import ds.yuanma.dao.UserDao;
import ds.yuanma.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class ApplicationContextTest {
    public static void main(String[] args) {
        /*
        // set evn
        System.setProperty("spring.profiles.active", "test");
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");


//        userDao.show();
//        System.out.println(userDao.getUsername());
//        OtherBean otherBean =  applicationContext.getBean(OtherBean.class);
//        System.out.println(otherBean);
//        XxxBean xxBean =  applicationContext.getBean(XxxBean.class);
//        System.out.println(xxBean);

//        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
//        System.out.println(sqlSessionFactory);
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        System.out.println(sqlSession);
        // sqlSession.select(...);

//        UserService userService = (UserService) applicationContext.getBean("userService");
//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        System.out.println(userService);
//        System.out.println(userDao);


//        userService.show();
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        UserDao userDao3 = (UserDao) applicationContext.getBean("userDao3");
//        System.out.println(userDao3);

    }
}
