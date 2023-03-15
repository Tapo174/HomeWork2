//Реализовать класс товар, содержащий следующие свойства...
import classes.*;
import main_classes.products;
import main_classes.program;

import java.util.ArrayList;


public class Main{
    public static void main(String[] args) {
        ArrayList<products> mProducts = new ArrayList<>();
        mProducts.add(new bread("Тосты", 46.5, 10,"шт", "16.03.2023", "Высший сорт"));
        mProducts.add(new diapers("Huggies", 1672, 100, "шт", 3, "S", 1, 3, "M"));
        mProducts.add(new eggs("Красная цена", 70, 10, "шт", "16.03.2023", 10));
        mProducts.add(new masks("Мед.маска", 5, 100, "шт", 5));
        mProducts.add(new milk("Первый вкус", 60, 10, "шт", "16.03.2023", 2.5));
        mProducts.add(new pacifier("Бэйби", 150, 10, "шт", 0, "hypoallergenic"));
        mProducts.add(new soda("Байкал", 55.5, 1, "литр", "16.03.2023"));
        mProducts.add(new toilet_paper("Zewa", 60, 8, "шт", 24, 3));
    
    for (products products: mProducts){
        program.info(products);
        System.out.println();
        }
    }
}