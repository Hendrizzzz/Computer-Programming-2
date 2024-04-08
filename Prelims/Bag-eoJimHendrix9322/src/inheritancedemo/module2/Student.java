package inheritancedemo.module2;

public class Student {
    private String name;
    private String program;
    private byte yearLevel;

    /**
     * constructs a student with name Juan Delacruz,
     * program BSCS, year level 1;
     * */
    public Student(){
        name = "Juan Delacruz";
        program = "BSCS";
        yearLevel = (byte) 1;
    }


    /**
     * Constructs a new Student object with the given name, program, and year level.
     * @param name
     * @param program
     * @param yearLevel
     */
    public Student(String name, String program, byte yearLevel ){
        this.name = name;
        this.program = program;
        this.yearLevel = yearLevel;
    }


    /**
     * Sets the name of the Student
     * @param name the name of the Student to be set
     */
    public void setName(String name){
        this.name = name;
    }


    /**
     * Sets the program of the Student
     * @param program the program of the Student to be set
     */
    public void setProgram(String program){
        this.program = program;
    }


    /**
     * Sets the year level of the Student
     * @param yearLevel the name of the Student to be set
     */
    public void setYearLevel(byte yearLevel){
        this.yearLevel = yearLevel;
    }


    /**
     * Returns the name of the Student
     * @return String
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the program of the Student
     * @return String
     */
    public String getProgram(){
        return program;
    }


    /**
     * Returns the year level of the Student
     * @return byte
     */
    public byte getYearLevel(){
        return yearLevel;
    }


    /**
     * Returns information of the Student with a format
     * @return String
     */
    @Override
    public String toString(){
        return ("Name : "+name + "\nProgram : "+program + "\nYear Level : "+ yearLevel);
    }


} // End of the class -> Student