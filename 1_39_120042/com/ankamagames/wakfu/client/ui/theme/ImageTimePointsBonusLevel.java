package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.appearance.*;

public class ImageTimePointsBonusLevel implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public ImageTimePointsBonusLevel() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public void applyStyle(final ElementMap item, final DocumentParser doc, final Widget widget) {
        this.doc = doc;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final DecoratorAppearance appearance = widget.getAppearance();
        appearance.setElementMap(elementMap);
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final ParticleDecorator element = new ParticleDecorator();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setAlignment(Alignment9.CENTER);
        element.setFile("6001044.xps");
        element.setLevel(100);
        appearance.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setHeight(18);
        checkOut.setPosition(Alignment17.CENTER);
        checkOut.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut.setWidth(18);
        checkOut.setX(870);
        checkOut.setY(218);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        appearance.onChildrenAdded();
    }
}
