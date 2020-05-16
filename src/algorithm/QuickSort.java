package algorithm;

import java.util.Arrays;

/**
 * 快速排序:
 * (1)首先设定一个分界值，通过该分界值将数组分成左右两部分。
 * (2)将大于或等于分界值的数据集中到数组右边，小于分界值的数据集中到数组的左边。此时，左边部分中各元素都小于或等于分界值，而右边部分中各元素都大于或等于分界值。
 * (3)然后，左边和右边的数据可以独立排序。对于左侧的数组数据，又可以取一个分界值，将该部分数据分成左右两部分，同样在左边放置较小值，右边放置较大值。右侧的数组数据也可以做类似处理。
 * (4)重复上述过程，可以看出，这是一个递归定义。通过递归将左侧部分排好序后，再递归排好右侧部分的顺序。当左、右两个部分各数据排序完成后，整个数组的排序也就完成了。
 * 时间复杂度：
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 */
public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = CommonUtils.getRandomArray(10);
        int[] arr = {7,9,9 ,0, 1, 5, 8, 0, 9 ,8 };
        System.out.print("获得数组：");
        CommonUtils.print(arr);
        System.out.print("排序后数组：");
        quickSort(arr, 0, arr.length - 1);
       /* int[] arr = {3, 5, 7, 8, 2, 6, 10, 4};
//        int[] arr = {6, 4};
        System.out.print("获取并打印数组： ");
        CommonUtils.print(arr);
        quickSort(arr, 0, arr.length - 1);*/
//        System.out.println(check(10));
    }

    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    // 第i轮循环，至少存在i个数，左边都比他小，右边都比他大
    public static void quickSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int leftPos = partition(arr, left, right);
        quickSort(arr, left, leftPos - 1);
        quickSort(arr, leftPos + 1, right);
    }

    // 分区:从左往右找到比轴元素大的数，从右往左找到比轴元素大的数，两两交换，最后把轴元素放到左元素右侧
    public static int partition(int[] arr, int left, int right){
        int leftPos = left; // 左下标
        int rightPos = right - 1;   // 右下标
        int pivot = arr[right]; // 取最右边的数为轴元素
        while(leftPos < rightPos){
//            System.out.println("leftPos is :" + leftPos + ", rightPos is :" + rightPos);
            while(arr[leftPos] <= pivot && leftPos <= rightPos){    // 如果元素小于轴元素，那么指针往右移动
                leftPos ++;
            }
            while(arr[rightPos] > pivot && leftPos <= rightPos){   // 如果元素大于轴元素，那么指针往左移动
                rightPos --;
            }

            if(leftPos < rightPos) {
                CommonUtils.swap(arr, leftPos, rightPos);   // 交换
            }
//            CommonUtils.print(arr);
        }
        CommonUtils.swap(arr, leftPos, right);   // 交换
        /*if(rightPos != right - 1){ // 如果轴元素本身是最大的数（即右指针未曾移动），那么不需要交换
            CommonUtils.swap(arr, leftPos + 1, right);
        }
        if(leftPos == rightPos && arr[leftPos] > pivot){    // 如果是两位数组，那么左指针等于又指针，如果左边元素大于轴元素，那么交换位置
            CommonUtils.swap(arr, leftPos, right);
        }*/
        CommonUtils.print(arr);
        return leftPos;
    }

    public static boolean check(int checkSize){
        for(int j = 0; j < checkSize; j++) {
            int[] arr = CommonUtils.getRandomArray(10);  // 获得一个长度10000的随机数组
            int[] arr2 = new int[arr.length];
            System.arraycopy(arr, 0, arr2, 0, arr.length);  // 复制数组

            quickSort(arr);
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
