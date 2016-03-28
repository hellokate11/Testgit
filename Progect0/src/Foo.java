/**
 * Created by jj on 22.03.2016.
 */
public class Foo {
    private int var1 = 0;
    private int var2 = 0;

    public int getVar1(){
        return var1;
    }

    public void setVar1(int  v){
        this.var1 = v;
    }

    public int getVar2(){
        return var2;
    }

    public void setVar2(int  v){
        this.var2 = v;
    }

    public void swapObj (Foo f)
    {
        int temp = this.var2;
        this.var2 = f.getVar2();
        f.setVar2(temp);
    }

    //
//        Foo foo1 = new Foo();
//        Foo foo2 = new Foo();
//
//        foo1.setVar2(4);
//        foo2.setVar2(2);
//        foo1.swapObj(foo2);
}
