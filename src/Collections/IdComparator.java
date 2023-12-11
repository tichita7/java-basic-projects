package Collections;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class IdComparator implements Comparator<GeniousStudent>{
	public int compare(GeniousStudent o1, GeniousStudent o2) {
		if(o1.getId() == o2.getId()) {
			return 0;
		}else if(o1.getId() > o2.getId()) {
			return 1;
		}else {
			return -1;
		}
	}
	public static void main(String[] args) {
		List<GeniousStudent> ss = new ArrayList();
		
		GeniousStudent gst1 = new GeniousStudent(101, "Sneha");
		GeniousStudent gst2 = new GeniousStudent(101, "Aman");
		GeniousStudent gst3 = new GeniousStudent(101, "Vansh");
		GeniousStudent gst4 = new GeniousStudent(101, "Amara");
		GeniousStudent gst5 = new GeniousStudent(101, "Hatori");
		
		ss.add(gst1);
		ss.add(gst2);
		ss.add(gst3);
		ss.add(gst4);
		ss.add(gst5);
		
		System.out.println(ss);
	}

}
