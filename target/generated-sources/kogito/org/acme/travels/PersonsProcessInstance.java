package org.acme.travels;

import org.acme.travels.PersonsModel;

public class PersonsProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<PersonsModel> {

    public PersonsProcessInstance(org.acme.travels.PersonsProcess process, PersonsModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public PersonsProcessInstance(org.acme.travels.PersonsProcess process, PersonsModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public PersonsProcessInstance(org.acme.travels.PersonsProcess process, PersonsModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public PersonsProcessInstance(org.acme.travels.PersonsProcess process, PersonsModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public PersonsProcessInstance(org.acme.travels.PersonsProcess process, PersonsModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(PersonsModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(PersonsModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
