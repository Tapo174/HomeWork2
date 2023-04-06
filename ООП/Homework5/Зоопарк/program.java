package Зоопарк;
import java.util.Scanner;

import Зоопарк.views.console;
import Зоопарк.views.view;
import Зоопарк.The_zoo.zoo;
import Зоопарк.presentrers.presenter;

public class program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        zoo javaZoo = new zoo();
        view view = new console(scan);
        presenter presenter = new presenter(view, javaZoo);
        presenter.Run();
        scan.close();
    }
}