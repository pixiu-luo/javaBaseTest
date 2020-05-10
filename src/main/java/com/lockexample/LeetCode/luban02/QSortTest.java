package com.lockexample.LeetCode.luban02;

/**
 * 快速排序.
 */
public class QSortTest {

    public static void main(String[] args) {
        int data[] = {45, 28, 80, 90, 50, 16, 100, 10};
        sort(data, 0, data.length - 1);
        sprint(data);
    }

    public static void sprint(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int data[], int left, int right) {

        int ll = left;
        int rl = right;
        int base = data[right]; //选择从哪个作为基准 影响下面是从头 还是从尾

        while (ll < rl) {

            //头
            while (ll < rl && data[ll] <= base) {
                ll++;
            }
            if (ll < rl) {
                int temp = data[rl];
                data[rl] = data[ll];
                data[ll] = temp;
                rl--;
            }

            //尾
            while (ll < rl && data[rl] > base) {
                rl--;
            }
            if (rl > ll) {
                int temp = data[rl];
                data[rl] = data[ll];
                data[ll] = temp;
                ll++;
            }
        }

        if (ll > left) {
            sort(data, left, ll - 1);
        }
        if (rl < right) {
            sort(data, ll + 1, right);
        }
    }

}
