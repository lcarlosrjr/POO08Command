
public class DocumentTextEditCommand extends Command {

	public DocumentTextEditCommand(DocumentText document) {
		super(document);
	}
	
	
	public String concatString(String string) {
		String initalString = string;
		String newString = "Opa, deu certo!";
		return initalString + newString;
	}
	

	@Override
	public boolean execute() {
		//Apenas umas condição qualquer para que seja executado
		if(document.getString().length() < 50){
			document.setNewString(concatString(document.getString()));
			return true;
		} else {
			return false;
		}
	}

}
