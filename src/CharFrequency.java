public class CharFrequency {
    public static void main(String[] args) {
        String str = "This is a sample string";
        char ch = 'i';
        int f = 0;

        for(int i = 0; i < str.length(); ++i) {
            if(ch == str.charAt(i)) {
                ++f;
            }
        }

        System.out.println("Frequency of " + ch + " in string = " + f);
    }
}
