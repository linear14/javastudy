package ch16_stream.ex2_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("src/ch16_stream/todoweek");
		Stream<String> stream;
		
		// Files.lines()
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out::println);
		System.out.println();
		
		// BufferedReader�� lines() �޼���
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		
		stream = br.lines();
		stream.forEach(System.out::println);

	}

}
