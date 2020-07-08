package House;

import House.using_enum.HouseCondition;

public class House {

    private double houseArea;
    private String district;
    private int builtYear;
    private HouseCondition condition; // fitted, partially finished, not finished

    public House(double houseArea, String district, int builtYear, HouseCondition condition) {
        this.houseArea = houseArea;
        this.district = district;
        this.builtYear = builtYear;
        this.condition = condition;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public double getHouseArea() {
        return houseArea;
    }

    public HouseCondition getCondition() {
        return condition;
    }

    public String toString() {
        return "House{" +
                "houseArea=" + houseArea +
                ", district='" + district + '\'' +
                ", builtYear=" + builtYear +
                ", condition='" + condition.name + '\'' +
                '}';
    }
}

