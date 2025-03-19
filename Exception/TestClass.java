package Exception;

import java.util.function.Function;
import java.util.function.Supplier;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

 public class TestClass {     
  public static class TestInner {
    public void sayIt() {System.out.println("Heelo");}
  }
  public static void main(String[] args) throws Exception {        
    var c = System.console(); //1         
    char[] line = c.readPassword("Please enter your pwd:"); //2         System.out.println("Pwd is "+new String(line));         
    
  }
 }
 