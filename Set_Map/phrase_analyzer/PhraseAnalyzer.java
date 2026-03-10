import java.util.TreeMap;

public class PhraseAnalyzer {

    public static TreeMap<String, Integer> wordCount(String phrase) {

        TreeMap<String, Integer> result = new TreeMap<>();

        phrase = phrase.toLowerCase();
        phrase = phrase.replace("?", "")
                       .replace("!", "")
                       .replace(".", "")
                       .replace(",", "");

        String[] words = phrase.split(" ");

        for (String word : words) {
            if (word.equals("")) continue;

            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }

        return result;
    }
}
