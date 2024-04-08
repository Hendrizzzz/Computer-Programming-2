package inheritancedemo.module2;
public class SubInherit extends ConsInherit {

    /**
     * Constructs a SubInherit object with the specified int value
     * <p> super(i) -> Calls the first constructor defined for ConsInherit </p>
     *
     * @param i int
     */
    public SubInherit(int i) {
        super(i);
        // other constructor code here...
    }

     /**
     * Constructs a SubInherit object with the specified boolean value.
     * <p>super(b) -> Calls the second constructor defined for ConsInherit -> super(b)</p>
     *
     * @param b boolean
     */
    public SubInherit(boolean b) {
        super(b);
        // other constructor code here...
    }


    /**
     * Creates a new Object of SubInherit
     * <p> super() -> Calls the default constructor of ConsInherit</p>
     */
    public SubInherit() {
        super();
    }
}
