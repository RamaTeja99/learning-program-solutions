public class FactoryMethodTest {
  public static void main(String[] args){
    DocumentFactory excelFactory = new ExcelDocumentFactory();
    Document excelDocument = excelFactory.createDocument();
    excelDocument.open();

    DocumentFactory pdfFactory = new PdfDocumentFactory();
    Document pdfDocument = pdfFactory.createDocument();
    pdfDocument.open();

    DocumentFactory wordFactory = new WordDocumentFactory();
    Document wordDocument = wordFactory.createDocument();
    wordDocument.open();
  }
}
