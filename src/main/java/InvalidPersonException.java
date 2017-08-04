/**
 * Created by sergiobelengueruc on 24/07/2017.
 */
public class InvalidPersonException extends Exception {


    public InvalidPersonException(String reason) {
        super(reason);
    }

    public InvalidPersonException(String reason, Throwable cause) {
        super(reason, cause);
    }

}
