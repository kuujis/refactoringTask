package services;

public class BetterThingsMaker extends ThingMaker{

    @Override
    public void makeThings() {
        new DatedLoggerService().makeLog("IMPROVED " + this.property);
        ((VeryImportantChecks)validator).validate(property);
        this.things.add("IMPROVED " + this.property);
    }
}
