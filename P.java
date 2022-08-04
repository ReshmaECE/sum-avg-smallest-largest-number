
@Author :S.Reshma
Title   :class P
Quiz    :inputs three intergers from the user and display 
         the sum,average,smallest,largest of the number.

import java.util.Scanner;
public class P{

public static void main(String[]args){
Scanner x=new Scanner(System.in);

int num1=0;
int num2=0;
int num3=0;

int sum=0;
double avg=0;
int largest=0;
int smallest=0;

System.out.print("Enter 1st number:");
num1=x.nextInt();
System.out.print("Enter 2nd number:");
num2=x.nextInt();
System.out.print("Enter 3rd number:");
num3=x.nextInt();
sum=num1+num2+num3;
avg=sum/3.0;

//find the largest number
if((num1>num2)&&(num1>num3)){
largest=num1;
}
else if((num2>num1)&&(num2>num3)){
largest=num2;
}
else{
largest=num3;
}

//find the smallest number
if((num1<num2)&&(num1<num3)){
 smallest=num1;
}
else if((num2<num1)&&(num2<num3)){
smallest=num2;
}
else{
smallest=num3;
}

// final result

System.out.println("Sum of the three number"+ sum);
System.out.println("Average is "+avg);
System.out.println("The Largest number"+ largest);
System.out.println("The Smallest number"+ smallest);
}
}