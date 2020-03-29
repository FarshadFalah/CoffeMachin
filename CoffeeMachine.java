package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Cofe cofe = new Cofe();

    }


}

class Cofe {
    int waterhave = 400;
    int milkhave = 540;
    int cbeanshave = 120;
    int cupshave = 9;
    int money = 550;
    Scanner con = new Scanner(System.in);

    Cofe() {
        String s = "";
        while (true) {
            System.out.println("Write action (buy, fill , take, remaining, exit)");
            s = this.con.nextLine();
            if (s.compareTo("exit") == 0) {
                return;
            }
            if (s.compareTo("buy") == 0) {
                this.buy();
            } else if (s.compareTo("fill") == 0) {
                this.fill();
            } else if (s.compareTo("take") == 0) {
                this.take();
            } else if (s.compareTo("remaining") == 0) {
                this.print();
            }
        }
    }

    void print() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(this.waterhave + " of water");
        System.out.println(this.milkhave + " of milk");
        System.out.println(this.cbeanshave + " of coffee beans");
        System.out.println(this.cupshave + " of disposable cups");
        System.out.println(this.money + " of money");
        System.out.println();
    }

    private void take() {
        System.out.println("I gave you " + this.money);
        this.money = 0;

    }

    private void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        int water = con.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = con.nextInt();
        System.out.println("Write how many ml of grams do of coffee you want to add:");
        int cofe = con.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cups = con.nextInt();
        this.waterhave += water;
        this.milkhave += milk;
        this.cbeanshave += cofe;
        this.cupshave += cups;
    }

    private void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String choise= con.nextLine();
        if (choise.compareTo("1")==0) {
            this.esper();
        } else if (choise.compareTo("2")==0) {
            this.latte();
        } else if (choise.compareTo("3")==0) {
            this.cappu();
        }

    }

    private void cappu() {
        if ((this.waterhave >= 200) && (this.milkhave >= 100) && (this.cbeanshave >= 12) && (this.cupshave >= 1)) {
            this.waterhave -= 200;
            this.milkhave -= 100;
            this.cbeanshave -= 12;
            this.cupshave--;
            this.money += 6;
            System.out.println("I have enough resources, making you a coffee!");
        } else if (this.waterhave < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milkhave < 100) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.cbeanshave < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("Sorry, not enough disposable cups!");
        }

    }

    private void latte() {
        if ((this.waterhave >= 350) && (this.milkhave >= 75) && (this.cbeanshave >= 20) && (this.cupshave >= 1)) {
            this.waterhave -= 350;
            this.milkhave -= 75;
            this.cbeanshave -= 20;
            this.cupshave--;
            this.money += 7;
            System.out.println("I have enough resources, making you a coffee!");
        } else if (this.waterhave < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milkhave < 75) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.cbeanshave < 20) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("Sorry, not enough disposable cups!");
        }

    }

    private void esper() {
        if ((this.waterhave >= 250) && (this.cbeanshave >= 16) && (this.cupshave >= 1)) {
            this.waterhave -= 250;
            this.cbeanshave -= 16;
            this.money += 4;
            this.cupshave--;
            System.out.println("I have enough resources, making you a coffee!");
        } else if (this.waterhave < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (this.cbeanshave < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("Sorry, not enough disposable cups!");
        }

    }
}