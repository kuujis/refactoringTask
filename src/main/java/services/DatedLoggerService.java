package services;

import java.time.LocalDateTime;

public class DatedLoggerService extends LoggerService{
    @Override
    public void makeLog(String message) {
        super.makeLog(LocalDateTime.now() + " Time bassed logged messge: " + message);
    }
}
