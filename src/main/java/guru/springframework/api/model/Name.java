
package guru.springframework.api.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

public class Name {

    private String title;
    private String first;
    private String last;
    public final String test;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Name(String first, String last, @Value("${test}") String test) {
        this.first = first;
        this.last = last;
        this.test = test;
    }

    @Bean
    public Name getName() {
        return new Name();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
