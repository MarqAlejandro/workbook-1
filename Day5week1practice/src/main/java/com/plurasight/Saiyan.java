package com.plurasight;

public class Saiyan {
   private String name;
   private int powerLevel;
   private int ki;
   private boolean superSaiyan;

    public Saiyan(String name, int powerLevel, int ki) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.ki = ki;
        this.superSaiyan = false;

    }

    public String getName(){
        return name;
    }

    public int getPowerLevel(){
        return powerLevel;
    }

    public int getKi(){
        return ki;
    }

    public void setKi(int ki){
        this.ki = ki;
    }

    public void setPowerLevel(int powerLevel){
        this.powerLevel = powerLevel;
    }

    public void setSuperSaiyan(boolean superSaiyan) {
        System.out.println("\n\nHis Power Levels are Spiking!!");
        System.out.println("It's over 9000!!!!");
        System.out.println("He's Transforming!!\n");
        this.superSaiyan = superSaiyan;



    }

    public void transform(){
        if((powerLevel >= 9000) && (superSaiyan == false)){
            setSuperSaiyan(true);
            setPowerLevel(18_000);
            display();
        }
        else{
            System.out.println("\nNot ready to transform yet. \n" + name + " needs more power.");
        }
    }

    public void train(){

        System.out.println("\n\nTraining Arc that lasts 4 episodes commences.\n\n");

        this.powerLevel += 500;
        this.ki += 50;

        System.out.println("4 Episodes later\n\n");
        display();

    }

    public void blast(Saiyan opponent){
        if(this.ki >= 30){
            this.ki -= 30;
            int temp = opponent.getKi() - 20;
            opponent.setKi(temp);
            System.out.println();
            System.out.println(name + " blasts " + opponent.getName());
            System.out.println(opponent.getName() + "'s ki is at " + opponent.getKi());
            System.out.println(name + "'s ki is at " + ki);
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println(name + " is too tired to blast!");
            System.out.println();
        }


    }

    public void display(){
        System.out.println("Scanner has been initiated...Lock onto target");
        System.out.println("Scanning");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("=== Saiyan Status ===");
        System.out.println("Name: " + name);
        System.out.println("Power Level: " + powerLevel);
        System.out.println("Ki: " + ki);

        if (superSaiyan){
            System.out.println("Is a Super Saiyan.\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25");
        }
        else{
            System.out.println("❌❌❌Is NOT a Super Saiyan.❌❌❌");
        }
        System.out.println("==========================");
    }

    public void eatSenzu(){
        this.ki += 100;
        System.out.println("Eating a senzu bean. Health has been restored. Ki is rising.");
    }

    public void chargeStance(){
        this.ki *= 1.25;
        this.powerLevel *= 1.25;
        System.out.println();
        System.out.println("Power level and ki is rising.");
        System.out.println("Bulma, why is he screaming?");
        System.out.println();
    }

    public void compareStength(Saiyan opponent){
        int winner = Math.max(powerLevel, opponent.getPowerLevel());
        if(winner == powerLevel){
            System.out.println();
            System.out.println(name + " is stronger than" + opponent.getName());
        }
        else{
            System.out.println();
            System.out.println(opponent.getName() + " is stronger than " + name);
        }
    }
}
