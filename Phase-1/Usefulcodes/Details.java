package Usefulcodes;

import java.util.*;
public class Details {
	int id=0;
	String name;
	int age;
	static List<Integer> idlist=new ArrayList<>();
	static List<String> namelist=new ArrayList<>();
	static Map<Integer,Details> map=new HashMap<>();
	//static int num=0;
	Details() {
    }
	Details(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
    public String toString() {
    	return id+" "+name+" "+age;
    }
}
