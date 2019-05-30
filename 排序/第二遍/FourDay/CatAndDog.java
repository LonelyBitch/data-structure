package FourDay;

import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.Queue;

public class CatAndDog {


    public class Pet {
        private String type;
        private int cout;

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

    public class Cat extends Pet {

        public Cat(String type) {
            super(type);
        }
    }

    public class Dog extends Pet {

        public Dog(String type) {
            super(type);
        }
    }

    public class petEnitity {
        private Pet pet;
        private long cout;

        public petEnitity(Pet pet, long cout) {

        }

        public Pet getPet() {
            return pet;
        }

        public void setPet(Pet pet) {
            this.pet = pet;
        }

        public long getCout() {
            return cout;
        }

        public void setCout(int cout) {
            this.cout = cout;
        }
    }

    public class PetQueue {
        private Queue<petEnitity> dogQueue;
        private Queue<petEnitity> catQueue;

        private long cout = 0;

        public PetQueue() {
            this.dogQueue = new LinkedList<petEnitity>();
            this.catQueue = new LinkedList<petEnitity>();
            this.cout = cout;
        }

        public void addPet(Pet pet) {
            if (pet.getType().equals("dog")) {
                dogQueue.add(new petEnitity(pet, cout++));
            } else if (pet.getType().equals("cat")) {
                catQueue.add(new petEnitity(pet, cout++));
            }
        }

        public Pet getPet() {
            Pet pet;
            if (!isEmpty()){

                petEnitity petEnitity = dogQueue.poll().getCout() > catQueue.poll().getCout() ? catQueue.poll() : dogQueue.poll();

                pet = petEnitity.getPet();
            }else {
                if (dogQueue.isEmpty()){
                    pet = dogQueue.poll().getPet();
                }else {
                    pet = catQueue.poll().getPet();
                }
            }
            return pet;
        }

        public boolean isEmpty(){
            return dogQueue.isEmpty()&&catQueue.isEmpty();
        }

    }


}
