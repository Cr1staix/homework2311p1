import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ImmutableClass {
    private final String name;
    private final List<Integer> numbers;
    private final CustomMutableClass customMutableClass;

    public ImmutableClass(String name, List<Integer> numbers, CustomMutableClass customMutableClass) {
        this.name = name;
        this.numbers = new ArrayList<>(numbers);
        this.customMutableClass = new CustomMutableClass(customMutableClass);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return Objects.equals(name, that.name) && Objects.equals(numbers, that.numbers) && Objects.equals(customMutableClass, that.customMutableClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbers, customMutableClass);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", numbers=" + numbers +
                " " + customMutableClass +
                '}';
    }
}
