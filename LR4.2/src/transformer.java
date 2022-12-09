import java.util.Scanner;

public class transformer {
    private static melee your_melee;
    private static weapon your_weapon;
    private static kind your_kind;
    private static form your_form;

    public transformer(melee your_melee, weapon your_weapon, kind your_kind, form your_form) {
        this.your_melee = your_melee;
        this.your_weapon = your_weapon;
        this.your_kind = your_kind;
        this.your_form = your_form;
    }

    public static void input() {
        your_kind.input();
        your_melee.input();
        your_weapon.input();
        your_form.input();
    }

    public static void output() {
        your_kind.output();
        your_melee.output();
        your_weapon.output();
        your_form.output();
    }

    public static void color() {
        if ((your_melee.color_of_melee.equals(your_weapon.color_of_weapon)) && (your_melee.color_of_melee.equals(your_kind.color_of_transformer)))
            System.out.println("Ваш трансформер одноцветный");
        else
            System.out.println("Ваш трансформер разноцветный");
    }

    public static void speed_type() {
        if ((your_form.speed >= 120) && (your_form.speed < 200))
            System.out.println("У вашего трансформера маленькая скорость");
        if ((your_form.speed >= 200) && (your_form.speed < 300))
            System.out.println("У вашего трансформера средняя скорость");
        if ((your_form.speed >= 300) && (your_form.speed <= 400))
            System.out.println("У вашего трансформера большая скорость");
    }
}
