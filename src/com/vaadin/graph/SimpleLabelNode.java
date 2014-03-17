package com.vaadin.graph;

import java.util.Map;

/**
 * @author tsarevskiy
 * @version $Id$
 */
public abstract class SimpleLabelNode implements Node {

    public String getContent() {
        String delim;
        String open;
        String close;
        StringBuilder builder = new StringBuilder("<b>" + getLabel() + "</b><br>");
        delim = "<br>";
        open = "<i>";
        close = ":</i> ";
        for (Map.Entry<String, Object> property : getProperties().entrySet()) {
            builder.append(open).append(property.getKey()).append(close).append(property.getValue()).append(delim);
        }
        String label = builder.toString();
        return label;
    }
}
