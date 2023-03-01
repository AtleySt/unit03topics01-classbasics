public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int curMonth, int curDay, int curYear) {
        month = curMonth;
        day = curDay;
        year = curYear;
    }

    public String toString() {
        String result = "";
        if (month < 10) {
            result+="0"+month+"/";
        } else {
            result+=month+"/";
        }
        if (day < 10) {
            result+="0"+day+"/";
        } else {
            result+=day+"/";
        }
        result+=year;

        return result;
        
    }
    public static void main(String[] args) {
        Date today = new Date(3,1,2023);
        System.out.println(today);
    }
}