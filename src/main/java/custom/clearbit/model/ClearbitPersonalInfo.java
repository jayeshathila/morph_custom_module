package custom.clearbit.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by jayeshathila
 * on 20/05/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClearbitPersonalInfo {

    Geo geo;

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }
}
