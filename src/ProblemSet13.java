public class ProblemSet13 {
    public static void main(String[] args) {
        int[] arr = {1,4,4,8};

        System.out.println(groupSumClump(4,arr,14));
    }

    public static boolean groupSum(int start, int[] numbers, int target) {
        if(target == 0) {
            return true;
        }
        if(start >= numbers.length || start < 0) {
            return false;
        }
        if(groupSum(start + 1, numbers, target - numbers[start])) {
            return true;
        }
        return groupSum(start + 1, numbers, target);
    }

     public static boolean groupSum6(int start, int[] numbers, int target) {
         if( start < 0 || start >= numbers.length)
         {
             if(target == 0) {
                 return true;
             }
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

    public static boolean groupNoAdj(int start, int[] numbers, int target) {
        if(target == 0) {
            return true;
        }
        if(start >= numbers.length || start < 0) {
            return false;
        }
        if(groupNoAdj(start + 2, numbers, target - numbers[start])) {
            return true;
        }
        return groupNoAdj(start + 1, numbers, target);
    }

    public static boolean groupSum5(int start, int[] numbers, int target) {
        if(start >= numbers.length || start < 0)
        {
            if(target == 0) {
                return true;
            }
            return false;
        }
        if(numbers[start] % 5 == 0)
        {
            if(start < numbers.length - 1 && numbers[start+1] == 1) {
                return groupSum5(start + 2, numbers, target - numbers[start]);
            }
            return groupSum5(start + 1, numbers, target - numbers[start]);
        }
        if(groupSum5(start + 1, numbers, target - numbers[start])) {
            return true;
        }
        return groupSum5(start + 1, numbers, target);
    }

    public static boolean groupSumClump(int start, int[] numbers, int target) {
	if(start >= numbers.length || start < 0)
 	{
		if(target == 0) {
            return true;
        }
  	    return false;
 	}
 	int i = start + 1;

 	for(;  i < numbers.length && numbers[start] == numbers[i]; i++);
 	if(groupSumClump(i, numbers, target - ((i - start) * numbers[start]))) {
        return true;
    }
 	return groupSumClump(i, numbers, target);
    }

    /*public static boolean splitArray(int[] numbers) {

    }

    public boolean splitOdd(int[] numbers) {
        
    }*/
}
