package com.vi.singlebuilderpattern.builder;

/**
 * Created by taufiqotulfaidah on 12/20/16.
 */

public class Hero {

    private final Profession profession;
    private final String name;
    private final HairType hairType;
    private final HairColor hairColor;

    private Hero(Builder builder){
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairType = builder.hairType;
        this.hairColor = builder.hairColor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a ")
                .append(profession)
                .append(" named ")
                .append(name);

        if (hairColor != null || hairType != null) {
            sb.append(" with ");
            if (hairColor != null) {
                sb.append(hairColor).append(' ');
            }
            if (hairType != null) {
                sb.append(hairType).append(' ');
            }
            sb.append(hairType != HairType.BALD ? "hair" : "head");
        }

        return sb.toString();
    }

    public static class Builder{

        private final Profession profession;
        private final String name;
        private HairType hairType;
        private HairColor hairColor;

        public Builder(Profession profession, String name){
            this.profession = profession;
            this.name = name;
        }

        public Builder withHairType(HairType hairType){
            this.hairType = hairType;
            return this;
        }

        public Builder withHairColor(HairColor hairColor){
            this.hairColor = hairColor;
            return this;
        }

        public Hero build(){
            return new Hero(this);
        }
    }
}
