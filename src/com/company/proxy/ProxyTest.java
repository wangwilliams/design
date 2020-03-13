package com.company.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface ISinger {
    public void sing();
}

public class ProxyTest {
    public static void main(String[] args) {
       /* Proxy proxy = new Proxy();
        proxy.request();*/

      /* ISinger singer = new Singer();
       ISinger proxy = new SingerProxy(singer);
       proxy.sing();*/
        Singer singer = new Singer();
        ISinger proxy = (ISinger) Proxy.newProxyInstance(singer.getClass().getClassLoader(), singer.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 调用共同impl的接口的方法，形式固定
                Object object = method.invoke(singer, args);
                return object;
            }
        });
        proxy.sing();
    }


}

class Singer implements ISinger {

    @Override
    public void sing() {
        System.out.println("sing a song");
    }
}

class SingerProxy implements ISinger {
    private ISinger singer = null;

    SingerProxy(ISinger singer) {
        this.singer = singer;
    }

    @Override
    public void sing() {
        singer.sing();
    }
}
