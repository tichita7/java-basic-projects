package Collections;

import java.util.*;


public class GeniousStudent implements Comparable<GeniousStudent> {


   int id;
   String name;


   public GeniousStudent(int id, String name) {
       super();
       this.id = id;
       this.name = name;
   }


   public int getId() {
       return id;
   }


   public void setId(int id) {
       this.id = id;
   }


   public String getName() {
       return name;
   }


   public void setName(String name) {
       this.name = name;
   }


   public String toString() {
       return "GeniusStudent [id=" + id + ", name=" + name + "]";
   }


   public int hashCode() {
       return Objects.hash(id, name);
   }


   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       GeniousStudent other = (GeniousStudent) obj;
       return id == other.id && Objects.equals(name, other.name);
   }


   public int compareTo(GeniousStudent o) {


       if(id == o.id)
       {
           return 0;
       }
       else if(id > o.id)
       {
           return 1;
       }
       else
       {
           return -1;
       }
   }


}


