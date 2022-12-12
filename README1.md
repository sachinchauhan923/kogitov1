<?xml version="1.0" encoding="UTF-8"?>
<bpmn2:definitions xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:bpmn2="http://www.omg.org/spec/BPMN/20100524/MODEL" xmlns:bpmndi="http://www.omg.org/spec/BPMN/20100524/DI" xmlns:bpsim="http://www.bpsim.org/schemas/1.0" xmlns:dc="http://www.omg.org/spec/DD/20100524/DC" xmlns:di="http://www.omg.org/spec/DD/20100524/DI" xmlns:drools="http://www.jboss.org/drools" id="_J6NXkFwaEDuKP6LSpXGyNw" xsi:schemaLocation="http://www.omg.org/spec/BPMN/20100524/MODEL BPMN20.xsd http://www.jboss.org/drools drools.xsd http://www.bpsim.org/schemas/1.0 bpsim.xsd http://www.omg.org/spec/DD/20100524/DC DC.xsd http://www.omg.org/spec/DD/20100524/DI DI.xsd " exporter="jBPM Process Modeler" exporterVersion="2.0" targetNamespace="http://www.omg.org/bpmn20">
  <bpmn2:itemDefinition id="_personItem" structureRef="org.acme.travels.Person"/>
  <bpmn2:itemDefinition id="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_SkippableInputXItem" structureRef="Object"/>
  <bpmn2:itemDefinition id="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_PriorityInputXItem" structureRef="Object"/>
  <bpmn2:itemDefinition id="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_CommentInputXItem" structureRef="Object"/>
  <bpmn2:itemDefinition id="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_DescriptionInputXItem" structureRef="Object"/>
  <bpmn2:itemDefinition id="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_CreatedByInputXItem" structureRef="Object"/>
  <bpmn2:itemDefinition id="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_TaskNameInputXItem" structureRef="Object"/>
  <bpmn2:itemDefinition id="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_GroupIdInputXItem" structureRef="Object"/>
  <bpmn2:itemDefinition id="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_ContentInputXItem" structureRef="Object"/>
  <bpmn2:itemDefinition id="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_NotStartedReassignInputXItem" structureRef="Object"/>
  <bpmn2:itemDefinition id="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_NotCompletedReassignInputXItem" structureRef="Object"/>
  <bpmn2:itemDefinition id="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_NotStartedNotifyInputXItem" structureRef="Object"/>
  <bpmn2:itemDefinition id="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_NotCompletedNotifyInputXItem" structureRef="Object"/>
  <bpmn2:itemDefinition id="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_personInputXItem" structureRef="org.acme.travels.Person"/>
  <bpmn2:itemDefinition id="__7B8CC121-6F99-464A-93F8-9EAC4BE4601A_namespaceInputXItem" structureRef="java.lang.String"/>
  <bpmn2:itemDefinition id="__7B8CC121-6F99-464A-93F8-9EAC4BE4601A_modelInputXItem" structureRef="java.lang.String"/>
  <bpmn2:itemDefinition id="__7B8CC121-6F99-464A-93F8-9EAC4BE4601A_decisionInputXItem" structureRef="java.lang.String"/>
  <bpmn2:itemDefinition id="__7B8CC121-6F99-464A-93F8-9EAC4BE4601A_personInputXItem" structureRef="org.acme.travels.Person"/>
  <bpmn2:itemDefinition id="__7B8CC121-6F99-464A-93F8-9EAC4BE4601A_personOutputXItem" structureRef="org.acme.travels.Person"/>
  <bpmn2:collaboration id="_BFCF195A-391E-4467-B6F7-B352E5AB8503" name="Default Collaboration">
    <bpmn2:participant id="_BE0A98E6-F445-46DA-8532-30A12664378D" name="Pool Participant" processRef="persons"/>
  </bpmn2:collaboration>
  <bpmn2:process id="persons" drools:packageName="org.acme.travels" drools:version="1.0" drools:adHoc="false" name="persons" isExecutable="true" processType="Public">
    <bpmn2:extensionElements>
      <drools:import name="org.acme.travels.Person"/>
    </bpmn2:extensionElements>
    <bpmn2:property id="person" itemSubjectRef="_personItem" name="person"/>
    <bpmn2:sequenceFlow id="_29B77FA9-3C5F-4EC3-9F37-5D74C182F3C0" sourceRef="_7B8CC121-6F99-464A-93F8-9EAC4BE4601A" targetRef="_CB2B4CEB-E636-4F0C-904B-3468083FF1EF"/>
    <bpmn2:sequenceFlow id="_22717A42-3E59-431B-8AF8-C5061A69B295" sourceRef="_CB2B4CEB-E636-4F0C-904B-3468083FF1EF" targetRef="_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D">
      <bpmn2:conditionExpression xsi:type="bpmn2:tFormalExpression" language="http://www.java.com/java"><![CDATA[return person.isAdult() == false;]]></bpmn2:conditionExpression>
    </bpmn2:sequenceFlow>
    <bpmn2:sequenceFlow id="_41D07816-A956-491C-9787-5B8C0B8C4F58" sourceRef="_F2CC5C1D-5116-4C20-8702-A8357341790F" targetRef="_7B8CC121-6F99-464A-93F8-9EAC4BE4601A">
      <bpmn2:extensionElements>
        <drools:metaData name="isAutoConnection.source">
          <drools:metaValue><![CDATA[true]]></drools:metaValue>
        </drools:metaData>
        <drools:metaData name="isAutoConnection.target">
          <drools:metaValue><![CDATA[true]]></drools:metaValue>
        </drools:metaData>
      </bpmn2:extensionElements>
    </bpmn2:sequenceFlow>
    <bpmn2:sequenceFlow id="_C93EF8F2-D9C0-45D1-A3D6-C8A376D07806" sourceRef="_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D" targetRef="_6BDF2751-F544-4AFC-AB47-8C5F52EC97AD">
      <bpmn2:extensionElements>
        <drools:metaData name="isAutoConnection.source">
          <drools:metaValue><![CDATA[true]]></drools:metaValue>
        </drools:metaData>
        <drools:metaData name="isAutoConnection.target">
          <drools:metaValue><![CDATA[true]]></drools:metaValue>
        </drools:metaData>
      </bpmn2:extensionElements>
    </bpmn2:sequenceFlow>
    <bpmn2:sequenceFlow id="_FA444C47-2749-42FF-ACE3-7CF52A2AB11A" sourceRef="_CB2B4CEB-E636-4F0C-904B-3468083FF1EF" targetRef="_44052DCF-2D80-48EC-9691-556FEDD102FD">
      <bpmn2:conditionExpression xsi:type="bpmn2:tFormalExpression" language="http://www.java.com/java"><![CDATA[return person.isAdult() == true;]]></bpmn2:conditionExpression>
    </bpmn2:sequenceFlow>
    <bpmn2:exclusiveGateway id="_CB2B4CEB-E636-4F0C-904B-3468083FF1EF" name="Exclusive Gateway 1" gatewayDirection="Diverging">
      <bpmn2:extensionElements>
        <drools:metaData name="elementname">
          <drools:metaValue><![CDATA[Exclusive Gateway 1]]></drools:metaValue>
        </drools:metaData>
      </bpmn2:extensionElements>
      <bpmn2:incoming>_29B77FA9-3C5F-4EC3-9F37-5D74C182F3C0</bpmn2:incoming>
      <bpmn2:outgoing>_FA444C47-2749-42FF-ACE3-7CF52A2AB11A</bpmn2:outgoing>
      <bpmn2:outgoing>_22717A42-3E59-431B-8AF8-C5061A69B295</bpmn2:outgoing>
    </bpmn2:exclusiveGateway>
    <bpmn2:businessRuleTask id="_7B8CC121-6F99-464A-93F8-9EAC4BE4601A" drools:ruleFlowGroup="person" name="Evaluate Person" implementation="http://www.jboss.org/drools/rule">
      <bpmn2:extensionElements>
        <drools:metaData name="elementname">
          <drools:metaValue><![CDATA[Evaluate Person]]></drools:metaValue>
        </drools:metaData>
      </bpmn2:extensionElements>
      <bpmn2:incoming>_41D07816-A956-491C-9787-5B8C0B8C4F58</bpmn2:incoming>
      <bpmn2:outgoing>_29B77FA9-3C5F-4EC3-9F37-5D74C182F3C0</bpmn2:outgoing>
      <bpmn2:ioSpecification>
        <bpmn2:dataInput id="_7B8CC121-6F99-464A-93F8-9EAC4BE4601A_personInputX" drools:dtype="org.acme.travels.Person" itemSubjectRef="__7B8CC121-6F99-464A-93F8-9EAC4BE4601A_personInputXItem" name="person"/>
        <bpmn2:dataOutput id="_7B8CC121-6F99-464A-93F8-9EAC4BE4601A_personOutputX" drools:dtype="org.acme.travels.Person" itemSubjectRef="__7B8CC121-6F99-464A-93F8-9EAC4BE4601A_personOutputXItem" name="person"/>
        <bpmn2:inputSet>
          <bpmn2:dataInputRefs>_7B8CC121-6F99-464A-93F8-9EAC4BE4601A_personInputX</bpmn2:dataInputRefs>
        </bpmn2:inputSet>
        <bpmn2:outputSet>
          <bpmn2:dataOutputRefs>_7B8CC121-6F99-464A-93F8-9EAC4BE4601A_personOutputX</bpmn2:dataOutputRefs>
        </bpmn2:outputSet>
      </bpmn2:ioSpecification>
      <bpmn2:dataInputAssociation>
        <bpmn2:sourceRef>person</bpmn2:sourceRef>
        <bpmn2:targetRef>_7B8CC121-6F99-464A-93F8-9EAC4BE4601A_personInputX</bpmn2:targetRef>
      </bpmn2:dataInputAssociation>
      <bpmn2:dataOutputAssociation>
        <bpmn2:sourceRef>_7B8CC121-6F99-464A-93F8-9EAC4BE4601A_personOutputX</bpmn2:sourceRef>
        <bpmn2:targetRef>person</bpmn2:targetRef>
      </bpmn2:dataOutputAssociation>
    </bpmn2:businessRuleTask>
    <bpmn2:userTask id="_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D" name="Special handling for children">
      <bpmn2:extensionElements>
        <drools:metaData name="elementname">
          <drools:metaValue><![CDATA[Special handling for children]]></drools:metaValue>
        </drools:metaData>
      </bpmn2:extensionElements>
      <bpmn2:incoming>_22717A42-3E59-431B-8AF8-C5061A69B295</bpmn2:incoming>
      <bpmn2:outgoing>_C93EF8F2-D9C0-45D1-A3D6-C8A376D07806</bpmn2:outgoing>
      <bpmn2:ioSpecification>
        <bpmn2:dataInput id="_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_TaskNameInputX" drools:dtype="Object" itemSubjectRef="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_TaskNameInputXItem" name="TaskName"/>
        <bpmn2:dataInput id="_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_personInputX" drools:dtype="org.acme.travels.Person" itemSubjectRef="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_personInputXItem" name="person"/>
        <bpmn2:dataInput id="_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_SkippableInputX" drools:dtype="Object" itemSubjectRef="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_SkippableInputXItem" name="Skippable"/>
        <bpmn2:dataInput id="_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_PriorityInputX" drools:dtype="Object" itemSubjectRef="__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_PriorityInputXItem" name="Priority"/>
        <bpmn2:inputSet>
          <bpmn2:dataInputRefs>_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_TaskNameInputX</bpmn2:dataInputRefs>
          <bpmn2:dataInputRefs>_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_personInputX</bpmn2:dataInputRefs>
          <bpmn2:dataInputRefs>_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_SkippableInputX</bpmn2:dataInputRefs>
          <bpmn2:dataInputRefs>_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_PriorityInputX</bpmn2:dataInputRefs>
        </bpmn2:inputSet>
      </bpmn2:ioSpecification>
      <bpmn2:dataInputAssociation>
        <bpmn2:targetRef>_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_TaskNameInputX</bpmn2:targetRef>
        <bpmn2:assignment>
          <bpmn2:from xsi:type="bpmn2:tFormalExpression"><![CDATA[ChildrenHandling]]></bpmn2:from>
          <bpmn2:to xsi:type="bpmn2:tFormalExpression"><![CDATA[_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_TaskNameInputX]]></bpmn2:to>
        </bpmn2:assignment>
      </bpmn2:dataInputAssociation>
      <bpmn2:dataInputAssociation>
        <bpmn2:sourceRef>person</bpmn2:sourceRef>
        <bpmn2:targetRef>_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_personInputX</bpmn2:targetRef>
      </bpmn2:dataInputAssociation>
      <bpmn2:dataInputAssociation>
        <bpmn2:targetRef>_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_SkippableInputX</bpmn2:targetRef>
        <bpmn2:assignment>
          <bpmn2:from xsi:type="bpmn2:tFormalExpression"><![CDATA[true]]></bpmn2:from>
          <bpmn2:to xsi:type="bpmn2:tFormalExpression"><![CDATA[_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_SkippableInputX]]></bpmn2:to>
        </bpmn2:assignment>
      </bpmn2:dataInputAssociation>
      <bpmn2:dataInputAssociation>
        <bpmn2:targetRef>_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_PriorityInputX</bpmn2:targetRef>
        <bpmn2:assignment>
          <bpmn2:from xsi:type="bpmn2:tFormalExpression"><![CDATA[1]]></bpmn2:from>
          <bpmn2:to xsi:type="bpmn2:tFormalExpression"><![CDATA[_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_PriorityInputX]]></bpmn2:to>
        </bpmn2:assignment>
      </bpmn2:dataInputAssociation>
    </bpmn2:userTask>
    <bpmn2:startEvent id="_F2CC5C1D-5116-4C20-8702-A8357341790F" name="StartProcess">
      <bpmn2:extensionElements>
        <drools:metaData name="elementname">
          <drools:metaValue><![CDATA[StartProcess]]></drools:metaValue>
        </drools:metaData>
      </bpmn2:extensionElements>
      <bpmn2:outgoing>_41D07816-A956-491C-9787-5B8C0B8C4F58</bpmn2:outgoing>
    </bpmn2:startEvent>
    <bpmn2:endEvent id="_6BDF2751-F544-4AFC-AB47-8C5F52EC97AD" name="End Event 1">
      <bpmn2:extensionElements>
        <drools:metaData name="elementname">
          <drools:metaValue><![CDATA[End Event 1]]></drools:metaValue>
        </drools:metaData>
      </bpmn2:extensionElements>
      <bpmn2:incoming>_C93EF8F2-D9C0-45D1-A3D6-C8A376D07806</bpmn2:incoming>
    </bpmn2:endEvent>
    <bpmn2:endEvent id="_44052DCF-2D80-48EC-9691-556FEDD102FD" name="End Event 2">
      <bpmn2:extensionElements>
        <drools:metaData name="elementname">
          <drools:metaValue><![CDATA[End Event 2]]></drools:metaValue>
        </drools:metaData>
      </bpmn2:extensionElements>
      <bpmn2:incoming>_FA444C47-2749-42FF-ACE3-7CF52A2AB11A</bpmn2:incoming>
    </bpmn2:endEvent>
  </bpmn2:process>
  <bpmndi:BPMNDiagram>
    <bpmndi:BPMNPlane bpmnElement="persons">
      <bpmndi:BPMNShape id="shape__44052DCF-2D80-48EC-9691-556FEDD102FD" bpmnElement="_44052DCF-2D80-48EC-9691-556FEDD102FD">
        <dc:Bounds height="56" width="56" x="1060" y="298"/>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="shape__6BDF2751-F544-4AFC-AB47-8C5F52EC97AD" bpmnElement="_6BDF2751-F544-4AFC-AB47-8C5F52EC97AD">
        <dc:Bounds height="56" width="56" x="1060" y="135"/>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="shape__F2CC5C1D-5116-4C20-8702-A8357341790F" bpmnElement="_F2CC5C1D-5116-4C20-8702-A8357341790F">
        <dc:Bounds height="56" width="56" x="320" y="135"/>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="shape__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D" bpmnElement="_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D">
        <dc:Bounds height="102" width="154" x="826" y="112"/>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="shape__7B8CC121-6F99-464A-93F8-9EAC4BE4601A" bpmnElement="_7B8CC121-6F99-464A-93F8-9EAC4BE4601A">
        <dc:Bounds height="102" width="154" x="456" y="112"/>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="shape__CB2B4CEB-E636-4F0C-904B-3468083FF1EF" bpmnElement="_CB2B4CEB-E636-4F0C-904B-3468083FF1EF">
        <dc:Bounds height="56" width="56" x="690" y="135"/>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNEdge id="edge_shape__CB2B4CEB-E636-4F0C-904B-3468083FF1EF_to_shape__44052DCF-2D80-48EC-9691-556FEDD102FD" bpmnElement="_FA444C47-2749-42FF-ACE3-7CF52A2AB11A">
        <di:waypoint x="718" y="191"/>
        <di:waypoint x="718" y="325"/>
        <di:waypoint x="1060" y="326"/>
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="edge_shape__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_to_shape__6BDF2751-F544-4AFC-AB47-8C5F52EC97AD" bpmnElement="_C93EF8F2-D9C0-45D1-A3D6-C8A376D07806">
        <di:waypoint x="980" y="163"/>
        <di:waypoint x="1060" y="163"/>
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="edge_shape__F2CC5C1D-5116-4C20-8702-A8357341790F_to_shape__7B8CC121-6F99-464A-93F8-9EAC4BE4601A" bpmnElement="_41D07816-A956-491C-9787-5B8C0B8C4F58">
        <di:waypoint x="376" y="163"/>
        <di:waypoint x="456" y="163"/>
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="edge_shape__CB2B4CEB-E636-4F0C-904B-3468083FF1EF_to_shape__D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D" bpmnElement="_22717A42-3E59-431B-8AF8-C5061A69B295">
        <di:waypoint x="746" y="163"/>
        <di:waypoint x="826" y="163"/>
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="edge_shape__7B8CC121-6F99-464A-93F8-9EAC4BE4601A_to_shape__CB2B4CEB-E636-4F0C-904B-3468083FF1EF" bpmnElement="_29B77FA9-3C5F-4EC3-9F37-5D74C182F3C0">
        <di:waypoint x="610" y="163"/>
        <di:waypoint x="690" y="163"/>
      </bpmndi:BPMNEdge>
    </bpmndi:BPMNPlane>
  </bpmndi:BPMNDiagram>
  <bpmn2:relationship type="BPSimData">
    <bpmn2:extensionElements>
      <bpsim:BPSimData>
        <bpsim:Scenario id="default" name="Simulationscenario">
          <bpsim:ScenarioParameters/>
          <bpsim:ElementParameters elementRef="_F2CC5C1D-5116-4C20-8702-A8357341790F">
            <bpsim:TimeParameters>
              <bpsim:ProcessingTime>
                <bpsim:NormalDistribution mean="0" standardDeviation="0"/>
              </bpsim:ProcessingTime>
            </bpsim:TimeParameters>
          </bpsim:ElementParameters>
          <bpsim:ElementParameters elementRef="_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D">
            <bpsim:TimeParameters>
              <bpsim:ProcessingTime>
                <bpsim:NormalDistribution mean="0" standardDeviation="0"/>
              </bpsim:ProcessingTime>
            </bpsim:TimeParameters>
            <bpsim:ResourceParameters>
              <bpsim:Availability>
                <bpsim:FloatingParameter value="0"/>
              </bpsim:Availability>
              <bpsim:Quantity>
                <bpsim:FloatingParameter value="0"/>
              </bpsim:Quantity>
            </bpsim:ResourceParameters>
            <bpsim:CostParameters>
              <bpsim:UnitCost>
                <bpsim:FloatingParameter value="0"/>
              </bpsim:UnitCost>
            </bpsim:CostParameters>
          </bpsim:ElementParameters>
          <bpsim:ElementParameters elementRef="_7B8CC121-6F99-464A-93F8-9EAC4BE4601A">
            <bpsim:TimeParameters>
              <bpsim:ProcessingTime>
                <bpsim:NormalDistribution mean="0" standardDeviation="0"/>
              </bpsim:ProcessingTime>
            </bpsim:TimeParameters>
            <bpsim:ResourceParameters>
              <bpsim:Availability>
                <bpsim:FloatingParameter value="0"/>
              </bpsim:Availability>
              <bpsim:Quantity>
                <bpsim:FloatingParameter value="0"/>
              </bpsim:Quantity>
            </bpsim:ResourceParameters>
            <bpsim:CostParameters>
              <bpsim:UnitCost>
                <bpsim:FloatingParameter value="0"/>
              </bpsim:UnitCost>
            </bpsim:CostParameters>
          </bpsim:ElementParameters>
        </bpsim:Scenario>
      </bpsim:BPSimData>
    </bpmn2:extensionElements>
    <bpmn2:source>_J6NXkFwaEDuKP6LSpXGyNw</bpmn2:source>
    <bpmn2:target>_J6NXkFwaEDuKP6LSpXGyNw</bpmn2:target>
  </bpmn2:relationship>
</bpmn2:definitions>