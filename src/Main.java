import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        String filePath = "./data/pg6130.pdf";

        try {
            PDDocument document = Loader.loadPDF(new File(filePath));

            // Instantiate PDFTextStripper class
            PDFTextStripper pdfStripper = new PDFTextStripper();

            // Retrieving text from PDF document
            String text = pdfStripper.getText(document);
            System.out.println(text);

            // Closing the document
            document.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}