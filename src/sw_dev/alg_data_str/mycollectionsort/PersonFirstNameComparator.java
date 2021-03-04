package sw_dev.alg_data_str.mycollectionsort;

public class PersonFirstNameComparator implements MyComparator{
    @Override
    public int compare(Person lhs, Person rhs) {
        return (lhs.getFirstname().compareTo(rhs.getFirstname()));
    }
}
