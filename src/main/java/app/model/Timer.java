package app.model;

import org.springframework.stereotype.Component;

@Component ("timerBean")
public class Timer {

//    public Timer () {
//        System.out.println("Timer is created");
//    }
    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
