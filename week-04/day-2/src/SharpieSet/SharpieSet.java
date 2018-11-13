package SharpieSet;

import java.util.ArrayList;
import java.util.List;

import Sharpie.Sharpie;

public class SharpieSet {
    List<Sharpie> list = new ArrayList<Sharpie>();

    public int countUsable(List<Sharpie> list) {
        int usable = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).inkAmount > 0) {
                usable++;
            }
        }
        return usable;
    }

    public void removeTrash(List<Sharpie> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).inkAmount <= 0) {
                list.remove(list.get(i));
            }
        }
    }

    public void add(Sharpie sharpie) {
        list.add(sharpie);
    }
}
