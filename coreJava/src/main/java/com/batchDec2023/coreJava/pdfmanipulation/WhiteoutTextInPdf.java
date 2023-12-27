package com.batchDec2023.coreJava.pdfmanipulation;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class WhiteoutTextInPdf {

    public static void main(String[] args) {
        String inputFile = "/Users/abhisheksharma/Desktop/55486-0_shared-transfers-with-breakfast_87.pdf";
        String outputFile = "/Users/abhisheksharma/Desktop/updated.pdf";

        try {
            whiteoutTextInPdf(inputFile, outputFile, "abhishek.sharma@tripfactory.com");
            System.out.println("Text whiteout successful. Output saved to " + outputFile);
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }

    private static void whiteoutTextInPdf(String inputFilePath, String outputFilePath, String textToWhiteout)
            throws IOException, DocumentException {
        PdfReader reader = null;
        Document document = null;

        try {
            reader = new PdfReader(inputFilePath);
            document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(outputFilePath));
            document.open();

            int totalNumberOfPages = reader.getNumberOfPages();
            Rectangle pageSize;

            for (int i = 1; i <= totalNumberOfPages; i++) {
                document.setPageSize(pageSize = reader.getPageSize(i));
                document.newPage();

                PdfContentByte content = writer.getDirectContent();
                content.addTemplate(writer.getImportedPage(reader, i), 0, 0);

                // Whiteout specific text on the page
                whiteoutText(content, pageSize, textToWhiteout, 36, 700);
            }
        } finally {
            if (document != null) {
                document.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

    private static void whiteoutText(PdfContentByte content, Rectangle pageSize, String text, float x, float y) {
        content.setColorFill(BaseColor.WHITE);
        content.rectangle(x, pageSize.getHeight() - y, 100, 12); // Adjust the rectangle size as needed
        content.fill();
    }
}
