package ss4.bai_tap;
import java.util.Random;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public StopWatch() {

        this.startTime = System.currentTimeMillis();
    }
    public long getStartTime() {

        return startTime;
    }
    public long getStopTime() {

        return stopTime;
    }
    public long getElapsedTime() {

        return stopTime - startTime;
    }

    public void start() {

        this.startTime = System.currentTimeMillis();
    }
    public void stop() {

        this.stopTime = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            array[i] = random.nextInt(100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(array);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());

    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
