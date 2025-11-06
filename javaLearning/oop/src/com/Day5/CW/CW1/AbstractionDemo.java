<<<<<<<< HEAD:javaLearning/oop/src/com/Day5/CW/CW2/AbstractionDemo.java
package com.DAY5.CW2.AbstractionDemo;
========
package com.Day5.CW.CW1;
>>>>>>>> ecc5c9d (Save local uncommitted changes before rebase):javaLearning/oop/src/com/Day5/CW/CW1/AbstractionDemo.java

abstract class Shape{
    String color;
    abstract void draw();
    public void getColor(String color){
        this.color=color;
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle...");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square.....");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.draw();
        Shape square = new Square();
        square.draw();
    }
}