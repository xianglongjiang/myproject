package com.dana.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数字与字母转换工具类
 *
 * @author xianglongjiang
 * @since 2020/2/14 11:38
 */
public class NumberUtil {

    /**
     * 数字转换成字母
     */
    public static String numbersToLetters(int... numbers) {

        String result = "";
        for (int i : numbers) {
            result = oneNumberToLetters(i, result);
        }

        return result;
    }

    /**
     * 单个数字转换
     */
    private static String oneNumberToLetters(int i, String oldStr) {
        String[] items = oldStr.split(" ");

        List<String> strs = Arrays.asList(getLetters(i));

        if (strs.isEmpty()) {
            return oldStr;
        }

        List<String> newStrs = new ArrayList<>();
        if (items.length == 0) {
            newStrs = strs;
        }else {
            for (String item : items) {
                for (String str : strs) {
                    String newItem = item + str;
                    newStrs.add(newItem);
                }
            }
        }

        String result = "";
        for (String item : newStrs) {
            if (!"".equals(result)){
                result = result + " " + item;
            }else {
                result = result + item;
            }

        }

        return result;
    }

    private static String[] getLetters(int i) {

        String[] strs;
        switch (i) {
            case 0:
                strs = new String[]{};
                break;
            case 1:
                strs = new String[]{};
                break;
            case 2:
                strs = new String[]{"a", "b", "c"};
                break;
            case 3:
                strs = new String[]{"d", "e", "f"};
                break;
            case 4:
                strs = new String[]{"g", "h", "i"};
                break;
            case 5:
                strs = new String[]{"j", "k", "l"};
                break;
            case 6:
                strs = new String[]{"m", "n", "o"};
                break;
            case 7:
                strs = new String[]{"p", "q", "r", "s"};
                break;
            case 8:
                strs = new String[]{"t", "u", "v"};
                break;
            case 9:
                strs = new String[]{"w", "x", "y", "z"};
                break;
            default:
                strs = new String[]{};
                break;
        }
        return strs;
    }

}
