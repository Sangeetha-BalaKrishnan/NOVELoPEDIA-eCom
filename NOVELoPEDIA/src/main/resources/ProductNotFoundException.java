
public class ProductNotFoundException extends Exception implements serializable{

	private String message;

	public productNotFoundException(){
		this("Product is Not Avilable !");
	}
	
	public productNotFoundException(String message){
		this.message=System.currentTimeMillis() + ": " +message;
	}
	
	public String getMessage(){
		return message;
	}

}
