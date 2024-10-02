public class ExampleSealedClasses {

    public static void main(String[] args) {

    }
}


sealed class Parent1 permits child1, child2 {

}

final class child1 extends Parent1 {

}

final class child2 extends Parent1 {

}
