import ds.yuanma.dao.UserDao;
import ds.yuanma.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        /*
        // set evn
        System.setProperty("spring.profiles.active", "test");
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) applicationContext.getBean("userService");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userService);
        System.out.println(userDao);


//        userService.show();
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        UserDao userDao3 = (UserDao) applicationContext.getBean("userDao3");
//        System.out.println(userDao3);

    }
}
