package Lesson6.Registr;

import Lesson6.Documents.DocumentAll;

import java.util.Arrays;

public class Registr {
    private DocumentAll[] arrayDoc = new DocumentAll[10];
    private int size_registr = 0;
    private int typedoc;

    public void addToRegister(DocumentAll documentAll) {
        for (int i = 0; i < arrayDoc.length; i++) {
            arrayDoc[i] = documentAll;
            size_registr = size_registr + 1;
        }
        System.out.println(Arrays.deepToString(arrayDoc));
    }

    public void infodoc(DocumentAll arrayDoc[i])
}

