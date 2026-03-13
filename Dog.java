
import java.util.Objects;

public class Dog extends Animal {

    private String breed;

    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog: " + getAnimalName() + " " + getOwnerName() + " " + getAge() + " Breed: " + breed;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;

        if (!(obj instanceof Dog)) return false;

        Dog d = (Dog) obj;

        return Objects.equals(breed, d.breed);
    }
}