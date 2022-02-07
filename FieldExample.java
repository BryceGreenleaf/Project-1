import java.lang.reflect.Field;

class FieldExample {
    //Users names
    private String Name = "Rob";
    private String Name2 = "Bob";
// Printing off the names
    public String toString() { return "Name= " + Name + ", Name2= " + Name2; }

    public void zeroField (String fieldName) {   //Changing to public makes the exploit happen
   //private void zeroField (String fieldName) {   //Changing to private, so you can not exploit
        try {
            Field f = this.getClass().getDeclaredField(fieldName); //This line of code can exploit and create different flow paths resulting in bypass of security checks. This attack is an injection.
            f.set(this,"Philly"); //Setting the name to "Philly"

        } catch (NoSuchFieldException ex) {

            System.out.println("NoSuchFieldException");
        } catch (IllegalAccessException ex) {

            System.out.println("IllegalAccessException");
        }
    }
}