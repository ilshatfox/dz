import tracks.AudioTrack;
import tracks.PlayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        AudioTrack a1 = new AudioTrack(1, "a2", "a3");
        AudioTrack a2 = new AudioTrack(1, "A2", "a2");
        AudioTrack a3 = new AudioTrack(3, "a3", "a3");
        AudioTrack a4 = new AudioTrack(4, "a4", "a4");
        AudioTrack a5 = new AudioTrack(4, "a5", "a5");
        AudioTrack a6 = new AudioTrack(4, "a6", "a6");
        AudioTrack a7 = new AudioTrack(7, "a7", "a7");

//        System.out.println(a1.duration);
//        System.out.println(a3.duration);
        PlayList playList = new PlayList();
        playList.add(a1);
        playList.add(a3);
        playList.add(a2);
        playList.add(a7);
        playList.add(a6);
        playList.add(a5);
//        System.out.println("11111");
        playList.print();
    }
}