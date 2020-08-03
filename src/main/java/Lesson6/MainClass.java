package Lesson6;

import java.util.Arrays;

public class MainClass {
/*
    public static void main(String[] args) {
        int[] a1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        System.out.println(Arrays.toString(method1(a1)));
    }
*/

    public int[] method1(int[] inputArr){
        int[] result = null;
        int pos4 = -1;
        for(int i = 0; i < inputArr.length;i++){
            if(inputArr[i] == 4){
                pos4 = i;
            }
        }
        if(pos4 == -1){
            throw(new RuntimeException("Массив не содержит числа 4!"));
        }
        if(inputArr.length - pos4 - 1 > 0){
            result = new int[inputArr.length - pos4 - 1];
            System.arraycopy(inputArr,pos4+1,result,0,inputArr.length - pos4 - 1);
        }
        return result;
    }

    public boolean method2(int[] inputArr){
        if(inputArr.length == 0){
            return false;
        }
        for (int i = 0; i < inputArr.length; i++){
            if(inputArr[i] != 1 && inputArr[i] != 4 ){
                return false;
            }
        }
        return true;
    }
}

