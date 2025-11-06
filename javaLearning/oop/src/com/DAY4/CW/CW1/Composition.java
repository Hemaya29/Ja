<<<<<<< HEAD
package com.DAY4.CW.Composition;
=======
package com.DAY4.CW.CW1;
>>>>>>> ecc5c9d (Save local uncommitted changes before rebase)

class Engine{
    void start(){
        System.out.println("Engine Started");
    }
}
class Car{
    Engine engine=new Engine();
    void startCar(){
        engine.start();
        System.out.println("Car Started");
    }
}
public class Composition {
    public static void main(String[] args) {
        Car car=new Car();
        car.startCar();
    }
}