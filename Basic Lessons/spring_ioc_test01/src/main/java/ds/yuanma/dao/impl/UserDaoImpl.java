package ds.yuanma.dao.impl;

import ds.yuanma.dao.UserDao;

public class UserDaoImpl implements UserDao {

//    public UserDaoImpl() {
//        System.out.println("userDao instantiate");
//    }
//
//    public void init() {
//        System.out.println("init Initialization method executed...");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("after properties set then execute ...");
//    }

    @Override
    public void show() {
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("show....");
    }
//    private String username;
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//    public String getUsername() {
//        return this.username;
//    }
//
}
