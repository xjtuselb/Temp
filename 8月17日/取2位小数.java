package 经典算法;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class 取2位小数 {

	public static void main(String[] args) {
		double x = 432.2967324;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(x));

		BigDecimal bd = new BigDecimal("432.2967");
		System.out.println(bd.setScale(2, BigDecimal.ROUND_HALF_UP));
	}

}
