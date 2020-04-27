package cc.white.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/20
 *     time   : 21:36
 *     desc   : https://leetcode-cn.com/problems/pascals-triangle-ii/description/
 * </pre>
 */
public class PascalTriangle2 {
    public static void main(String[] args) {
        List<Integer> row = getRow(3);
        for (Integer aRow : row) {
            System.out.print(aRow + " ");
        }
    }

    /**
     * 给定一个索引 k，返回帕斯卡三角形（杨辉三角）的第 k 行。
     * <p>
     * 例如，给定 k = 3，
     * <p>
     * 则返回 [1, 3, 3, 1]。
     *
     * @param rowIndex
     * @return
     */
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            result.add(1);
            // 每一行的数据
            for (int j = i - 1; j > 0; j--) {
                // 中间是上一行对应的索引与前一个值的和
                result.set(j, result.get(j - 1) + result.get(j));
            }
        }
        return result;
    }
}

