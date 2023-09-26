package com.ds.singleton;

public class SingleTonTest {
    public static void main(String[] args) {
        Student instance1 = Student.getInstance();
        Student instance2 = Student.getInstance();
        System.out.println(instance1.hashCode()==instance2.hashCode());
        System.out.println(instance1.equals(instance2));


//           Eager loading
        Teacher teacher1 = Teacher.getTeacher();
        Teacher teacher2 = Teacher.getTeacher();
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());


    }
}
