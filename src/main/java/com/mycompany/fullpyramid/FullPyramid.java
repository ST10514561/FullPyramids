package com.mycompany.fullpyramid;

import java.util.Scanner;
public class FullPyramid {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("ENTER HEIGHT OF THE PYRAMID:");
        int height = input.nextInt();
        
        int i = 1;
        
        while (i <= height){
            
            int spaces = 1;//https://www.w3schools.com/java/java_while_loop.asp
            while (spaces <= height - i){//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html?utm_source=chatgpt.com
                System.out.print(" ");//https://www.geeksforgeeks.org/java/java-program-to-print-pyramid-star-pattern/
                spaces++;
            }
            int stars = 1;//https://www.geeksforgeeks.org/java/java-program-to-print-pyramid-star-pattern/
            while(stars <= (2 * i - 1)){//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html?utm_source=chatgpt.com
                System.out.print("*");//https://www.w3schools.com/java/java_while_loop.asp
                stars++;
            }
                System.out.println();
                i++;
            }
            input.close();
            
        }
    }
//CODE ATTRIBUTION
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html?utm_source=chatgpt.com
// https://share.google/1mmdGEn1kQRv57Mtf
//Source: GeeksforGeeks https://share.google/kRf18VitfI5PuSsYI
//Source: GeeksforGeeks https://share.google/kRf18VitfI5PuSsYI
// hhtps://chatGPT.com
