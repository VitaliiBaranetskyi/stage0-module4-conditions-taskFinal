package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        switch (month){
            case 1,3,5,7,8,10,12 -> System.out.println(31);
            case 4,6,9,11 -> System.out.println(30);
            case 2 -> System.out.println(year % 100 == 0 && year % 400 != 0 ? 28 : year % 4 == 0 ? 29 : year <= 0 ? "invalid date" : 28);
            default -> System.out.println("invalid date");
        }
    }
}
