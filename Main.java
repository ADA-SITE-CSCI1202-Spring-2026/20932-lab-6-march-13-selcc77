public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Max", "Selcan", 3, "Golden Retriever");
        Dog dog2 = new Dog("Baron", "Selcan", 3, "Husky");

        System.out.println(dog1);

        if (dog1.equals(dog2)) {
            System.out.println("Dogs are equal");
        } else {
            System.out.println("Dogs are not equal");
        }
    }
}
