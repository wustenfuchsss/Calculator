
public class Converter {
    public static String convertArabicToRomanian(Integer number) {

        String[] rnum = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        return rnum[number];
        }

    public static String convertRomanianToArabic(String number) {
        switch(number) {
            case "I":
                number = "1";
                break;
            case "II":
                number = "2";
                break;
            case "III":
                number = "3";
                break;
            case "IV":
                number = "4";
                break;
            case "V":
                number = "5";
                break;
            case "VI":
                number = "6";
                break;
            case "VII":
                number = "7";
                break;
            case "VIII":
                number = "8";
                break;
            case "IX":
                number = "9";
                break;
            case "X":
                number = "10";
                break;
            default: throw new NumberFormatException ();

        }
        return number;


    }
}

