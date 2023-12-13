package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
    //기존에는 view만 반환했지만 이제는 모델과 view가 같이 있는 객체를 반환
    ModelView process(Map<String, String> paramMap);
}
