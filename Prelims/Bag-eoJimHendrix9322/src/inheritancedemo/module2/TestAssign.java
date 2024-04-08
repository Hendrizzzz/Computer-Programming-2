package inheritancedemo.module2;
public class TestAssign {
    public static void main(String[] args) {
        SuperOverride sp;
        SubOverride sb;
        sp = new SubOverride(); // this is allowed...


        /*
        This is not allowed because the data type of sb is SubOverride, and you are assigning a
        SuperOverride type to it, which is more broad. In logic, all SubOverrides are SuperOverrides
        but not all SuperOverrides are SubOverrides. So you can't just assume that a SuperOverride is
        a SubOverride.
         */
         // sb = new SuperOverride();  but not this, so comment it out...


        Object o = new SuperOverride(); // this works, since Object is a superclass of all other classes...


        /*
        Because you can't just directly assign a superclass (Object superclass to all) reference to a subclass
        without casting it explicitly.
         */
       // sp = o; this won’t work, so comment it out...


        /*
        Since the Object o is referencing to a SuperOverride type, and sp is an instance of SuperOverride,
        it will work.
         */
        sp = (SuperOverride) o; // but this will...


        /*
        Like mentioned, the actual type of the o object is referencing to a type of SuperOverride,
        in which not a SubOverride or subclass of SubOverride
         */
        // sb = (SubOverride) o; this will compile, but will cause a run-time error when executed...


    }
} // try to determine why :-)...