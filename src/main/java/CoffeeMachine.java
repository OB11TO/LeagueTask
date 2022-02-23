

public class CoffeeMachine {
    private int coffeeVolumeTank;
    private int waterVolumeTank;
    private int milkVolumeTank;

    public CoffeeMachine(int coffeeVolumeTank, int waterVolumeTank, int milkVolumeTank) {
        this.coffeeVolumeTank = coffeeVolumeTank;
        this.waterVolumeTank = waterVolumeTank;
        this.milkVolumeTank = milkVolumeTank;
    }

    public void addWater(int waterVolume) {
        if (getNoCheckingVolume(waterVolume)) return;
        waterVolumeTank += waterVolume;
    }

    public void addMilk(int milkVolume) {
        if (getNoCheckingVolume(milkVolume)) return;
        milkVolumeTank += milkVolume;
    }

    public void addCoffee(int coffeeVolume) {
        if (getNoCheckingVolume(coffeeVolume)) return;
        coffeeVolumeTank += coffeeVolume;
    }

    public void addRistretto(int volume) {
        if (getCheckingDrinkVolume(volume)) return;
        if (coffeeVolumeTank < (0.5 * volume) || waterVolumeTank < (0.5 * volume)) {
            System.out.println("Недостаточно ингредиентов");
            return;
        }
        coffeeVolumeTank = (int) (coffeeVolumeTank - 0.5 * volume);
        waterVolumeTank = (int) (waterVolumeTank - 0.5 * volume);
    }

    public void addEspresso(int volume) {
        if (getCheckingDrinkVolume(volume)) return;
        if (coffeeVolumeTank < (0.3 * volume) || waterVolumeTank < (0.7 * volume)) {
            System.out.println("Недостаточно ингредиентов");
            return;
        }

        coffeeVolumeTank = (int) (coffeeVolumeTank - 0.3 * volume);
        waterVolumeTank = (int) (waterVolumeTank - 0.7 * volume);
    }

    public void addLungo(int volume) {
        if (getCheckingDrinkVolume(volume)) return;
        if (coffeeVolumeTank < (0.15 * volume) || waterVolumeTank < (0.85 * volume)) {
            System.out.println("Недостаточно ингредиентов");
            return;
        }
        coffeeVolumeTank = (int) (coffeeVolumeTank - 0.15 * volume);
        waterVolumeTank = (int) (waterVolumeTank - 0.85 * volume);
    }

    public void addCappuccino(int volume) {
        if (getCheckingDrinkVolume(volume)) return;
        if (coffeeVolumeTank < (0.15 * volume)
                || waterVolumeTank < (0.4 * volume)
                || milkVolumeTank < (0.45 * volume)) {
            System.out.println("Недостаточно ингредиентов");
            return;
        }
        coffeeVolumeTank = (int) (coffeeVolumeTank - 0.15 * volume);
        waterVolumeTank = (int) (waterVolumeTank - 0.4 * volume / 100);
        milkVolumeTank = (int) (milkVolumeTank - 0.45 * volume);
    }

    public void addLatte(int volume) {
        if (getCheckingDrinkVolume(volume)) return;
        if (coffeeVolumeTank < (0.1 * volume)
                || waterVolumeTank < (0.3 * volume)
                || milkVolumeTank < (0.6 * volume)) {
            System.out.println("Недостаточно ингредиентов");
            return;
        }
        coffeeVolumeTank = (int) (coffeeVolumeTank - 0.1 * volume);
        waterVolumeTank = (int) (waterVolumeTank - 0.3 * volume);
        milkVolumeTank = (int) (milkVolumeTank - 0.6 * volume);

    }

    private boolean getCheckingDrinkVolume(int volume) {
        if (volume < 10) {
            System.out.println("Мало (мл), невозможно приготовить напиток");
            return true;
        }
        return false;
    }


    private boolean getNoCheckingVolume(int volume) {
        if (volume < 0) {
            System.out.println("Количество (мл) не может быть отрицательным");
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Кофе Машина: \n" + "Резервуар с Кофе = " + coffeeVolumeTank +
                "\nРезервуар с Водой = " + waterVolumeTank +
                "\nРезервуар с Молоком = " + milkVolumeTank;
    }
}
