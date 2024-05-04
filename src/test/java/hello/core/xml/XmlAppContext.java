package hello.core.xml;

import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class XmlAppContext {
    @Test
    void xmlAppContext() {
        String location = "classpath:appConfig.xml";
        ApplicationContext ac = new GenericXmlApplicationContext(location);
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }
}