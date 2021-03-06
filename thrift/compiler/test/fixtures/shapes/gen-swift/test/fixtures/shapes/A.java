package test.fixtures.shapes;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("A")
public final class A
{
    @ThriftConstructor
    public A(
        @ThriftField(value=1, name="a", requiredness=Requiredness.NONE) final String a
    ) {
        this.a = a;
    }

    public static class Builder {
        private String a;

        public Builder setA(String a) {
            this.a = a;
            return this;
        }

        public Builder() { }
        public Builder(A other) {
            this.a = other.a;
        }

        public A build() {
            return new A (
                this.a
            );
        }
    }

    private final String a;

    @ThriftField(value=1, name="a", requiredness=Requiredness.NONE)
    public String getA() { return a; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("a", a)
            .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        A other = (A)o;

        return
            Objects.equals(a, other.a);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            a
        });
    }
}
