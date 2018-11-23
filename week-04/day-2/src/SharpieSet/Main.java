package SharpieSet;

import Sharpie.Sharpie;

public class Main {
    public static void main(String[] args) throws Exception {
        Sharpie sharpie = new Sharpie("Blue", 1.0);
        Sharpie sharpie1 = new Sharpie("Blue", 1.0);
        Sharpie sharpie2 = new Sharpie("Blue", 1.0);
        Sharpie sharpie3 = new Sharpie("Blue", 1.0);
        Sharpie sharpie4 = new Sharpie("Blue", 1.0);

        SharpieSet set = new SharpieSet();
        set.list.add(sharpie);
        set.list.add(sharpie1);
        set.list.add(sharpie2);
        set.list.add(sharpie3);
        set.list.add(sharpie4);

        for (int i = 0; i < 100; i++) {
            sharpie.use();
        }
        System.out.println(set.list.size());

        set.removeTrash(set.list);
        System.out.println(set.list.size());

        System.out.println(set.countUsable(set.list));

    }
}
