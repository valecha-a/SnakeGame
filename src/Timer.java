public class Timer {
    private int countdown = 3;

    public void startCountdown() {
        for (int i = countdown; i > 0; i--) {
            System.out.println("Starting in " + i + "...");
        }
        System.out.println("Go!");
    }

    public void reset() {
        System.out.println("Timer reset.");
    }

    public boolean isRunning() {
        return countdown > 0;
    }
}
