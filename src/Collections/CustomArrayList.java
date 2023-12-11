package Collections;

import java.util.*;


public class CustomArrayList extends ArrayList {
 
	public boolean add(Object o) {
       if(this.contains(o)){
           return false;
       }else return this.add(o);
   }


   public static void main(String[] args) {
       CustomArrayList list = new CustomArrayList();
       list.add(1);
       list.add(2);
       list.add(1);
       list.add(3);
       list.add(4);
       list.add(5);


       System.out.println(list);


       Set<GeniousStudent> geniousStudentSet = new HashSet<>();
       List<GeniousStudent>geniousStudentList = new ArrayList<>();
       GeniousStudent gst1 = new GeniousStudent(101,"Filza");
       GeniousStudent gst2 = new GeniousStudent(102,"Sneha");
       geniousStudentList.add(gst1);
       geniousStudentList.add(gst2);




       System.out.println(geniousStudentSet);
       Collections.sort(geniousStudentList);
   }
}



