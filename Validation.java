public class Validation {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.length() == 10 && phoneNumber.matches("[0-9]+");
    }
    public static boolean isValidPassword(String password) {
        char[] ch=password.toCharArray();
        if(password.length()<8)
            return false;
        boolean hasUpper=false;
        boolean hasLower=false;
        boolean hasDigit=false;
        boolean hasSymbol=false;
        for(char i:ch){
            if(Character.isLowerCase(i))
                hasLower=true;
            if(Character.isUpperCase(i))
                hasUpper=true;
            if(Character.isDigit(i))
                hasDigit=true;
            else
                hasSymbol=true;
        }
        return hasUpper&&hasDigit&&hasLower&&hasSymbol;
    }
    public static boolean isValidEmail(String email) {
        StringBuilder sb=new StringBuilder(email);
        if((email.charAt(0)!='@' &&email.contains("@gmail.com")&& email.length()>10))
            return true;
        return false;
    }

    public static boolean isValidCIBIL(int cibil) {
        if(cibil<550) return false;return true;
    }

    public static boolean isValidNewPassword(String reSetPassword, String reEnterNewPassword) {
        if(reSetPassword.equals(reEnterNewPassword)) return true;return false;
    }
}
