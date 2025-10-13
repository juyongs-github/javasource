package exam;

public class Won2Dollar extends Converter {
    private final String SRC_STRING = "원";
    private final String DEST_STRING = "달러";

    @Override
    protected double convert(double src) {
        return src / 1200;
    }

    @Override
    protected String getSrcString() {
        return SRC_STRING;
    }

    @Override
    protected String getDestString() {
        return DEST_STRING;
    }

}
