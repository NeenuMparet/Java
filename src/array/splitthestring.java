package array;

public class splitthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s3="Selenium webdriver is used for webapplication testing";
		String sr[] = s3.split(" ");
		for(String v:sr) {
			System.out.println(v);
			if(v.contains("webapplication"))
			{
				break;
			}
					
		}

	}

}
