package practice;
import java.util.Scanner;
public class SetersandGetter {
	public static void main(String[] args) {
		String varName,dataType;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Date Type");
		dataType=sc.next().trim();
		System.out.println("enter a variable name");
		varName=sc.next().trim();
	    System.out.println(GetterAndSetters(dataType,varName));
	}
	public static String GetterAndSetters(String dataType,String varName){
		String getter =
                "\tpublic " + dataType + " get" + Character.toUpperCase(varName.charAt(0)) + varName.substring(1) +
                        "() {\n\t\treturn " + varName + ";\n\t}";
		 String setter = "\tpublic void set" + Character.toUpperCase(varName.charAt(0)) + varName.substring(1) +
	                "(" + dataType + " " + varName + ") {\n\t\tthis." + varName + " = " + varName + ";\n\t}";
	     return getter+ "/n/n" +setter;
	}
}
