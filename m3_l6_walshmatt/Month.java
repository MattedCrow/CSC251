/*
 * The Month class determines the month
 */
package m3_l6_walshmatt;

public class Month {
    private int monthNumber;
    
    public Month() {
        monthNumber = 1;
    }
    
    public Month(int num) throws InvalidNum {
        if(num > 0) {
            if (num < 13) {
                monthNumber = num;
            }
        }
        else {
            throw new InvalidNum();
        }
    }
    
    public Month(String name) throws InvalidString {
        name = name.toLowerCase();
        
        switch (name) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;  
            case "april":
                monthNumber = 4;
                break;  
            case "may":
                monthNumber = 5;
                break; 
            case "june":
                monthNumber = 6;
                break;  
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default: 
                throw new InvalidString();
        }
    }
    
    public void setMonthNumber(int num) {
        if (num > 12 || num < 0) {
            monthNumber = 1;
        }
        else {
            monthNumber = num;
        }
    }
    
    public int getMonthNumber() {
        return monthNumber;
    }
    
    public String getMonthName() {
        String monthName = "January";
        
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        
        return monthName;
    }
    
    public String toString() {
        String monthName = this.getMonthName();
        
        return monthName;
    }
    
    public boolean equals(Month obj) {
        if (obj.monthNumber == monthNumber) {
            return true;
        }
        else {
            return false;
        }
    }
   
    public boolean greaterThan(Month obj) {
        if (obj.monthNumber > monthNumber) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean lessThan(Month obj) {
        if (obj.monthNumber < monthNumber) {
            return true;
        }
        else {
            return false;
        }
    }
}