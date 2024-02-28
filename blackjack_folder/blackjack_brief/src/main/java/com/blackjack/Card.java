package com.blackjack;
import java.util.Random;

public  interface Card
{
    public static Random random = new Random();
    public static String[] typeArr = {"Cœur", "Pique", "Carreau", "Trefle"};
    public static String[] valueArr = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "KING", "QUEEN"};
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //my inner Class
    public static class CardInfo
    {
        private int cardValue;
        private String cardType;

        public CardInfo(int cardValue, String cardType) {
            this.cardValue = cardValue;
            this.cardType = cardType;
        }

        public int getCardValue() {
            return cardValue;
        }

        public String getCardType() {
            return cardType;
        }

    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static CardInfo randomOneCard() {
        int typeRandom = random.nextInt(typeArr.length);
        int valueRandom = random.nextInt(valueArr.length);
        int cardValue = BJ_Interface.getValueAsNumber(valueArr[valueRandom]);
        String cardType = typeArr[typeRandom];
        return new CardInfo(cardValue, cardType);
    }

}