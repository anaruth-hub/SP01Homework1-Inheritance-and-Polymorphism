package sprint01.Exceptions01.level01A;

public class EmptySaleException extends  Exception {
    public static final String DEFAULT_MESSAGE =
            "To make a sale you must first add products";

    public EmptySaleException () {
        super(DEFAULT_MESSAGE);
    }
}
