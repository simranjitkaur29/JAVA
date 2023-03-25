public class StringMethod {
    public static void main(String args[]){
        String str = "Programmer@gmail.com";
        int i=str.indexOf("@");
        String domain=str.substring(i+1, str.length());
       System.out.println(domain.startsWith("gmail"));
        System.out.println("UserName : "+str.substring(0, i)+ "\nDomain : "+str.substring(i+1, str.length()));
    }
}
