//Program to demonstrate ArrayList package com.tnsif.collection.list;

import java. util.ArrayList; import java. util. Collections; import java. util. Comparator; import java. util. Iterator; import java. util. List, import java. util. List Iterator; public class ArrayListDemo { public static void main(String[] args) {

List listl = new ArrayList();// creates empty raw ArrayList

(allows heterogeneous elements)

System.   : "+listl .size());

System.out.println("ls list empty? "+listl .isEmpty()); listl .add(1 0); listl .add(20); listl .add(true); listl .add(false); listl .add(20); listl .add("Hello"); listl . add(56.78); listl .add(20); listl .add('A'); listl .add(5, "Hi"); listl .add(20);

System.out.println("List is "+listl);

 list conatins 1 5?

"+listl . contains(15)); listl . remove(false); System.out.println("List is "+listl);

// System.out.println(listl .remove(20)); //4 - index

System. out. println(listl);

System.out.println("Element at 5 location is : "+listl . get(5));

System.out.println("Element removed 

"+listl .remove(listl .1astlndexOf(20))); // remove 20 (last occurrence)

System.out.println("Element removed 

"+listl .remove(listl .indexOf(20))); // remove 20 (first occurrence)

System.out.println("List is "+listl);

* Collections.sort(list1);//RTE - ClassCastException * System.out.println("List is "+listl);

listl . clear();

System.out.println("List is "+listl);

// Using Generic we can create Homogeneous List List<String> names = new ArrayList<String>(); names. add("Amit"); names. add("Sumit"); names. add('Ankit"); names. 

names.add("Likshit");

//names.add(10); //CTE - Generic are type safety System.out.println("Name List is "+names);

Collections.reverse(names);

System.out.println("Reverse Name List is "+names);

System.out.println("ls \'AnkitV contains in name list?

 

System.out.println("Name List Before Sorting is "+names);

Collections.sort(names);

System.out.println("Sorting in Ascending order " + names);

Collections. reverse(names);

System.out.println("Sorting in Descending order " + names);

// Traversing a list

System.out.println(" Traversing a list  

Iterator<String> i = names.iterator(); while (i.hasNext()) {

String nm = i.next(); System.out.println(nm); if (nm.equals("Ankit"))

i. remove();

System.out.println("Name list is "+names);

System.out.println(" Traversing a list in backward manner

Listlterator<String> li=names.listlterator(names.size()); while(li.hasPrevious())

String nm = li.previous();

System.out.println(nm);

 



