package duke.delay;

public class Delay_ms {
    /**
     * Causes a delay in execution of code for specified duration
     * before returning control back to the caller of this method.
     *
     * @param ms The amount of millisecond to delay execution.
     */
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
