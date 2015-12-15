
package com.ness.academy.bean;

import java.util.UUID;


public class User {
    
            int id;
            String login, password;
	    boolean isAdmin;
	    
	    public User(){
	    }
	    
		public User(String login, String password, boolean isAdmin) {
			super();
                        this.id = Integer.valueOf(UUID.randomUUID().toString());
			this.login = login;
			this.password = password;
			this.isAdmin = isAdmin;
		}

		public int getId() {
			return id;
		}

                public void setId() {
			this.id = Integer.valueOf(UUID.randomUUID().toString());
		}
                
		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean isAdmin() {
			return isAdmin;
		}

		public void setAdmin(boolean isAdmin) {
			this.isAdmin = isAdmin;
		}
	    
                
                @Override
		public String toString() {
                    String rights = "";
                        if (isAdmin==true) rights="yes";
                        else rights="no";
			return "User: login = " + login + "  . has Admin rights? " + rights;
		}
    
}
