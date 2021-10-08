public class DocumentInvoker {

	public static void main(String[] args) {
		DocumentText documentText = new DocumentText();
		System.out.println("String atual: "+documentText.getString());
		System.out.println("Executando comando...");
		documentText.editText();
		System.out.println("String concatenada: "+documentText.getNewString());
	}

}
