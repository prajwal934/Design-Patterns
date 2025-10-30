package com.projects;

interface DocumentElement {
//    Interface for document element
    public abstract String render();
}

// It's for the text.
class TextElement implements DocumentElement {
    private String text;

    public TextElement(String text) {
        this.text=text;
    }
//    Override the method
    @Override
    public String render() {
        return text;
    }
}

//For the Image input

class ImageElement implements DocumentElement {
    private String imagePath;

    public ImageElement(String imagePath) {
        this.imagePath=imagePath;
    }

    @Override
    public String render() {
        return "[Image: "+ imagePath + "]";
    }
}

// NewLineElement represents a line break in the document.

class NewLineElement implements DocumentElement {
    @Override
    public String render() {
        return "\n";
    }
}
// TabSpaceElement represents a tab space in the document.

class TabSpaceElement implements DocumentElement {
    @Override
    public String render() {
        return "\t";
    }
}
