
/* public class Number implements Constant {
 float pie_value=PI;


} */

public class Number  {
 float pie_value=Constant.PI;

 public void display()
 {
	 System.out.println(pie_value);
	 int radius=4;
	 float area=pie_value*radius*radius;
	 System.out.println(area);
 }

}