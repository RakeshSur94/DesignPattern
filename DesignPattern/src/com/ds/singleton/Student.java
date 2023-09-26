package com.ds.singleton;
//single Ton design pattern (Lazy loading)// when we want to create Object
public class Student {

    private static Student student;

    /*
   1. make constructor private
   2. create a method for object creation static ClassName
   3.create a syncronized block(for thread safe) to chcek weather object is already created or not
   4.create private static variable Of class name
     */
    private Student(){

    }

    public static Student getInstance(){
        if (student==null){
            synchronized (Student.class){
                if(student==null){
                    student=new Student();
                }
            }
        }
        return student;

    }

}
