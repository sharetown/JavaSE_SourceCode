
package cn.tedu.hello2;

/**
 * ����������ֵ
 * 
 * @author Administrator
 *
 */
public class Test_Exchange {
	public static void main(String[] args) {
		// 1���������a
		int aa = 1;
		// 2���������b
		int bb = 2;
		System.out.println("����ǰ��a=" + aa + ",b=" + bb);
		// 3���������c
		int cc;
		// 4������������ֵ
		cc = aa;
		aa = bb;
		bb = cc;
		// 5����ӡ������ֵ

		// �����ķ�ʽ��������ʱ����ʵ�ֱ�����ֵ������
		System.out.println("������aa=" + aa + ",bb=" + bb);
		int m = 0;
		int n = 1;
		System.out.println("����ǰ��m=" + m + ",n=" + n);
		m = m ^ n;
		n = n ^ m;// n=n^m^n,�����������ʣ�a^b^a=b����ǰ��ı��ʽ�Ľ����n=m
		m = m ^ n;// (m^n)^(n^m^n)=(m^n)^n^(m^n)=m^n^m,���ʽ�Ľ����m=n;�����ֵ�Ľ���
		System.out.println("������m=" + m + ",n=" + n);

		// ʹ��������λ������������ľ���ֵ
		int x = -5;
		int y = (x ^ (x >> 31)) - (x >> 31);// ����31����Ϊֻȡ����λ
		System.out.println(y);

		// ��(&)������ж�һ��������ż��
		int k = 6;
		System.out.println((k & 1) == 1 ? "����" : "ż��");
		// �������λ�϶���1����1�Ķ��������λҲ��1������λ����0����������������1���������϶���1��

		// ʹ�ó˷���������ʱ������������������ֵ
		int i = 12;
		int j = 21;
		i = i * j;
		j = i / j;
		i = i / j;
		System.out.println("i=" + i + ",j=" + j);

		// ʹ�ó˷���������ʱ������������������ֵ
		//a=b. b=c��c=a 
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println("����ǰ��a=" + a + ",b=" + b+",c="+c);
		a=a*b*c;
		c=a/b/c;//a
		b=a/b/c;//c
		a=a/b/c;//b
		System.out.println("������a=" + a + ",b=" + b+",c="+c);
		a = 1;
		b = 2;
		c = 3;
		a=a^b^c;
		c=a^b^c;//a
		b=a^b^c;//c
		a=a^b^c;//b
		System.out.println("������a=" + a + ",b=" + b+",c="+c);
	}

}
