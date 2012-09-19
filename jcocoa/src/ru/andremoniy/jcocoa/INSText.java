package ru.andremoniy.cocoa;

import ru.andremoniy.cocoa.*;
import ns.NSRange;
import static ns.NSRange.*;
import ns.INSRange;
import static ns.INSRange.*;
import ns.NSData;
import static ns.NSData.*;
import ns.INSData;
import static ns.INSData.*;
import ns.NSColor;
import static ns.NSColor.*;
import ns.INSColor;
import static ns.INSColor.*;
import ns.NSFont;
import static ns.NSFont.*;
import ns.INSFont;
import static ns.INSFont.*;

import ns.NSView;

public abstract class INSText extends NSView {
public static Integer NSEnterCharacter = 0x0003;
public static Integer NSBackspaceCharacter = 0x0008;
public static Integer NSTabCharacter = 0x0009;
public static Integer NSNewlineCharacter = 0x000a;
public static Integer NSFormFeedCharacter = 0x000c;
public static Integer NSCarriageReturnCharacter = 0x000d;
public static Integer NSBackTabCharacter = 0x0019;
public static Integer NSDeleteCharacter = 0x007f;
public static Integer NSLineSeparatorCharacter = 0x2028;
public static Integer NSParagraphSeparatorCharacter = 0x2029;
public static Integer NSLeftTextAlignment = 0;
public static Integer NSRightTextAlignment = 1;
public static Integer NSCenterTextAlignment = 2;
public static Integer NSJustifiedTextAlignment = 3;
public static Integer NSNaturalTextAlignment = 4;

	public static class NSTextAlignment extends NSUInteger { }public static Integer NSWritingDirectionLeftToRight = 0;
public static Integer NSWritingDirectionRightToLeft = 1;

	public static class NSWritingDirection extends NSInteger { }public static Integer NSTextWritingDirectionEmbedding = (;
public static Integer NSTextWritingDirectionOverride = (;
public static Integer NSIllegalTextMovement = 0;
public static Integer NSReturnTextMovement = 0x10;
public static Integer NSTabTextMovement = 0x11;
public static Integer NSBacktabTextMovement = 0x12;
public static Integer NSLeftTextMovement = 0x13;
public static Integer NSRightTextMovement = 0x14;
public static Integer NSUpTextMovement = 0x15;
public static Integer NSDownTextMovement = 0x16;

	protected NSObject _ivars;

	public String string() { return null;
};
	public void setString(String string) { return ;
};
	public void replaceCharactersInRange(NSRange range, String aString) { return ;
};
	public void replaceCharactersInRange(NSRange range, NSData rtfData) { return ;
};
	public void replaceCharactersInRange(NSRange range, NSData rtfdData) { return ;
};
	public NSData RTFFromRange(NSRange range) { return null;
};
	public NSData RTFDFromRange(NSRange range) { return null;
};
	public Boolean writeRTFDToFile(String path, Boolean flag) { return null;
};
	public Boolean readRTFDFromFile(String path) { return null;
};
	public NSObject delegate() { return null;
};
	public void setDelegate(NSObject anObject) { return ;
};
	public Boolean isEditable() { return null;
};
	public void setEditable(Boolean flag) { return ;
};
	public Boolean isSelectable() { return null;
};
	public void setSelectable(Boolean flag) { return ;
};
	public Boolean isRichText() { return null;
};
	public void setRichText(Boolean flag) { return ;
};
	public Boolean importsGraphics() { return null;
};
	public void setImportsGraphics(Boolean flag) { return ;
};
	public Boolean isFieldEditor() { return null;
};
	public void setFieldEditor(Boolean flag) { return ;
};
	public Boolean usesFontPanel() { return null;
};
	public void setUsesFontPanel(Boolean flag) { return ;
};
	public Boolean drawsBackground() { return null;
};
	public void setDrawsBackground(Boolean flag) { return ;
};
	public NSColor backgroundColor() { return null;
};
	public void setBackgroundColor(NSColor color) { return ;
};
	public Boolean isRulerVisible() { return null;
};
	public NSRange selectedRange() { return null;
};
	public void setSelectedRange(NSRange range) { return ;
};
	public void scrollRangeToVisible(NSRange range) { return ;
};
	public void setFont(NSFont obj) { return ;
};
	public NSFont font() { return null;
};
	public void setTextColor(NSColor color) { return ;
};
	public NSColor textColor() { return null;
};
	public NSTextAlignment alignment() { return null;
};
	public void setAlignment(NSTextAlignment mode) { return ;
};
	public void setTextColor(NSColor color, NSRange range) { return ;
};
	public void setFont(NSFont font, NSRange range) { return ;
};
	public NSSize maxSize() { return null;
};
	public void setMaxSize(NSSize newMaxSize) { return ;
};
	public NSSize minSize() { return null;
};
	public void setMinSize(NSSize newMinSize) { return ;
};
	public Boolean isHorizontallyResizable() { return null;
};
	public void setHorizontallyResizable(Boolean flag) { return ;
};
	public Boolean isVerticallyResizable() { return null;
};
	public void setVerticallyResizable(Boolean flag) { return ;
};
	public void sizeToFit() { return ;
};
	public void copy(NSObject sender) { return ;
};
	public void copyFont(NSObject sender) { return ;
};
	public void copyRuler(NSObject sender) { return ;
};
	public void cut(NSObject sender) { return ;
};
	public void delete(NSObject sender) { return ;
};
	public void paste(NSObject sender) { return ;
};
	public void pasteFont(NSObject sender) { return ;
};
	public void pasteRuler(NSObject sender) { return ;
};
	public void selectAll(NSObject sender) { return ;
};
	public void changeFont(NSObject sender) { return ;
};
	public void alignLeft(NSObject sender) { return ;
};
	public void alignRight(NSObject sender) { return ;
};
	public void alignCenter(NSObject sender) { return ;
};
	public void subscript(NSObject sender) { return ;
};
	public void superscript(NSObject sender) { return ;
};
	public void underline(NSObject sender) { return ;
};
	public void unscript(NSObject sender) { return ;
};
	public void showGuessPanel(NSObject sender) { return ;
};
	public void checkSpelling(NSObject sender) { return ;
};
	public void toggleRuler(NSObject sender) { return ;
};
}