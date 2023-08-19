package main;

import builder.PizzaBuilder;
import builder.InvoiceBuilder;
import ingredient.*;
import dough.*;
import size.*;
import product.Pizza;
import product.Invoice;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        Big big = new Big();
        Thick thick = new Thick();
        boolean extracheese = true;

        Cheese cheese = new Cheese();
        Ham ham = new Ham();
        Pineapple pineapple = new Pineapple();
        Mushroom mushroom = new Mushroom();
        Onion onion = new Onion();
        Pepperoni pepperoni = new Pepperoni();
        Pepper pepper  = new Pepper();
        Olive olive = new Olive();

        HashMap<IIngredient, Integer> ingredient = new HashMap<>();
        ingredient.put(cheese,1);
        ingredient.put(ham,23);
        ingredient.put(pineapple,18);
        ingredient.put(mushroom,6);
        ingredient.put(onion,4);
        ingredient.put(pepperoni,12);
        ingredient.put(pepper,8);
        ingredient.put(olive,4);

        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.Size(big);
        pizzaBuilder.Dough(thick);
        pizzaBuilder.Ingredients(ingredient);
        pizzaBuilder.ExtraCheese(extracheese);

        Pizza pizza = pizzaBuilder.getPizza();
        System.out.println(pizza.toString() + "\n");

        InvoiceBuilder invoiceBuilder = new InvoiceBuilder();
        invoiceBuilder.Size(big);
        invoiceBuilder.Dough(thick);
        invoiceBuilder.Ingredients(ingredient);
        invoiceBuilder.ExtraCheese(extracheese);

        Invoice invoice = invoiceBuilder.getInvoice();
        System.out.println(invoice.toString());

    }

}
