import java.util.LinkedList;

public class TestList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(145);
        list.add(234);
        list.add(255);
        list.add(657);
        list.add(214);
        list.add(234);

        for(int i = 0; i < list.size(); i++)
            System.out.println( list.get(i) );
        }
    }
