
package fr.m2i.springapicrm.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super("Resource was not found");
    }

    public NotFoundException(String message) {
        super(message);
    }
}
