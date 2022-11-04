package chapters.chapter09.exercises09;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch(){
        startTime = System.currentTimeMillis();
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return getEndTime() - getStartTime();

    }
    public long getEndTime(){
        return endTime;

    }

    public long getStartTime(){
        return startTime;
    }
}
