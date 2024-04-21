package pub.sugar_high.nullability;

import org.jetbrains.annotations.NotNull;

public class Pojo2 {
    private String field;

    @NotNull
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
