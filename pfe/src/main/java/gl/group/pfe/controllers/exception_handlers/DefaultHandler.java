package gl.group.pfe.controllers.exception_handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * DefaultHandler
 */
@ControllerAdvice
public class DefaultHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Void> handle (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    
}
