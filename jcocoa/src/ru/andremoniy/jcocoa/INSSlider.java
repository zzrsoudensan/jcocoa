package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.*;
import ns.NSCell;
import static ns.NSCell.*;
import ns.INSCell;
import static ns.INSCell.*;
import ns.NSColor;
import static ns.NSColor.*;
import ns.INSColor;
import static ns.INSColor.*;
import ns.NSFont;
import static ns.NSFont.*;
import ns.INSFont;
import static ns.INSFont.*;
import ns.NSImage;
import static ns.NSImage.*;
import ns.INSImage;
import static ns.INSImage.*;
import ns.NSEvent;
import static ns.NSEvent.*;
import ns.INSEvent;
import static ns.INSEvent.*;

import ns.NSControl;

public abstract class INSSlider extends NSControl {
	public double minValue() { return null;
};
	public void setMinValue(double aDouble) { return ;
};
	public double maxValue() { return null;
};
	public void setMaxValue(double aDouble) { return ;
};
	public void setAltIncrementValue(double incValue) { return ;
};
	public double altIncrementValue() { return null;
};
	public void setTitleCell(NSCell aCell) { return ;
};
	public NSObject titleCell() { return null;
};
	public void setTitleColor(NSColor newColor) { return ;
};
	public NSColor titleColor() { return null;
};
	public void setTitleFont(NSFont fontObj) { return ;
};
	public NSFont titleFont() { return null;
};
	public String title() { return null;
};
	public void setTitle(String aString) { return ;
};
	public void setKnobThickness(Double aFloat) { return ;
};
	public Double knobThickness() { return null;
};
	public void setImage(NSImage backgroundImage) { return ;
};
	public NSImage image() { return null;
};
	public Integer isVertical() { return null;
};
	public Boolean acceptsFirstMouse(NSEvent theEvent) { return null;
};
	public void setNumberOfTickMarks(Integer count) { return ;
};
	public Integer numberOfTickMarks() { return null;
};
	public void setTickMarkPosition(NSTickMarkPosition position) { return ;
};
	public NSTickMarkPosition tickMarkPosition() { return null;
};
	public void setAllowsTickMarkValuesOnly(Boolean yorn) { return ;
};
	public Boolean allowsTickMarkValuesOnly() { return null;
};
	public double tickMarkValueAtIndex(Integer index) { return null;
};
	public NSRect rectOfTickMarkAtIndex(Integer index) { return null;
};
	public Integer indexOfTickMarkAtPoint(NSPoint point) { return null;
};
	public double closestTickMarkValueToValue(double value) { return null;
};
}
