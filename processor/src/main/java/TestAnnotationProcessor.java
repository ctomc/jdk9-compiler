import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

/**
 * @author Tomaz Cerar (c) 2016 Red Hat Inc.
 */
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class TestAnnotationProcessor extends AbstractProcessor {

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return Collections.singleton(TestAnnotation.class.getName());
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "annotation processor triggered, annotations: " + annotations);
        try {
            Class generated = Class.forName(Generated.class.getName());
        } catch (ClassNotFoundException e) {
            processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Could not load javax.annotation.Generated class");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "annotation processor completed successfully");
        return true;
    }
}
