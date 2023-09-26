package com.ds.singleton;
//Eager way to create SingleTon DP
public class Teacher {

    private static Teacher teacher=new Teacher();

    //create a method to get object
    public static Teacher getTeacher(){
        return teacher;
    }

}
