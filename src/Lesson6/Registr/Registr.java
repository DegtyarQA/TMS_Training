package Lesson6.Registr;

import Lesson6.Documents.DocumentAll;

import java.util.Arrays;
import java.util.Scanner;

public class Registr {
    private DocumentAll[] arrayDoc = new DocumentAll[10];
    private int size_registr = 0;

    public void addToRegister(DocumentAll documentAll) {
        for (int i = 0; i < arrayDoc.length; i++) {
            arrayDoc[i] = documentAll;
            size_registr = size_registr + 1;
            break;
        }
        System.out.println(Arrays.deepToString(arrayDoc));
    }
    public void infodoc(int docnum) {
        for (int j=0; j<arrayDoc.length; j++){
            if (arrayDoc[j].getType() == docnum){
                System.out.println("k");
            }
        }

    }
}

