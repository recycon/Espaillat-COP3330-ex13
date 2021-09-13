package org.example;
import java.util.Scanner;
/**
 * What is the principal amount? 1500
 * What is the rate? 4.3
 * What is the number of years? 6
 * What is the number of times the interest is compounded per year? 4
 * $1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.
 *
 */

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */
public class App 
{
    public static void main( String[] args )
    {
        /// A = P(1 + r/n)^(n*t)
        double A,r;
        int p,t,n;
        Scanner in= new Scanner(System.in);





        System.out.println( "What is the principal amount? " );
        p= in.nextInt();
        System.out.println( "What is the rate? " );
        r=in.nextDouble();
        System.out.println( "What is the number of years?" );
        t=in.nextInt();
        System.out.println( "What is the number of times the interest is compounded per year? " );
        n= in.nextInt();
        double w=r/100;
        double x=w/(double) n;
        double y=(1 + x);
        y=Math.pow(y,(n*t));
        A = p*(y);
        A=Math.round(A*100.0)/100.0;
        System.out.println( "$"+p+ " invested at "+r+"% for "+t +" years compounded "+ n +" times per year is $"+A+"." );
    }
}
