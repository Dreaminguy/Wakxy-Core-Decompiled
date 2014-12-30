package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.appearance.*;

public class SliderVolume implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public SliderVolume() {
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
        final PixmapBackground checkOut = PixmapBackground.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setEnabled(true);
        checkOut.setScaled(true);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final PixmapElement checkOut2 = PixmapElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setHeight(2);
        checkOut2.setPosition(Alignment17.NORTH_WEST);
        checkOut2.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut2.setWidth(3);
        checkOut2.setX(900);
        checkOut2.setY(214);
        checkOut.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final PixmapElement checkOut3 = PixmapElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setHeight(2);
        checkOut3.setPosition(Alignment17.NORTH);
        checkOut3.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut3.setWidth(1);
        checkOut3.setX(827);
        checkOut3.setY(716);
        checkOut.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final PixmapElement checkOut4 = PixmapElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setFlipHorizontaly(true);
        checkOut4.setHeight(2);
        checkOut4.setPosition(Alignment17.NORTH_EAST);
        checkOut4.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut4.setWidth(3);
        checkOut4.setX(900);
        checkOut4.setY(214);
        checkOut.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final PixmapElement checkOut5 = PixmapElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setHeight(1);
        checkOut5.setPosition(Alignment17.WEST);
        checkOut5.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut5.setWidth(3);
        checkOut5.setX(459);
        checkOut5.setY(210);
        checkOut.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final PixmapElement checkOut6 = PixmapElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setHeight(1);
        checkOut6.setPosition(Alignment17.CENTER);
        checkOut6.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut6.setWidth(1);
        checkOut6.setX(626);
        checkOut6.setY(201);
        checkOut.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setFlipHorizontaly(true);
        checkOut7.setHeight(1);
        checkOut7.setPosition(Alignment17.EAST);
        checkOut7.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut7.setWidth(3);
        checkOut7.setX(459);
        checkOut7.setY(210);
        checkOut.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final PixmapElement checkOut8 = PixmapElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setFlipVerticaly(true);
        checkOut8.setHeight(2);
        checkOut8.setPosition(Alignment17.SOUTH_WEST);
        checkOut8.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut8.setWidth(3);
        checkOut8.setX(900);
        checkOut8.setY(214);
        checkOut.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        final PixmapElement checkOut9 = PixmapElement.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setFlipVerticaly(true);
        checkOut9.setHeight(2);
        checkOut9.setPosition(Alignment17.SOUTH);
        checkOut9.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut9.setWidth(1);
        checkOut9.setX(827);
        checkOut9.setY(716);
        checkOut.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        final PixmapElement checkOut10 = PixmapElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setFlipHorizontaly(true);
        checkOut10.setFlipVerticaly(true);
        checkOut10.setHeight(2);
        checkOut10.setPosition(Alignment17.SOUTH_EAST);
        checkOut10.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut10.setWidth(3);
        checkOut10.setX(900);
        checkOut10.setY(214);
        checkOut.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        checkOut.onChildrenAdded();
        final Widget widgetByThemeElementName = appearance.getParentOfType(Widget.class).getWidgetByThemeElementName("horizontalButton", false);
        if (widgetByThemeElementName != null) {
            final DecoratorAppearance appearance2 = widgetByThemeElementName.getAppearance();
            appearance2.setElementMap(elementMap);
            appearance2.setState("default");
            widgetByThemeElementName.addBasicElement(appearance2);
            appearance2.onAttributesInitialized();
            final PixmapElement checkOut11 = PixmapElement.checkOut();
            checkOut11.setElementMap(elementMap);
            checkOut11.setHeight(20);
            checkOut11.setPosition(Alignment17.CENTER);
            checkOut11.setTexture(this.doc.getTexture("default_1.tga"));
            checkOut11.setWidth(20);
            checkOut11.setX(396);
            checkOut11.setY(261);
            appearance2.addBasicElement(checkOut11);
            checkOut11.onAttributesInitialized();
            checkOut11.onChildrenAdded();
            appearance2.onChildrenAdded();
            final DecoratorAppearance appearance3 = widgetByThemeElementName.getAppearance();
            appearance3.setElementMap(elementMap);
            appearance3.setState("mouseHover");
            widgetByThemeElementName.addBasicElement(appearance3);
            appearance3.onAttributesInitialized();
            final PixmapElement checkOut12 = PixmapElement.checkOut();
            checkOut12.setElementMap(elementMap);
            checkOut12.setHeight(20);
            checkOut12.setPosition(Alignment17.CENTER);
            checkOut12.setTexture(this.doc.getTexture("default_1.tga"));
            checkOut12.setWidth(20);
            checkOut12.setX(350);
            checkOut12.setY(261);
            appearance3.addBasicElement(checkOut12);
            checkOut12.onAttributesInitialized();
            checkOut12.onChildrenAdded();
            appearance3.onChildrenAdded();
            final DecoratorAppearance appearance4 = widgetByThemeElementName.getAppearance();
            appearance4.setElementMap(elementMap);
            appearance4.setState("pressed");
            widgetByThemeElementName.addBasicElement(appearance4);
            appearance4.onAttributesInitialized();
            final PixmapElement checkOut13 = PixmapElement.checkOut();
            checkOut13.setElementMap(elementMap);
            checkOut13.setHeight(20);
            checkOut13.setPosition(Alignment17.CENTER);
            checkOut13.setTexture(this.doc.getTexture("default_1.tga"));
            checkOut13.setWidth(20);
            checkOut13.setX(326);
            checkOut13.setY(260);
            appearance4.addBasicElement(checkOut13);
            checkOut13.onAttributesInitialized();
            checkOut13.onChildrenAdded();
            appearance4.onChildrenAdded();
        }
        final Widget widgetByThemeElementName2 = appearance.getParentOfType(Widget.class).getWidgetByThemeElementName("verticalButton", false);
        if (widgetByThemeElementName2 != null) {
            final DecoratorAppearance appearance5 = widgetByThemeElementName2.getAppearance();
            appearance5.setElementMap(elementMap);
            appearance5.setState("default");
            widgetByThemeElementName2.addBasicElement(appearance5);
            appearance5.onAttributesInitialized();
            final PixmapElement checkOut14 = PixmapElement.checkOut();
            checkOut14.setElementMap(elementMap);
            checkOut14.setHeight(20);
            checkOut14.setPosition(Alignment17.CENTER);
            checkOut14.setTexture(this.doc.getTexture("default_1.tga"));
            checkOut14.setWidth(20);
            checkOut14.setX(396);
            checkOut14.setY(261);
            appearance5.addBasicElement(checkOut14);
            checkOut14.onAttributesInitialized();
            checkOut14.onChildrenAdded();
            appearance5.onChildrenAdded();
            final DecoratorAppearance appearance6 = widgetByThemeElementName2.getAppearance();
            appearance6.setElementMap(elementMap);
            appearance6.setState("mouseHover");
            widgetByThemeElementName2.addBasicElement(appearance6);
            appearance6.onAttributesInitialized();
            final PixmapElement checkOut15 = PixmapElement.checkOut();
            checkOut15.setElementMap(elementMap);
            checkOut15.setHeight(20);
            checkOut15.setPosition(Alignment17.CENTER);
            checkOut15.setTexture(this.doc.getTexture("default_1.tga"));
            checkOut15.setWidth(20);
            checkOut15.setX(350);
            checkOut15.setY(261);
            appearance6.addBasicElement(checkOut15);
            checkOut15.onAttributesInitialized();
            checkOut15.onChildrenAdded();
            appearance6.onChildrenAdded();
            final DecoratorAppearance appearance7 = widgetByThemeElementName2.getAppearance();
            appearance7.setElementMap(elementMap);
            appearance7.setState("pressed");
            widgetByThemeElementName2.addBasicElement(appearance7);
            appearance7.onAttributesInitialized();
            final PixmapElement checkOut16 = PixmapElement.checkOut();
            checkOut16.setElementMap(elementMap);
            checkOut16.setHeight(20);
            checkOut16.setPosition(Alignment17.CENTER);
            checkOut16.setTexture(this.doc.getTexture("default_1.tga"));
            checkOut16.setWidth(20);
            checkOut16.setX(326);
            checkOut16.setY(260);
            appearance7.addBasicElement(checkOut16);
            checkOut16.onAttributesInitialized();
            checkOut16.onChildrenAdded();
            appearance7.onChildrenAdded();
        }
        final PixmapElement checkOut17 = PixmapElement.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setHeight(12);
        checkOut17.setPosition(Alignment17.CENTER);
        checkOut17.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut17.setWidth(1);
        checkOut17.setX(319);
        checkOut17.setY(442);
        appearance.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        checkOut17.onChildrenAdded();
        appearance.onChildrenAdded();
    }
}
