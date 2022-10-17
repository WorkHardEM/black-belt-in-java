package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("privet");
//        System.out.println(info1.toSting());
//        String s1 = info1.getValue();
//
//        Info<Integer> info2 = new Info<>(28);
//        System.out.println(info2.toSting());
//        Integer i1 = info2.getValue();
    }

//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toSting() {
        return "{ [" + value + "] }";
    }

    public T getValue() {
        return value;
    }
}

class Parent {
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}

//class Child extends Parent {
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
//}
