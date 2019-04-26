public class Word {
    String word;
    int num;

    public Word(String word, int num) {
        this.word = word;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Word{word=" + word +
                " num=" + num + "}";
    }

}
