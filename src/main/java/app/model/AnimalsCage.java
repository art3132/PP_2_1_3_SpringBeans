package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component ("animalsCageBean")
public class AnimalsCage {

    @Autowired
    @Qualifier ("timerBean")
    private Timer time;
    @Autowired
    public Timer getTimer() {
        return time;
    }

    @Autowired
    @Qualifier ("dogBean")
    private Animal animal;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(time.getTime());
        System.out.println("________________________");
    }
}
