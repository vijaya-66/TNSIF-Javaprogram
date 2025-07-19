//Program to demonstrate HashMap class package com.tnsif.collection.map; import java. util. Hash Map; import java. util. Iterator; import java.util.Map; Import java. util. Set; class HashMapDemo

public static void main(String args[])

//Hashmap with String key and Integer Value - Sorted on Keys order

HashMaP<String,lnteger> bookMap = new Hash  bookMap.put('Let Us C", 320); bookMap.put("The Complete Referece C++ 1,450); bookMap.put("The Complete Referece Java  bookMap.put('Python  bookMap.put("Application Development using Spring

 

System.out.println("Book Details are 

System.out.println(bookMap);

System.out.println("Traversing a Hash Map");

Set set = bookMap.entrySet(); // Get a set of the entries Iterator i = set.iterator(); // Get an iterator while(i.hasNext()) { // Display elements

 + : "+ me.getValue());

//Hash map with null keys and null values

HashMap<String, String> hml=new

HashMap<String,String>();

hml .  23@gmail.com"); hml.put("Deepak",null); hml. 

hml  hml.put(null,null); hml. 23@gmail.com"),

System.out.println("Person Hashmap with name and emailld");

System.out.println(hml);

//Hashmap with Integer key and User defined Object as a Value

Hash Map< Integer,Student> studentMap=new

HashMaP<lnteger,Student>(); studentMap.put(10001 ,new Student(l studentMap.put(10005,new studentMap.put(10006,new Student(3,"Amit",81)); studentMap.put(10003,new studentMap.put(10004,new

System.out.println("Student Details are "+StudentMap);

