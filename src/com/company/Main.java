package com.company;

public class Main {

    public static void main(String[] args) {

        String name = "Joy";
        int age = generateRandomAge();
        int temp = 20;

        if (temp > 30 && temp < -20 || age > 20 && age < 45) {
            System.out.println(name + " пойдет в гости к другу!");

        } else if (age < 20 && temp > 0 && temp < 28) {
            System.out.println(name + " Будет сидеть дома и играть");

        } else if (age > 45 && temp > -10 && temp < 25) {
            System.out.println(name + " Будет смотреть телевизор");
        }
        else {
            System.out.println(name + " не выходит гулять!");
        }
    }

    public static int generateRandomAge(){
        int a = (int) (Math.random() * 108);

        return a;
    }



}

