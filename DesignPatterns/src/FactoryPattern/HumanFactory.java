package FactoryPattern;

public class HumanFactory
{
    public Human getHuman(String humanGender)
    {
        switch (humanGender){
            case "Jongen": return new Boy();

            case"Meisje":return new Girl();

            default:return null;

        }
    }
}