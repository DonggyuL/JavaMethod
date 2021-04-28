//String으로 입력받아서 double형 숫자로 변환
public static double String2Double (String input)
{
	double num = 0;
	for(int i = 0; i < input.length(); i++) num += (input.charAt(i)-'0')*(Math.pow(10,input.length()-i-1));
    	return num;
}
또는
int to = Integer.parseInt(from);

//int형을 String형으로 변환
String to = Integer.toString(from);