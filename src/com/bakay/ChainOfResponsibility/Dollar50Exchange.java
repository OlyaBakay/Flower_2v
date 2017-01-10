package com.bakay.ChainOfResponsibility;

/**
 * Created by cs.ucu.edu.ua on 12/5/2016.
 */
public class Dollar50Exchange extends Exchange {

    public void getMoney(Currency obj){
//        if (obj.getAmount() >= 50){
////            if (obj.getMoney() % 10 == 0){
//                int m = obj.getAmount();
//                next.getMoney(obj.getAmount(m - (m/50)*50);
//                System.out.println("");
//            }
//
////        }
//        else {
//            next.getMoney(obj);
//        }

        int money = obj.getAmount();
        next.getMoney(new Currency(money % 50));
        System.out.println("Made " + money/50 + "dol.");
    }

}
