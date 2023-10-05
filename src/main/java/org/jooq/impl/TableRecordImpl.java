package org.jooq.impl;

import org.jooq.Field;
import org.jooq.TableRecord;

public class TableRecordImpl<R extends TableRecord<R>> extends AbstractRecord implements TableRecord<R> {
    @Override
    public final <T> R with(Field<T> field, T value) {
        return (R) super.with(field, value);
    }
}