import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //  Exercise:1
        // alphabeticIndex();

        //----------------------------

        //Exercise 2;
//        String str = "The quick brown fox jumps over the lazy dog.";
//        System.out.println(str.replaceAll("fox","cat"));

        //-----------------------------

        //Exercise  4;
//        String str = "w3resource";
//        String result = removeDublicate(str);
//        System.out.println(result);

        //-----------------------------

        //Exercise 5
//        String str = "abcdefghijklmnopqrstuvwxy";
//        equalStr(str);
        //-----------------------------


        //Exercise 6;
//        String orginalString = "Reverse words in a given string";
//        String reversedString = revercedStr(orginalString);
//        System.out.println(orginalString);
//        System.out.println(reversedString);

        //--------------------------

        //Exercise 7;

//        String str = "ab5c2d4ef12s";
//        int sum = calcValue(str);
//        System.out.println(sum);

        //---------------------------------

        //Exercise 8 ;

//        String[] colors = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
//
//        Arrays.sort(colors, Comparator.comparing(String::length).reversed());
//        System.out.println("Azalma siras:" + Arrays.toString(colors));
//
//
//        Arrays.sort(colors, Comparator.comparing(String::length));
//        System.out.println("Artma siras:" + Arrays.toString(colors));

        //---------------------------------------

        //Exercise 9

//        int[] digits = {4, 5, 10, 2, 56, 302, 73, 11};
//        Arrays.sort(digits);
//        int min = digits[0];
//        int max = digits[digits.length-1];
//        System.out.println("min: " + min );
//        System.out.println("max: " + max);

        //----------------------------------

        //Exercise 10;
//        int[] arr = {4, 23, 5, 12, 7, 4, 76, 4, 12};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Reqem daxil edin");
//        int temp = sc.nextInt();
//
//        System.out.println(countOccurence(arr, temp));

    }
    //Exercise 1
////    public static void alphabeticIndex(){
//        String alphabe = "abcdefghijklmnopqrstuvwxyz";
//
//        for (int i = 0; i<alphabe.length(); i++){
//            char symbol = alphabe.charAt(i);
//            int index = (int) symbol;
//            System.out.println(symbol + ":" + index);
//        }
//    }


    //--------------------------------

    //Exercise 4;

//    public static String removeDublicate(String s) {
//        StringBuilder resultBuilder = new StringBuilder();
//        boolean[] seen = new boolean[256];
//        for (char c : s.toCharArray()) {
//            if (!seen[c]) {
//                resultBuilder.append(c);
//                seen[c] = true;
//            }
//        }
//        return resultBuilder.toString();
//    }

    //-------------------------------------

//    public static String[] equalStr(String str){
//        int len = str.length();
//        int n = 5;
//        int temp = 0;
//        int chars = len / n;
//
//        String[] equalStr = new String[n];
//
//        for (int i = 0; i < len; i = i + chars) {
//            String part = str.substring(i, i + chars);
//            equalStr[temp] = part;
//            temp++;
//        }
//        for (int i = 0; i < equalStr.length; i++) {
//            System.out.println(equalStr[i]);
//        }
//        return equalStr;


        //Exercise 6;
//        public static String revercedStr(String s){
//            StringBuilder reverString = new StringBuilder();
//            String[] words = s.split("\\s+");
//            for (int i = words.length-1; i>=0; i--){
//                reverString.append(words[i]).append(" ");
//            }
//            return reverString.toString();
//        }
//    }
    //-----------------------------


    //Exercise 7;
//    public static int calcValue(String str){
//        int sum = 0;
//        for (char ch : str.toCharArray()){
//            if(Character.isDigit(ch)){
//                sum += Character.getNumericValue(ch);
//            }
//        }
//        return sum;
//    }
    //----------------------------

    //Exercise 10
//    public static int countOccurence(int[] arr, int temp){
//        int count = 0;
//        for (int number : arr){
//            if(number == temp){
//                count++;
//            }
//        }
//        return count;
//    }


}