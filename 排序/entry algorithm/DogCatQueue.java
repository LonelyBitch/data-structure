import java.util.LinkedList;
import java.util.Queue;

public class DogCatQueue {

    public static class Pet {

        private String type;

        public Pet(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class Dog extends Pet {



        public Dog() {

            super("Dog");
        }

    }

    public static class Cat extends Pet {

        public Cat() {
            super("cat");
        }
    }

    public static class petEntryQueue {
        private Pet pet;
        private long count;

        public petEntryQueue(Pet pet, long count) {
            this.count = count;
            this.pet = pet;
        }

        public Pet getPet() {
            return pet;
        }

        public void setPet(Pet pet) {
            this.pet = pet;
        }

        public long getCount() {
            return count;
        }

        public void setCount(long count) {
            this.count = count;
        }

        public String getEnterType() {
            return pet.getType();
        }
    }

    public static class petQueue {

        private Queue<petEntryQueue> catQueue;
        private Queue<petEntryQueue> dogQueue;
        private long count;


        public petQueue() {
            this.catQueue = new LinkedList<petEntryQueue>();
            this.dogQueue = new LinkedList<petEntryQueue>();
            this.count = 0;
        }

        public void add(Pet pet) {
            if (pet.getType().equals("Dog")) {
                this.dogQueue.add(new petEntryQueue(pet, this.count++));
            } else if (pet.getType().equals("Cat")) {

                this.catQueue.add(new petEntryQueue(pet, this.count++));
            } else {

                System.out.println("err");
            }
        }

        public Pet pollAll() {

            if (!catQueue.isEmpty() && !dogQueue.isEmpty()) {
                if (catQueue.peek().getCount() < dogQueue.peek().getCount()) {
                    return (Dog) dogQueue.poll().getPet();
                } else {
                    return (Cat) dogQueue.poll().getPet();
                }
            } else if (!catQueue.isEmpty()) {

                return (Cat) catQueue.poll().getPet();
            } else if (!dogQueue.isEmpty()) {
                return (Dog) dogQueue.poll().getPet();
            } else {
                throw new RuntimeException("err, queue is empty!");

            }
        }

        public Dog pollDog() {
            if (!this.isDogQueueEmpty()) {
                return (Dog) this.dogQueue.poll().getPet();
            } else {
                throw new RuntimeException("Dog queue is empty!");
            }
        }

        public Cat pollCat() {
            if (!this.isCatQueueEmpty()) {
                return (Cat) this.catQueue.poll().getPet();
            } else
                throw new RuntimeException("Cat queue is empty!");
        }

        public boolean isEmpty() {
            return this.dogQueue.isEmpty() && this.catQueue.isEmpty();
        }

        public boolean isDogQueueEmpty() {
            return this.dogQueue.isEmpty();
        }

        public boolean isCatQueueEmpty() {
            return this.catQueue.isEmpty();
        }

    }

    public static void main(String[] args) {
        petQueue test = new petQueue();

        Pet dog1 = new Dog();
        Pet cat1 = new Cat();
        Pet dog2 = new Dog();
        Pet cat2 = new Cat();
        Pet dog3 = new Dog();
        Pet cat3 = new Cat();

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        test.add(dog3);
        test.add(cat3);

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        test.add(dog3);
        test.add(cat3);

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        test.add(dog3);
        test.add(cat3);
        while (!test.isDogQueueEmpty()) {
            System.out.println(test.pollDog().getType());
        }
        while (!test.isEmpty()) {
            System.out.println(test.pollAll().getType());
        }

    }


}
