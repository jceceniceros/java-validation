
public class Validation
{
    public static void main(String[] args)
    {

        String message = "Hello world from Java!";

        System.out.println(message);

        String java_version = System.getProperty("java.version");
        String version_message = String.format("Java version: %s", java_version);

        System.out.println(version_message);

    }

}
