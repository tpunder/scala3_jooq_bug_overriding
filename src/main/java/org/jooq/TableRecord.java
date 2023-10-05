package org.jooq;

public interface TableRecord<R extends TableRecord<R>> extends Record {
  @Override
  <T> R with(Field<T> field, T value);
}