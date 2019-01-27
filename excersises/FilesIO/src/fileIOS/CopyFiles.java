package fileIOS;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path FROM = Paths.get("E:\\TaskExamples\\multicast.txt");	
		Path TO = Paths.get("E:\\TaskExamples\\empty.txt");
		
		CopyOption[] options = new CopyOption[]{
				StandardCopyOption.REPLACE_EXISTING,
				StandardCopyOption.COPY_ATTRIBUTES
		};
		Files.copy(FROM, TO, options);
		
	}

}
