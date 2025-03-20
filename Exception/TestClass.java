package Exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestClass {    
  
  
  public static void main(String args[]) throws Exception    {     
 int a1=1,a2=2,a3=3;
       int a4= a1*(a1=a2) ;
       System.out.println(a4);

  }
}
 
