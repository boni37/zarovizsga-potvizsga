package hu.nive.ujratervezes.zarovizsga.words;

public class Words {
    public boolean hasMoreDigits(String s) {
        int countDigit = 0;
        int countOther = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                countDigit += 1;
            } else {
                countOther += 1;
            }
        }
        return countDigit > countOther;
    }
}
