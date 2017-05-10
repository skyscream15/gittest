package hi;

class AAA {

}

public class ObjectMethod {
	public static void main(String args[]) {
		AAA aa = new AAA();
		System.out.println("두 객체가 같나? " + aa.equals(aa));
		System.out.println("aa 객체 클래스의 이름은? " + aa.getClass());
		System.out.println("aa 객체의 hash code는? " + aa.hashCode());
		System.out.println("aa 객체를 표현하는 기본 문자열은? " + aa.toString());
		System.out.println("aa 객체를 표현하는 기본 문자열 양식은? " + aa);
	}
}