package fr.aboudou.devcartevisv1.exceptions;

/**
 * Exception déclenchée lorsqu'on a pas trouvé de développeur
 */
public class DeveloppeurNotFoundException extends RuntimeException{

    private String message;

    @Override
    public String getMessage() {
        return this.message;
    }

    public DeveloppeurNotFoundException(String messageDeveloppeurNonTrouve) {
        this.message = messageDeveloppeurNonTrouve;
    }
}
