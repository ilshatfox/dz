import java.util.ArrayList;

public class PlayList {
    //массив упорядоченных треков
    ArrayList<AudioTrack> listOfTracks = new ArrayList<AudioTrack>();
    int n = 0;

//    public PlayList(int size) {
//        this.listOfTracks = new ArrayList();
//    }

    //вставляет новый аудиотрек в нужное место согласно порядку
    public void add(AudioTrack track) {
        for (int i = 0; i < n; i++) {
            if (track.compareTo(listOfTracks.get(i)) == 0) {

            } else  if (track.compareTo(listOfTracks.get(i)) < 0){

            }
        }
        n++;
    }

    public void addWithShift(AudioTrack track, int index) {
        AudioTrack lastElem1;
        AudioTrack lastElem2;

        lastElem1 = track;

        for (int i = in; i < listOfTracks.size(); i++) {
            if
        }
    }
}