import javax.swing.text.WrappedPlainView;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,2,9,1,4,3,7,6};
        System.out.println(Arrays.toString(arr));
//        mergeSort(arr, 0, arr.length - 1);
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int index = partition(arr, low, high);
            quickSort(arr, low, index-1);
            quickSort(arr, index+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if(arr[j]<=pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


//    private static void mergeSort(int[] arr, int low, int high) {
//        if(low<high) {
//            int mid = (low+high) / 2;
//            mergeSort(arr, low, mid);
//            mergeSort(arr, mid+1, high);
//            merge(arr, low, mid, high);
//        }
//    }
//
//    private static void merge(int[] arr, int low, int mid, int high) {
//        int i = low;
//        int j = mid+1;
//        int k = 0;
//        int[] sorted = new int[1000];
//
//        while (i<=mid && j<=high) {
//            if(arr[i]<arr[j]) {
//                sorted[k++] = arr[i++];
//            } else {
//                sorted[k++] = arr[j++];
//            }
//        }
//
//        while (i<=mid) {
//            sorted[k++] = arr[i++];
//        }
//
//        while (j<=high) {
//            sorted[k++] = arr[j++];
//        }
//
//        k--;
//        while (k>=0) {
//            arr[low+k] = sorted[k--];
//        }
//    }
















//    private static int fibo(int n) {
//        if(n<=1) return n;
//        else return fibo(n-1) + fibo(n-2);
//    }
//
//    private static void mergeSort(int[] arr, int left, int right) {
//        if(left<right) {
//            int mid = (left+right)/2;
//            mergeSort(arr, left, mid);
//            mergeSort(arr, mid+1, right);
//            merge(arr, left, mid, right);
//        }
//    }
//
//    private static void merge(int[] arr, int left, int mid, int right) {
//        System.out.println(Arrays.toString(arr));
//        int i = left;
//        int j = mid+1;
//        int k = 0;
//        int[] sorted = new int[1000];
//
//        while (i <= mid && j <= right) {
//            if(arr[i]<arr[j]) {
//                sorted[k++] = arr[i++];
//            } else {
//                sorted[k++] = arr[j++];
//            }
//        }
//
//        while (i <= mid) {
//            sorted[k++] = arr[i++];
//        }
//
//        while (j <= mid) {
//            sorted[k++] = arr[j++];
//        }
//
//        k--;
//
//        while (k>=0) {
//            arr[left+k] = sorted[k];
//            k--;
//        }
//    }
//
//    private static void quickSort(int[] arr, int left, int right) {
//        if(left<right) {
//            int index = partition(arr, left, right);
//            quickSort(arr, left, index-1);
//            quickSort(arr, index+1, right);
//        }
//    }
//
//    private static int partition(int[] arr, int left, int right) {
//        int pivot = arr[right];
//        int i = left - 1;
//
//        for (int j = left; j < right; j++) {
//            if(arr[j] <= pivot) {
//                i++;
//                //swap
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//
//        i++;
//        //swap
//        int temp = arr[right];
//        arr[right] = arr[i];
//        arr[i] = temp;
//
//        return i;
//    }























































//    private static void mergeSort(int[] arr, int left, int right) {
//        if(left<right) {
//            int mid = (left+right)/2;
//            mergeSort(arr, left, mid);
//            mergeSort(arr, mid+1, right);
//            merge(arr, left, mid, right);
//        }
//    }
//
//    private static void merge(int[] arr, int left, int mid, int right) {
//        int[] sorted = new int[1000];
//
//        int i = left;
//        int j = mid+1;
//        int k = 0;
//
//        while (i <= mid && j <= right) {
//            if(arr[i]<=arr[j]) {
//                sorted[k++] = arr[i++];
//            } else {
//                sorted[k++] = arr[j++];
//            }
//        }
//
//        while (i <= mid) {
//            sorted[k++] = arr[i++];
//        }
//
//        while (j <= right) {
//            sorted[k++] = arr[j++];
//        }
//
//        k--;
//        while (k>=0) {
//            arr[left+k] = sorted[k--];
//        }
//    }


//    private static void mergeSort(int[] arr, int left, int right) {
//        if(left<right) {
//            int middle = (left+right) / 2;
//            mergeSort(arr, left, middle);
//            mergeSort(arr, middle+1, right);
//            merge(arr, left, middle, right);
//        }
//    }
//
//    private static void merge(int[] arr, int left, int middle, int right) {
//        int[] sorted = new int[1000];
//        int i = left;
//        int j = middle+1;
//        int k = 0;
//
//        while (i<=middle && j<=right) {
//            if(arr[i]<=arr[j]) {
//                sorted[k++] = arr[i++];
//            } else {
//                sorted[k++] = arr[j++];
//            }
//        }
//
//        while (i<=middle) {
//            sorted[k++] = arr[i++];
//        }
//        while (j<=right) {
//            sorted[k++] = arr[j++];
//        }
//
//        k--;
//        while (k>=0) {
//            arr[left+k] = sorted[k];
//            k--;
//        }
//    }


//    private static void quickSort(int[] arr, int low, int high) {
//        if(low<high) {
//            int index = partition(arr, low, high);
//            quickSort(arr, low, index-1);
//            quickSort(arr, index+1, high);
//        }
//    }
//
//    private static int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int i = low-1;
//
//        for (int j = low; j < high; j++) {
//            if(arr[j]<=pivot) {
//                i++;
//                //swap
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//
//        //swap
//        int temp = arr[i+1];
//        arr[i+1] = arr[high];
//        arr[high] = temp;
//
//        return i+1;
//    }
}