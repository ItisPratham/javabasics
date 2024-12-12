package org.example.interfaceFoodOrder;

public class Order {
    private static int order_no = 1;
    private int order;
    private String orderName;
    private int orderPrice;

    private IOrderPayment orderPayment;//loose coupling aka abstraction
    private IOrderPlatform orderPlatform;

    public Order(String orderName, int orderPrice, IOrderPlatform orderPlatform, IOrderPayment orderPayment){
        this.order = order_no;
        order_no++;
        this.orderName = orderName;
        this.orderPrice = orderPrice;

        this.orderPlatform = orderPlatform;
        this.orderPayment = orderPayment;
    }

    public void placeOrder(){
        System.out.println("Order id: "+order);
        System.out.println("Order name is: "+ orderName);
        System.out.println("Order price is: "+ orderPrice);
        orderPayment.payment();
        orderPlatform.platform();
        System.out.println();
    }
}
