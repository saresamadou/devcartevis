package fr.aboudou.devcartevisv1.exceptions;

public class DeveloppeurDejaExistantException extends RuntimeException {
    private String message;

    public DeveloppeurDejaExistantException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
