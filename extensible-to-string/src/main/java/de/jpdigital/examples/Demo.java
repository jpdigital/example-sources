package de.jpdigital.examples;

public class Demo {

    public static void main(String[] args) {
//        final Bean1 bean1 = new Bean1();
//        bean1.setPropertyA("lorem");
//        bean1.setPropertyB("ipsum");
//        
//        final Bean2 bean2 = new Bean2();
//        bean2.setPropertyA("test");
//        bean2.setPropertyB("of");
//        bean2.setPropertyC("extensible");
//        bean2.setPropertyD("toString()");
//        
//        System.out.printf("bean1.toString():%n%s%n%n", bean1.toString());
//        
//        System.out.printf("bean2.toString():%n%s%n%n", bean2.toString());
        
        final Car roadster = new Car();
        roadster.setBrand("Fast Cars");
        roadster.setName("Roadster");
        roadster.setMaxSpeed(260);
        roadster.setSeats(2);
        
        final Car suv = new Car();
        roadster.setBrand("Big Cars");
        roadster.setName("SUV");
        roadster.setMaxSpeed(220);
        suv.setSeats(4);
        
        final Truck smallTruck = new Truck();
        smallTruck.setBrand("Trucks & Co.");
        smallTruck.setName("Small Truck");
        smallTruck.setMaxSpeed(100);
        smallTruck.setMaxLoad(6000);
        
        final Truck bigTruck = new Truck();
        bigTruck.setBrand("Trucks & Co.");
        bigTruck.setName("Bug Truck");
        bigTruck.setMaxSpeed(92);
        bigTruck.setMaxLoad(35000);
        
        System.out.printf("roadster.toString()  : %s%n%n", roadster.toString());
        System.out.printf("suv.toString()       : %s%n%n", suv.toString());
        System.out.printf("smallTruck.toString(): %s%n%n", smallTruck.toString());
        System.out.printf("bigTruck.toString()  : %s%n%n", bigTruck.toString());
    }

}
