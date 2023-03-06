public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int curMonth, int curDay, int curYear) {
        month = curMonth;
        day = curDay;
        year = curYear;
    }

    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public int getYear() {
        return year;
    }

    public String toString() {
        String result = "";
        if (getMonth() < 10) {
            result+="0"+getMonth()+"/";
        } else {
            result+=getMonth()+"/";
        }
        if (getDay() < 10) {
            result+="0"+getDay()+"/";
        } else {
            result+=getDay()+"/";
        }
        if (getYear()<1000 && getYear() >= 100) {
            result += "0"+getYear();
        } else if (getYear()<100 && getYear()>=10) {
            result += "00"+getYear();
        } else if (getYear()<10) {
            result += "000"+getYear();
        } else {
            result+=getYear();
        }

        return result;
        
    }
    public static void main(String[] args) {
        Date today = new Date(3,2,2023);
        Date d2 = new Date(12, 3, 2);
        System.out.println(d2);
        System.out.println(today);
    }
}

// nicely coded and tested!