package org.group1;

import org.jbibtex.ParseException;

import java.io.File;
import java.io.FileNotFoundException;

public class GUI {
    static BibTeXLibrary library;
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File file1 = new File(
                GUI.class.getClassLoader().getResource("java2.bib").getFile()
        );
        library =  BibTeXUtil.parse(file1);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new j2().setVisible(true);
            }
        });
    }
    
}
