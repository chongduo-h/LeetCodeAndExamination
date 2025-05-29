package forwork;

import java.util.ArrayList;
import java.util.List;

public class 查找包含给定字符的单词{

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        // 遍历每个单词
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            // 判断单词是否包含字符x
            if(word.contains(String.valueOf(x))){
                // 如果包含，则将单词的索引添加到结果列表中
                result.add(i);
            }
        }
        // 返回包含字符x的单词的索引列表
        return result;
    }
    
}
