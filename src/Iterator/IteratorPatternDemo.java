package Iterator;

public class IteratorPatternDemo {

    public static void main(String args[]) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        }
    }
}

// 迭代模式是为了不暴露内部结构，又可以让外部代码访问集合内部数据