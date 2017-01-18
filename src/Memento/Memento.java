package Memento;

/**
 * Created by xujianyong1 on 2017/1/18.
 */
public class Memento {
    private String state = "";
    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
