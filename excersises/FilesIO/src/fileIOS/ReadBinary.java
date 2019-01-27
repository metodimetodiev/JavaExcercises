package fileIOS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadBinary {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadBinary binary = new ReadBinary();
		byte[] bytes = binary.readBinFile(FILE_NAME);
		log("size of file  read in " + bytes.length);
		binary.writeBinFile(bytes, OUTPUT_NAME);

	}

	final static String FILE_NAME = "E:\\TaskExamples\\java.png";
	final static String OUTPUT_NAME = "E:\\TaskExamples\\newJava.png";

	byte[] readBinFile(String fileName) throws IOException {
		Path path = Paths.get(fileName);
		return Files.readAllBytes(path);
	}

	void writeBinFile(byte[] bytes, String fileName) throws IOException {
		Path path = Paths.get(fileName);
		Files.write(path, bytes);
	}

	private static void log(Object msg) {
		System.out.println(String.valueOf(msg));
	}

}
