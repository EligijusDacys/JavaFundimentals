package House.using_enum;

public enum HouseCondition {

    FITTED("fitted house"),
    PARTIALLY_FINISHED("Partially finished house"),
    NOT_FINISHED("not finished house");

    public String name;

    HouseCondition(String name){
        this.name = name;
    }

}
