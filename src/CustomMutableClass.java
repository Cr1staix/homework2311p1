import java.util.Objects;

public final class CustomMutableClass {
    private Integer value;

    public CustomMutableClass(Integer value) {
        this.value = value;
    }

    public CustomMutableClass(CustomMutableClass other) {
        this.value = other.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomMutableClass that = (CustomMutableClass) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return
                "value=" + value;

    }
}
