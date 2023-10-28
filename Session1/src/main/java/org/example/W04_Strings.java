public class W04_Strings {
    public static void reverseString(char[] string) {
        for (int i=0; i<string.length/2; i++) {
            int j = string.length - i - 1;
            char aux = string[i];
            string[i] = string[j];
            string[j] = aux;
        }
    }

    public static void main(String[] args) {
        char[] s1 = {'h','e','l','l','o'};
        System.out.println(s1);
        reverseString(s1);
        System.out.println(s1);

        char[] s2 = {'H','a','n','n','a','h'};
        System.out.println(s2);
        reverseString(s2);
        System.out.println(s2);
    }
}
