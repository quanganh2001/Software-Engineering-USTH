package tute01a_design;

import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.AttrRef;
import utils.DOpt;
import utils.OptType;

public class Person {
    // STATE SPACE
    @DomainConstraint(type="Integer", mutable=false, optional=false, min=1)
    private int id;

    @DomainConstraint(type="String", mutable=true, optional=false, length=30)
    private String name;

    @DomainConstraint(type="MobilePhone", mutable=true, optional=true)
    private MobilePhone phone;

    // BEHAVIOR SPACE
    public Person(@AttrRef("id") int id, @AttrRef("name") String name) throws NotPossibleException

    @DOpt(type=OptType.Observer) @AttrRef("id")
    public int getId()

    @DOpt(type=OptType.Observer) @AttrRef("name")
    public int getName()

    @DOpt(type=OptType.Observer) @AttrRef("phone")
    public MobilePhone getPhone()

    @DOpt(type=OptType.Mutator) @AttrRef("name")
    public boolean setName(String name)

    @DOpt(type=OptType.Mutator) @AttrRef("phone")
    public boolean setPhone(MobilePhone phone)

    @Override
    public String toString()

    @Override
    public boolean equals(Object o)

    public boolean repOK()

    private boolean validateId(int id)

    private boolean validateName(String name)

    private boolean validatePhone(MobilePhone phone)
}
