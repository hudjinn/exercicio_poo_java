import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	
		Memorando meuMemorando = new Memorando();
		
		Scanner meuTc = new Scanner (System.in);
		
		System.out.println("Escreva o assunto: ");
		String assunto = meuTc.next();
		
		System.out.println("Destinatário: ");
		String destinatario = meuTc.next();
		
		System.out.println("Signatário: ");
		String signatário = meuTc.next();
		
		System.out.println("Número do documento: ");
		int numDocumento = meuTc.nextInt();
		
		System.out.println("Ano do documento: ");
		int anoDocumento = meuTc.nextInt();
		
		System.out.println("Quantidade de páginas: ");
		int numeroDePaginas = meuTc.nextInt();
		
	
		meuMemorando.setAssunto(assunto);
		meuMemorando.setDestinatario(destinatario);
		meuMemorando.setSignatario(signatário);
		meuMemorando.setNumDocumento(numDocumento);
		meuMemorando.setAnoDocumento(anoDocumento);
		meuMemorando.setNumeroDePaginas(numeroDePaginas);
		
		System.out.println("\n===================E-MAIL====================\n");
		System.out.println("Assunto: " + meuMemorando.getAssunto());
		System.out.println("Destinatário: " + meuMemorando.getDestinatario());
		System.out.println("Signatario: " + meuMemorando.getSignatario());
		System.out.println("Número do documento: " + meuMemorando.getNumDocumento());
		System.out.println("Ano do documento: " + meuMemorando.getAnoDocumento());
		System.out.println("Quantidade de páginas: " + meuMemorando.getNumeroDePaginas());
		

	}

}
