package com.company.November10th;

public class userInfo extends userClass{
    String address;

 userInfo(String address,int mobilenumber,String username)
 {
     super(mobilenumber,username);//
     this.address=address;
     System.out.println("Address "+ address);
 }

    public static void main(String[] args) {
        userInfo obj=new userInfo("Atl",7703940,"ebrar");//passing info
        obj.userDetails();
    }
}
