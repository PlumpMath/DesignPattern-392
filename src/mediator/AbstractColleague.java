package mediator;

/**
 * Created by xujianyong1 on 2017/1/19.
 */
abstract class AbstractColleague {
    protected int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void setNumber(int number, AbstractColleague colleague);
}
