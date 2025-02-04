package com.github.houbb.word.checker.util;

import com.github.houbb.heaven.support.instance.impl.Instances;
import com.github.houbb.word.checker.bs.impl.EnWordCheckerBs;
import com.github.houbb.word.checker.bs.impl.ZhWordCheckerBs;

import java.util.List;

/**
 * 英文拼写工具类
 * <p> project: word-checker-EnWordCheckers </p>
 * <p> create on 2020/2/6 9:37 </p>
 *
 * @author Administrator
 * @since 0.0.5
 */
public final class ZhWordCheckers {

    private ZhWordCheckers(){}

    /**
     * 单词拼写实现类
     * @since 0.0.5
     */
    private static final ZhWordCheckerBs WORD_CHECK_BS = ZhWordCheckerBs.newInstance();

    /**
     * 单词拼写是否正确
     * @param word 单词
     * @return 是否正确
     * @since 0.0.5
     */
    public static boolean isCorrect(String word) {
        return WORD_CHECK_BS.isCorrect(word);
    }

    /**
     * 最佳纠正结果
     * @param word 单词
     * @return 纠正结果
     * @since 0.0.5
     */
    public static String correct(String word) {
        return WORD_CHECK_BS.correct(word);
    }

    /**
     * 指定个数纠正列表结果
     * @param word 单词
     * @param limit 限制个数
     * @return 纠正结果
     * @since 0.0.5
     */
    public static List<String> correctList(String word, int limit) {
        return WORD_CHECK_BS.correctList(word, limit);
    }

    /**
     * 全部纠正列表结果
     * @param word 单词
     * @return 纠正结果
     * @since 0.0.5
     */
    public static List<String> correctList(String word) {
        return WORD_CHECK_BS.correctList(word);
    }

}
