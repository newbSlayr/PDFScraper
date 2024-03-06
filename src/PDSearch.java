import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.Loader;

import java.io.File;
import java.io.IOException;

public class PDSearch {

    public void findTextInPDF(String filePath) {
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
            System.err.println("Error during text search in PDF: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
