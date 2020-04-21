package algorithm;

import java.util.Random;

/**
 * @author tao.huang
 * @date 2020-04-21 11:40
 */
public class CommonUtils {
    /**
     * 打印数组排序结果
     * @param arr
     */
    public static void print(int [] arr, int num){
        if(arr == null || arr.length == 0){
            return;
        }
        System.out.print("第" + num + "轮排序结果：");
        for(int i = 0; i < arr.length; i ++){   // 打印排序结果
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    /**
     * 打印数组排序结果
     * @param arr
     */
    public static void print(int [] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        for(int i = 0; i < arr.length; i ++){   // 打印排序结果
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    /**
     * 交换数组某两个下标
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int [] arr, int i, int j){
        int length = arr.length;
        if(arr == null || length == 0){
            return;
        }
        if(length < i || length < j){
            return;
        }
        int temp = arr[i];      // 交换找到的最小值与当前起始值的下标
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 随机返回一个 arraySize 长度的数组
     * @param arraySize
     * @return
     */
    static int[] getRandomArray(int arraySize){
        Random r = new Random();
        int[] array =   new int[arraySize];

        for(int i = 0; i < arraySize; i ++){
            array[i] = r.nextInt(arraySize);
        }
        return array;
    }
}
