package com.cg.Cricket;

class Cricketer{

String name = “Dhoni”;

int age = 39;

String color = “Brown”;

String role = “Batsman”;

String nationality= “Indian”;

void Display(){

System.out.println(“I LOVE
Criket”);

}}//end of criketerDetails
method

public static void main(String args[]){

System.out.println(“main method
started”);

Cricketer c = new Cricketer();

c.Display ();

System.out.println(“main method
ended”);

}//end of main method

}//end of Cricketer class