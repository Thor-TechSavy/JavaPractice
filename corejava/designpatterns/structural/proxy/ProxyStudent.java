package corejava.designpatterns.structural.proxy;

public class ProxyStudent extends Student {

    public void getName() {
        System.out.println("Before Invocation");
        super.getName();
        System.out.println("After invocation");
    }

    public static void main(String[] args) {
        Student proxyStudent = new ProxyStudent();
        proxyStudent.getName();
    }
}
