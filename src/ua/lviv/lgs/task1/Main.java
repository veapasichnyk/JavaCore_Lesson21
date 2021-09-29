package ua.lviv.lgs.task1;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main (String[] args) throws IOException {
        List <String> annotationValuesList = MethodWriteMyAnnotationInFile.getAnnotationValues ( Book.class );

        for (String str : annotationValuesList) {
            System.out.println(str);
        }

        MethodWriteMyAnnotationInFile.writeObjectToFile (annotationValuesList, new File ( "MyAnnotation.obj") );
        MethodWriteMyAnnotationInFile.writeListItemsToFile(annotationValuesList, new File("MyAnnotation.txt"));
    }
}
