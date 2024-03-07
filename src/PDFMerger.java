import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.Loader;

import java.io.File;
import java.io.IOException;

public class PDFMerger {

    public void mergePDFs(String firstPath, String secondPath) {
            String[] words = firstPath.split(" ");
            String firstWord = words[0];
            String outputFileName = firstWord+" Resume.pdf";

            File firstFile = new File("./Data/"+firstPath+ ".pdf");
            File secondFile = new File("./Data/"+secondPath+ ".pdf");
            File mergedFile = new File ("./Data/"+outputFileName);

        System.out.println("Merging files:");
        System.out.println("First file path: " + firstFile.getAbsolutePath());
        System.out.println("Second file path: " + secondFile.getAbsolutePath());
        System.out.println("Merged file will be saved to: " + mergedFile.getAbsolutePath());


        PDFMergerUtility merger = new PDFMergerUtility();

        merger.setDestinationFileName(mergedFile.getAbsolutePath());

        try {
            // Add the documents to be merged
            merger.addSource(firstFile);
            merger.addSource(secondFile);

            // Merge documents
            merger.mergeDocuments(null);
            System.out.println("PDFs merged successfully: " + mergedFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error during PDF merge: " + e.getMessage());
            e.printStackTrace();
        }
    }

}

