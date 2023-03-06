public class TimeV2 {
    private int totalSeconds;

    public TimeV2(int curHou, int curMin, int curSec) {
        totalSeconds = curHou*60*60;
        totalSeconds += curMin*60;
        totalSeconds += curSec;
    }

    public int getHours() {
        int hours = totalSeconds / 60 / 60;
        return hours;
    }
    public int getMinutes() {
        int minutes = totalSeconds / 60 % 60;
        return minutes;
    }
    public int getSeconds() {
        int seconds = totalSeconds % 60;
        return seconds;
    }

    public String toString() {
        String result = "";
        if (getHours() < 10) {
            result += "0"+getHours()+":";
        } else {
            result += getHours()+":"; 
        }
        if (getMinutes() < 10) {
            result += "0"+getMinutes()+":";
        } else {
            result += getMinutes()+":";
        }
        if (getSeconds() < 10) {
            result += "0"+getSeconds();
        } else {
            result += getSeconds();
        }
        return result;
    }

    public static void main(String[] args) {
        // TimeV1 ex = new TimeV1(5, 2, 0);
        // TimeV2 result = new TimeV2(5, 4, 12);
        // System.out.println(result);

        final int NTESTS = 3;
        for (int trial = 0; trial < NTESTS; trial++) {
            int hours = (int) (Math.random() * 5);
            int minutes = (int) (Math.random() * 60);
            int seconds = (int) (Math.random() * 60);

            TimeV1 tv1 = new TimeV1(hours, minutes, seconds);
            TimeV2 tv2 = new TimeV2(hours, minutes, seconds);
            System.out.println("using hours = " + hours + ", minutes = " + minutes + ", seconds = " + seconds);
            System.out.println("TimeV1 gives: " + tv1);
            System.out.println("TimeV2 gives: " + tv2);




        }
    }
}
// nicely done