package Usefulcodes;

import java.util.*;
public class CRUD {
	static Details de = new Details();
    static Map<Integer, Details> ma = new HashMap<>(); 

	public static void add(int id,String name,int age) {
		de.namelist.add(name);
		de=new Details(id,name,age);
		ma.put(de.id, de);
	}
	public static void Find(int id) {
		if(ma.containsKey(id)) {
			   System.out.println(ma.get(id));
		   }
		else {
			System.out.println("Id not present");
		}
	}
	public static void Remove(int id) {
		if(ma.containsKey(id)) {
			ma.remove(id);
			System.out.println("removed successfully");
		}
		else {
			System.out.println("This student not present");
		}
	}
	public static void Update(int id) {
	    Scanner sc = new Scanner(System.in);
	    
	    if (ma.containsKey(id)) {
	        System.out.println("Do you want to update? 1 - Name, 2 - Age");
	        int opt = sc.nextInt();
	        sc.nextLine(); 
	        
	        switch (opt) {
	            case 1:
	                System.out.println("Enter the new name:");
	                String newName = sc.nextLine();
	                ma.get(id).name = newName;
	                break;
	                
	            case 2:
	                System.out.println("Enter the new age:");
	                int newAge = sc.nextInt();
	                ma.get(id).age = newAge;
	                break;
	                
	            default:
	                System.out.println("Invalid option");
	                return;
	        }

	        System.out.println("Updated successfully");
	    } else {
	        System.out.println("ID not found");
	    }
	}

	}
