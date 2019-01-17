/*Topic 1: JavaBasics
 * Define the scope of variables
 * Define the structure of a Java class
 * Create executable Java applications with a main method; 
   run a Java program from the command line; including console output.
 * Import other Java packages to make them accessible in your code
 * Compare and contrast the features and components of Java such as: 
   platform independence, object orientation, encapsulation, etc.
 */
package javabasic;

/**
 *The fields of a class can be made read-only or write-only.
 * @author Hlabedy
 */
public class JavaBasic {
    
    //Global Varials that are used in oop (the scope of variables) 
    private String name;
    private String idNum;
    
    
    //The access points of the instance variables of the Test class.
    public String getName() {
      return name;
   }
    public String getIdNum() {
      return idNum;
   }
   
   public void setName(String newName) {
      name = newName;
   }


   public void setIdNum( String newId) {
      idNum = newId;
   }
   public void myAge() {
      //local variables only accessable by a method (variable scope)
      int currentYear = 2018;
      int age;
      age = currentYear - 1990;
      System.out.print("I am: " + age);
      System.out.print(" years and my name is ");
   }
  


}



