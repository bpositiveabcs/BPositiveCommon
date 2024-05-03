package bpos.common.model.Validators.Enums.Interfaces;


import bpos.common.model.Exceptions.ValidatorException;

public interface Validator<T> {
    void validate(T entity) throws ValidatorException;
}
