/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21sumkolpakov;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV21SumKolpakov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*A - Будет число которое мы вводим*/
        System.out.println("Здравствуй. Набери рандомное трёх-значное число: ");
        Scanner scan = new Scanner(System.in);
        /*Из числа делаем переменую*/
        int input = scan.nextInt();
        int sum = 0;
        int a = (input % 10);
        int b = (input / 10 % 10);
        int c = (input / 100);
        System.out.println("Вы ввели число: " + input);
        System.out.println("Единица: " + a);/*Последнее число*/
        System.out.println("Десятков: " + b);/*Второе число*/
        System.out.println("Сотня: " + c);/*первое число*/
        System.out.println("-------------------------------------------");
        /*Вторая часть*/
        /*Ищем сумму*/
        if ( input>0 ){
            sum = a + b + c;
            System.out.println("Сумма чисел равна: " + sum);
        }
        
    
    }
}
