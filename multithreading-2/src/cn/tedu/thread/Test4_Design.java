package cn.tedu.thread;

/**
 * @author sharetown
 * @date 2020/8/22 15:28
 */
public class Test4_Design {
    public static void main(String[] args) {
        MySingleTon m1=MySingleTon.getMy();
        MySingleTon m2=MySingleTon.getMy();
        System.out.println(m1==m2);

        Runtime r1=Runtime.getRuntime();
        Runtime r2=Runtime.getRuntime();
        System.out.println(r1==r2);

    }

}
class MySingleTon{

    private static MySingleTon my =new MySingleTon();

    public static MySingleTon  getMy(){
        return my;
    }

    private MySingleTon(){}
}

class MySingleTon2{
    private MySingleTon2(){}

    private static MySingleTon2 my;

    public static MySingleTon2 getMy(){
        if (my==null){
            my=new MySingleTon2();
        }
        return my;
    }
}