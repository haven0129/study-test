package algorithm;

/**
 * 插入排序:
 * 第一次从待排序的数据元素中选出第二个元素，然后与前一个数比较，
 * 如果小于前面的数，那么交换位置，然后再找到第三个元素，与前两个元素比较，如果小于前面的数，那么交换位置，大于或等于，则不动。
 * 以此类推，直到最后一个元素比较完成。
 * 时间复杂度：最坏时间复杂度：O(n^2)，最好时间复杂度()已经排好序：O(n)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = CommonUtils.getRandomArray(10);
        CommonUtils.print(arr);
        insertSort(arr);
    }

    public static void insertSort(int[] arr){
        for(int i = 1; i < arr.length; i ++){
            for(int j = i - 1; j >= 0; j --) {
                int num = arr[j + 1];   // 当前下标的元素
                int lastNum = arr[j];   // 前一个下标的元素
                if (num < lastNum) {    // 如果当前元素小于前一个元素，那么交换位置
                    CommonUtils.swap(arr, j + 1, j);
                }else { // 如果当前元素大于等于前一个元素，退出当前循环
                    break;
                }
            }
            CommonUtils.print(arr, i);
        }
    }



}
