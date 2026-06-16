package walid.djebbouri.demo;

import java.io.IOException;

public class InvalidAgeException extends Exception {
    
    // Constructeur avec message
    public InvalidAgeException(String message) {
        super(message);
    }
    
    // Constructeur avec message et cause
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
    
    // Constructeur avec cause
    public InvalidAgeException(Throwable cause) {
        super(cause);
    }
}
