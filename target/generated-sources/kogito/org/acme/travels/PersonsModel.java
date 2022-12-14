/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.travels;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "persons", name = "Persons", hidden = false)
public class PersonsModel implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<PersonsModelOutput> {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "m1")
    @javax.validation.Valid()
    private org.acme.travels.M1AddonDto m1;

    public org.acme.travels.M1AddonDto getM1() {
        return m1;
    }

    public void setM1(org.acme.travels.M1AddonDto m1) {
        this.m1 = m1;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "person")
    @javax.validation.Valid()
    private org.acme.travels.Person person;

    public org.acme.travels.Person getPerson() {
        return person;
    }

    public void setPerson(org.acme.travels.Person person) {
        this.person = person;
    }

    @Override()
    public PersonsModelOutput toModel() {
        PersonsModelOutput result = new PersonsModelOutput();
        result.setId(getId());
        result.setM1(getM1());
        result.setPerson(getPerson());
        return result;
    }
}
