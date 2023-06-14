package org.example;

import java.util.PriorityQueue;
import java.util.Random;

public class ToyStore {
    private Toy[] toys;
    private PriorityQueue<Integer> queue;
    private Random random;

    public ToyStore(String idsString, String namesString, String weightsString) {
        String[] ids = idsString.split(" ");
        String[] names = namesString.split(" ");
        String[] weightsStrings = weightsString.split(" ");
        this.toys = new Toy[ids.length];
        for (int i = 0; i < ids.length; i++) {
            int weight = Integer.parseInt(weightsStrings[i]);
            Toy toy = new Toy(ids[i], names[i], weight);
            this.toys[i] = toy;
        }
        this.queue = new PriorityQueue<>();
        this.random = new Random();
    }

    public void fillQueue() {
        for (int i = 0; i < this.toys.length; i++) {
            for (int j = 0; j < this.toys[i].getWeight(); j++) {
                this.queue.add(i + 1);
            }
        }
    }

    public Toy get() {
        if (this.queue.isEmpty()) {
            return null;
        }
        int value = this.queue.poll();
        int randomInt = this.random.nextInt(100) + 1;
        if (randomInt <= 20) {
            return new Toy("1", " ", 1);
        } else if (randomInt <= 40) {
            return new Toy("2", " ", 2);
        } else {
            return this.toys[value - 1];
        }
    }
}
