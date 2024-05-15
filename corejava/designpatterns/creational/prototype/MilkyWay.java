package corejava.designpatterns.creational.prototype;

public class MilkyWay extends Space {

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public String getType() {
        return type;
    }

    public MilkyWay(int id, String type) {
        super(id);
        this.type = type;
    }

    public MilkyWay(MilkyWay other) {
        super(other);
        this.type = other.type;
    }
}
