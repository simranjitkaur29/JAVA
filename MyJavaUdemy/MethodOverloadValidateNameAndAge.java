public class MethodOverloadValidateNameAndAge {
    static boolean validate(String name){
        return name.matches("[A-Za-z\\s]+");
    }
    static boolean validate(int age){
        return age>=3 &&age<=15;
    }
    public static void main(String args[])
    {
        System.out.println("CHECK NAME IS VALID OR NOT : " +validate("Simranjit Kaur"));
        System.out.println("Check age is under condition : "+validate(2));
    }
}
