//Program to demonstrate Person entity using Comparator interface package com.tnsif.collection.comparable_comparator; import java. util. Comparator;

public class Person { private String name; private String city;

public String getName() { return name;

public void setName(String name) { this.name = name;

public String getCity() { return city;

public void setCity(String city) { this.city = city;

@Override public String toString() { return "Person [name=" + name+ , city=" + city + 'l ' 

public Person(String name, String city) { super(); this.name = name;

this.city = city;

public Person() { super();

// TODO Auto-generated constructor stub

class SortByName implements Comparator<Person> {

@Override public int compare(Person PI, Person p2) { return pl .getName().compareTo(p2.getName());

class SortByCity implements Comparator<Person> {

@Override public int compare(Person PI, Person p2) { return pl .getCity().compareTo(p2.getCity());

