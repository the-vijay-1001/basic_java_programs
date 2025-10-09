// Count the frequency of each element in an array.....
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        int arr[] = {1,4,6,63,2,23,1,1,22,6,67,3,1,4};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        System.out.println(frequencyMap);
    }
}
