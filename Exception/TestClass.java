package Exception;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.*;

interface Flyer{ String getName(); }  
class Bird implements Flyer{     public String name;     public Bird(String name){         this.name = name;     }    
 public String getName(){ return name; } }  class Eagle extends Bird {     public Eagle(String name){         super(name);     } }  
 public class TestClass {     
  public static void main(String[] args) throws Exception {        

    System.out.println(null +" "); //1    
   
  } }


  interface Book{   public default String getId(){      return "ISBN123456";   } }  
  interface Encyclopedia extends Book{
    default String getId(){ 
      return "AIN8888"; };
    }