package classes;

public class RuntimeApp {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());

        // Memory di JVM
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());
    }
}
