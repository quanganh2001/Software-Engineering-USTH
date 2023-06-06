package tute01a_design;

import utils.DomainConstraint;
import utils.NotPossibleException;
import utils.AttrRef;
import utils.DOpt;
import utils.OptType;

public class MobilePhone {
    @DomainConstraint(type="String", mutable=false, optional=false, length=100)
    private String manName;

    @DomainConstraint(type="String", mutable=false, optional=false, length=50)
    private String model;

    @DomainConstraint(type="Character", mutable=false, optional=false, length=1)
    private char color;

    @DomainConstraint(type="Integer", mutable=false, optional=false, min=1970)
    private int year;

    @DomainConstraint(type="Boolean", mutable=true, optional=true)
    private boolean guaranteed;

    public MobilePhone(@AttrRef("name") String manName,
            @AttrRef("model") String model,
            @AttrRef("color") char color,
            @AttrRef("year") int year) throws NotPossibleException
    
    @DOpt(type=OptType.Observer) @AttrRef("manName")
    public String getManName()

    @DOpt(type=OptType.Observer) @AttrRef("model")
    public String getModel()

    @DOpt(type=OptType.Observer) @AttrRef("color")
    public char getColor()

    @DOpt(type=OptType.Observer) @AttrRef("year")
    public int getYear()

    @DOpt(type=OptType.Observer) @AttrRef("guaranteed")
    public boolean getGuaranteed()

    @DOpt(type=OptType.Mutator) @AttrRef("guaranteed")
    public boolean setGuaranteed(boolean guaranteed)

    @Override
    public String toString()

    @Override
    public boolean equals(Object o)

    public boolean repOK()

    private boolean validateManName(String manName)

    private boolean validateModel(String model)

    private boolean validateColor(char color)

    private boolean validateYear(int year)
}
