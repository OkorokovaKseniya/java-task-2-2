public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int added = 1100;
        int bonus = 11;
        if (added > 1100) {
            bonus = added / 100;
        }

        int finalAccount = initialAccount + added + bonus;

        System.out.println("Итоговый счет: " + finalAccount);
        System.out.println("Бонус: " + bonus);
    }
}