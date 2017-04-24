import java.util.HashMap;

/**
 * User: shreyven
 * Date: 4/24/17
 */
public class CheatingQuiz {

    private static HashMap<Character, Integer>  probability = new HashMap<Character, Integer>();

    public int[] howMany(String answers) {

        char[] answersToCharArray = answers.toCharArray();
        int value = 0;
        for(char c: answersToCharArray) {
            if (probability.containsKey(c)) {
                probability.put(c, probability.get(c)+1);
            }
            else{
                probability.put(c,1);
            }
        }
        int[] results = new int[answers.length()];
        for(int i=0; i< answersToCharArray.length; i++) {
            results[i] = probability.size();
            value = probability.get(answersToCharArray[i]);
            probability.put(answersToCharArray[i], --value);
            if(value == 0) {
                probability.remove(answersToCharArray[i]);
            }
        }
        return results;
    }

    public static void main(String args[]) {
        String answers = "BACACABCBBBBCAAAAACCCABBCAA";
        CheatingQuiz cheatingQuiz = new CheatingQuiz();
        int[] results = cheatingQuiz.howMany(answers);
        for (int ele : results) {
            System.out.print(ele + " ");
        }
    }
}
