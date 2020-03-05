package DecoratorPattern;

abstract class Ninja {
    String description = "Unknown Ninja";
    int stamina;
    public String getDescription() {
        return description;
    }

    public int getStamina() { return stamina; }
}


abstract class SkillsDecorator extends Ninja {
    Ninja ninja;
    public SkillsDecorator(Ninja ninja) { this.ninja = ninja; }
    public String getDescription() {
        return ninja.getDescription() + ", " + description;
    }
    public int getStamina() { return ninja.getStamina() + stamina; }
}

class SubZero extends Ninja {
    public SubZero() {
        description = "SubZero";
        stamina = 45;
    }
}
class Reptile extends Ninja {
    public Reptile() {
        description = "Reptile";
        stamina = 60;
    }
}
class Tremor extends Ninja {
    public Tremor() {
        description = "Tremor";
        stamina = 75;
    }
}
class Rain extends Ninja {
    public Rain() {
        description = "Rain";
        stamina = 56;
    }
}
class Scorpion extends Ninja {
    public Scorpion() {
        description = "Scorpion";
        stamina = 75;
    }
}

class Iceblast extends SkillsDecorator {
    public Iceblast(Ninja ninja) {
        super(ninja);
        description = "Freeeeezah!";
        stamina = 15;
    }
}
class ChainHook extends SkillsDecorator {
    Ninja ninja;
    public ChainHook(Ninja ninja) {
        super(ninja);
        description = "Get over here!!!";
        stamina = 20;
    }
}
class AcidSpit extends SkillsDecorator {
    Ninja ninja;
    public AcidSpit(Ninja ninja) {
        super(ninja);
        description = "Gggsssssss!";
        stamina = 10;
    }
}

class NinjaGame {
    public static void main(String args[]) {

        Ninja ninja = new Scorpion();
        System.out.println(ninja.getDescription() +
                " will have this stamina: " + ninja.getStamina());

        Ninja ninja2 = new Reptile();

        ninja2 = new AcidSpit(ninja2);

        ninja2 = new ChainHook(ninja2);

        System.out.println(ninja2.getDescription() +
                " will have this stamina: " + ninja2.getStamina());

    }
}
