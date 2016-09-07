import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Dicionario {
	public void adicionarPalavra(String palavra1, String palavra2) throws IOException{
		BufferedWriter bw = null;
		try {
			OutputStream os = new FileOutputStream("/home/gressler/dicionario.txt",true);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.append(palavra1.toLowerCase()+" -> "+palavra2.toLowerCase());
			bw.newLine();
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir arquivo! "+ e.getMessage());
			e.printStackTrace();
		} finally {
			if(bw!=null)
				bw.close();
		}
	}
	
	public String recuperaPalavra(String palavra) throws IOException{
		String dicionario[];
	    InputStream is = new FileInputStream("/home/gressler/dicionario.txt");
	    InputStreamReader isr = new InputStreamReader(is);
	    BufferedReader br = new BufferedReader(isr);
	    String s = br.readLine();
	    while(s!=null){
	    	dicionario = s.split(" -> ");
	    	if(dicionario[0].equals(palavra.toLowerCase())){
	    		br.close();
	    		return dicionario[1];
	    	}
	    	s = br.readLine();
	    }
	    br.close();
		return palavra;
	}
}
