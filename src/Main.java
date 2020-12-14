import javax.annotation.processing.SupportedSourceVersion;
import javax.imageio.IIOException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);

        ArrayList b = new ArrayList();
        b.add(2);
        b.add(4);
        b.add(6);
        b.add(8);
        b.add(8);

        TaskJavaMergeClass.merge(a, b);
        System.out.println(a);
    }
}
