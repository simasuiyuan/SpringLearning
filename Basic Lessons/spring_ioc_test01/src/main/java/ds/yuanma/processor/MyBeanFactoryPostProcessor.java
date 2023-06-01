package ds.yuanma.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor's: postProcessBeanFactory");
//        System.out.println("After beanDefinitionMap injection completed, return (invoke) this method");
//        // Dynamically register BeanDefinition
//        BeanDefinition beanDefinition = new RootBeanDefinition();
//        beanDefinition.setBeanClassName("ds.yuanma.dao.impl.PersonDaoImpl");
//        // force conversion to DefaultListableBeanFactory
//        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) beanFactory;
//        defaultListableBeanFactory.registerBeanDefinition("personDao", beanDefinition);


        // modify some beanDefinition: getBeanDefinition by beanName from BeanDefinitionMap
//        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
//        beanDefinition.setBeanClassName("ds.yuanma.dao.impl.UserDaoImpl");
    }
}
