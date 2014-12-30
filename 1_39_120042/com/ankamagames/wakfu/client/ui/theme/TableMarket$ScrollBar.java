package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import java.awt.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.framework.graphics.engine.geometry.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.appearance.*;

public class TableMarket$ScrollBar implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public TableMarket$ScrollBar() {
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
        final Widget widgetByThemeElementName = appearance.getParentOfType(Widget.class).getWidgetByThemeElementName("verticalIncreaseButton", false);
        if (widgetByThemeElementName != null) {
            final Padding element = new Padding();
            element.onCheckOut();
            element.setElementMap(elementMap);
            element.setInsets(new Insets(3, 0, 3, 0));
            widgetByThemeElementName.addBasicElement(element);
            element.onAttributesInitialized();
            element.onChildrenAdded();
            final DecoratorAppearance appearance2 = widgetByThemeElementName.getAppearance();
            appearance2.setElementMap(elementMap);
            ((TextWidgetAppearance)appearance2).setAlignment(Alignment9.CENTER);
            appearance2.setState("default");
            widgetByThemeElementName.addBasicElement(appearance2);
            appearance2.onAttributesInitialized();
            final PixmapElement checkOut = PixmapElement.checkOut();
            checkOut.setElementMap(elementMap);
            checkOut.setHeight(18);
            checkOut.setPosition(Alignment17.CENTER);
            checkOut.setRotation(GeometrySprite.SpriteRotation.QUARTER_CLOCKWISE);
            checkOut.setTexture(this.doc.getTexture("default_1.tga"));
            checkOut.setWidth(16);
            checkOut.setX(215);
            checkOut.setY(744);
            appearance2.addBasicElement(checkOut);
            checkOut.onAttributesInitialized();
            checkOut.onChildrenAdded();
            appearance2.onChildrenAdded();
            final DecoratorAppearance appearance3 = widgetByThemeElementName.getAppearance();
            appearance3.setElementMap(elementMap);
            ((TextWidgetAppearance)appearance3).setAlignment(Alignment9.CENTER);
            appearance3.setState("mouseHover");
            widgetByThemeElementName.addBasicElement(appearance3);
            appearance3.onAttributesInitialized();
            final PixmapElement checkOut2 = PixmapElement.checkOut();
            checkOut2.setElementMap(elementMap);
            checkOut2.setHeight(18);
            checkOut2.setPosition(Alignment17.CENTER);
            checkOut2.setRotation(GeometrySprite.SpriteRotation.QUARTER_CLOCKWISE);
            checkOut2.setTexture(this.doc.getTexture("default_0.tga"));
            checkOut2.setWidth(16);
            checkOut2.setX(964);
            checkOut2.setY(14);
            appearance3.addBasicElement(checkOut2);
            checkOut2.onAttributesInitialized();
            checkOut2.onChildrenAdded();
            appearance3.onChildrenAdded();
            final DecoratorAppearance appearance4 = widgetByThemeElementName.getAppearance();
            appearance4.setElementMap(elementMap);
            ((TextWidgetAppearance)appearance4).setAlignment(Alignment9.CENTER);
            appearance4.setState("pressed");
            widgetByThemeElementName.addBasicElement(appearance4);
            appearance4.onAttributesInitialized();
            final PixmapElement checkOut3 = PixmapElement.checkOut();
            checkOut3.setElementMap(elementMap);
            checkOut3.setHeight(18);
            checkOut3.setPosition(Alignment17.CENTER);
            checkOut3.setRotation(GeometrySprite.SpriteRotation.QUARTER_CLOCKWISE);
            checkOut3.setTexture(this.doc.getTexture("default_1.tga"));
            checkOut3.setWidth(16);
            checkOut3.setX(215);
            checkOut3.setY(723);
            appearance4.addBasicElement(checkOut3);
            checkOut3.onAttributesInitialized();
            checkOut3.onChildrenAdded();
            appearance4.onChildrenAdded();
        }
        final Widget widgetByThemeElementName2 = appearance.getParentOfType(Widget.class).getWidgetByThemeElementName("verticalDecreaseButton", false);
        if (widgetByThemeElementName2 != null) {
            final Padding element2 = new Padding();
            element2.onCheckOut();
            element2.setElementMap(elementMap);
            element2.setInsets(new Insets(3, 0, 3, 0));
            widgetByThemeElementName2.addBasicElement(element2);
            element2.onAttributesInitialized();
            element2.onChildrenAdded();
            final DecoratorAppearance appearance5 = widgetByThemeElementName2.getAppearance();
            appearance5.setElementMap(elementMap);
            ((TextWidgetAppearance)appearance5).setAlignment(Alignment9.CENTER);
            appearance5.setState("default");
            widgetByThemeElementName2.addBasicElement(appearance5);
            appearance5.onAttributesInitialized();
            final PixmapElement checkOut4 = PixmapElement.checkOut();
            checkOut4.setElementMap(elementMap);
            checkOut4.setHeight(18);
            checkOut4.setPosition(Alignment17.CENTER);
            checkOut4.setRotation(GeometrySprite.SpriteRotation.QUARTER_COUNTER_CLOCKWISE);
            checkOut4.setTexture(this.doc.getTexture("default_1.tga"));
            checkOut4.setWidth(16);
            checkOut4.setX(215);
            checkOut4.setY(744);
            appearance5.addBasicElement(checkOut4);
            checkOut4.onAttributesInitialized();
            checkOut4.onChildrenAdded();
            appearance5.onChildrenAdded();
            final DecoratorAppearance appearance6 = widgetByThemeElementName2.getAppearance();
            appearance6.setElementMap(elementMap);
            ((TextWidgetAppearance)appearance6).setAlignment(Alignment9.CENTER);
            appearance6.setState("mouseHover");
            widgetByThemeElementName2.addBasicElement(appearance6);
            appearance6.onAttributesInitialized();
            final PixmapElement checkOut5 = PixmapElement.checkOut();
            checkOut5.setElementMap(elementMap);
            checkOut5.setHeight(18);
            checkOut5.setPosition(Alignment17.CENTER);
            checkOut5.setRotation(GeometrySprite.SpriteRotation.QUARTER_COUNTER_CLOCKWISE);
            checkOut5.setTexture(this.doc.getTexture("default_0.tga"));
            checkOut5.setWidth(16);
            checkOut5.setX(964);
            checkOut5.setY(14);
            appearance6.addBasicElement(checkOut5);
            checkOut5.onAttributesInitialized();
            checkOut5.onChildrenAdded();
            appearance6.onChildrenAdded();
            final DecoratorAppearance appearance7 = widgetByThemeElementName2.getAppearance();
            appearance7.setElementMap(elementMap);
            ((TextWidgetAppearance)appearance7).setAlignment(Alignment9.CENTER);
            appearance7.setState("pressed");
            widgetByThemeElementName2.addBasicElement(appearance7);
            appearance7.onAttributesInitialized();
            final PixmapElement checkOut6 = PixmapElement.checkOut();
            checkOut6.setElementMap(elementMap);
            checkOut6.setHeight(18);
            checkOut6.setPosition(Alignment17.CENTER);
            checkOut6.setRotation(GeometrySprite.SpriteRotation.QUARTER_COUNTER_CLOCKWISE);
            checkOut6.setTexture(this.doc.getTexture("default_1.tga"));
            checkOut6.setWidth(16);
            checkOut6.setX(215);
            checkOut6.setY(723);
            appearance7.addBasicElement(checkOut6);
            checkOut6.onAttributesInitialized();
            checkOut6.onChildrenAdded();
            appearance7.onChildrenAdded();
        }
        final Widget widgetByThemeElementName3 = appearance.getParentOfType(Widget.class).getWidgetByThemeElementName("verticalSlider", false);
        if (widgetByThemeElementName3 != null) {
            final DecoratorAppearance appearance8 = widgetByThemeElementName3.getAppearance();
            appearance8.setElementMap(elementMap);
            widgetByThemeElementName3.addBasicElement(appearance8);
            appearance8.onAttributesInitialized();
            final Padding element3 = new Padding();
            element3.onCheckOut();
            element3.setElementMap(elementMap);
            element3.setInsets(new Insets(0, 4, 0, 4));
            appearance8.addBasicElement(element3);
            element3.onAttributesInitialized();
            element3.onChildrenAdded();
            final Widget widgetByThemeElementName4 = appearance8.getParentOfType(Widget.class).getWidgetByThemeElementName("verticalButton", false);
            if (widgetByThemeElementName4 != null) {
                final DecoratorAppearance appearance9 = widgetByThemeElementName4.getAppearance();
                appearance9.setElementMap(elementMap);
                appearance9.setState("default");
                widgetByThemeElementName4.addBasicElement(appearance9);
                appearance9.onAttributesInitialized();
                final PixmapBorder element4 = new PixmapBorder();
                element4.onCheckOut();
                element4.setElementMap(elementMap);
                appearance9.addBasicElement(element4);
                element4.onAttributesInitialized();
                final PixmapElement checkOut7 = PixmapElement.checkOut();
                checkOut7.setElementMap(elementMap);
                checkOut7.setHeight(4);
                checkOut7.setPosition(Alignment17.NORTH_WEST);
                checkOut7.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut7.setWidth(1);
                checkOut7.setX(540);
                checkOut7.setY(286);
                element4.addBasicElement(checkOut7);
                checkOut7.onAttributesInitialized();
                checkOut7.onChildrenAdded();
                final PixmapElement checkOut8 = PixmapElement.checkOut();
                checkOut8.setElementMap(elementMap);
                checkOut8.setHeight(4);
                checkOut8.setPosition(Alignment17.NORTH);
                checkOut8.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut8.setWidth(11);
                checkOut8.setX(146);
                checkOut8.setY(239);
                element4.addBasicElement(checkOut8);
                checkOut8.onAttributesInitialized();
                checkOut8.onChildrenAdded();
                final PixmapElement checkOut9 = PixmapElement.checkOut();
                checkOut9.setElementMap(elementMap);
                checkOut9.setHeight(4);
                checkOut9.setPosition(Alignment17.NORTH_EAST);
                checkOut9.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut9.setWidth(1);
                checkOut9.setX(594);
                checkOut9.setY(286);
                element4.addBasicElement(checkOut9);
                checkOut9.onAttributesInitialized();
                checkOut9.onChildrenAdded();
                final PixmapElement checkOut10 = PixmapElement.checkOut();
                checkOut10.setElementMap(elementMap);
                checkOut10.setHeight(13);
                checkOut10.setPosition(Alignment17.EAST);
                checkOut10.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut10.setWidth(1);
                checkOut10.setX(827);
                checkOut10.setY(753);
                element4.addBasicElement(checkOut10);
                checkOut10.onAttributesInitialized();
                checkOut10.onChildrenAdded();
                final PixmapElement checkOut11 = PixmapElement.checkOut();
                checkOut11.setElementMap(elementMap);
                checkOut11.setHeight(4);
                checkOut11.setPosition(Alignment17.SOUTH_EAST);
                checkOut11.setTexture(this.doc.getTexture("default_0.tga"));
                checkOut11.setWidth(1);
                checkOut11.setX(315);
                checkOut11.setY(474);
                element4.addBasicElement(checkOut11);
                checkOut11.onAttributesInitialized();
                checkOut11.onChildrenAdded();
                final PixmapElement checkOut12 = PixmapElement.checkOut();
                checkOut12.setElementMap(elementMap);
                checkOut12.setHeight(4);
                checkOut12.setPosition(Alignment17.SOUTH);
                checkOut12.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut12.setWidth(11);
                checkOut12.setX(282);
                checkOut12.setY(283);
                element4.addBasicElement(checkOut12);
                checkOut12.onAttributesInitialized();
                checkOut12.onChildrenAdded();
                final PixmapElement checkOut13 = PixmapElement.checkOut();
                checkOut13.setElementMap(elementMap);
                checkOut13.setHeight(4);
                checkOut13.setPosition(Alignment17.SOUTH_WEST);
                checkOut13.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut13.setWidth(1);
                checkOut13.setX(594);
                checkOut13.setY(286);
                element4.addBasicElement(checkOut13);
                checkOut13.onAttributesInitialized();
                checkOut13.onChildrenAdded();
                final PixmapElement checkOut14 = PixmapElement.checkOut();
                checkOut14.setElementMap(elementMap);
                checkOut14.setHeight(13);
                checkOut14.setPosition(Alignment17.WEST);
                checkOut14.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut14.setWidth(1);
                checkOut14.setX(827);
                checkOut14.setY(753);
                element4.addBasicElement(checkOut14);
                checkOut14.onAttributesInitialized();
                checkOut14.onChildrenAdded();
                element4.onChildrenAdded();
                final PixmapBackground checkOut15 = PixmapBackground.checkOut();
                checkOut15.setElementMap(elementMap);
                checkOut15.setEnabled(true);
                checkOut15.setScaled(true);
                appearance9.addBasicElement(checkOut15);
                checkOut15.onAttributesInitialized();
                final PixmapElement checkOut16 = PixmapElement.checkOut();
                checkOut16.setElementMap(elementMap);
                checkOut16.setHeight(2);
                checkOut16.setPosition(Alignment17.CENTER);
                checkOut16.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut16.setWidth(11);
                checkOut16.setX(829);
                checkOut16.setY(283);
                checkOut15.addBasicElement(checkOut16);
                checkOut16.onAttributesInitialized();
                checkOut16.onChildrenAdded();
                checkOut15.onChildrenAdded();
                final PixmapElement checkOut17 = PixmapElement.checkOut();
                checkOut17.setElementMap(elementMap);
                checkOut17.setHeight(5);
                checkOut17.setPosition(Alignment17.CENTER);
                checkOut17.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut17.setWidth(11);
                checkOut17.setX(594);
                checkOut17.setY(669);
                appearance9.addBasicElement(checkOut17);
                checkOut17.onAttributesInitialized();
                checkOut17.onChildrenAdded();
                appearance9.onChildrenAdded();
                final DecoratorAppearance appearance10 = widgetByThemeElementName4.getAppearance();
                appearance10.setElementMap(elementMap);
                appearance10.setState("mouseHover");
                widgetByThemeElementName4.addBasicElement(appearance10);
                appearance10.onAttributesInitialized();
                final PixmapBorder element5 = new PixmapBorder();
                element5.onCheckOut();
                element5.setElementMap(elementMap);
                element5.setEnabled(false);
                appearance10.addBasicElement(element5);
                element5.onAttributesInitialized();
                final PixmapElement checkOut18 = PixmapElement.checkOut();
                checkOut18.setElementMap(elementMap);
                checkOut18.setHeight(4);
                checkOut18.setPosition(Alignment17.NORTH_WEST);
                checkOut18.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut18.setWidth(1);
                checkOut18.setX(321);
                checkOut18.setY(278);
                element5.addBasicElement(checkOut18);
                checkOut18.onAttributesInitialized();
                checkOut18.onChildrenAdded();
                final PixmapElement checkOut19 = PixmapElement.checkOut();
                checkOut19.setElementMap(elementMap);
                checkOut19.setHeight(4);
                checkOut19.setPosition(Alignment17.NORTH);
                checkOut19.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut19.setWidth(11);
                checkOut19.setX(185);
                checkOut19.setY(283);
                element5.addBasicElement(checkOut19);
                checkOut19.onAttributesInitialized();
                checkOut19.onChildrenAdded();
                final PixmapElement checkOut20 = PixmapElement.checkOut();
                checkOut20.setElementMap(elementMap);
                checkOut20.setHeight(4);
                checkOut20.setPosition(Alignment17.NORTH_EAST);
                checkOut20.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut20.setWidth(1);
                checkOut20.setX(594);
                checkOut20.setY(286);
                element5.addBasicElement(checkOut20);
                checkOut20.onAttributesInitialized();
                checkOut20.onChildrenAdded();
                final PixmapElement checkOut21 = PixmapElement.checkOut();
                checkOut21.setElementMap(elementMap);
                checkOut21.setHeight(13);
                checkOut21.setPosition(Alignment17.EAST);
                checkOut21.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut21.setWidth(1);
                checkOut21.setX(397);
                checkOut21.setY(718);
                element5.addBasicElement(checkOut21);
                checkOut21.onAttributesInitialized();
                checkOut21.onChildrenAdded();
                final PixmapElement checkOut22 = PixmapElement.checkOut();
                checkOut22.setElementMap(elementMap);
                checkOut22.setHeight(4);
                checkOut22.setPosition(Alignment17.SOUTH_EAST);
                checkOut22.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut22.setWidth(1);
                checkOut22.setX(294);
                checkOut22.setY(330);
                element5.addBasicElement(checkOut22);
                checkOut22.onAttributesInitialized();
                checkOut22.onChildrenAdded();
                final PixmapElement checkOut23 = PixmapElement.checkOut();
                checkOut23.setElementMap(elementMap);
                checkOut23.setHeight(4);
                checkOut23.setPosition(Alignment17.SOUTH);
                checkOut23.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut23.setWidth(11);
                checkOut23.setX(595);
                checkOut23.setY(586);
                element5.addBasicElement(checkOut23);
                checkOut23.onAttributesInitialized();
                checkOut23.onChildrenAdded();
                final PixmapElement checkOut24 = PixmapElement.checkOut();
                checkOut24.setElementMap(elementMap);
                checkOut24.setHeight(4);
                checkOut24.setPosition(Alignment17.SOUTH_WEST);
                checkOut24.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut24.setWidth(1);
                checkOut24.setX(594);
                checkOut24.setY(286);
                element5.addBasicElement(checkOut24);
                checkOut24.onAttributesInitialized();
                checkOut24.onChildrenAdded();
                final PixmapElement checkOut25 = PixmapElement.checkOut();
                checkOut25.setElementMap(elementMap);
                checkOut25.setHeight(13);
                checkOut25.setPosition(Alignment17.WEST);
                checkOut25.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut25.setWidth(1);
                checkOut25.setX(397);
                checkOut25.setY(718);
                element5.addBasicElement(checkOut25);
                checkOut25.onAttributesInitialized();
                checkOut25.onChildrenAdded();
                element5.onChildrenAdded();
                final PixmapBackground checkOut26 = PixmapBackground.checkOut();
                checkOut26.setElementMap(elementMap);
                checkOut26.setEnabled(false);
                checkOut26.setScaled(true);
                appearance10.addBasicElement(checkOut26);
                checkOut26.onAttributesInitialized();
                final PixmapElement checkOut27 = PixmapElement.checkOut();
                checkOut27.setElementMap(elementMap);
                checkOut27.setHeight(2);
                checkOut27.setPosition(Alignment17.CENTER);
                checkOut27.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut27.setWidth(11);
                checkOut27.setX(800);
                checkOut27.setY(199);
                checkOut26.addBasicElement(checkOut27);
                checkOut27.onAttributesInitialized();
                checkOut27.onChildrenAdded();
                checkOut26.onChildrenAdded();
                final PixmapElement checkOut28 = PixmapElement.checkOut();
                checkOut28.setElementMap(elementMap);
                checkOut28.setHeight(5);
                checkOut28.setPosition(Alignment17.CENTER);
                checkOut28.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut28.setWidth(11);
                checkOut28.setX(968);
                checkOut28.setY(330);
                appearance10.addBasicElement(checkOut28);
                checkOut28.onAttributesInitialized();
                checkOut28.onChildrenAdded();
                appearance10.onChildrenAdded();
                final DecoratorAppearance appearance11 = widgetByThemeElementName4.getAppearance();
                appearance11.setElementMap(elementMap);
                appearance11.setState("pressed");
                widgetByThemeElementName4.addBasicElement(appearance11);
                appearance11.onAttributesInitialized();
                final PixmapBorder element6 = new PixmapBorder();
                element6.onCheckOut();
                element6.setElementMap(elementMap);
                element6.setEnabled(false);
                appearance11.addBasicElement(element6);
                element6.onAttributesInitialized();
                final PixmapElement checkOut29 = PixmapElement.checkOut();
                checkOut29.setElementMap(elementMap);
                checkOut29.setHeight(4);
                checkOut29.setPosition(Alignment17.NORTH_WEST);
                checkOut29.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut29.setWidth(1);
                checkOut29.setX(255);
                checkOut29.setY(292);
                element6.addBasicElement(checkOut29);
                checkOut29.onAttributesInitialized();
                checkOut29.onChildrenAdded();
                final PixmapElement checkOut30 = PixmapElement.checkOut();
                checkOut30.setElementMap(elementMap);
                checkOut30.setHeight(4);
                checkOut30.setPosition(Alignment17.NORTH);
                checkOut30.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut30.setWidth(11);
                checkOut30.setX(280);
                checkOut30.setY(330);
                element6.addBasicElement(checkOut30);
                checkOut30.onAttributesInitialized();
                checkOut30.onChildrenAdded();
                final PixmapElement checkOut31 = PixmapElement.checkOut();
                checkOut31.setElementMap(elementMap);
                checkOut31.setHeight(4);
                checkOut31.setPosition(Alignment17.NORTH_EAST);
                checkOut31.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut31.setWidth(1);
                checkOut31.setX(594);
                checkOut31.setY(286);
                element6.addBasicElement(checkOut31);
                checkOut31.onAttributesInitialized();
                checkOut31.onChildrenAdded();
                final PixmapElement checkOut32 = PixmapElement.checkOut();
                checkOut32.setElementMap(elementMap);
                checkOut32.setHeight(13);
                checkOut32.setPosition(Alignment17.EAST);
                checkOut32.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut32.setWidth(1);
                checkOut32.setX(397);
                checkOut32.setY(766);
                element6.addBasicElement(checkOut32);
                checkOut32.onAttributesInitialized();
                checkOut32.onChildrenAdded();
                final PixmapElement checkOut33 = PixmapElement.checkOut();
                checkOut33.setElementMap(elementMap);
                checkOut33.setHeight(4);
                checkOut33.setPosition(Alignment17.SOUTH_EAST);
                checkOut33.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut33.setWidth(1);
                checkOut33.setX(628);
                checkOut33.setY(276);
                element6.addBasicElement(checkOut33);
                checkOut33.onAttributesInitialized();
                checkOut33.onChildrenAdded();
                final PixmapElement checkOut34 = PixmapElement.checkOut();
                checkOut34.setElementMap(elementMap);
                checkOut34.setHeight(4);
                checkOut34.setPosition(Alignment17.SOUTH);
                checkOut34.setTexture(this.doc.getTexture("default_1.tga"));
                checkOut34.setWidth(11);
                checkOut34.setX(920);
                checkOut34.setY(587);
                element6.addBasicElement(checkOut34);
                checkOut34.onAttributesInitialized();
                checkOut34.onChildrenAdded();
                this.method0(element6);
                this.method1(element6);
                element6.onChildrenAdded();
                this.method2(appearance11);
                this.method3(appearance11);
                appearance11.onChildrenAdded();
            }
            appearance8.onChildrenAdded();
        }
        appearance.onChildrenAdded();
    }
    
    public BasicElement method0(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setHeight(4);
        checkOut.setPosition(Alignment17.SOUTH_WEST);
        checkOut.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut.setWidth(1);
        checkOut.setX(594);
        checkOut.setY(286);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method1(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setHeight(13);
        checkOut.setPosition(Alignment17.WEST);
        checkOut.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut.setWidth(1);
        checkOut.setX(397);
        checkOut.setY(766);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method2(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final PixmapBackground checkOut = PixmapBackground.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setEnabled(false);
        checkOut.setScaled(true);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final PixmapElement checkOut2 = PixmapElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setHeight(2);
        checkOut2.setPosition(Alignment17.CENTER);
        checkOut2.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut2.setWidth(11);
        checkOut2.setX(379);
        checkOut2.setY(239);
        checkOut.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method3(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setHeight(5);
        checkOut.setPosition(Alignment17.CENTER);
        checkOut.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut.setWidth(11);
        checkOut.setX(361);
        checkOut.setY(549);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        return checkOut;
    }
}
