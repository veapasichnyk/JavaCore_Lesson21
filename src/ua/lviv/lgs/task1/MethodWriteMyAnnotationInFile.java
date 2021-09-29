package ua.lviv.lgs.task1;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class MethodWriteMyAnnotationInFile {

    public static List <String> getAnnotationValues ( Class<?> customClass ) {

        List<String> annotationValues = new ArrayList <String> ();

        Field[] classFields = customClass.getDeclaredFields ( );

        for (int i = 0; i < classFields.length; i++) {
            Field field = classFields[i];

            if (field.getAnnotation(MyAnnotation.class) instanceof MyAnnotation) {
                annotationValues.add(field.getType().getSimpleName() + " " + field.getName() + " ---> "
                                     + field.getAnnotation(MyAnnotation.class).purpose ());
            }
        }

        return annotationValues;
    }

    public static void writeObjectToFile (Object object, File file ) throws IOException {
        OutputStream       os  = new FileOutputStream ( file);
        ObjectOutputStream oos = new ObjectOutputStream( os);
        oos.writeObject(object);
        oos.close();
        os.close();
    }

    public static void writeListItemsToFile(List<String> list, File file) throws IOException {
        Files.write ( file.toPath ( ), list );
    }

}
