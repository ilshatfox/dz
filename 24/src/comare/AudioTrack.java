package comare;

import com.sun.org.apache.xpath.internal.operations.Equals;
import equals.PhoneNumber;

public class AudioTrack implements Comparable<AudioTrack> {
    public int duration;
    private String title;
    private String author;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    @Override
//    public boolean equals(Object obj) {
//        //покрывается следующим условием (излишне)
//        if (obj == null) {
//            return false;
//        }
//        if (! (obj instanceof PhoneNumber)) {
//            return false;
//        }
//        if (obj == this) {
//            return true;
//        }
//        PhoneNumber pn = (PhoneNumber) obj;
//        return this.getCode().equals(pn.getCode()) &&
//                this.getNumber().equals(pn.getNumber());
//    }
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int compareTo(AudioTrack o) {
        return duration - o.duration;
    }
}