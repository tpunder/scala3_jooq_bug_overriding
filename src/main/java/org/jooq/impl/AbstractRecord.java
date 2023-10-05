package org.jooq.impl;

import org.jooq.Field;
import org.jooq.Record;

abstract class AbstractRecord implements Record {
  @Override
    public /* non-final */ <T> Record with(Field<T> field, T value) {
        return this;
    }
}