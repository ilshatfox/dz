package tracks;

public class AudioTrack implements Comparable<AudioTrack> {
    public int duration;
    public String title;
    public String author;
    private StringComparator strComp = new StringComparator();

    public AudioTrack(int duration, String title, String author) {
        this.duration = duration;
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(AudioTrack o) {
        int d1 = duration - o.duration;
        if (d1 != 0) {
            return d1;
        } else if(title != o.title) {
            return strComp.compare(title, o.title);
        } else {
            return strComp.compare(author, o.author);
        }
    }

    public void print() {
        System.out.println("AudioTrack: duration " + duration + " title " + title + " author " + author);
    }
}