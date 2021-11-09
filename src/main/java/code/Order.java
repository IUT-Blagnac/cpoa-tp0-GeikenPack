package main.java.code;

import java.util.List;
import java.util.LinkedList;

public class Order {
    private String owner;
    private String recipient;
    private List<Order.Drink> lDrink;

    public Order()
    {
        this.owner = "";
        this.recipient = "";
        lDrink = new LinkedList<Order.Drink>();
    }

    public String getOwner(){return this.owner;}
    public String getRecipient(){return this.recipient;}
    public List<Order.Drink> getDrinks(){return this.lDrink;}
    public void setOwner(String _owner){this.owner = _owner;}
    public void setRecipient(String _recipient){this.recipient = _recipient;}
    public void addDrink(Order.Drink drink){lDrink.add(drink);}

    @Override
    public String toString() {
        return "Order: " + owner + " / " + recipient + " / { " + lDrink + "}";
    }

    public static class Drink
    {
        private String name;
        public Drink(String name){this.name = name;}
        public String getName(){return this.name;}
        public void setName(String _name){this.name = _name;}
        @Override public String toString() { return name; }
    }
}
