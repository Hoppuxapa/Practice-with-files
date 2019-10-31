import java.io.*;
import java.nio.file.Path;


public class SomeClass {

    public String replacer(Path path) throws IOException {
        String searchLine = "";
        String changeToLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(String.valueOf(path)));


            String NewLine = System.getProperty("line.separator");
            while ((searchLine = br.readLine()) != null) {
                changeToLine = changeToLine + searchLine + NewLine;
            }
            br.close();
            changeToLine = changeToLine.replaceAll("(H|h)(E|e)(L|l)(L|l)(O|o)",
                    "Hi");
            System.out.println(changeToLine);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return changeToLine;
    }
}
