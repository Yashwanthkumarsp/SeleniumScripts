package Maven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class ReadPDF {
	public static void main(String[] args) throws IOException, SAXException, TikaException {
//		BodyContentHandler contenthandle = new BodyContentHandler();
//		FileInputStream fis = new FileInputStream("./src/test/resources/Data/Yashwanth_BE_2021.pdf");
//		Metadata metadata = new Metadata();
//		ParseContext parsecontext = new ParseContext();
//		PDFParser parse = new PDFParser();
//		parse.parse(fis, contenthandle, metadata, parsecontext);
//		System.out.println(contenthandle.toString());
		BodyContentHandler handler=new BodyContentHandler();
		FileInputStream fs=new FileInputStream("./src/test/resources/Data/Yashwanth_BE_2021.pdf");
		Metadata mt=new Metadata();
		ParseContext pc=new ParseContext();
		PDFParser parser=new PDFParser();
		parser.parse(fs, handler, mt, pc);
		System.out.println(handler.toString());
		
		
		
		
	}
}
