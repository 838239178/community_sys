package jmu.shijh.community_system.common.sqlbuilder.enums;

public enum Logic {
    AND("and"),OR("or"),EMPTY("");

    String name;

    Logic(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
