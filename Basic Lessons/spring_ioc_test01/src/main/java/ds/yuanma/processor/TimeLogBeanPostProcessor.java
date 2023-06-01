package ds.yuanma.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class TimeLogBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        // use Dynamic Proxy to enhance the target bean, return a proxy object,
        // then cache the proxy into singletonObjects
        Object myProxy = Proxy.newProxyInstance(
                bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    // 1. ouput start time
                    System.out.println("method "+method.getName()+" start @ "+new Date());
                    // 2. invoke and execute target method
                    Object result = method.invoke(bean, args);
                    // 3. output finish time
                    System.out.println("method "+method.getName()+" finish @ "+new Date());
                    return result;
                }
        );

        return myProxy;
    }
}
