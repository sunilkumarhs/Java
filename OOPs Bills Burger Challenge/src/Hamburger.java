import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Hamburger {
    Scanner scan = new Scanner(System.in);
    private String rollType;
    private double basePrice;
    private String name;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean caliFlower;

    public Hamburger() {
        this.rollType="Bread Meat Roll";
        this.basePrice=200;
        this.name="Hamburger";
    }

    public Hamburger(String rollType, double basePrice, String name) {
        this.rollType=rollType;
        this.basePrice=basePrice;
        this.name=name;
    }

    public void viewBurger(){
        System.out.println("The "+this.name+" contains "+rollType+" in it");
        System.out.println("The  base price of "+this.name+" :- "+this.basePrice+"Rs");
        System.out.println("The additional components that are can be added are :");
        System.out.println("0.Nothing    - +=0Rs \n"+
                           "1.Lettuce    - +50Rs \n"+
                           "2.Tomato     - +60Rs  \n"+
                           "3.Carrot     - +55Rs   \n"+
                           "4.CaliFlower - +65Rs");
    }

    public double buyBurger(int qty) {
        double totalAmount = 0;
        for(int i=1;i<=qty;i++){
            System.out.println("Please enter the number that items to be added to "+i+"th burger");
            String addition = scan.next();
            double totalPrice = 0;
            if(!Objects.equals(addition, "0")) {
                double additionPrice = additionalItems(addition);
                totalPrice += additionPrice + this.basePrice;
                System.out.println("Addition items price of "+i+"th burger :- "+additionPrice+"Rs");
            }else {
                totalPrice += this.basePrice;
            }
            totalAmount += totalPrice;
            System.out.println("Your total price of "+i+"th burger :- "+totalPrice+"Rs");
            System.out.println("");
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Your total amount of "+qty+" burgers :- "+totalAmount+"Rs");
        return totalAmount;
    }

    public double additionalItems( String addition) {
        lettuce = addition.contains("1");
        tomato = addition.contains("2");
        carrot = addition.contains("3");
        caliFlower = addition.contains("4");
        double additionPrice = 0;
        if(lettuce) {
            additionPrice += 50;
        }
        if(tomato) {
            additionPrice += 60;
        }
        if(carrot) {
            additionPrice += 55;
        }
        if(caliFlower) {
            additionPrice += 65;
        }
        return additionPrice;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
    }

    public void setCaliFlower(boolean caliFlower) {
        this.caliFlower = caliFlower;
    }

    public String getRollType() {
        return rollType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isCaliFlower() {
        return caliFlower;
    }
}
