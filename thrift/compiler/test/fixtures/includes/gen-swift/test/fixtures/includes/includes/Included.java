package test.fixtures.includes.includes;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@ThriftStruct("Included")
public final class Included
{
    @ThriftConstructor
    public Included(
        @ThriftField(value=1, name="MyIntField", requiredness=Requiredness.NONE) final long myIntField
    ) {
        this.myIntField = myIntField;
    }

    public static class Builder {
        private long myIntField;

        public Builder setMyIntField(long myIntField) {
            this.myIntField = myIntField;
            return this;
        }

        public Builder() { }
        public Builder(Included other) {
            this.myIntField = other.myIntField;
        }

        public Included build() {
            return new Included (
                this.myIntField
            );
        }
    }

    private final long myIntField;

    @ThriftField(value=1, name="MyIntField", requiredness=Requiredness.NONE)
    public long getMyIntField() { return myIntField; }

    @Override
    public String toString()
    {
        return toStringHelper(this)
            .add("myIntField", myIntField)
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

        Included other = (Included)o;

        return
            Objects.equals(myIntField, other.myIntField);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            myIntField
        });
    }
}
