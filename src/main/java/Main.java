import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        CoffeeMachine coffeeMachine = new CoffeeMachine(Integer.parseInt(args[0]),
                                                        Integer.parseInt(args[1]),
                                                        Integer.parseInt(args[2]));

        /*CoffeeMachine coffeeMachineTest = new CoffeeMachine(100, 100, 100);*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите команду из списка: water, milk, coffee, latte, ristretto, " +
                    "cappuccino, lungo, espresso, turn off");

            String[] params = reader.readLine().trim().toLowerCase().split(" ");
            if (params.length < 1 || params.length > 2) {
                System.out.println("Неверная команда");
                continue;
            }


            int drinkVolume = 0;

            try {
                if (params.length == 2 && !params[1].equals("off")) {
                    drinkVolume = Integer.parseInt(params[1].intern());
                }
                if (params.length == 2 && params[0].equals("turn") && params[1].equals("off")) {
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильно введено количество (мл) ");
            }


            switch (params[0]) {
                case "water":
                    coffeeMachine.addWater(drinkVolume);
                    System.out.println(coffeeMachine + "\n");
                    break;
                case "milk":
                    coffeeMachine.addMilk(drinkVolume);
                    System.out.println(coffeeMachine + "\n");
                    break;
                case "coffee":
                    coffeeMachine.addCoffee(drinkVolume);
                    System.out.println(coffeeMachine + "\n");
                    break;
                case "latte":
                    coffeeMachine.addLatte(drinkVolume);
                    System.out.println(coffeeMachine + "\n");
                    break;
                case "ristretto":
                    coffeeMachine.addRistretto(drinkVolume);
                    System.out.println(coffeeMachine + "\n");
                    break;
                case "cappuccino":
                    coffeeMachine.addCappuccino(drinkVolume);
                    System.out.println(coffeeMachine + "\n");
                    break;
                case "lungo":
                    coffeeMachine.addLungo(drinkVolume);
                    System.out.println(coffeeMachine + "\n");
                    break;
                case "espresso":
                    coffeeMachine.addEspresso(drinkVolume);
                    System.out.println(coffeeMachine + "\n");
                    break;

                default:
                    System.out.println("Неверная команда");
                    break;
            }
        }


    }
}
