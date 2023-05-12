package ds.yuanma.factory;

import ds.yuanma.dao.UserDao;
import ds.yuanma.dao.impl.UserDaoImpl;

public class myBeanFactoryStatic {
    public static UserDao userDao (String name,int age) {
        //reason to use this way: more flexible
        // before create this bean we can execute some other program/logic here
        System.out.println("param passed when instantiate bean: name = "+name+", age = "+Integer.toString(age));
        return new UserDaoImpl();
    }
}
