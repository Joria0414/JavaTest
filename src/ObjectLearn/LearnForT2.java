package ObjectLearn;

public class LearnForT2 {
    public static void main(String[] args){
        TestA a = new TestA();
        TestA b = a.setValue1(5);
        b.setValue1(6);
        System.out.println(b.getValue1());

        LearnForT2 c = new LearnForT2();
        TestA d = c.CreateTestA(5);
        System.out.println(d.getValue1());
    }
    TestA CreateTestA(int value){
        TestA a = new TestA();
        a.setValue1(value);
        return a;
    }
}

