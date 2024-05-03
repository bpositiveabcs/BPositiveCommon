package bpos.common.model.Validators.Enums.Interfaces;


import bpos.common.model.Validators.Enums.ValidatorStrategy;

public interface Factory {
    Validator createValidator(ValidatorStrategy validatorStrategy);
}
