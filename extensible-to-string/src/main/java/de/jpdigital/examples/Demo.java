package de.jpdigital.examples;

public class Demo {

    public static void main(String[] args) {
        final Bean1 bean1 = new Bean1();
        bean1.setPropertyA("lorem");
        bean1.setPropertyB("ipsum");
        
        final Bean2 bean2 = new Bean2();
        bean2.setPropertyA("test");
        bean2.setPropertyB("of");
        bean2.setPropertyC("extensible");
        bean2.setPropertyD("toString()");
        
        System.out.printf("bean1.toString():%n%s%n%n", bean1.toString());
        
        System.out.printf("bean2.toString():%n%s%n%n", bean2.toString());
    }

}
