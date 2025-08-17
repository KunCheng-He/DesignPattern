package cn.byack.proxypattern.proxy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Proxy implements Subject {
    /**
     * 代理人
     */

    private Pursuer pursuer;

    public Proxy(SchoolGirl schoolGirl) {
        // 创建追求者
        setPursuer(new Pursuer(schoolGirl));
    }

    @Override
    public void love() {
        System.out.println("代理开始");
        this.pursuer.love();
    }
}
