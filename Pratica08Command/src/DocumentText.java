
public class DocumentText {
	
	DocumentText documentText = this;
	private String newString = "";
	
	public String getString() {
		return "Testando 1, 2, 3...";
	}
	
	public void editText() {
		executeCommand(new DocumentTextEditCommand(documentText));
	}
	
	private void executeCommand(Command command) {
		command.execute();
	}

	public String getNewString() {
		return this.newString;
	}

	public void setNewString(String concatString) {
		this.newString = concatString;
	}
	
}
