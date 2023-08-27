package week3.day1;

public class Automation extends MultipleLangauge implements Language,TestTool {



	public static void main(String[] args) {
	
	Automation now=new Automation();	
	
	now.Java();
	now.python();
	now.Selenium();
	now.ruby();
	}

	public void Java() {
		System.out.println("print Java");
		
	}

	@Override
	public void ruby() {
	System.out.println("print ruby");
		
	}

	public void Selenium() {
		
		System.out.println("print selenium");
	}
}
