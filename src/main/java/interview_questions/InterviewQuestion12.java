package interview_questions;

public class InterviewQuestion12 {
    /*
    What are the differences between abstract class and interface
    1)Methods:
    *Abstract class can have both: abstract and concrete methods
    Interfaces can have just abstract methods.
    Note: We can create methods with body by using default and static keywords
    *Methods in abstract class can use any access modifier.
    Methods in interfaces are definitely public.

    2)Variables:
    Abstract class can have every type of variables.
    Interface can have just public static final variables.
    Note: Variables are final in interface because of that they must be initialized.
    Variables may or may not to be final in abstract class because of that it is not mandatory to initialize.

    3)NOTE: By the help of the interfaces we can create multiple parents for a class but
    when you use abstract classes it is impossible to create multiple parents for a class.

     4) Class extends Class, Interface extends Interface, Class implements Interface, Interface cannot be the child of a class.

     */
}
