package Usefulcodes;
import java.util.*;
public class Switch {
	static Details de=new Details();
	static CRUD crud=new CRUD();
     public static void main(String [] args) {
    	 Scanner sc=new Scanner(System.in);
    	 boolean br=true;
    	 while(br) {
    	 System.out.println("Enter the option 1-add 2-find 3-update 4-delete");
    	 int option=sc.nextInt();
    	 switch(option){
    	 case 1:
    		 System.out.println("added successfully");
    		 boolean ans=true;
    		 Integer id=0;
    		 while(ans) {
    			 System.out.println("enter the id:");
    			 id=sc.nextInt();
    			 sc.nextLine();
    		        if (de.idlist.contains(id)) {
    				 System.out.println("your enter id is already present");
    				 System.out.println(de.idlist);
    			 }
    			 else {
    				 System.out.println("Id not present");
    				 de.idlist.add(id);
    				 ans=false;
    			 }
    		 }
    		 System.out.println("Enter the name:");
    		 String name=sc.nextLine();
    		 System.out.println("Enter the age:");
    		 int age=sc.nextInt();
    		 crud.add(id,name,age);
    		 break;
    	 case 2:
    		 System.out.println("finding....");
    		 System.out.println("Enter the id for student");
    		 int fid=sc.nextInt();
    		 crud.Find(fid);
    		 break;
    	 case 3:
    		 System.out.println("updating....");
    		 System.out.println("Enter the id for student");
    		 int Uid=sc.nextInt();
    		 crud.Update(Uid);
    		 break;
    	 case 4:
    		 System.out.println("Deleting....");
    		 System.out.println("Enter the id for student");
    		 int Did=sc.nextInt();
    		 crud.Remove(Did);
    		 break;
    	 case 5:
    		 br=false;
    		 System.out.println("Exit successfully");
    		 break;
    	default:
    		System.out.println("enter the valid option");
    		break;
    		 
    	 }
    	 }
    	 
     }
}
