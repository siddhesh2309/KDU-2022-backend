package homework5.annotation;

import homework5.Annotations;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Class annotationsAttribute = s.getClass();
        System.out.println(annotationsAttribute.getName());

        CustomAnnotation annotation = (CustomAnnotation)annotationsAttribute.getAnnotation(CustomAnnotation.class);
        System.out.println(annotation.myValue());
        System.out.println(annotation.myName());
        System.out.println(annotation.myCity());
    }
}
