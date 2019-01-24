package demostatic;

import Content.TheStatic;

public class DemoStatic {

    public static void main(String[] args) {
        TheStatic one = new TheStatic();
        TheStatic two = new TheStatic();
        
        System.out.println("One;s name is: " +one.name);
        System.out.println("Two's name is: " +two.name);
        
        one.name = "Barney";
         System.out.println("One;s name is: " +one.name);
        System.out.println("Two's name is: " +two.name);
        
        System.out.println("One's company is: "+one.company);
        System.out.println("Two's company is: "+two.company);
        
        one.company = "ACME Inc";
        System.out.println("One's company is: "+one.company);
        System.out.println("Two's company is: "+two.company);
        
        TheStatic.company = "Widgets";
        System.out.println("One's company is: "+one.company);
        System.out.println("Two's company is: "+two.company);
        
       //  TheStatic.name= "Wilma";
       
    }
    
}
