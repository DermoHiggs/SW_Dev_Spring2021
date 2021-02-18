package sw_dev.inheritance.example1;

/**
 * SimpleDate allows us to store date of birth info
 * I used it as an example to illustrate COMPOSITION, i.e. a Person HAS-A d.o.b.
 *
 */
public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "SimpleDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
