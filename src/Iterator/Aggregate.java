package Iterator;

/**
 * Created by xujianyong1 on 2017/2/6.
 */
public interface Aggregate {
    void add(Object obj);
    void remove(Object obj);
    Iterator iterator();
}
