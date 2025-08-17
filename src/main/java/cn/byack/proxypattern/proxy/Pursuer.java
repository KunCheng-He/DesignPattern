package cn.byack.proxypattern.proxy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pursuer implements Subject {
    /**
     * 追求者
     */

    private SchoolGirl schoolGirl;

    public Pursuer(SchoolGirl schoolGirl) {
        // 指定被追求者
        setSchoolGirl(schoolGirl);
    }

    @Override
    public void love() {
        System.out.println(schoolGirl.getName() + "，我是追求者");
    }
}
