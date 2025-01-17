package com.macro.mall.tiny.util.hutool.DFA查找;

import java.util.List;

import cn.hutool.dfa.WordTree;
import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName DFATest
 * @Author WB-918966
 * @Date 2022/10/21 16:15
 * @Version 1.0
 **/
public class DFATest {
    @Test
    /**
     * 用所有关键字构造一棵树，然后用正文遍历这棵树，遍历到叶子节点即表示文章中存在这个关键字。
     * 每次查找正文只需要O(n)复杂度就可以搞定。
     */
    public void test(){
        WordTree tree = new WordTree();
        tree.addWord("大");
        tree.addWord("大土豆");
        tree.addWord("土豆");
        tree.addWord("刚出锅");
        tree.addWord("出锅");
        //正文
        String text = "我有一颗大土豆，刚出锅的";
        // 匹配到【大】，就不再继续匹配了，因此【大土豆】不匹配
        // 匹配到【刚出锅】，就跳过这三个字了，因此【出锅】不匹配（由于刚首先被匹配，因此长的被匹配，最短匹配只针对第一个字相同选最短）
        List<String> matchAll = tree.matchAll(text, -1, false, false);
        Assert.assertEquals(matchAll.toString(), "[大, 土豆, 刚出锅]");
        // 【大】被匹配，最短匹配原则【大土豆】被跳过，【土豆继续被匹配】
        // 【刚出锅】被匹配，由于不跳过已经匹配的词，【出锅】被匹配
        matchAll = tree.matchAll(text, -1, true, false);
        Assert.assertEquals(matchAll.toString(), "[大, 土豆, 刚出锅, 出锅]");
        // 匹配到【大】，由于到最长匹配，因此【大土豆】接着被匹配
        // 由于【大土豆】被匹配，【土豆】被跳过，由于【刚出锅】被匹配，【出锅】被跳过
        matchAll = tree.matchAll(text, -1, false, true);
        Assert.assertEquals(matchAll.toString(), "[大, 大土豆, 刚出锅]");
        // 匹配到【大】，由于到最长匹配，因此【大土豆】接着被匹配，由于不跳过已经匹配的关键词，土豆继续被匹配
        // 【刚出锅】被匹配，由于不跳过已经匹配的词，【出锅】被匹配
        matchAll = tree.matchAll(text, -1, true, true);
        Assert.assertEquals(matchAll.toString(), "[大, 大土豆, 土豆, 刚出锅, 出锅]");
    }
}
