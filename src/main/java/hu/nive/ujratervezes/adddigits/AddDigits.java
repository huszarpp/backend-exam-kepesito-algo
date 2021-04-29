package hu.nive.ujratervezes.adddigits;

class AddDigits {
    int addDigits(String input) {

        if (input == null || input.equals("")) {
            return -1;
        }

        int sumOfDigits = 0;
        for (char c : input.toCharArray()) {
            int intValueOfCurrentDigit = c - '0';
            if (0 <= intValueOfCurrentDigit && intValueOfCurrentDigit <= 9) {
                sumOfDigits += intValueOfCurrentDigit;
            }
        }
        return sumOfDigits;
    }
}
