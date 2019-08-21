import java.io.BufferedReader;
import java.io.IOException;;
import java.io.InputStreamReader;

public class Stdio
{

    public static void main(String[] args)
    {

        String message = null;

        if (args.length == 0) {

            BufferedReader reader = null;

            try {

                reader = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter a message << ");
                message = reader.readLine();

            } catch (IOException e) {

                return;

            }
        } else {

            message = args[0];

        }

        System.out.println(message);

    }

}
