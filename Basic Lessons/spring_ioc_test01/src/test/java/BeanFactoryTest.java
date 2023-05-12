import ds.yuanma.dao.UserDao;
import ds.yuanma.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {
    public static void  main(String[] args) {
        // Create Factory object
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // Create a configuration reader for xml file: beans.xml
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        // read configuration to Factory
        reader.loadBeanDefinitions("beans.xml");

        // obtain bean object based on the id in configuration
        UserService userService = (UserService) beanFactory.getBean("userService");
        System.out.println(userService);

        UserDao userDao = (UserDao) beanFactory.getBean("userDao");
//        System.out.println(userDao);
    }
}
