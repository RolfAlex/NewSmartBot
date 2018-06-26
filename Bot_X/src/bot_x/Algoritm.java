/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bot_x;

import java.net.SocketTimeoutException;

/**
 *
 * @author alex
 */
public class Algoritm {

    public static void main(String[] args) throws InterruptedException, SocketTimeoutException {
        double prise = Calculation.getFormatPrise(Double.parseDouble(Modules.getPrise(Bot_Action.key, Bot_Action.secret, Bot_Action.getPair()).get("1").toString()), "#0.00000");
        
        
        
        
        
        double oldOrderPrise = 0.0;
        double orderPrise = Calculation.getOldOrderBuyPrise(Bot_Action.getPair(), Bot_Action.getPrsProfit(), Bot_Action.key, Bot_Action.secret, Bot_Action.trustLimit, oldOrderPrise);       
        double quantiti = Double.parseDouble(Calculation.getPartTrustBalans(Bot_Action.trustLimit, String.valueOf(prise), Bot_Action.part).get("partEth").toString());
        Modules.orderTypeCreated(Bot_Action.key, Bot_Action.secret, Bot_Action.pair, String.valueOf(quantiti), String.valueOf(orderPrise), "buy");
    }

}
