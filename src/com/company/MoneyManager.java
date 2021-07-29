package com.company;

public class MoneyManager extends CostManager implements Goods{

    private int value;
    private int amount;



    public int getPrice(){
         return (int)(compute(value,amount) * 1.1);

    }

}
