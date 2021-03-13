package Homework1;

public class Customer {
    String num;
    int price;
    int disc;
    int total;

    public Customer(String num , int price , int disc) {
        this.num = num;
        this.price =price ;
        this.disc = disc;
        total = price - total;
    }

    public void print() {
        System.out.println(num + " " + price + " " + disc + " " + total);
    }
}
