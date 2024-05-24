package bpos.other;


import bpos.common.model.Person;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonResponse {
    @JsonProperty("person")
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
