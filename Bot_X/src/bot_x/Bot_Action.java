/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bot_x;

import javax.swing.SwingWorker;

public class Bot_Action {

    static String key = "";
    static String secret = "";

    static String pair = "ETH_USD";
    static String valent = "ETH";

    static double trustLimit = 0.0;
    static double persProfit = 0.0;

    static double orderLifeTime = 0;
    static int orderCount = 0;
    static boolean averageOrCurent = false;
    static int part;

    public static void setPart(String part) {
        part = part;
    }

    public static int getPart() {
        return part;
    }

    public static void setPrsProfit(String PrsProf) {
        persProfit = Double.parseDouble(PrsProf);

    }

    public static double getPrsProfit() {
        return persProfit;
    }

    public static void setorderLifeTime(String LifeTime) {
        orderLifeTime = Double.parseDouble(LifeTime.replace(",", "."));

    }

    public static double getorderLifeTime() {
        orderLifeTime = orderLifeTime * 120;
        return orderLifeTime;
    }

    public static void setOrderCount(String ordCount) {
        orderCount = Integer.parseInt(ordCount);
    }

    public static int getOrderCount() {
        return orderCount;
    }

    public static void setTrustLimit(String trLim) {
        trustLimit = Double.parseDouble(trLim);
    }

    public static double getTrustLimit() {
        return trustLimit;
    }

    public static void setAverageOrCurent(boolean avOrCu) {
        averageOrCurent = avOrCu;
    }

    public static boolean getAverageOrCurent() {
        return averageOrCurent;
    }

    public static String getKey() {
        return key;
    }

    public static String getSecret() {
        return secret;
    }

    public static String getPair() {
        return pair;
    }

    public static String getValent() {
        return valent;
    }

}
