package PizzaHut;

import java.util.Scanner;

public class PizzaHut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        while (flag == 1){
            System.out.println("Please choose Italian or Mexican pizza or type exit");
            String input = sc.nextLine();
            if (input.equals("exit") || input.equals("")){
                flag = 0;
                System.out.println("Exit");
                break;
            }
            System.out.println(createPizza(input).toString());
        }


    }

    public static Pizza createPizza(String pizza){
        if (pizza.equals("Italian") || pizza.equals(("italian"))){
            ItalianPizza italianPizza = new ItalianPizza();
            return italianPizza;
        } else if (pizza.equals("Mexican") || pizza.equals(("mexican"))) {
            MexicanPizza mexicanPizza = new MexicanPizza();
            return mexicanPizza;
        }
        return null;
    }
}
