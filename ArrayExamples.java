

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] holder = new int[arr.length];
    for(int i = 0; i < arr.length; i ++){
      holder[i] = arr[arr.length-1-i];
    }
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = holder[i];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] holder = new int[arr.length];
    for(int i = 0; i < arr.length; i ++){
      holder[i] = arr[arr.length-1-i];
    }
    return holder;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    int indexOfLowest = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] < arr[indexOfLowest]) { 
        indexOfLowest = i;
      }
    }
    double sum = 0;
    for(int i = 0; i < arr.length; i++) {
      if(i != indexOfLowest) { 
        sum += arr[i]; 
      }
    }
    return sum / (arr.length - 1);
  }


}

