package org.acme.travels;

import org.acme.travels.PersonsModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;

@org.springframework.stereotype.Component("persons")
public class PersonsProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.travels.PersonsModel> {

    @org.springframework.beans.factory.annotation.Autowired()
    public PersonsProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public PersonsProcess() {
    }

    @Override()
    public org.acme.travels.PersonsProcessInstance createInstance(org.acme.travels.PersonsModel value) {
        return new org.acme.travels.PersonsProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.travels.PersonsProcessInstance createInstance(java.lang.String businessKey, org.acme.travels.PersonsModel value) {
        return new org.acme.travels.PersonsProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.acme.travels.PersonsProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.acme.travels.PersonsModel value) {
        return new org.acme.travels.PersonsProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.acme.travels.PersonsModel createModel() {
        return new org.acme.travels.PersonsModel();
    }

    public org.acme.travels.PersonsProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.travels.PersonsModel) value);
    }

    public org.acme.travels.PersonsProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.travels.PersonsModel) value);
    }

    public org.acme.travels.PersonsProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.PersonsProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.travels.PersonsProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.PersonsProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("persons", true);
        factory.variable("person", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.travels.Person.class), null, "customTags", null);
        factory.variable("m1", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.travels.M1AddonDto.class), null, "customTags", null);
        factory.name("persons");
        factory.packageName("org.acme.travels");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        factory.imports("org.acme.travels.M1AddonDto");
        factory.imports("org.acme.travels.Person");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode1 = factory.endNode(1);
        endNode1.name("End Event 1");
        endNode1.terminate(false);
        endNode1.metaData("UniqueId", "_6BDF2751-F544-4AFC-AB47-8C5F52EC97AD");
        endNode1.metaData("elementname", "End Event 1");
        endNode1.metaData("x", 1060);
        endNode1.metaData("width", 56);
        endNode1.metaData("y", 135);
        endNode1.metaData("height", 56);
        endNode1.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode2 = factory.startNode(2);
        startNode2.name("StartProcess");
        startNode2.interrupting(false);
        startNode2.metaData("UniqueId", "_F2CC5C1D-5116-4C20-8702-A8357341790F");
        startNode2.metaData("elementname", "StartProcess");
        startNode2.metaData("x", 320);
        startNode2.metaData("width", 56);
        startNode2.metaData("y", 135);
        startNode2.metaData("height", 56);
        startNode2.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode3 = factory.ruleSetNode(3);
        ruleSetNode3.name("Evaluate Person");
        ruleSetNode3.ruleFlowGroup("M1AddonDto", () -> {
            org.kie.kogito.rules.RuleConfig ruleConfig = app.config().get(org.kie.kogito.rules.RuleConfig.class);
            org.kie.api.runtime.KieSession ksession = org.drools.project.model.ProjectRuntime.INSTANCE.newKieSession("defaultStatelessKieSession");
            ruleConfig.ruleEventListeners().agendaListeners().forEach(ksession::addEventListener);
            ruleConfig.ruleEventListeners().ruleRuntimeListeners().forEach(ksession::addEventListener);
            return ksession;
        });
        ruleSetNode3.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("m1", "m1", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_7B8CC121-6F99-464A-93F8-9EAC4BE4601A_m1InputX", "m1", "org.acme.travels.M1AddonDto", null), null, null));
        ruleSetNode3.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_7B8CC121-6F99-464A-93F8-9EAC4BE4601A_m1OutputX", "m1", "org.acme.travels.M1AddonDto", null)), new org.jbpm.workflow.core.impl.DataDefinition("m1", "m1", "java.lang.Object", null), null, null));
        ruleSetNode3.metaData("UniqueId", "_7B8CC121-6F99-464A-93F8-9EAC4BE4601A");
        ruleSetNode3.metaData("elementname", "Evaluate Person");
        ruleSetNode3.metaData("x", 456);
        ruleSetNode3.metaData("width", 154);
        ruleSetNode3.metaData("y", 112);
        ruleSetNode3.metaData("height", 102);
        ruleSetNode3.done();
        factory.connection(3, 1, "_84B4980C-CDF1-4E6B-8067-984E50147731");
        factory.connection(2, 3, "_41D07816-A956-491C-9787-5B8C0B8C4F58");
        factory.validate();
        return factory.getProcess();
    }
}
