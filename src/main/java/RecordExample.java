public class RecordExample {

    public static void main(String[] args) {
        BodyMassIndex bodyMassIndex = new BodyMassIndex(5,80,29);
    }
}

record BodyMassIndex(int height, int weight, int age) {

}