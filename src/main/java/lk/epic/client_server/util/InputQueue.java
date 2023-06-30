package lk.epic.client_server.util;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class InputQueue {
    private static final BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    public static void add(String input) {
        queue.add(input); // Add the input to the queue
    }

    public static String poll() {
        return queue.poll(); // Retrieve and remove the input from the queue
    }
}
