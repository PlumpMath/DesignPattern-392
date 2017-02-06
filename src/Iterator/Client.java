package Iterator;

/**
 * Created by xujianyong1 on 2017/2/6.
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("a");
        aggregate.add("b");
        aggregate.add("c");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()){
            String next = (String) iterator.next();
            System.out.println(next);
        }
        aggregate.remove("a");
        Iterator iterator2 = aggregate.iterator();
        while (iterator2.hasNext()){
            String next = (String) iterator2.next();
            System.out.println(next);
        }
    }
}
