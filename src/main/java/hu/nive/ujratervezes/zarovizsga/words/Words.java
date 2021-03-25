package hu.nive.ujratervezes.zarovizsga.words;

public class Words {

    private String countPattern = "0123456789";

    public boolean hasMoreDigits(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (countPattern.contains(String.valueOf(ch))) {
                count += 1;
            }
        }
        return count > s.length() / 2;
    }
}
