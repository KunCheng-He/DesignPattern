package cn.byack.proxypattern;

import cn.byack.proxypattern.proxy.Proxy;
import cn.byack.proxypattern.proxy.SchoolGirl;

public class ProxyText {
    public static void main(String[] args) {
        // 韩立（追求者） 银月（代恋） 慕沛灵（被追求者）
        // 不太恰当，看个乐呵

        SchoolGirl PeiLingMu = new SchoolGirl("慕沛灵");
        Proxy YueYin = new Proxy(PeiLingMu);
        YueYin.love();
    }
}
