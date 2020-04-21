package algorithm;

/**
 * 冒泡排序：
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * 时间复杂度：最差O(n^2)，最优O(n)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = CommonUtils.getRandomArray(10);
        bubbleSort(arr);
    }

    // 普通冒泡排序时间复杂度：O(n^2)
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int num1 = arr[j];
                int num2 = arr[j + 1];
                if (num1 > num2) {    // 如果前一个数大于后一个数，那么交换两者位置
                    CommonUtils.swap(arr, j, j + 1);
                }
            }
            CommonUtils.print(arr, i + 1);
        }
    }


}
