package polymorphismDemo;

public class CustomerManager {
	private BaseLogger _logger;
	
	public CustomerManager(BaseLogger logger) {
		_logger = logger;
	}
	public void add() {
		System.out.println("M��teri Eklendi.");
		_logger.log("Log Mesaj�");
	}
}
