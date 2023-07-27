package Lesson6.Registr;

import Lesson6.Documents.DocumentAll;

import java.util.Arrays;

public class Registr {
    private DocumentAll[] arrayDoc = new DocumentAll[10];
    private int size_registr = 0;
    private int i = 0;

    public void addToRegister(DocumentAll documentAll) {
        arrayDoc[i] = documentAll;
        i++;
        System.out.println(Arrays.deepToString(arrayDoc));
    }

    public void infoDoc(int docnum) {
        for (int j = 0; j < arrayDoc.length; j++) {
            if (arrayDoc[j].getType() == docnum) {
                System.out.println(arrayDoc[j]); //Как вывести?
            }
        }
    }
}
