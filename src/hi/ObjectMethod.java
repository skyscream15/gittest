package hi;

class AAA {

}

public class ObjectMethod {
	public static void main(String args[]) {
		AAA aa = new AAA();
		System.out.println("�� ��ü�� ����? " + aa.equals(aa));
		System.out.println("aa ��ü Ŭ������ �̸���? " + aa.getClass());
		System.out.println("aa ��ü�� hash code��? " + aa.hashCode());
		System.out.println("aa ��ü�� ǥ���ϴ� �⺻ ���ڿ���? " + aa.toString());
		System.out.println("aa ��ü�� ǥ���ϴ� �⺻ ���ڿ� �����? " + aa);
	}
}