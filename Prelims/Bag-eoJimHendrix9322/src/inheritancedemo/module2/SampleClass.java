package inheritancedemo.module2;

public class SampleClass {
    public static void main(String[] args) {
        SampleClass program;
        try{
            program = new SampleClass();
            program.run();
        } catch (Exception exception){
            exception.printStackTrace();
        }
        System.exit(0);
    } // End of the main method


    public void run(){
        // Scholar 1
        Scholar scholar1 = new Scholar();
        System.out.println(scholar1 + "\n");

        // Scholar 2
        Scholar scholar2 = new Scholar("DOST - Merit Scholar");
        System.out.println(scholar2 + "\n");

        // Scholar 3
        Scholar scholar3 = new Scholar("Edison Malazan","BS in Computer Science",(byte) 1, "SSS scholar");
        System.out.println(scholar3);

    } // End of the run method
}

/*
    OUTPUT:

    Name : Juan Delacruz
    Program : BSCS
    Year Level : 1
    Scholarship Name : Working Scholar

    Name : Juan Delacruz
    Program : BSCS
    Year Level : 1
    Scholarship Name : DOST - Merit Scholar

    Name : Edison Malazan
    Program : BS in Computer Science
    Year Level : 1
    Scholarship Name : SSS scholar

 */