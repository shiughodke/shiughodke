package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
     
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("mamta"); // adding object in list
		a1.add("shiu");
		a1.add("vani");
		a1.add("nirali");
		a1.add("tani");
		a1.add("dhol");
		System.out.println("before sorting");
		for(String a:a1) {
			System.out.println(a);
			
		}
		Collections.sort(a1); // sort list
		System.out.println();
		
		System.out.println("after sorting");
		for(String a:a1) {
			System.out.println(a);
			
 	}
     System.out.println("________");
     ArrayList<Integer> all = new ArrayList<Integer>();
     all.add(101);
     all.add(102);
     all.add(103);
     all.add(104);
     all.add(105);
     all.add(106);
     
     System.out.println("before sorting");
     for(int a:all) {
			System.out.println(a);
			
     }
     Collections.sort(a1); // sort list
		System.out.println();
		
		System.out.println("after sorting");
		for(int a:all) {
			System.out.println(a);

      }
	  }
      }
