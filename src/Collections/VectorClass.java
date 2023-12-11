package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import java.util.List;

public class VectorClass {
    public static void main(String[] args) throws InterruptedException {
	    int size = 1000000;
	    
//	    List<Integer> al = new ArrayList<>();
//	    long start = System.currentTimeMillis();
//	    for(int i=0;i<size;i++) {
//	    	al.add(i);
//	    }
//	    
//	    long end = System.currentTimeMillis();
//	    System.out.println("Time taken to add " + size + " values : " + (end-start));
//	    
//	    
//	    
//	    List<Integer> v = new Vector<>();
//	    long st = System.currentTimeMillis();
//	    for(int i=0;i<size;i++) {
//	    	v.add(i);
//	    }
//	    
//	    long ed = System.currentTimeMillis();
//	    System.out.println("Time taken to add " + size + " values in vector : " + (ed-st));
	    
	    
	    List<Integer> multiThreadArrayList = Collections.synchronizedList(new ArrayList<>());
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                multiThreadArrayList.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                multiThreadArrayList.add(i);
            }
        });
 long end  = System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Multithreading time : " + (end-start));

    }
}
