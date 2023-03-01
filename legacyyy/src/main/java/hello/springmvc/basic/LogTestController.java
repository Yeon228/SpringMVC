package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController//그냥 controller는 반환값이 string이면 뷰 이름으로 인식하지만 RestController는 뷰 이름이 아닌 Http 바디로 인식을함
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());


    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";
        //아래로 내려갈수록 중요도 증가
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);
        return "ok";
    }
}
