public class ProblemSet13 {
    public static void main(String[] args) {
        int[] arr = {2,4,3,8,9};

        System.out.println(groupSum6(1,arr,1));
    }

    public static boolean groupSum(int start, int[] numbers, int target) {
        if(target == 0) {
            return true;
        }
        if(start >= numbers.length) {
            return false;
        }
        if(groupSum(start + 1, numbers, target - numbers[start])) {
            return true;
        }
        return groupSum(start + 1, numbers, target);
    }

     public static boolean groupSum6(int start, int[] numbers, int target) {
         if(start == numbers.length)
         {
             if(target == 0)
                 return true;
             return false;
         }
         if(numbers[start] == 6) {
             return groupSum6(start + 1, numbers, target - numbers[start]);
         }
         if(groupSum6(start + 1, numbers, target - numbers[start])) {
             return true;
         }
         return groupSum6(start + 1, numbers, target);
    }

    /*public boolean groupNoAdj(int start, int[] numbers, int target) {

    }

    public boolean groupSum5(int start, int[] numbers, int target) {

    }

    public boolean groupSumClump(int start, int[] numbers, int target) {

    }

    public boolean splitArray(int[] numbers) {

    }

    public boolean splitOdd(int[] numbers) {
        
    }*/
}
