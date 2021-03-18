import java.util.Arrays;

public class Dog {

    private String name;
    private boolean isHungry;

    private Dog[] offSpring = new Dog[1];

    private Owner owner;

    public Dog(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    public String feedDog() {
        if (isHungry) {
            isHungry = false;
            return "dog is feeded";
        } else {
            return "dog isn't hungry";
        }
    }

    public Dog[] getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(String offSpring) {
        Dog puppy = new Dog(offSpring, true);

        boolean empty;

        for (int i = 0; i < this.offSpring.length; i++) {

            empty = this.offSpring[i] == null;

            if (empty) {
                this.offSpring[i] = puppy;
                break;
            }
            this.offSpring = Arrays.copyOf(this.offSpring, i + 2);
        }
    }

    @Override
    public String toString() {
        return name;
    }


}
