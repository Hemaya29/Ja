package com.Day3;
class Student{
    String name;
    int rno;
    String dept;
    static String college;
    public void display(){
        System.out.println("Name: "+name+"\nRno: "+rno+"\nDept: "+dept+"\nCollege Name: "+college);
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Nila";
        s1.rno=40;
        s1.dept="IT";
        Student.college="MSAJCE";
        s1.display();
        System.out.println("----------------------");
        Student s2=new Student();
        s2.name="Akhil";
        s2.rno=102;
        s2.dept="CSE";
        s2.display();

    }
}