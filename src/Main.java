//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task1
        int carBus = 222;
        byte levelGame = -123;
        short sizeShoes = 42;
        long spedOfWorld = 3000L;
        float weightCar = 42.3f;
        double salary = 132.5;
        System.out.println("Значение переменной carBus с типом int равно " + carBus);
        System.out.println("Значение переменной levelGame с типом byte равно " + levelGame);
        System.out.println("Значение переменной sizeShoes с типом short равно " + sizeShoes);
        System.out.println("Значение переменной spedOfWorld с типом long равно " + spedOfWorld);
        System.out.println("Значение переменной weightCar с типом float равно " + weightCar);
        System.out.println("Значение переменной salary с типом double равно " + salary);
        //Task2
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte j = 67;
        //Task3
        byte totalStudentsLP = 23;
        byte totalStudentsAS = 27;
        byte totalStudentsEA = 30;
        short totalPaper = 480;
        int paperPerStudent = totalPaper / (totalStudentsLP + totalStudentsAS + totalStudentsEA);
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
        //Task4
        byte bottlesPer2Minutes = 16;
        int bottlesPer1Minutes = bottlesPer2Minutes / 2;
        int bottlesPer20Minutes = bottlesPer1Minutes * 20;
        int bottlesPerDay = bottlesPer1Minutes * (24 * 60);
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 29;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");
        //Task5
        byte totalCans = 120;
        byte cansWhitePerRoom = 2;
        byte cansBrownPerRoom = 4;
        int cansPerRoom = cansBrownPerRoom + cansWhitePerRoom;
        int totalRooms = totalCans / cansPerRoom;
        int totalWhiteCans = totalRooms * cansWhitePerRoom;
        int totalBrownCans = totalRooms * cansBrownPerRoom;
        System.out.println("В школе, где " + totalRooms + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");
        //Task6
        byte weightBanan = 80;
        byte weightMilk = 105;
        byte weightIcecream = 100;
        byte weightEgg = 70;
        int weightBreakfastInGrams = 5 * weightBanan + 2 * weightMilk + 2 * weightIcecream + 4 * weightEgg;
        double weightBreakfastInKilograms = (double) weightBreakfastInGrams / 1000;
        System.out.println("Вес завтрака в граммах составит " + weightBreakfastInGrams);
        System.out.println("Вес завтрака в граммах составит " + weightBreakfastInKilograms);
        //Task7
        short minWeightLoseGram = 250;
        short maxWeightLoseGram = 500;
        short totalWeightLosKilo = 7;
        int minDaysLoseWeight = (totalWeightLosKilo * 1000) / maxWeightLoseGram;
        int maxDaysLoseWeight = (totalWeightLosKilo * 1000) / minWeightLoseGram;
        int averageDayLoseWeight = (minDaysLoseWeight + maxDaysLoseWeight) / 2;
        System.out.println(maxDaysLoseWeight + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + minWeightLoseGram + " грамм");
        System.out.println(minDaysLoseWeight + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + maxWeightLoseGram + " грамм");
        System.out.println(averageDayLoseWeight + " дней уйдет в среднем на похудение");
        //Task8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        byte salaryIncrease = 10;
        int newSalaryMasha = salaryMasha + (salaryMasha * salaryIncrease / 100);
        int newSalaryDenis = salaryDenis + (salaryDenis * salaryIncrease / 100);
        int newSalaryKristina = salaryKristina + (salaryKristina * salaryIncrease / 100);
        int salaryByYearMasha = salaryMasha * 12;
        int salaryByYearDenis = salaryDenis * 12;
        int salaryByYearKristina = salaryKristina * 12;
        int newSalaryByYearMasha = newSalaryMasha * 12;
        int newSalaryByYearDenis = newSalaryDenis * 12;
        int newSalaryByYearKristina = newSalaryKristina * 12;
        int incomeMasha = newSalaryByYearMasha - salaryByYearMasha;
        int incomeDenis = newSalaryByYearDenis - salaryByYearDenis;
        int incomeKristina = newSalaryByYearKristina - salaryByYearKristina;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + incomeMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + incomeDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + incomeKristina + " рублей");
    }
}