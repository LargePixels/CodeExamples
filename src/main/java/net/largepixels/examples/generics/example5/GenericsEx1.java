package net.largepixels.examples.generics.example5;

/**
 * Created by johnminchuk on 2/9/16.
 */
public class GenericsEx1 {

    private void runMe() {
        GenEx1<String> genEx1 = new GenEx1(new String("testing"));
        System.out.println(genEx1.getObj().getClass().getName());

        GenEx1<Long> genEx2 = new GenEx1(new Long(1234));
        System.out.println(genEx2.getObj().getClass().getName());
    }

    public static void main(String a[]){
        GenericsEx1 genericsEx1 = new GenericsEx1();
        genericsEx1.runMe();
    }

}

class GenEx1<T>{

    private T obj = null;

    public GenEx1(T param){
        this.obj = param;
    }

    public T getObj(){
        return this.obj;
    }
}
