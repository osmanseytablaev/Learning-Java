import java.util.*;

class Profile {
    public static void main(String args[]) {
        String site = "https://www.facebook.com/";
        System.out.println("Это регестрация на сайт: " + site);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String name = in.nextLine();
        System.out.print("Введите email: ");
        String email = in.nextLine();
        System.out.print("Введите пароль: ");
        String password = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        if (age < 16) {
            System.out.println("Вам меньше 16!");
        }
        if (name.length() < 5) {
            System.out.println("Имя не менее 5 символов!");
        }
        if (email.length() < 14) {
            System.out.println("Неверный email! Пароль не менее 12 символов!");
        }
        if (password.length() < 14) {
            System.out.println("Маленький пароль! Пароль не менее 14 символов!");
        }
        else {
            System.out.println(name);
            System.out.println(email);
            System.out.println(password);
            System.out.println(age);
            System.out.println("Вы зарегестрированы! Поздравляю!");
        }
    }
}