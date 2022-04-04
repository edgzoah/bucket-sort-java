import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class app {
   public static void main(String[] args) {
    ArrayList<Object> arr = new ArrayList<>(Arrays.asList(0.22, 0.66, 0.23, 0.9, 0.1));
    ArrayList<List> list = new ArrayList<>();
    System.out.println(arr.get(0).getClass());
    Double max = (Double) arr.get(0);
    Double min = (Double) arr.get(0);
    for (int i = 0; i < arr.size(); i++) {
       if ((double)arr.get(i) > max) {
          max = (double)arr.get(i);
       }
    }
    for (int i = 0; i < arr.size(); i++) {
      if ((double)arr.get(i) < min) {
         min = (double)arr.get(i);
      }
   }
    int bucklen = 5;
    double oko = (float) (max - min) / (int) bucklen;
    oko = Math.round(oko * 1000.0) / 1000.0;

    for (int i = 0; i < bucklen; i++) {
       list.add(new ArrayList<>());
    }
    for (int i = 0; i < arr.size(); i++) {
       if (i == arr.indexOf(min)) {
         list.get((int) (long) (Math.round(((((double)arr.get(i))-min)/oko)))).add(arr.get(i));

       }
       else {
         list.get((int) (long) (Math.round(((((double)arr.get(i))-min)/oko-1)))).add(arr.get(i));
      }
    }
    for (int i = 0; i < bucklen; i++) {
       list.get(i).sort(null);
       for (int j = 0; j < list.get(i).size(); j++) {
          System.out.print(list.get(i).get(j) + " ");
       }
      }
      System.out.print("\n");
   //  System.out.println(list);
   } 
}