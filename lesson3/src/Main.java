import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      /*  char c;
        //c=in.nextLine().charAt(0);
        c='\u00AE';
        System.out.println((int)c);
        System.out.println(c);
*/
       /* int n=in.nextInt();
        for (int i='A'+(n-1);i<='Z';i++){
            System.out.print((char)i+" ");
        }*/
    /*    //дана строка из строчных букв. перевести в прописные
      /*  String str=in.nextLine();
        int offset = 'a'-'A';
        StringBuilder buf = new StringBuilder(str);
        for(int i =0; i<buf.length();i++){
            int c =(int)buf.charAt(i)-offset;
            buf.setCharAt(i,(char)c);
        }
        System.out.println(buf);*/
      /*  //вводится предложение на англ яз без знаков припинания
        //слова в предлож разделяются 1 пробелом
        //написать статический метод который делает первые буквы слов большими

        String str=in.nextLine();
        int offset = 'a'-'A';
        StringBuilder buf = new StringBuilder(str);
        for(int i =0; i<buf.length();i++){
            if ( buf.charAt(i) == ' '){
                int c =(int)buf.charAt(i+1)-offset;
                buf.setCharAt(i+1,(char)c);
            }
        }
        System.out.println(buf);
*/

        String str = in.nextLine();

      //  System.out.println(upperCase2Space(str));
      //  System.out.println(upperCase2SpaceBack(str));
      //  System.out.println(findNumbers(str));
      //  System.out.println(findUpperCase(str));
      //  System.out.println(findLowerCaseAndRU(str));
        System.out.println(lowerCaseToUpper(str));
    }

    public static String upperCase2Space(String str){
        StringBuilder buf = new StringBuilder(str);
        for (int i = 0; i < buf.length(); i++) {
            if ('a' <= buf.charAt(i) && buf.charAt(i) <= 'z' && buf.charAt(i - 1) == ' '){
                charLowerToUpper(buf,i);
            }
        }
        return buf.toString();
    }
    public static String upperCase2SpaceBack(String str){
        int offset = 'a' - 'A';
        StringBuilder buf = new StringBuilder(str);
        for(int i =buf.length(); i>0;i--){
            if(buf.charAt(i-1) == ' '&& buf.charAt(i)==' ')
                i--;
            else if ( buf.charAt(i-1) == ' '){
                int c =(int)buf.charAt(i)-offset;
                buf.setCharAt(i,(char)c);
            }
        }
        return buf.toString();
    }
    public static String lowerCaseToUpper(String str){
        StringBuilder buf = new StringBuilder(str);
        for (int i = 0; i < buf.length(); i++) {
            if ('A' <= buf.charAt(i) && buf.charAt(i) <= 'Z' ){
                charUpperToLower(buf,i);
            }
        }
        return buf.toString();
    }
    public static void charLowerToUpper(StringBuilder buf, int i){
        int offset = 'a' - 'A';
        int c = buf.charAt(i) - offset;
        buf.setCharAt(i, (char) c);
    }
    public static void charUpperToLower(StringBuilder buf, int i){
        int offset = 'a' - 'A';
        int c = buf.charAt(i) + offset;
        buf.setCharAt(i, (char) c);
    }

    public static boolean isLetterLower(String str, int i){
        return 'a'<= str.charAt(i) && str.charAt(i)<='z';
    }
    public static boolean isLetterLowerRU(String str, int i){
        return 'а'<= str.charAt(i) && str.charAt(i)<='я';
    }
    public static boolean isLetterUpper(String str, int i){
        return 'A'<= str.charAt(i) && str.charAt(i)<='Z';
    }
    public static boolean isLetterUpperRU(String str, int i){
        return 'А'<= str.charAt(i) && str.charAt(i)<='Я';
    }
    public static boolean isDigit(String str, int i){
        return '0'<= str.charAt(i) && str.charAt(i)<='9';
    }

    public static int findNumbers(String str){
        int k=0;
        for (int i=0;i<str.length();i++) {
            if(isDigit(str,i))
                k++;
        }
        return k;
    }
    public static int findUpperCase(String str){
        int k=0;
        for (int i=0;i<str.length();i++) {
            if(isLetterUpper(str,i))
                k++;
        }
        return k;
    }
    public static int findLowerCaseAndRU(String str){
        int k=0;
        for (int i=0;i<str.length();i++) {
            if(isLetterLower(str,i)||isLetterLowerRU(str,i))
                k++;
        }
        return k;
    }














}
