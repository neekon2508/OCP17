package IOStream;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class test{

    long ticketSold;
    final AtomicInteger ticketsTaken;
    public test() {
        ticketSold = 0;
        ticketsTaken = new AtomicInteger(0);
    }
    public void perform() {
        IntStream.iterate(1, s->s+1)
        .parallel().limit(100)
        .forEach(i->ticketsTaken.getAndIncrement());
        IntStream.iterate(1,q->q+1)
            .parallel().limit(500).forEach(i->++ticketSold);
        System.out.println(ticketsTaken+" "+ticketSold);
    }

    public static void main(String[] args) throws Exception {
    var original = List.of(1,2,3,4,5);
    var cop1 = new ConcurrentLinkedDeque<Integer>(original);
    for(Integer w : cop1) cop1.poll();
    System.out.println(cop1);
    }
}
class A{}
class B extends A {}
class C extends B{}