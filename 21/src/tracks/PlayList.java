package tracks;
import java.util.ArrayList;
import java.util.Comparator;

public class PlayList {
    //массив упорядоченных треков
    ArrayList<AudioTrack> listOfTracks = new ArrayList<>();

    //вставляет новый аудиотрек в нужное место согласно порядку
    public void add(AudioTrack track) {
        if (listOfTracks.size() == 0) {
            listOfTracks.add(0, track);
        } else {
            boolean addTest = false;
            for (int i = 0; i < listOfTracks.size(); i++) {
                if (track.compareTo(listOfTracks.get(i)) < 0) {
                    listOfTracks.add(i, track);
                    addTest = true;
                    break;
                }
            }
            if (!addTest) {
                listOfTracks.add(track);
            }
        }
    }

    public void print() {
        System.out.println("lenght " + listOfTracks.size());
        for (int i = 0; i < listOfTracks.size(); i++) {
            listOfTracks.get(i).print();
//            System.out.println(listOfTracks.get(i).duration);
        }
    }
}