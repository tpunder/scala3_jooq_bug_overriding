package org.jooq;

public interface Record {
  <T> Record with(Field<T> field, T value);
}