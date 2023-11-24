package koschei.models;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class Egg6 {

    @Autowired
    private Needle7 needle;

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
