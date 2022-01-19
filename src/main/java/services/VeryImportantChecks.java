package services;

public class VeryImportantChecks {
    public void validate(String value){
        if (value.length() > 10) {
            throw new IllegalCallerException();
        }
    }
}
