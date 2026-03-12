

public class Substring {
	public static void main(String[] args) {
		String s="abcabcdf";
		String s1=" ";
		
		for(int i=0;i<s.length();i++){
			for(int j=i;j<s.length();j++){

			if(s1.indexOf(s.charAt(i))==-1){
				s1=s1+s.charAt(i);
			}else{
				break;
			}
		}if(s1.length>max){
			max = s1.length();
			System.out.println(max);
		}
			System.out.println(s1);
		}
	}
}
