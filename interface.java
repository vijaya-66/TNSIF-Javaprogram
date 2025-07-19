package com.tnsif.interfacedemo;

@Functionallnterface// 2 interface Shape{ void draw();

// void drawl ();//normal inteface - 1 //marker interface - 3

public class InterfaceDemo implements Shape{

public void draw() {

System.out.println("Drawing a circle in a Interface");

public static void main(String[] args) { // TODO Auto-generated method stub

InterfaceDemo id = new InterfaceDemo(); id.draw();

