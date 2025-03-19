package com.example;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// int array (1D Array)
     int []arr = {10,-15,20,30,-35,50,-39,70,80};
     // String array
     String []name = new String[5];
//     System.out.println(arr[0]);
//     System.out.println(arr[1]);
//     System.out.println(arr[2]);
//     for(int i=0;i<arr.length;i++)
//     {
//    	 System.out.print(arr[i]+"\t");
//     }
//     int even=0;
//     int odd = 0;
//     int pos=0;
//     int neg =0;
//     
//     for(int data:arr) //jdk1.5
//     {
//    	 if(data % 2==0)
//    		 even++;
//    	 else
//    		 odd++;
//    	 if(data < 0)
//    		 neg++;
//    	 else
//    		 pos++;
//     }
//    System.out.println("Even No"+"\t"+even);
//	 System.out.println("Odd No"+"\t"+odd);
//	 System.out.println("Positive No"+"\t"+pos);
//	 System.out.println("Negative No"+"\t"+neg);
//     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter five name");
     for(int i=0;i<name.length;i++)
    {
    	 name[i] =sc.next();
    }
     for(String n :name)
     {
    	 if(n.length() >= 0 && n.length() < 3)
    		 System.out.println("Invalid Name");
    	 else
    		 System.out.print("Name:"+" "+n+"\t");
    }
     System.out.println();
     
     int []marks = {56,45,30,89,76,56,88,97,25};
     for(int m :marks)
     {
    	 if(m >=0 && m <=100)
    	 {
    		 if(m >=35 && m < 45)
    		 {
    			 System.out.println("Grade C");
    		 }
    		 else if(m >=45 && m < 60)
    		 {
    			 System.out.println("Grade B");
    		 }
    		 else if(m >=60 && m <=100)
    		 {
    			 System.out.println("Grade A");
    		 }
    		 else
    		 {
    			 System.out.println("Fail");
    		 }
    	 }
     }
	}

}
