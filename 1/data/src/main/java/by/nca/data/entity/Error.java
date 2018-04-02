package by.nca.data.entity;

/**
 * Created by user on 02.04.2018.
 */

public class Error extends Exception {
    private ErrorType friendlyError;

    public ErrorType getFriendlyError() {
        return friendlyError;
    }

    public Error(ErrorType friendlyError) {
        this.friendlyError = friendlyError;
    }

}
