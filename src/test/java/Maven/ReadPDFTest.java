package Maven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class ReadPDFTest {
	public static void main(String[] args) throws IOException, SAXException, TikaException {
		BodyContentHandler contenthandle = new BodyContentHandler();
		FileInputStream fis = new FileInputStream("./src/test/resources/Data/Yashwanth_BE_2021.pdf");
		Metadata metadata = new Metadata();
		ParseContext parsecontext = new ParseContext();
		PDFParser parse = new PDFParser();
		parse.parse(fis, contenthandle, metadata, parsecontext);
		System.out.println(contenthandle.toString());

	}
}
