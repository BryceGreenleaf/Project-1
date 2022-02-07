public class Main {
    public static void main(String[] args) {
        FieldExample fe = new FieldExample(); //calls FieldExample class into main
        System.out.println("Users names"); //Prints out the prompt
        System.out.println(fe.toString());

        System.out.println("\nInsecure/non-compliant usage");   //Prints out the changed lines if there are any
        for (String arg : args) {
            fe.zeroField(arg);
            System.out.println(fe.toString());
        }
    }
}