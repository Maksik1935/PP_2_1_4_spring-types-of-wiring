package koschei.models;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class Needle7 {
    @Autowired
    private Deth8 deth;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( ";
    }
}
