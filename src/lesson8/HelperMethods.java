package lesson8;

public class HelperMethods {
    public HelperMethods() {
    }

    public static void blockNumberOut(String str1) {
        char str2[] = new char[8];
        str1.getChars(0, 4, str2, 0);
        str1.getChars(9, 13, str2, 4);
        System.out.println(str2);
    }
    public static void hideLetters(String str1) {
        StringBuilder sb1 = new StringBuilder(str1);
        sb1.replace(5, 8, "***");
        sb1.replace(14, 17, "***");
        sb1.replace(19, 20, "*");
        sb1.replace(21, 22, "*");
        System.out.println(sb1);
    }
    public static void formatLetterOut(String str1) {
        String str3 = str1;
        String str5 = String.join("/", str3.substring(5, 8), str3.substring(14, 17), str3.substring(19, 20), str3.substring(21, 22));
        System.out.println(str5.toLowerCase());
        StringBuilder sb2 = new StringBuilder(str5);
        System.out.println(sb2.toString().toUpperCase());
    }
    public static void intoStringABC(String str1){
        String str6 = "abc";
        if (str6.regionMatches(true, 0, str1, 0, 3)) {
            System.out.println("abc in string = true");
        } else {
            System.out.println("abc in string = false");
        }

    }
    public static void startString(String str1) {
        if (str1.startsWith("555")) {
            System.out.println("String is start with 555");
        } else {
            System.out.println("String is not start with 555");
        }
    }
    public static void endString(String str1) {
        if (str1.endsWith("1a2b")) {
            System.out.println("String is start with 1a2b");
        } else {
            System.out.println("String is not start with 1a2b");
        }
    }
}
