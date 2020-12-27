package leetcode;

public class DetermineifStringHalvesAreAlike1704 {

    public void DetermineifStringHalvesAreAlike1704() {
        String s = "eaiouA";
        if (counterVowels(s.substring(0, s.length() / 2)) == counterVowels(s.substring((s.length() / 2)))) {
            System.out.println("true");
        }
        System.out.println("false");
    }

    public int counterVowels(String sValue) {
        int iCounterVowls = 0;
        for (char c : sValue.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                iCounterVowls++;
            }
        }
        return iCounterVowls;
    }
}
