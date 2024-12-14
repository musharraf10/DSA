import java.util.Arrays;
public class MergeWithoutExtraSpace {
    public static void merge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int gap = (n + m) / 2 + (n + m) % 2; 
        while (gap > 0) {
            int i = 0;
            int j = gap;
            while (j < n + m) {
                if (j < n) {
                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                } else if (i < n) {
                    if (a[i] > b[j - n]) {
                        int temp = a[i];
                        a[i] = b[j - n];
                        b[j - n] = temp;
                    }
                } else {
                    if (b[i - n] > b[j - n]) {
                        int temp = b[i - n];
                        b[i - n] = b[j - n];
                        b[j - n] = temp;
                    }
                }
                i++;
                j++;
            }

            // Reduce the gap
            if (gap == 1) {
                gap = 0; 
            } else {
                gap = (gap / 2) + (gap % 2);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 7, 10};
        int[] b = {2, 3};

        merge(a, b);

        System.out.println("Array a:");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Array b:");
        for (int x : b) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}