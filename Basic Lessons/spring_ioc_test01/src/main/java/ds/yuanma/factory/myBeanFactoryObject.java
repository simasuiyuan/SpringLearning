package ds.yuanma.factory;

import ds.yuanma.dao.UserDao;
import ds.yuanma.dao.impl.UserDaoImpl;

public class myBeanFactoryObject {
    public UserDao userDao (String username) {
        //reason to use this way: more flexible
        // 1. before create this bean we can execute some other program/logic here
        // 2. 3rd party jar bean created from method, can be defined & config here
        System.out.println("param passed when instantiate bean: username = "+username);
        return new UserDaoImpl();
    }
}
