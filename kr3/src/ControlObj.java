public class ControlObj {
    public char ch;
    public String session;
    private boolean isReady;

    private boolean stop = false;

    public ControlObj(String session) {
        this.session = session;
    }

    public void produce() {
        isReady = true;
    }

    public boolean isProduced() {
        return isReady;
    }

    public void consume() {
        isReady = false;
    }

    public boolean isConsumed() {
        return !isReady;
    }

    public boolean isStop() {
        return stop;
    }

    public void stop() {
        stop = true;
    }
}
