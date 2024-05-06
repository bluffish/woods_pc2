import java.util.*;
import java.io.*;

public class DryRun {
    public static void main(String[] args) throws FileNotFoundException {
        new DryRun().run();
    }

    public void run () throws FileNotFoundException {
        Scanner f = new Scanner(new File("DryRun.dat"));

        int t = f.nextInt(), s = 0;
        while (t-- > 0) s += f.nextInt();

        System.out.println("Team #\nName 1\nName 2\nName 3\nHigh School Name\nDivision\n"+s);

        f.close();
    }
}
