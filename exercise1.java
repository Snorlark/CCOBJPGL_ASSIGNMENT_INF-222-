public class exercise1 {
    
    static boolean IwillBehave = true;
    static boolean IwillGraduate = true;

    public static void main (String[] args) throws Exception {

        //precondition
        assert IwillBehave == true: "Umayos ka boi";

        //method
        College();

        //postcondition
        assert IwillGraduate == true: "Pareh naman, ayos buhay";

    }

    static void College(){

        IwillGraduate = false;
        
    }
}
