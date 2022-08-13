/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calculator.console;
/**
 *
 * @author FT
 */
import java.util.Scanner;
public class CalculatorConsole 
{
    
    public static void main(String[] args) 
    {
        //variable declaration
        float num1,num2;
        char op;
        try (Scanner scan = new Scanner(System.in)) {
            inputNumber in=new inputNumber();
            calculations cal=new calculations();
            System.out.println(" --------------------------- ");
            System.out.println(" This is Aizaz Calculator ");
            System.out.println(" --------------------------- ");
            
            
            //Ask user to enter number
            
    boolean y=true;
    do
    {
            System.out.println("Enter Two Numbers");
            System.out.println("Enter first number: ");
            num1=in.input1();   
            System.out.println("Enter Second Number: ");
            num2=in.input2();
            System.out.println("");
            System.out.println(" Choose Operator you want to Operate: ");
            System.out.println("[+] for add, [-] to substract, [ * ] to multiply and [ / ] to divide:  ");
            op=scan.next().charAt(0);
     
             switch(op)
             {
                 case '+':
                    float sum=cal.sum(num1, num2);
                    System.out.println(" Result : "+ sum);
                    break;
                 case '-':
                     float sub=cal.sub(num1, num2);
                     System.out.println(" Result : "+ sub);
                     break;
                     case '*':
                   float mul= cal.prod(num1, num2);
                   System.out.println(" Result : "+ mul);
                    break;
                 case '/':
                     float div=cal.divide(num1, num2);
                     System.out.println(" Result : "+ div);
                     break;
                 default:
                     System.out.println("Please Enter a valid operator");
                     break;
                             
             }
             
             // Asking user to do another operation
             int x;
             System.out.println(" Do You want to do another operation? ");
             System.out.println("Enter 1 [yes] , any other key [No] :");
             x=scan.nextInt();
             
             if (x==1)
             {
                 y=true;
             }
             else
                     {
                       y=false;  
                     }
              
             
    } while(y);
        }
        
        
    }
}
