package com.company.November22;

public class Registration {
    String email;
    String username;
    String password;
Registration(String email,String username,String password)
{
    this.password=password;
    this.username=username;
    this.email=email;

}

    boolean Emailinfo()
    {
        if(email.equals("yahoo"))
        {
            System.out.println("valid info");
        }
        else if(username.isEmpty()||password.isEmpty())
        {
            System.out.println("this cant be empty");
        }
        else if(username.length()>6||password.length()>6)
        {
            System.out.println("Username or password should be more than 6 characters");
        }
        else if(password.contains(username))
        {
            System.out.println("password cant contain username");
        }
        return false;
    }
}
