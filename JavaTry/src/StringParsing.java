
public class StringParsing {
	public static void main(String[] args){
		String ICCoutput = "miniplayer/onlineActitivy/onOptionSelected(Landroid/View/Menu);";
		System.out.println(parsingMethodName(ICCoutput));
		System.out.println(getMethodName(ICCoutput));
	}
	
	public static String parsingMethodName(String name) {
		int branketIndex = name.indexOf('(');
		name = name.substring(0, branketIndex);
		int slashIndex = name.lastIndexOf('/');
		String temp = name.substring(0, slashIndex);
		int secondSlashIndex = temp.lastIndexOf('/');
		name = name.substring(secondSlashIndex + 1, slashIndex);
		int dollarIndex = name.indexOf('$');
		if (dollarIndex != -1)
			name = name.substring(0, dollarIndex);
		return name;
	}
	
	public static String getMethodName(String name){
		int branketIndex = name.indexOf('(');
		name = name.substring(0, branketIndex);
		int slashIndex = name.lastIndexOf('/');
		name = name.substring(slashIndex + 1);
		return name;
	}
}
