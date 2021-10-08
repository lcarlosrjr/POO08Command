
public abstract class Command {
	
	public DocumentText document;
	
	public Command(DocumentText document) {
		this.document = document;
	}
	
	
	public abstract boolean execute();

}
