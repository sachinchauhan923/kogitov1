package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules7acdf1a27af94f17bfd1c1c0ca86c355.*;
import static org.acme.travels.Rules7acdf1a27af94f17bfd1c1c0ca86c355.*;

public class Rules7acdf1a27af94f17bfd1c1c0ca86c355_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata7acdf1a27af94f17bfd1c1c0ca86c355.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata7acdf1a27af94f17bfd1c1c0ca86c355.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P62.LambdaPredicate62877201BF9536F3DE938F0116E0CABD.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata7acdf1a27af94f17bfd1c1c0ca86c355.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PBE.LambdaExtractorBEFD892C5A806BC34294A33884FA8B18.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PB4.LambdaConsequenceB49A95824D5B08CEAB09481E7C4AB176.INSTANCE));
        return rule;
    }
}
