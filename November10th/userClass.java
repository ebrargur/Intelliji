package com.company.November10th;
//Write program: userClass  that has a constructor that initializes instance variable name and mobile number. Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call. Print users name, mobile number and address in userDetails method. Test your code.
class userClass {
    int mobilenumber;
    String username;


    userClass(int mobilenumber,String username)
    {
        this.mobilenumber=mobilenumber;
        this.username=username;

    }
    void userDetails()
    {
        System.out.println("The username of person "+username+" Mobile Number "+mobilenumber);
    }
}
