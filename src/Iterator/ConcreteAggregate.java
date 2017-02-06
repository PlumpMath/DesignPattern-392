package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xujianyong1 on 2017/2/6.
 */
public class ConcreteAggregate implements Aggregate {
    private List list = new ArrayList();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
