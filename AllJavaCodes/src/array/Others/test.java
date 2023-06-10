//package array;
//
//import java.util.*;
//public class  test
//{
//    public static void main(String[] args) {
//        int input1 []={10,20,30,40,50};
//        int input2 [] = {10,20,30,50,60,70};
//        System.out.println(differance(input1,input2));
//
//
//    }
//
//    public static ArrayList<Integer>  differance(int input1[],int input2[]){
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list1res = new ArrayList<>();
//        for (int i =0;i<input1.length ;i++ )
//            list1.add(input1[i]);
//        ArrayList<Integer> list2 = new ArrayList<>();
//        for (int i =0;i<input2.length ;i++ )
//            list1.add(input2[i]);
//
//        int num;
//
//        if(list1.size()>list2.size()){
//           li =list1.removeAll(list2);
//            return list1;
//        }
//        else{
//            list2.removeAll(list1);
//            return list2;
//        }
//
//    }
//}
