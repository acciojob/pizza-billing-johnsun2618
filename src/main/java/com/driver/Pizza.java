package com.driver;

public class Pizza {

    public int cheesePrice;
    public int basePrice;
    public int toppingPrice;
    public int paperBagPrice;

    public String bill;
    public int totalPrice;
    boolean isCheeseAdded;
    boolean isToppingAdded;
    boolean isPaperBagAdded;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        if(isVeg){
            basePrice = 300;
            toppingPrice = 70;
        } else {
            basePrice = 400;
            toppingPrice = 120;
        }

        paperBagPrice = 20;
        cheesePrice = 80;

        isCheeseAdded = false;
        isPaperBagAdded = false;
        isToppingAdded = false;

        totalPrice = basePrice;
        bill = "Base Price Of The Pizza "+basePrice + "\n";
    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){

        if(!isCheeseAdded){
            this.totalPrice = totalPrice + cheesePrice;
            isCheeseAdded = true;  //so to prevent it from adding again
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            this.totalPrice = totalPrice + toppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isPaperBagAdded){
            this.totalPrice = totalPrice + paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated){

            if(isCheeseAdded == true){
                bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";
            }
            if(isToppingAdded == true){
                bill = bill + "Extra Toppings Added: " + toppingPrice + "\n";
            }
            if(isPaperBagAdded == true){
                bill = bill + "Paper Bag Added: " + paperBagPrice + "\n";
            }

            bill = bill + "Total Price: " + totalPrice + "\n";

            isBillGenerated = true;
        }
        return this.bill;
    }
}
