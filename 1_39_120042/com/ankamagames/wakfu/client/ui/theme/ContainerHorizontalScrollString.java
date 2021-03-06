package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.framework.graphics.engine.geometry.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.appearance.*;

public class ContainerHorizontalScrollString implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public ContainerHorizontalScrollString() {
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
        final String id = "horizontalscrollStringBackground";
        final PixmapBackground checkOut = PixmapBackground.checkOut();
        checkOut.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut);
        }
        checkOut.setScaled(true);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final PixmapElement checkOut2 = PixmapElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setHeight(1);
        checkOut2.setPosition(Alignment17.CENTER);
        checkOut2.setRotation(GeometrySprite.SpriteRotation.QUARTER_COUNTER_CLOCKWISE);
        checkOut2.setWidth(0);
        checkOut2.setX(1183);
        checkOut2.setY(226);
        checkOut.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        checkOut.onChildrenAdded();
        final String id2 = "horizontalScrollStringBorder";
        final PixmapBorder pixmapBorder = new PixmapBorder();
        pixmapBorder.onCheckOut();
        pixmapBorder.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, pixmapBorder);
        }
        appearance.addBasicElement(pixmapBorder);
        pixmapBorder.onAttributesInitialized();
        final PixmapElement checkOut3 = PixmapElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setHeight(12);
        checkOut3.setPosition(Alignment17.SOUTH_WEST);
        checkOut3.setRotation(GeometrySprite.SpriteRotation.QUARTER_COUNTER_CLOCKWISE);
        checkOut3.setTexture(this.doc.getTexture("scroll_0.tga"));
        checkOut3.setWidth(6);
        checkOut3.setX(200);
        checkOut3.setY(185);
        pixmapBorder.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final PixmapElement checkOut4 = PixmapElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setHeight(12);
        checkOut4.setPosition(Alignment17.WEST);
        checkOut4.setRotation(GeometrySprite.SpriteRotation.QUARTER_COUNTER_CLOCKWISE);
        checkOut4.setWidth(0);
        checkOut4.setX(1183);
        checkOut4.setY(211);
        pixmapBorder.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final PixmapElement checkOut5 = PixmapElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setHeight(12);
        checkOut5.setPosition(Alignment17.NORTH_WEST);
        checkOut5.setRotation(GeometrySprite.SpriteRotation.QUARTER_COUNTER_CLOCKWISE);
        checkOut5.setTexture(this.doc.getTexture("scroll_0.tga"));
        checkOut5.setWidth(4);
        checkOut5.setX(218);
        checkOut5.setY(185);
        pixmapBorder.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final PixmapElement checkOut6 = PixmapElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setHeight(1);
        checkOut6.setPosition(Alignment17.NORTH);
        checkOut6.setRotation(GeometrySprite.SpriteRotation.QUARTER_COUNTER_CLOCKWISE);
        checkOut6.setTexture(this.doc.getTexture("scroll_0.tga"));
        checkOut6.setWidth(4);
        checkOut6.setX(333);
        checkOut6.setY(196);
        pixmapBorder.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setHeight(12);
        checkOut7.setPosition(Alignment17.NORTH_EAST);
        checkOut7.setRotation(GeometrySprite.SpriteRotation.QUARTER_COUNTER_CLOCKWISE);
        checkOut7.setTexture(this.doc.getTexture("scroll_0.tga"));
        checkOut7.setWidth(4);
        checkOut7.setX(225);
        checkOut7.setY(185);
        pixmapBorder.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final PixmapElement checkOut8 = PixmapElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setHeight(12);
        checkOut8.setPosition(Alignment17.EAST);
        checkOut8.setRotation(GeometrySprite.SpriteRotation.QUARTER_COUNTER_CLOCKWISE);
        checkOut8.setWidth(0);
        checkOut8.setX(1183);
        checkOut8.setY(231);
        pixmapBorder.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        final PixmapElement checkOut9 = PixmapElement.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setHeight(12);
        checkOut9.setPosition(Alignment17.SOUTH_EAST);
        checkOut9.setRotation(GeometrySprite.SpriteRotation.QUARTER_COUNTER_CLOCKWISE);
        checkOut9.setTexture(this.doc.getTexture("scroll_0.tga"));
        checkOut9.setWidth(6);
        checkOut9.setX(209);
        checkOut9.setY(185);
        pixmapBorder.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        final PixmapElement checkOut10 = PixmapElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setHeight(1);
        checkOut10.setPosition(Alignment17.SOUTH);
        checkOut10.setRotation(GeometrySprite.SpriteRotation.QUARTER_COUNTER_CLOCKWISE);
        checkOut10.setTexture(this.doc.getTexture("scroll_0.tga"));
        checkOut10.setWidth(6);
        checkOut10.setX(324);
        checkOut10.setY(196);
        pixmapBorder.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        pixmapBorder.onChildrenAdded();
        appearance.onChildrenAdded();
    }
}
