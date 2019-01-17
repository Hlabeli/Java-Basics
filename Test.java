/*
 * Create executable Java applications with a main method; 
   run a Java program from the command line; including console output.
 */
package javabasic;

//imported package in the same package which is redundant, classes are in the same package
import javabasic.*;

/**
 *
 * @author Hlabedy
 */
public class Test {

    //public static method
    public static void main(String[] args) {
       
    /* creating an instance of the class by instantiate it in main()
        with newely created object myself
    */ 
        JavaBasic myself = new JavaBasic();//JavaBasic came from javabasic
        
        myself.myAge();
        myself.setName("Thabo");
        myself.setIdNum("SA123456667098765");
        
        
        System.out.println("" + myself.getName());


    }
    
    
}
