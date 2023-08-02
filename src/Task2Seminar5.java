import java.util.*;

public class Task2Seminar5 {
    public static void main(String[] args) {
//        2) Подсчитать количество вхождения каждого слова
//        Пример:
//        Россия идет вперед всей планеты. Планета — это не Россия.
//                toLoverCase().
//        (Усложнение - игнорировать пунктуацию)*


        String str = "Россия идет вперед всей планеты. Планета — это не Россия";
        List<String> strf = Arrays.asList(str.split(" "));
        System.out.println(strf);
        System.out.println(Counter(strf));
    }

    private static Map Counter(List<String> strf) {
        Map<String, Integer> words = new HashMap<>();
        for (String s : strf) {
            if (words.containsKey(s)) {
                words.put(s, words.get(s) + 1);
            } else {
                words.put(s, 1);
            }
        }

        return words;
    }
}



