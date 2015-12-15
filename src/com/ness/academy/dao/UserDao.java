/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ness.academy.dao;

import com.ness.academy.bean.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author P3502442
 */
public class UserDao implements IUserDao{

    List<User> users=new ArrayList<User>();
    
    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public List<User> users() {
        return users;
    }

    //FIXME
    @Override
    public void modify(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(User user) {
        users.remove(user);
    }

    @Override
    public User findById(int id) {
        for (int i = 0; i < users().size(); i++) {
              if (users().get(i).getId() == id) {
                return users().get(i);
              }
            }
            return null;
    }
}
