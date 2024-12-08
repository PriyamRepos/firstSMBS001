package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sbms0To1001Application {

	public static void main(String... args) {
		SpringApplication.run(Sbms0To1001Application.class, args);
//		
//		HashSet<String> set=new HashSet<>();
//		set.add("Priyam");
//		set.add("Devin");
//		set.add("Resshi");
//		
//		System.out.println(set);
//		
//		Iterator<String> iterator = set.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
//		System.out.println(list);
//		
//		ArrayList l=new ArrayList<>(list);
//		System.out.println(l);
//		
//		int[] a= {12,23,3,4,5,5667,889,87};
//		List<int[]> asList = Arrays.asList(a);
//		System.out.println(asList);
//		
//		IntStream stream = Arrays.stream(a);
//
//		System.out.println(stream);
//		Stream<Integer> s = stream.boxed();
//		System.out.println(s);
//	    
		
//		Integer[] i=new Integer[] {12,23,34,56,78};
//	    List<Integer> list2 = Arrays.asList(i);
//	    System.out.println(list2);
////		
//	    Integer[] arr={12,23,34,56,78};
//	    List<Integer> list3 = Arrays.asList(arr);
//	    System.out.println(list3);
//		
	    
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		System.out.println(list);
//		
//		ArrayList<Integer> l= new ArrayList<>();
//		int[]arr= {11,222,3333,44444,555555};
//		for(int x:arr) {
//		System.out.println(x);
//		l.add(x);
//		}
//		List<int[]> list2 = Arrays.asList(arr);
//		System.out.println(list2);
//		System.out.println(l);
//		
////	String[] array = l.toArray(new String[0]);
////	System.out.println(array);
//
//		
//		String[] str= {"priyam","sourav","om"};
//		
//		System.out.println(str);
//		
//		String sss = str.toString();
//		System.out.println(sss);
//	
		ArrayList<Integer>l= new ArrayList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		System.out.println(l);
	
	Integer[] array = l.toArray(new Integer[0]);
		System.out.println(array);
		for(Integer i:array)
			 System.out.println(i);
	}

}
