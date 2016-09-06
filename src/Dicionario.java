import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	public Map<String,String> dic = new HashMap<>();
	public void adicionarPalavra(String palavra1, String palavra2){
		dic.put(palavra1, palavra2);
	}
	public String recuperaPalavra(String palavra){
		if(dic.containsKey(palavra))
			return dic.get(palavra);
		return null;
	}
}
