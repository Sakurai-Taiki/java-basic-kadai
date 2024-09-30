package kadai_021;

import java.util.HashMap;
public class Dictionary_Chapter21 {

	//英単語の辞書として機能する
		private HashMap<String,String> dictionaryMap;
		
		public Dictionary_Chapter21() {
			dictionaryMap = new HashMap<>();
			tuika();
		}
		
		//辞書に単語を追加するメソッド
		public void tuika() {
		dictionaryMap.put("apple", "りんご");
		dictionaryMap.put("peach", "桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear", "梨");
		dictionaryMap.put("kiwi", "キウィ");
		dictionaryMap.put("strawberry", "いちご");
		dictionaryMap.put("grape", "ぶどう");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
		
		}
		
		//検索メソッド
		public void searchWords(String[] words) {
			for(String word : words) {
			if (dictionaryMap.containsKey(word)) {
				System.out.println(word + "の意味は" + dictionaryMap.get(word) + "です");
			} else {
				System.out.println(word + "は辞書に存在しません");
		}		
	}
}
}