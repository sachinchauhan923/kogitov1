package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules147dcb1cc99c4a96921fbd65e1fd21f7.*;
import static org.acme.travels.Rules147dcb1cc99c4a96921fbd65e1fd21f7.*;

public class Rules147dcb1cc99c4a96921fbd65e1fd21f7_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata147dcb1cc99c4a96921fbd65e1fd21f7.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata147dcb1cc99c4a96921fbd65e1fd21f7.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P19.LambdaPredicate196A387EC2E25754EB81DA9B676108B1.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata147dcb1cc99c4a96921fbd65e1fd21f7.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P01.LambdaExtractor01165E95DB7BD7D4B3E342FDA0082BEB.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PBF.LambdaConsequenceBF1EA3F1C270343B727380CC1D4D2DCA.INSTANCE));
        return rule;
    }
}
