package stop_watch;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;
    public StopWatch(){
        this.startTime = LocalTime.now();
    }
    public StopWatch(LocalTime startTime, LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public void start(){
        startTime = LocalTime.now();
    }
    public void stop(){
        endTime = LocalTime.now();
    }
    public int getElapsedTime(){
        int miliSecond = (endTime.getHour()-startTime.getHour())*3600000
                +(endTime.getMinute()-startTime.getMinute())*60000
                +(endTime.getSecond()-startTime.getSecond())*1000;
        return miliSecond;
    }
}
