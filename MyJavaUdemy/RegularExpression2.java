public class RegularExpression2 {
    public static void main(String args[] ){
        String str  = "a!b@c#1$2%3";
       str= str.replaceAll("[^0-9A-Za-z]","");//string without speacial characters
       String str1="    abc       de      fg       hjk   ";//remove extra spaces
       str1=str1.replaceAll("\\s+", " ").trim();
        System.out.println(str);
        System.out.println(str1);
      String words[] =str1.split("\\s");
      System.out.println(words.length);

    }
}
