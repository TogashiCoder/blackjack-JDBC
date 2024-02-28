package com.blackjack;

import com.blackjack.dataStock.InsertRecords;

public interface MainInterface {

    static void hitPlayer() {
        Card.CardInfo obPlayer = Card.randomOneCard();
        //insert Playercard info into database
        InsertRecords.insertCardPlayer(obPlayer);

        int print_ValueCardPly = obPlayer.getCardValue();
        String print_TypeCardPly = obPlayer.getCardType();
        Player.totalValuePlayer += obPlayer.getCardValue();

        //******************insert totalValuePlayer
        InsertRecords.insesrtPlayerRco();

        System.out.println("[ " + print_TypeCardPly + " ]" + " value : " + "[ " + print_ValueCardPly + " ]");
    }

    static void hitCroupier() {
        Card.CardInfo obCroupier = Card.randomOneCard();
        //insert Croupiercard info into database
        InsertRecords.insertCardCroupier(obCroupier);

        int print_ValueCardCrou = obCroupier.getCardValue();
        String print_TypeCardCrou = obCroupier.getCardType();
        Croupier.totalValueCroupierFinal += obCroupier.getCardValue();

        //******************insert totalValueCroupierFinal
        InsertRecords.insesrtCroupierRco();

        System.out.println("[ " + print_TypeCardCrou + " ]" + " value : " + "[ " + print_ValueCardCrou + " ]");
    }

    static void hitHiddenCard() {
        Card.CardInfo obCroupier = Card.randomOneCard();
        //insert Croupiercard info into database
        InsertRecords.insertCardCroupier(obCroupier);

        int print_ValueCardCrou = obCroupier.getCardValue();
        String print_TypeCardCrou = obCroupier.getCardType();
        Croupier.totalValueCroupierFinal += obCroupier.getCardValue();

        //******************insert totalValueCroupierFinal
        InsertRecords.insesrtCroupierRco();
    }
}