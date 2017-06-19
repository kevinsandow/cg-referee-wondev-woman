import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

class Referee extends MultiReferee {
    public Referee(InputStream is, PrintStream out, PrintStream err) throws IOException {
        super(is, out, err);
    }

    public static void main(String... args) throws IOException {
        new Referee(System.in, System.out, System.err);
    }
}

// ------------------------------------------------------------------------------------------------------------

abstract class MultiReferee extends AbstractReferee {
    public MultiReferee(InputStream is, PrintStream out, PrintStream err) throws IOException {
        super(is, out, err);
    }
}

abstract class AbstractReferee {
    public AbstractReferee(InputStream is, PrintStream out, PrintStream err) throws IOException {

    }
}