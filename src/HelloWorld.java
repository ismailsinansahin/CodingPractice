import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println(algo9());
        algo9().keySet().stream().forEach(System.out::println);

    }

    public static Map algo9(){

        int[] array = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};

        Arrays.sort(array);//0,1,2,3,4,5,6,7   //10,11,12  //15

        ArrayList<Integer> arraylist = new ArrayList<>();

        Map<ArrayList, Integer> map = new HashMap<ArrayList, Integer>();

        for (int i=0; i<array.length-1; i++){

            if (array[i+1] - array[i] == 1){
                arraylist.add(i);
            }else {
                arraylist.add(i);
                map.put(arraylist, arraylist.size());
                arraylist.clear();
            }
        }

        return map;

    }

}


