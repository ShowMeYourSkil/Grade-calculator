import java.util.Random;

// A Generator how generate random passwords for you
public class PasswordGenerator{
    public static void main(String[] args){
        int length = 10;
        System.out.println(give_password(length));
    }
    static char[] give_password(int len){
     System.out.println("Your Password is: ");

     String CAPITAL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     String SMALL_CHARS = "abcdefghijklmnopqrstuvwxyz";
     String NUMBERS = "01234567989";
     String SYMBOLS = "!§$%&/=?@€*#-+0";

     String values = CAPITAL_CHARS + SMALL_CHARS + NUMBERS + SYMBOLS;
     
     Random random = new Random();
     char[] password = new char[len];
     for(int i=0; i < len; i++)
     {
         password[i] = values.charAt(random.nextInt(values.length()));
     }

     return password;

    }
}
