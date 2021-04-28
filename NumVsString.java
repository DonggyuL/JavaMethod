//String으로 입력받아서 double형 숫자로 변환
int to = Integer.parseInt(from);
//구현방법
public static double String2Double (String input)
{
	double num = 0;
	for(int i = 0; i < input.length(); i++) num += (input.charAt(i)-'0')*(Math.pow(10,input.length()-i-1));
    	return num;
}


//int형을 String형으로 변환
String to = Integer.toString(from);
//구현방법
public static String Ten2Base(int input)
    {
        String result = "";
        int count = 0;
        int quotient = input;
        
        do
        {
        	quotient /= 10;
        	count ++;
        } while(quotient != 0);
        char[] num = new char [count];
        for (int i = 0; i < count; i++)
        {
        	int k = input % 10;
        	num[i] = (char) ('0' + k);
        	result_10 /= base;
        }
        for (int i = count-1; i >=0 ; i--) result+= num[i];
        return result;
    }
