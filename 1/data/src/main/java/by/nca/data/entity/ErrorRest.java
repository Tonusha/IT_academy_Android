package by.nca.data.entity;

/**
 * Created by user on 06.04.2018.
 */

public class ErrorRest extends Error {
    public ErrorRest(ErrorType friendlyError) {
        super(friendlyError);
    }
}
