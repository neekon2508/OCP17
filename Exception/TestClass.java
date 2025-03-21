package Exception;

import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.stream.DoubleStream;

class Game{
  public void play() throws Exception{
    System.out.println("Playing...");
  }
}
public class TestClass extends Game{    
  
  public void play() {
    System.out.println("Playing Soccer");
  }
  public static void main(String[] args)    {  
String a = null;
System.out.println(a);         
  }
}
