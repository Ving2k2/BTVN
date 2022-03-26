public class DateUtil {
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0) && (year % 100 != 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 0 || year > 9999 || month < 1 || month > 12 || day < 0) {
            return false;
        }

        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    return day <= 29;
                } else {
                    return day <= 28;
                }
            case 1, 3, 5, 7, 8, 10, 12:
                return day <= 31;
            default:
                return day <= 30;
        }
    }

    public static int getDayOfWeek(int year, int month, int day) {
        boolean findTheCentury = false;
        int tempYear = year;
        while (!findTheCentury) {
            if (tempYear < 1700) {
                tempYear += 400;
            } else if (tempYear >= 1700 && tempYear < 1800) {
                day += 4;
                findTheCentury = true;
            } else if (tempYear >= 1800 && tempYear < 1900) {
                day += 2;
                findTheCentury = true;
            } else if (tempYear >= 1900 && tempYear < 2000) {
                findTheCentury = true;
            } else if (tempYear >= 2000 && tempYear < 2100) {
                day += 6;
                findTheCentury = true;
            } else {
                year -= 400;
            }
        }

        int last2DigitsOfYear = year % 100;
        int date = day + last2DigitsOfYear + last2DigitsOfYear / 4;

        int[] numMonthYear = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] numMonthLeapYear = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        if (isLeapYear(year)) {
            date += numMonthLeapYear[month - 1];
        } else {
            date += numMonthYear[month - 1];
        }

        return date % 7;
    }

    public static void printDay(int year, int month, int day) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        int date = getDayOfWeek(year,month,day);

        System.out.println(daysOfWeek[date] + " " + day + " " +
                           months[month - 1] + " " + year);
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2022, 5, 17));

        printDay(2022, 3, 26);

    }
}
