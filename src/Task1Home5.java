import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Task1Home5 {
    public static void main(String[] args) {
//        1) Пусть дан список сотрудников:
//
//        Иван Иванов Светлана Петрова
//
//        Кристина Белова Анна Мусина
//
//        Анна Крутова Иван Юрин
//
//        Петр Лыков Павел Чернов
//
//        Петр Чернышов Мария Федорова
//
//        Марина СветловаМария Савина
//
//        Мария Рыкова Марина Лугова
//
//        Анна Владимирова Иван Мечников
//
//        Петр Петин Иван Ежов
//
//        Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности.
        String[] fio = {     "Иван Иванов", "Светлана Петрова","Кристина Белова", "Анна Мусина","Анна Крутова","Иван Юрин",
                "Петр Лыков","Павел Чернов","Петр Чернышов","Мария Федорова","Марина Светлова","Мария Савина","Мария Рыкова",
                "Марина Лугова","Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        System.out.println(CounterNames(fio));
        Map<String,Integer> fiotable = new HashMap<>(CounterNames(fio));
        System.out.println(finalfio(fiotable));

    }

    private static LinkedList finalfio(Map<String, Integer> fiotable) {
        LinkedList finalfio = new LinkedList();
        int max = 0;
        for (Map.Entry<String, Integer> i : fiotable.entrySet()) {
            if (i.getValue() > max) max = i.getValue();
        }


        for (int i = max; i>0; i--){
            for (Map.Entry<String, Integer> j : fiotable.entrySet()) {

                if(j.getValue() == i) {
                    finalfio.add(j);
                }
            }

        }
        return  finalfio;
    }

    private static Map CounterNames(String[] fio) {
        Map<String, Integer> fioTable = new HashMap<>();
        for (int i = 0; i < fio.length; i++) {
            String[] spl = fio[i].split(" ");
            if (fioTable.containsKey(spl[0])) {
                fioTable.put(spl[0], fioTable.get(spl[0]) + 1);}
                else{
                    fioTable.put(spl[0], 1);
                }
            }
        return fioTable;
    }
}
