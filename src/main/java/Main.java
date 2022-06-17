public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();

        int i = 0;
        while(i++ < 6) {
            generator.generateInfoLog();
            generator.generateWarnLog();

            generator.generateErrorLog();
        }
    }
}