package day1107.exam08;

public class CheckBoxExample {
	public static void main(String[] args) {

		CheckBox checkBox = new CheckBox();
		
		checkBox.setOnSelectListerer(new BackgroundChangeListener());
		checkBox.select();

	}

}
