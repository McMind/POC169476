package restaurant;

public class Chef{
    private int id;
    private String name;
    private double skillLevel;

    public Chef(int id, String name, double skillLevel) {
        this.id = id;
        this.name = name == null ? "" : name;
        this.skillLevel = skillLevel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSkillLevel() {
        return skillLevel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name == null ? "" : name;
    }

    public void setSkillLevel(double skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chef chef = (Chef) o;

        if (getId() != chef.getId()) return false;
        if (Double.compare(getSkillLevel(), chef.getSkillLevel()) != 0) return false;
        return getName().equals(chef.getName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        result = 31 * result + getName().hashCode();
        temp = Double.doubleToLongBits(getSkillLevel());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  "Name='" + name + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }
}
