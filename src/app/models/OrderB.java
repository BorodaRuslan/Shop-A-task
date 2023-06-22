package app.models;

public class OrderB extends Order {

    double delivery;

    public OrderB(String code, String delivery) {
        super(code);
        this.delivery = Double.parseDouble(delivery);
    }

    public double getOrderCost(double quantity, double price) {

        return  quantity * price + delivery;
    }
}
