import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {7, 2, 8, 3, 5};
        System.out.println("Original Array : " + Arrays.toString(array));

        int rotationCount = 122;

        int[] resultArray =  solution(array, rotationCount);
        System.out.println("Rotated Array  : " + Arrays.toString(resultArray));
    }

    public static int[] solution(int[] array, int rotationCount) {
        int reducedRotationCount = rotationCount % array.length;

        int[] resultArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            resultArray[(i + reducedRotationCount) % array.length] = array[i];
        }
        return resultArray;
    }
}
