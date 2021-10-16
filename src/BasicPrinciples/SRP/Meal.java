package BasicPrinciples.SRP;

import java.util.List;

public class Meal {
    public List<String> materials;
    public int timeCook;

    public List<String> getMaterials() {
        return materials;
    }

    public void setMaterials(List<String> materials) {
        this.materials = materials;
    }

    public int getTime() {
        return timeCook;
    }

    public void setTime(int timeCook) {
        this.timeCook = timeCook;
    }
}
