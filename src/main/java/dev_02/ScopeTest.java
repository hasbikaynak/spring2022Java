package dev_02;

public class ScopeTest {
    int z;
    public static void main(String[] args) {
        ScopeTest myScope = new ScopeTest();
        int z = 6;
        System.out.println(z);
        myScope.doStuff();
        System.out.println(z);
        System.out.println(myScope.z);

    }

    private void doStuff() {
        int z = 5;
        doStuff2();
        System.out.println(z);
    }

    private void doStuff2() {
        z = 4;
    }
}
