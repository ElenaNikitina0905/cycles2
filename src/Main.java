public class Main {
    public static void main(String[] args) {

        // 1
        int money = 15000;
        int totalMoney = 0;
        int i = 0;
        while (totalMoney < 2_459_000) {
            totalMoney = totalMoney + totalMoney / 100;
            totalMoney = totalMoney + money;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalMoney + " рублей");
        }
        System.out.println();

        // 2
        int k = 1;
        while (k <= 10) {
            System.out.print(k + " ");
            k++;
        }
        System.out.println();

        for (int l = 10; l >= 1; l--) {
            System.out.print(l + " ");
        }
        System.out.println();

        // 3
        int population = 12_000_000;
        int year = 1;
        do {
            int birthRate = population / 1000 * 17;
            int mortality = population / 1000 * 8;
            population = population + birthRate - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
        }
        while (year <= 10);
        System.out.println();

        // 4
        int initialDepositAmount = 15000;
        int monthlyDepositInterest = 7;
        int monthNumber = 0;
        float goal = initialDepositAmount;
        while (goal <= 12000000) {
            goal = goal + goal / 100 * monthlyDepositInterest;
            monthNumber++;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений составляет " + goal);
        }

        // 5
        System.out.println();
        int initialDepositAmount1 = 15000;
        int monthlyDepositInterest1 = 7;
        int monthNumber1 = 0;
        float goal1 = initialDepositAmount;
        while (goal1 <= 12000000) {
            goal1 = goal1 + goal1 / 100 * monthlyDepositInterest1;
            monthNumber1++;
            if (monthNumber1 % 6 == 0) {
                System.out.println("Месяц " + monthNumber1 + ", сумма накоплений составляет " + goal1);
            }
        }

        // 6
        System.out.println();
        int initialDepositAmount2 = 15000;
        int monthlyDepositInterest2 = 7;
        int monthNumber2 = 0;
        float goal2 = initialDepositAmount;
        while (monthNumber2 <= 12 * 9) {
            goal2 = goal2 + goal2 / 100 * monthlyDepositInterest2;
            monthNumber2++;
            if (monthNumber2 % 6 == 0) {
                System.out.println("Месяц " + monthNumber2 + ", сумма накоплений составляет " + goal2);
            }
        }

        // 7
        System.out.println();
        int firstFriday = 7;

        for (int n = firstFriday; n <= 31; n += 7) {
            System.out.println("Сегодня пятница, " + n + "-е число. Необходимо подготовить отчет");
        }

        // 8
        System.out.println();
        int initialYear = 2023;
        int yearsBefore = initialYear - 200;
        int yearsAfter = initialYear + 100;

        for (int j = 0; j <= yearsAfter; j += 79) {
            if (j >= yearsBefore) {
                System.out.println(j);
        }
    }
}}