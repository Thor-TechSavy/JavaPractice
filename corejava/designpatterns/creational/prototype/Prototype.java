package corejava.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Prototype {

    private static Map<Integer, Space> spaceMap = new HashMap<Integer, Space>();

    public static Space getCloneSpace(int id) throws CloneNotSupportedException {
        if (spaceMap.containsKey(id)) {
            return spaceMap.get(id).clone();
        }

        return new MilkyWay(id, "VOILA");
    }

    public static void loadSpace() {
        Space space = new MilkyWay(1, "TARS");
        Space space2 = new MilkyWay(2, "MARS");
        Space space3 = new MilkyWay(3, "LARS");

        spaceMap.put(1, space);
        spaceMap.put(2, space2);
        spaceMap.put(3, space3);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        loadSpace();
        Space cloneSpace = Prototype.getCloneSpace(1);
        System.out.println(cloneSpace.hashCode());
        System.out.println(Prototype.getCloneSpace(1).hashCode());
    }
}
