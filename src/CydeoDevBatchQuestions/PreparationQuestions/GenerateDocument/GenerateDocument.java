package CydeoDevBatchQuestions.PreparationQuestions.GenerateDocument;

public class GenerateDocument {

    public static void main(String[] args) {
        String document = "Sinan";
        String characters = "niSan";
        System.out.println(canGenerate(document, characters));
    }

    private static boolean canGenerate(String document, String characters) {
        //StringBuilder chars = new StringBuilder(characters);
        if (characters.length()<document.length()) return false;
        boolean isFound = false;
        for(int i=0 ; i< document.length() ; i++){
            isFound = false;
            for(int j=0 ; j<characters.length() ; j++){
                if(document.charAt(i)==characters.charAt(j)){
                    characters.replaceFirst(String.valueOf(characters.charAt(i)), "");
                    isFound = true;
                    break;
                }
            }
            if (!isFound) return false;
        }
        return true;
    }

}
