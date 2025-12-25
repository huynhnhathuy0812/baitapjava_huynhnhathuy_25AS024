package baitap66;

public class TestAnimal {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Mimi");
        cat1.greets();

        Dog dog1 = new Dog("Ki");
        Dog dog2 = new Dog("Lu");
        dog1.greets();
        dog1.greets(dog2);

        BigDog bigDog1 = new BigDog("Gấu");
        BigDog bigDog2 = new BigDog("Béo");
        bigDog1.greets();
        bigDog1.greets(dog1);
        bigDog1.greets(bigDog2);
    }
}
