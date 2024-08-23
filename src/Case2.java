public class Case2 {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int initialBalance = 100; // начальный счёт
        int refillAmount = 1100; // сумма пополнения

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран
        int bonusAmount;
        if (refillAmount > 1000) {
            bonusAmount = refillAmount / 100;
        } else {
            bonusAmount = 0;
        }
        int finalBalance = initialBalance + refillAmount + bonusAmount;
        System.out.println("Итоговый счёт: " + finalBalance);
        System.out.println("Количество бонусных рублей: " + bonusAmount);
    }
}
