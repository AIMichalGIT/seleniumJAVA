package RahulCourse;

public class exercise {
    public static void main (String[] args) {
        int[] numbers = {1,3,7,11,110};
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);

        for (int i=numbers.length-1; i>=0 ; i--)
        {
            System.out.println("number in reverse order: " + numbers[i]);
        }

    }

}


