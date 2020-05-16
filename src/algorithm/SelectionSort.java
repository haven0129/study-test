package algorithm;

import java.util.Arrays;

/**
 * 选择排序:
 * 第一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，
 * 然后再从剩余的未排序元素中寻找到最小（大）元素，
 * 然后放到已排序的序列的末尾。以此类推，直到全部待排序的数据元素的个数为零。
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 */
public class SelectionSort {
    public static void main(String[] args) {
       /* int[] arr = CommonUtils.getRandomArray(10);

        selectionSort(arr);*/
        System.out.println(check(100));
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i ++){
            int minPos = i;     // 最小下标
            for(int j = i + 1; j < arr.length; j++){
                if(arr[minPos] > arr[j]){   // 如果当前最小值大于此值，设置最小下标为当前下标
                    minPos = j;
                }
            }
//            System.out.println("min num is :" + arr[i]);    // 打印当前轮次的最小值

            CommonUtils.swap(arr, i, minPos);      // 交换找到的最小值与当前起始值的下标
//            CommonUtils.print(arr);
        }
    }
    // 检验正确性
    public static boolean check(int checksize){

        for(int j = 0; j < checksize; j++) {
            int[] arr = CommonUtils.getRandomArray(10000);  // 获得一个长度10000的随机数组
            int[] arr2 = new int[arr.length];
            System.arraycopy(arr, 0, arr2, 0, arr.length);  // 复制数组

            selectionSort(arr);
            Arrays.sort(arr2);  // 利用数组自带的排序功能

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }



}
