package ds.yuanma.service.impl;

import ds.yuanma.dao.UserDao;
import ds.yuanma.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserServiceImpl implements UserService {

    // paramter-less constructor
    public UserServiceImpl(){
        System.out.println("userService Created");
    }
    private UserDao userDao;
    private  String userName;
    //Bean Factory will invoke this method, from container obtain userDao and configure it here
    public void setUserDao(UserDao userDao) {
        System.out.println("Bean Factory will invoke this method and configure it here:" + userDao);
        this.userDao = userDao;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /*
    //setter List
    private List<String> stringList;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    private List<UserDao> userDaoList;

    public void setUserDaoList(List<UserDao> userDaoList) {
        this.userDaoList = userDaoList;
    }

    private Set<String> stringSet;

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    private Set<UserDao> userDaoSet;

    public void setUserDaoSet(Set<UserDao> userDaoSet) {
        this.userDaoSet = userDaoSet;
    }

    private Map<String, UserDao> userDaoMap;

    public void setUserDaoMap(Map<String, UserDao> userDaoMap) {
        this.userDaoMap = userDaoMap;
    }

    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
    */

    public void show() {
        /*System.out.println(userDaoMap);
        System.out.println(properties);
        System.out.println(stringList);
        System.out.println(userDaoList);
        System.out.println(stringSet);
        System.out.println(userDaoSet);*/

        System.out.println(userDao);
    }

    /*
    public UserServiceImpl(){
        System.out.println("instantiate UserServiceImpl");
    }

    public UserServiceImpl(String name){
        System.out.println("instantiate UserServiceImpl with arguments: " + name);
    }
    */

}
