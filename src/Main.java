public class Main {
    public static void main(String[] args) {
        int firstBalance = 100;
        int addend = 1100;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int finalBalance = firstBalance + addend + bonus;
        System.out.println("Итоговый баланс:" + finalBalance);
        System.out.println("Бонус:" + bonus);

    }
}