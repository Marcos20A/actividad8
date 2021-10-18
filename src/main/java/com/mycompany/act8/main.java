/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.act8;

import java.util.ArrayList;
/**
 *
 * @author Marco
 */
public class main {
    
    public static void main(String[] args) {

        String[] palo = {"Pika", "Corazon", "Diamante", "Trebol"};
        String[] valor = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Integer cont = 1;
        Deck deck = new Deck();
        deck.setCard(new ArrayList<Card>());
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < valor.length; j++) {
                Card card = new Card(palo[i], getColor(palo[i]), valor[j]);
                deck.getCard().add(card);
            }

        }
        System.out.println("El tamaño de la baraja es:" + deck.getCard().size());
        System.out.println("Mezclar Baraja\n" + deck.mezclar());
    }

    public static String getColor(String palo) {
        if (palo.toLowerCase().equals("Pika") || palo.toLowerCase().equals("Trebol")) {
            return "Negro";
        }
        if (palo.toLowerCase().equals("Corazon") || palo.toLowerCase().equals("Diamante")) {
            return "Rojo";
        }

        return null;
    }
    
}
