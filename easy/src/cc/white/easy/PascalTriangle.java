package cc.white.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <pre>
 *     @author : Wh1te
 *     e-mail : white.hcj@gmail.com
 *     date   : 2018/03/20
 *     time   : 21:24
 *     desc   : https://leetcode-cn.com/problems/pascals-triangle/description/
 * </pre>
 */
public class PascalTriangle {

    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);
        for (List<Integer> line : result) {
            for (Integer i : line) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    /**
     * 给定 numRows, 生成帕斯卡三角形的前 numRows 行。
     *
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            // 每一行的数据
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    // 首尾都是 1
                    line.add(1);
                } else {
                    // 中间是上一行对应的索引与前一个值的和
                    List<Integer> upLine = result.get(i - 1);
                    line.add(upLine.get(j - 1) + upLine.get(j));
                }
            }
            result.add(line);
        }
        return result;
    }
}
