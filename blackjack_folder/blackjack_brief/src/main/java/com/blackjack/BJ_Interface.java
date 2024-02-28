package com.blackjack;

public interface BJ_Interface {

    // Turn the string value into an int value
    static int getValueAsNumber(String value) {
        if (value.equals("Ace")) {
            if ((Player.totalValuePlayer + 11) > 21 || (Croupier.totalValueCroupierFinal + 11) > 21) {
                return 1;
            } else {
                return 11;
            }
        } else if (value.equals("JACK") || value.equals("KING") || value.equals("QUEEN")) {
            return 10;
        } else {
            return Integer.parseInt(value);
        }
    }

    static void playerWin() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("You Win  :" + " <Total> " + "( " + Player.totalValuePlayer + " )");
        System.out.println("CROUPIER  :" + " <Total> " + "( " + Croupier.totalValueCroupierFinal + " )");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // After win or lose
        Player.totalValuePlayer = 0;
        Croupier.totalValueCroupierFinal = 0;
    }

    static void croupierWin() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("You Lose  :" + " <Total> " + "( " + Player.totalValuePlayer + " )");
        System.out.println("CROUPIER Win :" + " <Total> " + "( " + Croupier.totalValueCroupierFinal + " )");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // After win or lose
        Player.totalValuePlayer = 0;
        Croupier.totalValueCroupierFinal = 0;
    }

    static void theBlackJack() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("-----------------BlackJack------------------------------------------------");
        System.out.println("You Win  :" + " <Total> " + "( " + Player.totalValuePlayer + " )");
        System.out.println("CROUPIER  :" + " <Total> " + "( " + Croupier.totalValueCroupierFinal + " )");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // After win or lose
        Player.totalValuePlayer = 0;
        Croupier.totalValueCroupierFinal = 0;
    }

    static void noWinNoLose() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("-----------------Draw Result------------------------------------------------");
        System.out.println("You   :" + " <Total> " + "( " + Player.totalValuePlayer + " )");
        System.out.println("CROUPIER  :" + " <Total> " + "( " + Croupier.totalValueCroupierFinal + " )");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // After win or lose
        Player.totalValuePlayer = 0;
        Croupier.totalValueCroupierFinal = 0;
    }


}