public class Main {
    public static void main(String[] args) {
        int account = 100; //сумма на счету
        int add = 2000; //сумма пополнения

        int bonus = add / 100;
        if (add < 1000) bonus = 0;

        int total = account + add + bonus;

        System.out.print("Полученно бонусов:" + bonus +
                "Итоговый счёт:" + total);
    }
}
