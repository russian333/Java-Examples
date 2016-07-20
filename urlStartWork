package yourPackage;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

/*CS145
URL programming practice

Focuses on the concepts of parsing, file output

Goal:
Use the provided file and function to pull the source from a webpage. In two seperate files output
Links to photos and links to all other sort of media, including other webpages. 

Definition:
Parsing - To sequentially analyse a string by its syntactic components. 

Run, about:
To use the provided function pass in the URL to that webpage as a string. In response the function
will return to you a String containing the source of the page. You can then use this string to 
accomplish the task of parsing it for images and other links.

Once the program sees one of the things we are interested in, a link, It should output the link on 
its own line into a new file.
*/

public class Main {
    public static String doRequest(String addr)throws Exception{
        InputStream response = new URL(addr).openStream();
        try (Scanner scanner = new Scanner(response)) {
            String responseBody = scanner.useDelimiter("\\A").next();
            return responseBody;
        }
    }
    public static void main(String[] args) {

    }
}
