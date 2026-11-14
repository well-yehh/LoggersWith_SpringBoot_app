package dear.darling.loggerswith_springboot_app.Controller;

import dear.darling.loggerswith_springboot_app.Service.Log4j_Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.LogManager;

@RestController
public class Log4_controller {

//    private static final Logger log = LogManager.getLogManager().getLogger(String.valueOf(Log4_controller.class));

    private static final Logger log =LoggerFactory.getLogger(Log4_controller.class);

    @Autowired
    private Log4j_Service service;

    @GetMapping("/api1")
    public ResponseEntity<String> generateGreeting(){
        log.info("Control in Api1");
        String body = service.generateWishes();
        log.debug("Debug is here Sirrr");
        log.info("Service method logic is bean invocked and we got response");
        return new ResponseEntity<String>(body, HttpStatus.OK);
    }

}
