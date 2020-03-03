package com.ocr.downa2;

public enum Kind {
    ACTION("action"),HORREUR("horreur"), COMEDIE ("comédie"), DOCUMENTAIRE ("documentaire"), POLICIER("policier"), DRAME ("drame"), ANIMATION ("animation"), SCIENCE_FICTION("science fiction");


public String name;
Kind (String name) {
this.name = name;
}

}