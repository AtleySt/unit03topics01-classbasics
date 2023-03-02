import java.sql.Time;

public class TimeV1 {
    private int hour;
    private int minute;
    private int second;

    public TimeV1(int curHou, int curMin, int curSec) {
        hour = curHou;
        minute = curMin;
        second = curSec;
    }

    public int getHours() {
        return hour;
    }
    public int getMinutes() {
        return minute;
    }
    public int getSeconds() {
        return second;
    }

    public String toString() {
        String result = "";
        if (hour < 10) {
            result += "0"+hour+":";
        } else {
            result += hour+":";
        }
        if (minute < 10) {
            result += "0"+minute+":";
        } else {
            result += minute+":";
        }
        if (second < 10) {
            result += "0"+second;
        } else {
            result += second;
        }
        return result;
    }

    public static void main(String[] args) {
        TimeV1 time = new TimeV1(19, 2, 0);
        System.out.println(time);
    }
}
