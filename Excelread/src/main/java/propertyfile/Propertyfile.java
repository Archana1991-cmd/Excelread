package propertyfile;

public class Propertyfile {
	public static void main(String[] args) throws IOException {

		FileReader f= new FileReader("C:\\Users\\lenovo\\git\\Excelread\\Excelread\\src\\main\\resources\\login.properties");
		Properties p= new Properties();

		p.load(f);

		System.out.println(p.getProperty("username"));

		System.out.println(p.getProperty("password"));

}
