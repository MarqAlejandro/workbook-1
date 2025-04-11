package com.plurasight;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello, Bulma!\n");


        Saiyan Tom_Ado = new Saiyan("Tom Ado",8500, 1_000);

        Saiyan Po_Tato = new Saiyan("Po Tato", 900, 900);

        Tom_Ado.display();

        Po_Tato.display();

        Tom_Ado.transform();

        Tom_Ado.blast(Po_Tato);

        Po_Tato.blast(Tom_Ado);

        Tom_Ado.eatSenzu();

        Tom_Ado.chargeStance();

        Tom_Ado.transform();

        Tom_Ado.display();

        Po_Tato.display();

        Tom_Ado.compareStength(Po_Tato);




    }
}