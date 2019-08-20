/**
 * @author:WandDeKai
 * @date:Created in 2019/8/18
 * @param: arr 数组   key 关键字    low  最小值   high  最大值
 * @description:
 * @version:1.0
 */
public class ErFen {
    public static int recursionBinarySearch(int[] arr,int key,int low,int high){

        if(key < arr[low] || key > arr[high] || low > high){
            return -1;
        }

        int middle = (low + high) / 2;			//初始中间位置
        if(arr[middle] > key){
            //比关键字大则关键左字在区域
            return recursionBinarySearch(arr, key, low, middle - 1);
        }else if(arr[middle] < key){
            //比关键字小则关键字在右区域
            return recursionBinarySearch(arr, key, middle + 1, high);
        }else {
            return middle;
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,3,5,9,7,11};
        int key = 7;
        int position = recursionBinarySearch(arr,key,0,arr.length - 1);

        //int position = commonBinarySearch(arr, key);
        if(position == -1){
            System.out.println("查找的是"+key+",序列中没有该数！");
        }else{
            System.out.println("查找的是"+key+",找到位置为："+position);
        }
    }
}
