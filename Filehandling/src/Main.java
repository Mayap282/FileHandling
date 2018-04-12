import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("sample.txt");
		FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String data= "";
			while(br.readLine()!= null) {
				data =  br.readLine();
			}
			
			System.out.println(data);
			String[] str = data.split(" ");
			HashMap<String, Integer> map = new HashMap<>();
			for (int i = 0; i < str.length; i++) {
				if(map.containsKey(str[i])) {
					map.put(str[i], map.get(str[i])+1);	
				}
				else
					map.put(str[i], 1);
			}
			 for(Map.Entry m:map.entrySet()){  
				 System.out.println(m.getKey()+" "+m.getValue());   
				  } 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
