import services.BetterThingsMaker;
import services.ThingMaker;
import services.VeryImportantChecks;

public class Main {
    public static void main(String[] args) {
        System.out.println("making things");

        ThingMaker thingMaker = new ThingMaker();
        thingMaker.makeThingsWith("property");
        thingMaker.property = "some other property";
        try {
            thingMaker.makeThings();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        ThingMaker anotherMaker = new BetterThingsMaker();
        anotherMaker.property = "more than 10 symbols long property";
        anotherMaker.validator = new VeryImportantChecks();
        try {
            anotherMaker.makeThings();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        ThingMaker.things.forEach(thing -> System.out.println(thing));
    }
}

