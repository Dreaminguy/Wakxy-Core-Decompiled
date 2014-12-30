package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.*;
import java.awt.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import com.ankamagames.xulor2.appearance.*;

public class DeathMessageBoxDialog implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public DeathMessageBoxDialog() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public BasicElement getElement(final Environment env, final ElementMap item) {
        this.env = env;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final Window window = new Window();
        window.onCheckOut();
        window.setElementMap(elementMap);
        window.onAttributesInitialized();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setAlign(Alignment17.CENTER);
        window.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final StaticLayout element2 = new StaticLayout();
        element2.onCheckOut();
        element2.setAdaptToContentSize(true);
        window.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        final String id = "messageBoxImage";
        final Image image = new Image();
        image.onCheckOut();
        image.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, image);
        }
        image.setScaled(false);
        image.setAlign(Alignment17.NORTH);
        image.setVisible(false);
        window.addBasicElement(image);
        image.onAttributesInitialized();
        image.onChildrenAdded();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setStyle("decorated");
        window.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final StaticLayoutData element3 = new StaticLayoutData();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setSize(new Dimension(100.0f, 100.0f));
        checkOut.addBasicElement(element3);
        element3.onAttributesInitialized();
        element3.onChildrenAdded();
        final DecoratorAppearance appearance = checkOut.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Margin checkOut2 = Margin.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setInsets(new Insets(0, 0, 17, 0));
        appearance.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        appearance.onChildrenAdded();
        final RowLayout checkOut3 = RowLayout.checkOut();
        checkOut3.setHorizontal(false);
        checkOut.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final String id2 = "messageBoxTextView";
        final TextView textView = new TextView();
        textView.onCheckOut();
        textView.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, textView);
        }
        textView.setStyle("white11");
        textView.setMinWidth(170);
        textView.setMaxWidth(200);
        checkOut.addBasicElement(textView);
        textView.onAttributesInitialized();
        final RowLayoutData element4 = new RowLayoutData();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setAlign(Alignment9.CENTER);
        textView.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        final DecoratorAppearance appearance2 = textView.getAppearance();
        appearance2.setElementMap(elementMap);
        textView.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Margin checkOut4 = Margin.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setInsets(new Insets(20, 10, 20, 10));
        appearance2.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        appearance2.onChildrenAdded();
        textView.onChildrenAdded();
        final String id3 = "messageBoxTextEditor";
        final TextEditor textEditor = new TextEditor();
        textEditor.onCheckOut();
        textEditor.setElementMap(elementMap);
        if (elementMap != null && id3 != null) {
            elementMap.add(id3, textEditor);
        }
        checkOut.addBasicElement(textEditor);
        textEditor.onAttributesInitialized();
        final DecoratorAppearance appearance3 = textEditor.getAppearance();
        appearance3.setElementMap(elementMap);
        textEditor.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final Margin checkOut5 = Margin.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setInsets(new Insets(5, 5, 5, 5));
        appearance3.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        appearance3.onChildrenAdded();
        textEditor.onChildrenAdded();
        final String id4 = "messageBoxButtonsContainer";
        final Container checkOut6 = Container.checkOut();
        checkOut6.setElementMap(elementMap);
        if (elementMap != null && id4 != null) {
            elementMap.add(id4, checkOut6);
        }
        checkOut6.setExpandable(false);
        checkOut.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        final RowLayout checkOut7 = RowLayout.checkOut();
        checkOut7.setAlign(Alignment9.CENTER);
        checkOut6.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final DecoratorAppearance appearance4 = checkOut6.getAppearance();
        appearance4.setElementMap(elementMap);
        checkOut6.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final Margin checkOut8 = Margin.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setInsets(new Insets(5, 15, 5, 15));
        appearance4.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        appearance4.onChildrenAdded();
        final String id5 = "messageBoxButton";
        final Button button = new Button();
        button.onCheckOut();
        button.setElementMap(elementMap);
        if (elementMap != null && id5 != null) {
            elementMap.add(id5, button);
        }
        button.setPrefSize(new Dimension(50, 0));
        button.setExpandable(false);
        button.setStyle("small");
        checkOut6.addBasicElement(button);
        button.onAttributesInitialized();
        final DecoratorAppearance appearance5 = button.getAppearance();
        appearance5.setElementMap(elementMap);
        button.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        final Padding element5 = new Padding();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setInsets(new Insets(5, 10, 5, 10));
        appearance5.addBasicElement(element5);
        element5.onAttributesInitialized();
        element5.onChildrenAdded();
        final Margin checkOut9 = Margin.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setInsets(new Insets(0, 10, 0, 10));
        appearance5.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        appearance5.onChildrenAdded();
        button.onChildrenAdded();
        checkOut6.onChildrenAdded();
        checkOut.onChildrenAdded();
        final Container checkOut10 = Container.checkOut();
        checkOut10.setElementMap(elementMap);
        window.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        final StaticLayoutData element6 = new StaticLayoutData();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setAlign(Alignment17.SOUTH);
        checkOut10.addBasicElement(element6);
        element6.onAttributesInitialized();
        element6.onChildrenAdded();
        final RowLayout checkOut11 = RowLayout.checkOut();
        checkOut11.setAlign(Alignment9.CENTER);
        checkOut10.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        final Container checkOut12 = Container.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setStyle("deathTooth");
        checkOut12.setExpandable(false);
        checkOut12.setPrefSize(new Dimension(15, 6));
        checkOut10.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        final Container checkOut13 = Container.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setStyle("deathTooth");
        checkOut13.setExpandable(false);
        checkOut13.setPrefSize(new Dimension(15, 6));
        checkOut10.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        checkOut13.onChildrenAdded();
        final Container checkOut14 = Container.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setStyle("deathTooth");
        checkOut14.setExpandable(false);
        checkOut14.setPrefSize(new Dimension(15, 6));
        checkOut10.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        checkOut10.onChildrenAdded();
        window.onChildrenAdded();
        return window;
    }
}
