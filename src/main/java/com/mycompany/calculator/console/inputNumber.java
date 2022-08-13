/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.console;
import java.util.Scanner;
/**
 *
 * @author FT
 */
public class inputNumber
{
    float num1,num2;
    Scanner scan=new Scanner(System.in);
    float input1()
    {
        
        System.out.println("First Number : ");
        num1=scan.nextFloat();
        return num1;
    }
    float input2()
    {
        System.out.println("Second Number : ");
        num2=scan.nextFloat();
        return num2;
    }
    
}
