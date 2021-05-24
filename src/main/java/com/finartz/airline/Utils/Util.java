package com.finartz.airline.Utils;

public class Util {

    private static final String[] separators = {",", "-", ".", "?"};
    private static final String mask = "######******####";

    public static String maskCreditCard(String creditCard) {

        for (String separator: separators) {
            creditCard = creditCard.replace(separator, "");
        }

        StringBuilder cc = new StringBuilder();

        for (int i = 0; i < mask.length(); i++) {
            char c = mask.charAt(i);
            if (c == '#') {
                cc.append(creditCard.charAt(i));
            }
            else {
                cc.append(c);
            }
        }

        return cc.toString();
    }
}
