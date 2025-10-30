package com.projects;

import java.util.ArrayList;
import java.util.List;

public class Document {
//     It's responsible for holding a collection of elements.
    private List<DocumentElement> documentElements = new ArrayList<>();

    public void addElement(DocumentElement docElement) {
        documentElements.add(docElement);
    }

//    Renders the document by concatenating the render output of all elements.

    public String render() {
        StringBuilder result = new StringBuilder();

        for(DocumentElement element : documentElements) {
            result.append(element.render());
        }
        return result.toString();
    }
}
