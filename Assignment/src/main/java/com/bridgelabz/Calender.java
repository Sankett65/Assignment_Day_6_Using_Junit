package com.bridgelabz;

public class Calender {
    public  String dayOfWeek(int m, int d, int y) {
//        y0 = y − (14 − m) / 12
//        x = y0 + y0 /4 − y0 /100 + y0 /400
//        m0 = m + 12 × ((14 − m) / 12) − 2
//        d0 = (d + x + 31m0 / 12) mod 7
        y = y-(14-m)/12;
        int x = y+(y/4)-(y/100) + (y/400);
        m= m+12*((14-m)/12)-2;
        d=(d+x+(31*m)/12)%7;
        switch (d){
            case 0:
                System.out.println("Sunday");
                return "Sunday";
            case 1:
                System.out.println("Monday");
                return "Monday";

            case 2:
                System.out.println("Tuesday");
                return "Tuesday";

            case 3:
                System.out.println("Wednesday");
                return "Wednesday";

            case 4:
                System.out.println("Thrushday");
                return "Thrushday";

            case 5:
                System.out.println("Firday");
                return "Firday";

            case 6:
                System.out.println("Saturday");
                return "Saturday";

        }
        return null;
    }
}
