package cn.tedu.api;

/**
 * @author sharetown
 * @date 2020/8/14 18:45
 */
public class Test5_Number {
    public static void main(String[] args) {
        byte by=116;
        Byte a=new Byte(by);
        short sh=464;
        Short s=new Short(sh);
        char ch=97;
        Character b=new Character(ch);
        Integer c=new Integer(225);
        Long d=new Long(1654641654654161L);
        Double e=new Double(123456.1);
        Float f=new Float(126445.4);
        Boolean flag=new Boolean(false);
        System.out.println(Byte.TYPE+","+Byte.BYTES+","+a.byteValue());
        System.out.println(Short.TYPE+","+Short.BYTES+","+s.shortValue());
        System.out.println(Character.TYPE+","+Character.BYTES+","+b.charValue());
        System.out.println(Integer.TYPE+","+Integer.BYTES+","+c.intValue());
        System.out.println(Long.TYPE+","+Long.BYTES+","+d.longValue());
        System.out.println(Double.TYPE+","+Double.BYTES+","+e.doubleValue());
        System.out.println(Float.TYPE+","+Float.BYTES+","+f.floatValue());
        System.out.println(Boolean.TYPE+","+flag.booleanValue());




    }
}
