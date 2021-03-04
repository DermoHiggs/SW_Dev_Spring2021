package sw_dev.alg_data_str.bigo;

/**
 * Simple Utility Class that allows to you time operations/algorithms.
 * Very simple:
 * 1: Start the timer
 * 2: Do the algorithm
 * 3: Stop the timer
 * 4: Ask the timer for the elapsed time (between start and stop)
 */
public class Timer {
    private long elapsedTime;
    private long startTime;
    private boolean isRunning;

    public Timer() {
        reset();
    }

    public void start()    {
        if (isRunning)
            return;
        isRunning = true;
        startTime = System.nanoTime();
    }

    public void stop()   {
        if (!isRunning)
            return;
        isRunning = false;
        long endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
    }

    public long getElapsedTime()   {
        if (isRunning) {
            long endTime = System.nanoTime();
            elapsedTime = (endTime - startTime);
            return elapsedTime;
        }
        else
            return elapsedTime;
    }

    //reset the time - not really required if a start() is always followed by a stop()
    public void reset()  {
        elapsedTime = 0;
        isRunning = false;
    }
}
