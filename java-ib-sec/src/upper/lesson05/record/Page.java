package upper.lesson05.record;

import java.util.ArrayList;

public class Page<T> {

    protected final int FIRST_PAGE = 1;

    protected ArrayList<T> items;

    protected int current;

    protected int next;

    protected int last;

    protected int total;

    protected int pageSize;
}
