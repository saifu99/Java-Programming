package practiceprograms;
import java.util.Timer;

public class TimerTask {
    public static void main(String[] args) {
        Timer timer = new Timer();
        java.util.TimerTask task = new java.util.TimerTask() {
            int count = 0;

            @Override
            public void run() {
                count++;
                System.out.println(count);

                if (count >= 5) { //for infinite time you can exclude it
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
