
public class test_two_dimo_array{
public static void main(String[] args) {
 int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}};
 System.out.println(m1(array)[0]);
 System.out.println(m1(array)[1]);
 System.out.println(m1(array)[2]);
 }
 public static int[] m1(int[][] m) {
int[] result = new int[4];
 result[0] = m.length;
 result[1] = m[0].length;
 result[2] = m[1]. length;
return result;
 }

}
