package cn.byack.proxypattern.proxy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SchoolGirl {
    /**
     * 被追求者
     */

    private String name;

    public SchoolGirl(String name) {
        setName(name);
    }
}
