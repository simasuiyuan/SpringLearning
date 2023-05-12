package ds.yuanma.factory;

import ds.yuanma.dao.UserDao;
import ds.yuanma.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class myBeanFactoryFactoryBean implements FactoryBean {

    @Override
    public UserDao getObject () throws  Exception{
        System.out.println("getObject is invoked...");
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
