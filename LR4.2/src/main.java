import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        int x = 0;
        int i = 0;
        int counter = 0;
        int min, max;
        transformer[] your_transformer = new transformer[10];
        while (x != 5) {
            System.out.println("Введите:");
            System.out.println("1 - для создания вашего трансформера");
            System.out.println("2 - для вывода всех трансформеров");
            System.out.println("3 - вывода случайного числа через вспомогательный класс");
            System.out.println("4 - выхода");
            Scanner vvod = new Scanner(System.in);
            x = vvod.nextInt();
            switch (x) {
                case 1:
                    melee your_melee = new melee("type_of_melee", 0, "color_of_melee");
                    weapon your_weapon = new weapon("color_of_weapon", "type_of_weapon", 0, 0);
                    kind your_kind = new kind("color_of_transformer", "genus", 0);
                    form your_form = new form("model_of_car", 0, 0);
                    your_transformer[i] = new transformer(your_melee, your_weapon, your_kind, your_form);
                    your_transformer[i].input();
                    your_transformer[i].output();
                    your_transformer[i].color();
                    your_transformer[i].speed_type();
                    i++;
                    counter++;
                    break;
                case 2:
                    for (int j = 0; j < counter; j++) {
                        your_transformer[j].output();
                        your_transformer[j].color();
                        your_transformer[i].speed_type();
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    System.out.println("Введите нижнюю границу:");
                    min = vvod.nextInt();
                    System.out.println("Введите верхнюю границу:");
                    max = vvod.nextInt();
                    System.out.println("Случайное число: "+ generateRandomInt.generateRandomIntRange(min, max));
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}