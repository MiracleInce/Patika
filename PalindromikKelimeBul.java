public class PalindromikKelimeBul {
    static boolean isPalindrome(String str){
        int i=0;
        int j=0;
        String reverse="";
        for (i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return str.equals(reverse);

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("kayak"));
    }
}