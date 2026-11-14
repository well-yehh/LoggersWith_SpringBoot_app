package dear.darling.loggerswith_springboot_app.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GreetingServices implements Log4j_Service {

    private static final Logger log = LoggerFactory.getLogger(GreetingServices.class);
    @Override
    public String generateWishes(){

        log.trace("Service / Business logic is invocked");

        LocalDateTime dateTime = LocalDateTime.now();
        int hour = dateTime.getHour();
        String body = null;

        if(hour<12) body = "Good Morning";
        else if(hour < 16) body = "Good AfterNoon";
        else if(hour < 20) body = "Good Evening";
        else body = "Good Night";

        return body;
    }
}

