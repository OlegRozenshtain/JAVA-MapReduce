package lesson4.day4_code_examples;

public class Invoice implements Printable {

	String header;
	String invoiceDetails;
	String footer;
	
	public Invoice ( String header, String invoiceDetails, String footer ) {
		
		this.header = header;
		this.invoiceDetails = invoiceDetails;
		this.footer = footer;
	}
		
	@Override
	public void print() {
		
		System.out.println( header + "\n" +
							invoiceDetails + "\n" + 
							footer );		
	}
}
