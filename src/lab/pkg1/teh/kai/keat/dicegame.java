/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1.teh.kai.keat;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author User
 */
public class dicegame {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random rand = new Random();
        int dice1p1value;
    int dice2p1value;
     int dice1p2value;
    int dice2p2value;
    int player2result=0;
    int player1result=0;
    char continueornot;
    int turn = 1;
    char roll;
        Scanner s = new Scanner(System.in);
        do{
        do{
        
        dice1p1value = 0;
        dice2p1value = 0;
        do{
        System.out.print("Enter R to roll both of the dice (Player 1):");
        roll = s.next().charAt(0); 
        }while(roll!='R');
        
        dice1p1value = rand.nextInt(6)+1;
        dice2p1value = rand.nextInt(6)+1;
        System.out.println("Player 1 1st dice value : "+dice1p1value);
        System.out.println("Player 1 2st dice value : "+dice2p1value);
        System.out.println("===============================");
        
        if(dice1p1value == 1 && dice2p1value == 1){
           player1result = player1result*2;
        }
        else if(dice1p1value%2==1 && dice2p1value%2==1){
            player1result = player1result-5;
        }
         else if(dice1p1value == 6 && dice2p1value == 6){
        }
        else{
            player1result = player1result+dice1p1value+dice2p1value;
        }
        }while(dice1p1value == 6 && dice2p1value == 6);
        
        
       
        
        do{
        dice1p2value = 0;
        dice2p2value = 0;
        
         do{
        System.out.print("Enter R to roll both of the dice (Player 2):");
        roll = s.next().charAt(0); 
        }while(roll!='R');
        
        dice1p2value = rand.nextInt(6)+1;
        dice2p2value = rand.nextInt(6)+1;
        
        
        System.out.println("Player 2 1st dice value : "+dice1p2value);
        System.out.println("Player 2 2st dice value : "+dice2p2value);
        System.out.println("===============================");
        
        if(dice1p2value == 1 && dice2p2value == 1){
           player2result = player2result*2;
        }
        else if(dice1p2value%2==1 && dice2p2value%2==1){
            player2result = player2result-5;
        }
        else if(dice1p2value == 6 && dice2p2value == 6){
          }
        else{
            player2result = player2result+dice1p2value+dice2p2value;
        }
        }while(dice1p2value == 6 && dice2p2value == 6);
            System.out.println("Round "+turn);
            System.out.println("===============================");
            System.out.println("Player 1 score:"+player1result);
            System.out.println("Player 2 score:"+player2result);
            System.out.println("===============================");
    
            System.out.print("Continue the dice game? (Y/N):");
            continueornot = s.next().charAt(0); 
            turn++;
        }while(continueornot == 'Y');
            
        
        
        
        
            System.out.printf("\n");
            System.out.printf("\n");
            System.out.println("==============================");
            System.out.println("Dice Game Final Score");
            System.out.println("==============================");
            if(player1result>player2result){
            System.out.println("Player 1 win!");
            System.out.println("==============================");
            System.out.println("Player 1 score:"+player1result);
            System.out.println("Player 2 score:"+player2result);
            }
            else if(player1result==player2result){
            System.out.println("Player 1 and 2 Tie!");
            System.out.println("==============================");
            System.out.println("Player 1 score:"+player1result);
            System.out.println("Player 2 score:"+player2result);
            }
            else{
            System.out.println("Player 2 win!");
            System.out.println("==============================");
            System.out.println("Player 1 score:"+player1result);
            System.out.println("Player 2 score:"+player2result);
            }
            System.out.println("==============================");
}
}
