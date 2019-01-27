package fileIOS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class ReadWriteFiles {
	
	final static String FILE_NAME = "E:\\TaskExamples\\multicast.txt";
	final static String OUTPUT_FILE_NAME = "E:\\TaskExamples\\empty.txt";
	final static Charset ENCODING = StandardCharsets.UTF_8;
	
	void readFile(String fileName) throws IOException{
		Path path = Paths.get(fileName);
		try(BufferedReader reader = Files.newBufferedReader(path, ENCODING)){
			String line = null;
			while((line = reader.readLine())!= null){
				log(line);
			}
		}
	}
	void writeFile(String fileName, List<String> lines) throws IOException{
		Path path = Paths.get(fileName);
		try(BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)){
			for(String line:lines){
				writer.write(line);
				writer.newLine();
			}
		}
	}
	
	private static void log(Object msg){
		System.out.println(String.valueOf(msg));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadWriteFiles text = new ReadWriteFiles();
		
		text.readFile(FILE_NAME);
		List<String> lines = Arrays.asList("Open file and check", "This must be line 2 in txt file");
		text.writeFile(OUTPUT_FILE_NAME, lines);
	}
	

}
