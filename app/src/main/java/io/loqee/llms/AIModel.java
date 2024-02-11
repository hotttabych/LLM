package io.loqee.llms;

public class AIModel {

    private String name;
    private String developer;
    private String properties;
    private String year;

    public AIModel(String name, String developer, String properties, String year) {
        this.name = name;
        this.developer = developer;
        this.properties = properties;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getProperties() {
        return properties;
    }

    public String getYear() {
        return year;
    }
}
