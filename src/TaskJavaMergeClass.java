import java.util.ArrayList;

public class TaskJavaMergeClass {

    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int size = a.size();
        ArrayList temp = new ArrayList(2 * size);
        int iFirst = 0;
        int iSecond = 0;
        while (iFirst < size && iSecond < size) {
            if (a.get(iFirst).compareTo(b.get(iSecond)) < 0) {
                temp.add(a.get(iFirst));
                iFirst++;
            } else {
                temp.add(b.get(iSecond));
                iSecond++;
            }
        }
        if (iFirst < size) {
            temp.addAll(a.subList(iFirst, size));
        }
        if (iSecond < size) {
            temp.addAll(b.subList(iSecond, size));
        }
        a.clear();
        a.addAll(temp);
    }
}
