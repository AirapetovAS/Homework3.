public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задча 1");

        int car  = 145000;
        System.out.println("Значение переменной car c типом int равно " + car);

        byte cat = 110;
        System.out.println("Значение переменной cat c типом byte равно " + cat);

        short dog = 12500;
        System.out.println("Значение переменной dog c типом short равно " + dog);

        long table = 1350000;
        System.out.println("Значение переменной table c типом short равно " + table);

        float moon = 12.500f;
        System.out.println("Значение переменной moon c типом float равно " + moon);

        double flowers = -2.5;
        System.out.println("Значение переменной flowers c типом double равно " + flowers);
    }
     public static void task2 () {
         System.out.println("Задача 2");

         int a = -159;
         byte b = 67;
         short c = 569;
         long d = 987678965549L;
         float e = 2.786f;
         double f = 27.12;
         char g = 27897;
     }
     public static void task3 () {
         System.out.println("Задача 3");

         byte ludmilaPavlovna = 23;
         byte annaSrgeevna = 27;
         byte ekaterinaAndreevna = 30;
         short papers = 480;
         int x = papers / (ludmilaPavlovna + annaSrgeevna + ekaterinaAndreevna);
         System.out.println("На каждого ученика расчитано " + x + " листов бумаги.");
     }
     public static void task4 () {
         System.out.println("Задача 4");

         byte bottles = 16;
         byte time = 2;

         int inMinutes = 20;
         int twentyForHours = 24 * 60;
         short day = 24 * 60 * 3;
         long month = 24 * 60 * 31;     // в месяце будет 31 день

         inMinutes = 20;
         int result = bottles / time * inMinutes;
         System.out.println("За 20 минут машина произвела " + result + " штук бутылок. ");

         twentyForHours = 24 * 60;
         int result2 = bottles / time * twentyForHours;
         System.out.println("В сутки машина прозвела " + result2 + " штук бутылок. ");

         day = 24 * 60 * 3;
         int result3 = bottles / time * day;
         System.out.println("За 3 дня машина произвела " + result3 + " штук бутылок. ");

         month = 24 * 60 * 31;
         long result4 = bottles / time * month;
         System.out.println("За 1 месяц машина произвела " + result4 + " штук бутылок. ");
    }
    public static void task5 () {
         System.out.println("Задача 5");

         byte jars = 120;
         int white = 2;
         int brown = 4;
         int _claas = jars / (white + brown);
         int paintingWight = _claas * white;
         int paintingBrown = _claas * brown;
        System.out.println("В школе где " + _claas  + " классов, нужно " + paintingWight
                + " банок белой краски и " + paintingBrown + " банок коричневой краски." );
    }
    public static void task6 () {
        System.out.println("Задача 6");

        int bananas = 5 * 80;
        int milk = (200 * 105) / 100;
        int iceCream = 2 * 100;
        int ags = 4 * 70;
        int products = (bananas + milk + iceCream + ags);
        System.out.println(products + " грамм съедает спортсмен за завтраком. ");

        int weightGr = 1090;
        int grPerKg = 1000;
        float weightKg = weightGr /(float) grPerKg;
        System.out.println( weightKg + " килограмм съедает спортсмен за завтраком. ");
    }
    public static void task7 () {
        System.out.println("Задача 7");

        int kg = 7;
        double kgPerGr = 1000;
        int one250InDay = 250;
        int one500InDay = 500;
        double dayAtWightLoss = kg * (float) kgPerGr / one250InDay;
        double _dayAtWightLoss = kg * (float) kgPerGr / one500InDay;
        System.out.println( dayAtWightLoss + " дней потребовалось чтобы добиться результата похудения");
        System.out.println( _dayAtWightLoss + " дней потребовалось чтобы добиться результата похудения");
    }
    public static void task8() {
        System.out.println("Задача 8");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float percentage = 0.1F;
        float mashaAfterYears = masha * percentage + masha;
        float annualIncomeMasha = masha * percentage;
        System.out.println("Маша теперь получает " + mashaAfterYears + " рубелй. Годовой доход вырос на "
        + annualIncomeMasha + " рублей ");

        float denisAfterYears = denis * percentage + denis;
        float annualIncomeDenis = denis * percentage;
        System.out.println("Денис теперь получает " + denisAfterYears + " рубелй. Годовой доход вырос на "
                + annualIncomeDenis + " рублей ");

        float kristinaAfterYears = kristina * percentage + kristina;
        float annualIncomeKristina = kristina * percentage;
        System.out.println("Кристина теперь получает " + kristinaAfterYears + " рубелй. Годовой доход вырос на "
                + annualIncomeKristina + " рублей ");
    }
}






