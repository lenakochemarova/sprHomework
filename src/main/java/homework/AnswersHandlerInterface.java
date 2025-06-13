package homework;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;

public interface AnswersHandlerInterface {

    default Map<Integer,String> getAnswers(Path path){

        try {
            return Files.lines(path)
                    .map(string -> parseAnswer(string))
                    .collect(Collectors.toMap(
                            Answer::getTask,
                            Answer::getAnswer
                    ));
        } catch (IOException e){
            throw new UncheckedIOException(e);
        }
    }

    private Answer parseAnswer(String line){
        String[] s = line.split("-");
        return new Answer(Integer.parseInt(s[0]),s[1]);
    }

}
