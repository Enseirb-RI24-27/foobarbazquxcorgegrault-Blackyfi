package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;
    private Corge corge;

    public Foo(Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public List<Baz> getBazs() {
        return bazs;
    }

    public void addBaz(Baz baz) {
        if (baz != null && !this.bazs.contains(baz)) {
            this.bazs.add(baz);
        }
    }
    public Qux getQux() {
        return qux;
    }
    
    public void setQux(Qux qux) {
        this.qux = qux;
    }

    public Corge getCorge() {
        return corge;
    }
}
