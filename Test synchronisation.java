package com.tnsif.multithreading.synchronization;

class Table {

// Synchronized method synchronized void printTable(int n) { for (int i = 1; i 5; i++) {

System.out.println(n + x + i +  try {

Thread.sleep(500);

} catch (InterruptedException e) {

System.out.println(e);

 

// Thread class 1 class MyThread1 extends Thread {

Table t;

MyThread1 (Table t) { this.t = t;

public void run() {

t.printTable(5);

// Thread class 2 class MyThread2 extends Thread {

Table t;

MyThread2(Table t) { this.t = t,

public void run() {

t. printTable(1 00);

//Executor class public class TestSynchronization {

public static void main(String[] args) {

Table obj = new Table(); // Shared object

MyThreadl tl = new MyThreadl (obj); MyThread2 t2 = new MyThread2(obj);

tl .start(); t2.start();

