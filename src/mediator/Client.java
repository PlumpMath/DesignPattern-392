package mediator;

/**
 * Created by xujianyong1 on 2017/1/19.
 */
public class Client {
    public static void main(String[] args) {
        AbstractColleague colleagueA = new ColleagueA();
        AbstractColleague colleagueB = new ColleagueB();
        System.out.println("=====设置A影响B======");
        colleagueA.setNumber(1288, colleagueB);
        System.out.println("collA的值：" + colleagueA.getNumber());
        System.out.println("collB的值：" + colleagueB.getNumber());

        System.out.println("======设置B影响A=====");
        colleagueB.setNumber(280098, colleagueA);
        System.out.println("collA的值：" + colleagueA.getNumber());
        System.out.println("collB的值：" + colleagueB.getNumber());

    }
}
