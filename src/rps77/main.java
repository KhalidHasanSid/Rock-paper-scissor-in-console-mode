/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rps77;

/**
 *
 * @author khalid hasan
 */
         import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 import java.util.Scanner;
import java.util.Random;
public class Rps77 {


    public static void main(String[] args)throws IOException  {
        // TODO code application logic here
       // Scanner sc=new Scanner(System.in);
         Random rand = new Random();
        int num;
    String userChoice="";
        int uscore=0;
        int cscore=0;
        int tiegame=0;  
        int a ;
        
        System.out.println("Welcome to Rock paper scissor!");
        
            do{
                 
                Scanner sc=new Scanner(System.in);
         System.out.println("Pleaser choose R)ock P)aper or S)cissors");
         
    
           int x = 5; // wait 2 seconds at most
        

BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
long startTime = System.currentTimeMillis();
while ((System.currentTimeMillis() - startTime) < x * 1000
        && !in.ready()) {
}

if (in.ready()) {
    userChoice=in.readLine().toUpperCase();
//    System.out.println("You entered: " + userChoice);
     if((userChoice.equals("R")||userChoice.equals("S")||userChoice.equals("P")))
     {
        System.out.println("You entered: " + userChoice);
       
        }
     else
     {
        System.out.println("You didnot enter correct input ");
       
        }
    
    
} 
else {
    System.out.println("You did not enter data, you lose!");
    
  //  break;
}
    //  if((userChoice=="R"||userChoice=="S"||userChoice=="P")){
         String [] computerchoice={"R","P","S"};
         
         //for( i=0;i<computerchoice.length;i++)
          //i=Math.random()*computerchoice.length;
          num = rand.nextInt(3);
       System.out.println( "The computer choose   "+computerchoice[num]);
      String computerChoice=computerchoice[num];

        // Determine a winner
        if(userChoice.equals("R") && computerChoice.equals("S"))
        {
            System.out.println("The user won!");
            uscore =uscore+1;      
        }
        
        else if(userChoice.equals("P") && computerChoice.equals("R"))
        {
            System.out.println("The user won!");
            uscore=uscore+1;      
        }
        
        else if(userChoice.equals("S") && computerChoice.equals("P"))
        {
            System.out.println("The user won!");
            uscore=uscore+1;     
        }
        
        else if(userChoice.equals("S") && computerChoice.equals("R"))
        {
            System.out.println("The computer won!");
            cscore=cscore+1;
            
        }
        
        else if(userChoice.equals("R") && computerChoice.equals("P"))
        {
            System.out.println("The computer won!");
            cscore=cscore+1;
              
        }
        
        else if(userChoice.equals("P") && computerChoice.equals("S"))
        {
            System.out.println("The computer won!");
            cscore=cscore+1;
              System.out.println("computer score"+cscore);
        }
        
        else if(userChoice.equals(computerChoice))
        {
            System.out.println("Tie!");
            tiegame=tiegame+1;
               
        }
  
        System.out.println("Do you want to play again . press 1 to continue");
         a =sc.nextInt();
            }
           while(a==1);
             System.out.println("Your score"+uscore);
         System.out.println("computer score"+cscore);
                  System.out.println("Tie games"+tiegame);
    }}
    
    

