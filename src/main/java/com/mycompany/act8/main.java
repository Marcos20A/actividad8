/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.act8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Marco
 */
public class main {
    
    public static void main(String[] args) {
        
        
        String[] palo = {"Pica", "Corazon", "Diamante", "Trebol"};
        String[] valor = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        //Integer cont = 1;
        Deck deck = new Deck();
        deck.setCard(new ArrayList<Card>());
        
        for(int i = 0; i < palo.length; i++) {
            for(int j = 0; j < valor.length; j++) {
                //System.out.println(cont + " Palo: " + palo[i] + " " + "Valor: " + valor[j] + " Color: "+getColor(palo[i]));
                //cont++;
                Card card = new Card(palo[i], getColor(palo[i]), valor[j]);
                deck.getCard().add(card);
            }
        }
        
        
        
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        
        while(!salir){
            
            
            System.out.println("Bienvenido a Poker!");
            System.out.println("Tus opciones son las siguientes: ");
            
            System.out.println("1.- Mezclar el deck ");
            System.out.println("2.- Sacar 1 carta ");
            System.out.println("3.- Carta al azar ");
            System.out.println("4.- Generar una mano de 5 cartas ");
            System.out.println("0.- salir ");
            
            try{
            
                 System.out.println("Selecciona una opcion: ");
                  opcion = sn.nextInt();
            
            
               switch(opcion){
                
                  case 1:
                    System.out.println(deck.mezclar());
                    System.out.println("Se mezclo el deck");
                      
                     break;
                    
                  case 2:
                    
                      Card card1 = deck.getCard().get(0);
                      card1.getColor();
                      card1.getPalo();
                      deck.getCard().get(0).getPalo();
                      //System.out.println(card1);
                      System.out.println("La primera carta del deck es: " +" "+card1.getPalo()+" " + card1.getColor()+" " + card1.getValor());
                      System.out.println("Quedan:  51 cartas en deck");
                      //System.out.println(deck.mezclar());
                      
                    
                    break;
                    
                 case 3:
                    
                     Card card2 = deck.pick(deck);
                     card2.getColor();
                     card2.getPalo();
                     System.out.println("La carta al azar es: " + card2.getPalo()+ " " + card2.getColor()+ " "+card2.getValor());
                     System.out.println("Quedan: 51 cartas en deck");
                     //System.out.println(deck.mezclar());
                     
                    
                    break;
                    
                case 4: 
                          Card card3 = deck.getCard().get(1);
                          card3.getColor();
                          card3.getPalo();
                          deck.getCard().get(1).getPalo();
                          System.out.println("La primera carta es: " +" "+card3.getPalo()+" " + card3.getColor()+" " + card3.getValor());
      
                         Card card4 = deck.getCard().get(2);
                         card4.getColor();
                         card4.getPalo();
                         deck.getCard().get(2).getPalo();
                         System.out.println("La segunda carta es: " +" "+card4.getPalo()+" " + card4.getColor()+" " + card4.getValor());
      
                         Card card5 = deck.getCard().get(3);
                         card5.getColor();
                         card5.getPalo();
                         deck.getCard().get(3).getPalo();
                         System.out.println("La tercera carta es: " +" "+card5.getPalo()+" " + card5.getColor()+" " + card5.getValor());
      
                         Card card6 = deck.getCard().get(4);
                         card6.getColor();
                         card6.getPalo();
                         deck.getCard().get(4).getPalo();
                         System.out.println("La cuarta carta es: " +" "+card6.getPalo()+" " + card6.getColor()+" " + card6.getValor());
      
                         Card card7 = deck.getCard().get(5);
                         card7.getColor();
                         card7.getPalo();
                         deck.getCard().get(5).getPalo();
                         System.out.println("La quinta carta es: " +" "+card7.getPalo()+" " + card7.getColor()+" " + card7.getValor());
                         System.out.println("Quedan: 47 cartas en deck");
                         
                    
                      break;
                    
                  case 0:
                         salir=true;
                      break;
                default:
                        System.out.println("Opcion no valida, ingresa un numero del 0 al 4");
            }
            
            }catch(InputMismatchException e){
                
                System.out.println("Opcion no valida, ingresa un numero del 0 al 4");
                sn.next();
                
            }
        }
        


    //  System.out.println("El tamaño de la baraja es de: " + deck.getCard().size());
      //System.out.println("Mezclar Baraja\n" + deck.mezclar());
      
      
      /*
      parte de head
      */
      
     /* Card card1 = deck.getCard().get(0);
      card1.getColor();
      card1.getPalo();
      deck.getCard().get(0).getPalo();
      //System.out.println(card1);
      System.out.println("La primera carta del deck es: " +" "+card1.getPalo()+" " + card1.getColor()+" " + card1.getValor());
      System.out.println("Quedan:  51 cartas en deck");
      System.out.println(deck.mezclar());
      */
      
      
      /*
      parte de pick
      */
      
      /*Card card2 = deck.pick(deck);
      card2.getColor();
      card2.getPalo();
      //deck.getCard().get().getPalo();
      System.out.println("La carta al azar es: " + card2.getPalo()+ " " + card2.getColor()+ " "+card2.getValor());
      System.out.println("Quedan: 50 cartas en deck");
      System.out.println(deck.mezclar());*/
  
      
      
      
      
      /*
      parte de hand
      */
      
      
    /*  Card card3 = deck.getCard().get(1);
      card3.getColor();
      card3.getPalo();
      deck.getCard().get(1).getPalo();
      System.out.println("La primera carta es: " +" "+card3.getPalo()+" " + card3.getColor()+" " + card3.getValor());
      
      Card card4 = deck.getCard().get(2);
      card4.getColor();
      card4.getPalo();
      deck.getCard().get(2).getPalo();
      System.out.println("La segunda carta es: " +" "+card4.getPalo()+" " + card4.getColor()+" " + card4.getValor());
      
      Card card5 = deck.getCard().get(3);
      card5.getColor();
      card5.getPalo();
      deck.getCard().get(3).getPalo();
      System.out.println("La tercera carta es: " +" "+card5.getPalo()+" " + card5.getColor()+" " + card5.getValor());
      
      Card card6 = deck.getCard().get(4);
      card6.getColor();
      card6.getPalo();
      deck.getCard().get(4).getPalo();
      System.out.println("La cuarta carta es: " +" "+card6.getPalo()+" " + card6.getColor()+" " + card6.getValor());
      
      Card card7 = deck.getCard().get(5);
      card7.getColor();
      card7.getPalo();
      deck.getCard().get(5).getPalo();
      System.out.println("La quinta carta es: " +" "+card7.getPalo()+" " + card7.getColor()+" " + card7.getValor());
      
      System.out.println("Quedan: 45 cartas en deck");*/
      
    }

    public static String getColor(String palo) {
        
        if (palo.toLowerCase().equals("pica") || palo.toLowerCase().equals("trebol")) {
            return "negro";
        }
        if (palo.toLowerCase().equals("corazon") || palo.toLowerCase().equals("diamante")) {
            return "rojo";
        }

        return null;
    }
    
}
