package fileIOS;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class RemoveTreeDir {

	void rmDirWithStreams(Path dir) throws IOException{
		if(shouldDelete(dir)){
			try(Stream<Path> paths = Files.walk(dir)){
				paths
					.map(Path::toFile)
					.sorted(Comparator.reverseOrder())
					.forEach(File::delete);
			}
		}
	}
	
	private boolean shouldDelete(Path dir){
		return dir.toFile().exists() && dir.toFile().isDirectory();
	}
	
	private static void log(Object thing){
		System.out.println(Objects.toString(thing));
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RemoveTreeDir rtd =  new RemoveTreeDir();
		String dirDel = "E:\\TaskExamples\\Try";
		rtd.rmDirWithStreams(Paths.get(dirDel));
		log("done");
	}

}
