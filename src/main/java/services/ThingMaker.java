package services;

import java.util.ArrayList;
import java.util.List;

public class ThingMaker {
    public final static List<String> things = new ArrayList<>();
    public String property;
    public Object validator;

    public void makeThings(){
        new LoggerService().makeLog("thing with " + property);
        things.add("thing with " + property);
    }

    public void makeThingsWith(String property) {
        this.property = property;
    }
}
