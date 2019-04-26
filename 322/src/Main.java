import simplemap.Entry;
import simplemap.Map;
import simplemap.SimpleMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String myText = "Атака 6-го егерского обеспечила отступление правого фланга. В центре действие забытой батареи Тушина, успевшего зажечь Шенграбен, останавливало движение французов. Французы тушили пожар, разносимый ветром, и давали время отступать. Отступление центра через овраг совершалось поспешно и шумно; однако войска, отступая, не путались командами. Но левый фланг, который единовременно был атакован и обходим превосходными силами французов под начальством Ланна и который состоял из Азовского и Подольского пехотных и Павлоградского гусарского полков, был расстроен. Багратион послал Жеркова к генералу левого фланга с приказанием немедленно отступать.";

        String[] file = myText.split(" ");

        Map<String, Integer> map = new SimpleMap<>();

        for (int i = 0; i < file.length; i++) {
            if (map.get(file[i]) != null) {
                int ent = map.get(file[i]);
                map.put(file[i], ent + 1);
            } else {
                map.put(file[i], 1);
            };
        }

        map.print();

    }
}