package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesceb8f68cdfb04aa6a69c12acb17f201f.*;
import static org.acme.travels.Rulesceb8f68cdfb04aa6a69c12acb17f201f.*;

public class Rulesceb8f68cdfb04aa6a69c12acb17f201f_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadataceb8f68cdfb04aa6a69c12acb17f201f.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataceb8f68cdfb04aa6a69c12acb17f201f.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P5F.LambdaPredicate5FE8F7714BC5EE3148EECB0022D75CC6.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadataceb8f68cdfb04aa6a69c12acb17f201f.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PD3.LambdaExtractorD3964E448DBA1681A3E7954F9D43BCD3.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P68.LambdaConsequence68C1D2D0C1134D8DAE92E94DCDD7E0B5.INSTANCE));
        return rule;
    }
}
