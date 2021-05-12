package de.gothaer;



import static java.util.stream.Collectors.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static java.util.function.Function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestReadFile {

    public static void main(String args[]) {

        String fileName = "blindtext.txt";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream
            .collect(joining("\n"))
            .chars()
            .mapToObj(c->Character.valueOf((char)c))
            .collect(
            		groupingBy(identity(), counting())
            		)
            .forEach((k,v)->System.out.printf("Anzahl '%s' ist %s.\n",k,v));
            

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}