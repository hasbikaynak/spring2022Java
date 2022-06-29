package interview_questions;

public class InterviewQuestion11 {
    public static void main(String[] args) {

    }
    public String endUp(String str) {
        if(str.length() >= 3)
        {
            String last3LettersUpperCase = str.substring(str.length()-3).toUpperCase();
            String restOfLetters = str.substring(0,str.length()-3);
            String newString = restOfLetters+last3LettersUpperCase;
            return newString;
        }
        return str;
    }
}

