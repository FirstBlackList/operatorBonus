public class Main {
    public static void main(String[] args) {

        int balance = 400;
        int depositAmount = 1400;
        int accruedBonus = 0;
        int sumBalance = balance + depositAmount;
        if (depositAmount > 0 && depositAmount > 1000){
            for (int i = 0; i < sumBalance; i++){
                accruedBonus = accruedBonus + sumBalance  / 100;
                sumBalance = sumBalance % 100;
            }
        }else
            System.out.println("Для начисления бонусов сумма поплнения\n" +
                    "должна превышать 1000 рублей.");
        int sum = balance + depositAmount + accruedBonus;
        System.out.println("Количество бонусов: " + accruedBonus);
        System.out.println("Ваш баланс: " + sum);
    }
}