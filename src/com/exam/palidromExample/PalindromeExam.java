package com.exam.palidromExample;

import java.util.Scanner;

public class PalindromeExam 
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the String");
		 String input= sc.nextLine(); 		//take input parameter
		 StringBuffer stb;         			//immutable function 
		 String temp="";
		 int counter =0,length;            			//initialize counter
		 length=input.length();
		 for(int i=0;i<length;i++)
		 {
			 for(int j=i+1;j<=length;j++)
			 {
				 temp=input.substring(i, j);
				
				 // Check for palindrome 
				 stb=new StringBuffer(temp);
				 stb.reverse();
				// Compare substring wih reverse of substring
				if(stb.toString().compareTo(temp)==0)
					counter++;
				}
			}
		System.out.println("Count of substring present in the given string is "+counter);
		}
}
