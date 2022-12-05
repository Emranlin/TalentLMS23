import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int[] array= new int[10];
        ArrayList<Integer>arrayIntegers=new ArrayList<>();
        LinkedList<Integer>linkedIntegers=new LinkedList<>();
        for (int i = 0; i <10; i++) {
            arrayIntegers.add(random.nextInt(0,2));
            linkedIntegers.add(random.nextInt(0,2));
            array[i]= random.nextInt(0,1);
        }
        sort(arrayIntegers);
        System.out.println(" Before the sort :  "+arrayIntegers);
        System.out.println(" After the sort : "+arrayIntegers);
        sort(linkedIntegers);
        sort(array);



    }

    public static void sort(ArrayList<Integer> arrayIntegers){
        Collections.sort(arrayIntegers);
        for (Integer arrayInteger : arrayIntegers) {
            System.out.print("ArrayList sort "+arrayInteger);
        }
    }
    public static void sort(LinkedList<Integer>LinkedIntegers){
        Collections.sort(LinkedIntegers);
        for (Integer linkedInteger : LinkedIntegers) {
            System.out.print("LinkedList sort "+LinkedIntegers);

        }
    }
    public static void sort(int[]array){
        Arrays.sort(array);
        for (int i : array) {
            System.out.print("Array"+i);

        }
    }


}