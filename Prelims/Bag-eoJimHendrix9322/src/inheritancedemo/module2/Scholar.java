package inheritancedemo.module2;
public class Scholar extends Student {
    private String scholarshipDescription;


    /**
     * Default constructor in which it calls the default constructor of the Student class
     *  and sets the scholarship to "Working Scholar"
     */
    public Scholar(){
        super();
        scholarshipDescription = "Working Scholar";
    }


    /**
     * Constructs a new Scholar object with a given scholarship description. Constructs the name, program,
     *  and year level by calling the default constructor of the Student class. Then sets the scholarshipD
     *  to the given data.
     *
     * @param scholarshipDescription the description of the Scholarship
     */
    public Scholar(String scholarshipDescription){
        super();
        this.scholarshipDescription = scholarshipDescription;
    }


    /**
     * Constructs a new Scholar object given the name, program. year level, and scholarship Description.
     *  Calls the constructor of the Student class with the same parameters to construct the initialize the
     *   name, program, and scholarship description.
     *
     * @param name                   the name of the scholar
     * @param program                the program of the scholar
     * @param yearLevel              the year level of the scholar
     * @param scholarshipDescription the scholarship description of the scholar
     */
    public Scholar(String name, String program, byte yearLevel, String scholarshipDescription){
        super(name, program, yearLevel);
        this.scholarshipDescription = scholarshipDescription;
    }


    /**
     * Sets the scholarship description of the Scholar
     *
     * @param scholarshipDescription the description of the scholarship the scholar joined
     */
    public void setScholarshipDescription(String scholarshipDescription){
        this.scholarshipDescription = scholarshipDescription;
    }


    /**
     * Returns the scholarship description of the scholar
     *
     * @return String
     */
    public String getScholarshipDescription(){
        return scholarshipDescription;
    }


    /**
     * Prints the information of this Scholar (name, program, year level, and scholarship description)
     * Overrides the toString method of the Student class (added another info to print)
     *
     * @return String
     */
    @Override
    public String toString(){
        return (super.toString() + "\nScholarship Name : " + scholarshipDescription);
    }

} // End of the class -> Scholar