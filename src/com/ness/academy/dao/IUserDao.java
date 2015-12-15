
package com.ness.academy.dao;

import com.ness.academy.bean.User;
import java.util.List;


public interface IUserDao {
    
    public void add(User user);
    
    public List<User> users();
    
    public void modify(User user);
    
    public void remove(User user);
    
    public User findById(int id);
}
