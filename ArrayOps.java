import javax.sql.rowset.spi.SyncResolver;

public class ArrayOps {
    public static void main(String[] args) {
        int [] array1 = {3, 2, 1}; 
        int [] array2 = {3, 3, 3, 2, 1, 2}; 
        int [] array3 = {1};
        int [] array4 = {4, 4};
        System.out.println(isSorted(array3));
        System.out.println(isSorted(array4));
    }


    public static int findMissingInt (int [] array) {
        int [] completeArray = new int [array.length + 1]; 
        int ans = 0; 
        
        for (int i = 0; i < completeArray.length; i++) {
            completeArray[i] = i; 
        }
        for (int i = 0; i < completeArray.length; i++) {
            if (!contains(array, i)) {
                ans = i;  
                }
            } 
        return ans;
        }
       
    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i; 
            }
        } 

        max = array[0];
        if (maxIndex == 0) {
            max = array[1];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max && i != maxIndex) {
                max = array[i]; 
            }
        }
        return max;
    }

    public static boolean containsTheSameElements(int [] array1 ,int [] array2) {
        int [] set1 = set(array1);
        int [] set2 = set(array2);

        if (set1.length != set2.length) {
            return false;
        }
        for (int i = 0; i < set1.length; i++) {
            if (!isInSet(set2, set1[i])) {
                return false;
            }
        }
        return true; 

    }

    public static boolean isInSet(int [] set1, int element) {
        for (int i = 0; i < set1.length; i++) {
            if (element == set1[i]) {
                return true; 
            }
        }
        return false; 
    }

    public static boolean isSorted(int [] array) {
        if (array[0] > array[array.length - 1]) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i+1] > array[i]) {
                    return false;
                }
            }
        } else { 
            if (array[0] > array[array.length - 1]) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i+1] > array[i]) {
                        return false; 
                    }
                }
            }
        }
        return true;
    }

    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                 return true;
             }
        }
        return false;
    } 

    public static void printArray(int[] array){
        System.out.print('{');
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            char c = i != array.length - 1 ? ',' : '}';
            System.out.print(c);
         }
        System.out.println();
    }

    public static boolean contains(int[] arr, int value, int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == value) {
                return true;
                }
            }
        return false ;
    }

    public static int countUnique(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = contains(arr, arr[i], i) ? count : count + 1;
        }
        return count;
    }

    public static int [] set (int[] arr) {
        int [] res = new int [countUnique(arr)];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!contains(arr, arr[i], i)){
                res[index++] = arr[i];
            }
        }
        return res;
    }

}
