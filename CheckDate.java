import java.util.Scanner;
public class CheckDate
{
    public void printDate() {
        try (Scanner input = new Scanner(System.in)) {
        
            int lastDayFed = 0;
            
            System.out.print("Day = ");
            int day = input.nextInt();
            
            System.out.print("Month = ");
            int month = input.nextInt();
            
            System.out.print("Year = ");
            int year = input.nextInt();
            
            if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1) {
                System.out.println("Error: Something wrong... try again!");
            }else {
                if (year % 4 != 0) {
                    lastDayFed = 28;
                }else {
                    lastDayFed = 29;
                }
                System.out.println("\n--------------| Date |--------------\n");
                
                if (month == 1 && day < 32) { //////////// 1 // special
                    System.out.printf("Today %d/%d/%d \n", day, month, year);
                    if (day == 1) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year); 
                        System.out.printf("Yesterday %d/%d/%d \n", 31, 12, year-1); 
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 30, 12, year-1);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                    else if (day == 2) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 31, 12, year-1);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    } 
                    else if (day == 30) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 1, 2, year);
                    }
                    else if (day == 31) {
                        System.out.printf("Tomorrow %d/%d/%d \n", 1, 2, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 2, 2, year);
                    }else {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                }
                
                else if (month == 2 && day < 30) { //////////// 2 special
                    if (year % 4 != 0) {
                        if (day == 29) {
                            System.out.printf("month %d year %d is not %d day \n", month, year, day);
                            System.exit(0);
                        }
                    }
                    System.out.printf("Today %d/%d/%d \n", day, month, year);
                    if (day == 1) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", 31, 1, year); 
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 30, 1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                    else if (day == 2) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 31, 1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    } 
                    else if (day == (lastDayFed-1)) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 1, 3, year);
                    }
                    else if (day == lastDayFed) {
                        System.out.printf("Tomorrow %d/%d/%d \n", 1, 3, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 2, 3, year);
                    }else {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                }

                else if (month == 3 && day < 32) { //////////// 3 // special
                    System.out.printf("Today %d/%d/%d \n", day, month, year);
                    if (day == 1) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year); 
                        System.out.printf("Yesterday %d/%d/%d \n", lastDayFed, month-1, year); 
                        System.out.printf("The day before Yesterday %d/%d/%d \n", lastDayFed-1, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                    else if (day == 2) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", lastDayFed, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    } 
                    else if (day == 30) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 1, month+1, year);
                    }
                    else if (day == 31) {
                        System.out.printf("Tomorrow %d/%d/%d \n", 1, month+1, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 2, month+1, year);
                    }else {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                }
    
                else if (month == 4 && day < 31) { //////////// 4
                    System.out.printf("Today %d/%d/%d \n", day, month, year);
                    if (day == 1) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", 31, month-1, year); 
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 30, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                    else if (day == 2) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 31, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    } 
                    else if (day == 29) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 1, month+1, year);
                    }
                    else if (day == 30) {
                        System.out.printf("Tomorrow %d/%d/%d \n", 1, month+1, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 2, month+1, year);
                    }else {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                }
        
                else if (month == 5 && day < 32) { //////////// 5
                    System.out.printf("Today %d/%d/%d \n", day, month, year);
                    if (day == 1) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year); 
                        System.out.printf("Yesterday %d/%d/%d \n", 30, month-1, year); 
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 29, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                    else if (day == 2) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 30, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    } 
                    else if (day == 30) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 1, month+1, year);
                    }
                    else if (day == 31) {
                        System.out.printf("Tomorrow %d/%d/%d \n", 1, month+1, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 2, month+1, year);
                    }else {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                }

                else if (month == 6 && day < 31) { //////////// 6 
                    System.out.printf("Today %d/%d/%d \n", day, month, year);
                    if (day == 1) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", 31, month-1, year); 
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 30, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                    else if (day == 2) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 31, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    } 
                    else if (day == 29) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 1, month+1, year);
                    }
                    else if (day == 30) {
                        System.out.printf("Tomorrow %d/%d/%d \n", 1, month+1, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 2, month+1, year);
                    }else {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                }

                else if (month == 7 && day < 32) { //////////// 7
                    System.out.printf("Today %d/%d/%d \n", day, month, year);
                    if (day == 1) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year); 
                        System.out.printf("Yesterday %d/%d/%d \n", 30, month-1, year); 
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 29, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                    else if (day == 2) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 30, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    } 
                    else if (day == 30) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 1, month+1, year);
                    }
                    else if (day == 31) {
                        System.out.printf("Tomorrow %d/%d/%d \n", 1, month+1, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 2, month+1, year);
                    }else {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                }
                
                else if (month == 8 && day < 32) { //////////// 8 // special
                    System.out.printf("Today %d/%d/%d \n", day, month, year);
                    if (day == 1) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year); 
                        System.out.printf("Yesterday %d/%d/%d \n", 31, month-1, year); 
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 30, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                    else if (day == 2) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 31, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    } 
                    else if (day == 30) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 1, month+1, year);
                    }
                    else if (day == 31) {
                        System.out.printf("Tomorrow %d/%d/%d \n", 1, month+1, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 2, month+1, year);
                    }else {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                }
                
                else if (month == 9 && day < 31) { //////////// 9 
                    System.out.printf("Today %d/%d/%d \n", day, month, year);
                    if (day == 1) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", 31, month-1, year); 
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 30, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                    else if (day == 2) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 31, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    } 
                    else if (day == 29) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 1, month+1, year);
                    }
                    else if (day == 30) {
                        System.out.printf("Tomorrow %d/%d/%d \n", 1, month+1, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 2, month+1, year);
                    }else {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                }
                
                else if (month == 10 && day < 32) { //////////// 10
                    System.out.printf("Today %d/%d/%d \n", day, month, year);
                    if (day == 1) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year); 
                        System.out.printf("Yesterday %d/%d/%d \n", 30, month-1, year); 
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 29, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                    else if (day == 2) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 30, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    } 
                    else if (day == 30) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 1, month+1, year);
                    }
                    else if (day == 31) {
                        System.out.printf("Tomorrow %d/%d/%d \n", 1, month+1, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 2, month+1, year);
                    }else {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                }

                else if (month == 11 && day < 31) { //////////// 11
                    System.out.println("month 11");
                    System.out.printf("Today %d/%d/%d \n", day, month, year);
                    if (day == 1) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", 31, month-1, year); 
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 30, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                    else if (day == 2) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 31, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    } 
                    else if (day == 29) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 1, month+1, year);
                    }
                    else if (day == 30) {
                        System.out.printf("Tomorrow %d/%d/%d \n", 1, month+1, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 2, month+1, year);
                    }else {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                }
                
                else if (month == 12 && day < 32) { //////////// 12 // special
                    System.out.printf("Today %d/%d/%d \n", day, month, year);
                    if (day == 1) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year); 
                        System.out.printf("Yesterday %d/%d/%d \n", 30, month-1, year); 
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 29, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                    else if (day == 2) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", 30, month-1, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    } 
                    else if (day == 30) {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 1, 1, year+1);
                    }
                    else if (day == 31) {
                        System.out.printf("Tomorrow %d/%d/%d \n", 1, 1, year+1);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", 2, 1, year+1);
                    }else {
                        System.out.printf("Tomorrow %d/%d/%d \n", day+1, month, year);
                        System.out.printf("Yesterday %d/%d/%d \n", day-1, month, year);
                        System.out.printf("The day before Yesterday %d/%d/%d \n", day-2, month, year);
                        System.out.printf("The day after Tomorrow %d/%d/%d \n", day+2, month, year);
                    }
                }
                
                else {
                    System.out.printf("Month %d don't have %d days \n", month, day);
                }
                System.out.println("\n------------------------------------\n");
            }
        }
    }
}