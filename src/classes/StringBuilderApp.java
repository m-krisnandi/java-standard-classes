package classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Muhamad");
        builder.append(" ");
        builder.append("Krisnandi");

        String name = builder.toString();
        System.out.println(name);
    }
}
