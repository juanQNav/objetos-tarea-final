package uaslp.objetos.figuras;

public class Figura implements DrawableItem{
    private final String name;
    private final String description;

    public Figura(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void draw() {
        System.out.println("0");
    }
}
