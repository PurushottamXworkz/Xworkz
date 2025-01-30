package com.xworkz.zomato.interfaces;

public interface CancellingOrder extends Discounts,Ordering,ReturningOrder {
    void cancel();
    void discount();
    void order();
    void returnOrder();
}
