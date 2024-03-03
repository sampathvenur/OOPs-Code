//Implement a Java Program to demonstration of producer-consumer problems


public class BoundedBuffer {

    private final int[] buffer;
    private int count, in, out;

    public BoundedBuffer(int size) {
        buffer = new int[size];
        count = in = out = 0;
    }

    public synchronized void put(int data) {
        while (count == buffer.length) {
            try {
                wait(); // Wait if buffer is full
            } catch (InterruptedException e) {}
        }
        buffer[in] = data;
        in = (in + 1) % buffer.length;
        count++;
        notifyAll(); // Notify other threads that new data is added
    }

    public synchronized int get() {
        while (count == 0) {
            try {
                wait(); // Wait if buffer is empty
            } catch (InterruptedException e) {}
        }
        int data = buffer[out];
        out = (out + 1) % buffer.length;
        count--;
        notifyAll(); // Notify other threads that data is removed
        return data;
    }

    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(10);

        // Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                buffer.put(i);
                System.out.println("Produced " + i);
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                int data = buffer.get();
                System.out.println("Consumed " + data);
            }
        });

        producer.start();
        consumer.start();
    }
}

