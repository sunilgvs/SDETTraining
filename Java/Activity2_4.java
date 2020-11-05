public class Activity2_4 {
    public static void main(String[] args){
        try {
            Activity2_4.exceptionTest("Will print to console");
            Activity2_4.exceptionTest(null);
            Activity2_4.exceptionTest("Won't execute");
        } catch(CustomException msg) {
            System.out.println("Inside catch block: " + msg.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}