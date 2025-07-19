//Program to demonstrate LinkedList class package com.tnsif.collection.list;

import java. util. Collections; import java. util. LinkedList; import java. util. List Iterator; public class LinkedListDemo {

public static void main(String[] args) {

LinkedList< Integer> Il = new LinkedList<lnteger>(); ll. add(1 0); ll.add(20); ll.add(40); ll.addFirst(5); ll. add(2, 60); ll.addLast(25); ll.add(30);

System.out.println("Number List is " + Il);

System.out.println("First Element is + ll.getFirst()); System.out.println("Last Element is " + ll.getLast());

ll.removeFirst(); ll.removeLast();

System.out.println("Number List after removing first and last element is " + 

Listlterator<lnteger> li = ll.listlterator();

while (li.hasNext())

System. out.print(li.next() + 'At");

li = ll. listlterator(ll.size()); while (li.hasPrevious()) { int n = li.previous(); System. out.print(n + "\t"); if (n == 20) li.add(99999); if (n 	60) li.set(5555);

System.out.println("Number List is " + Il);

Collections.sort(ll);

System.out.println("Number List in Ascending order is " +

Collections. reverse(ll);

System.out.println("Number List in Descending order is 

+ Il);

