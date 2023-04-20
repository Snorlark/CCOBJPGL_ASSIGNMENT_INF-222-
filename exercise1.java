public class exercise1 {
    
    static boolean IwillBehave = true;
    static boolean IwillGraduate = true;

    public static void main (String[] args) throws Exception {

        //precondition
        assert IwillBehave == true: "Sit down boy!";

        //method
        College();

        //postcondition
        assert IwillGraduate == true: "There's always another chance, don't stop chasing your goals";

    }

    static void College(){

        IwillGraduate = false;
        
    }
}
