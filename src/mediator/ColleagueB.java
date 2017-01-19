package mediator;

/**
 * Created by xujianyong1 on 2017/1/19.
 */
public class ColleagueB extends AbstractColleague {

    @Override
    public void setNumber(int number, AbstractColleague colleague) {
        this.number = number;
        colleague.setNumber(number/100);
    }
}
