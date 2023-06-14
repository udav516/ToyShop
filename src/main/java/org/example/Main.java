package org.example;

public class Main {
    public static void main(String[] args) {
        String idsString = "1 2 3";
        String namesString = "конструктор робот кукла";
        String weightsString = "2 2 6";
        String fileName = "output.txt";
        ToyStore toyStore = new ToyStore(idsString, namesString, weightsString);
        toyStore.fillQueue();
        String[] results = new String[10];
        for (int i = 0; i < 10; i++) {
            Toy toy = toyStore.get();
            if (toy == null) {
                results[i] = "Очередь пуста";
            } else {
                results[i] = toy.getId();
            }
        }
        Write.writeResults(fileName, results);
    }
}