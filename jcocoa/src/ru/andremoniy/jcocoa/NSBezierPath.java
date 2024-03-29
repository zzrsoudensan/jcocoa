package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSGeometry;

/**
 * User: Andremoniy
 * Date: 17.06.12
 * Time: 23:54
 */
public class NSBezierPath extends NSObject {

    private static Number defaultFlatness;

    public int length() {
        throw new RuntimeException("not implemented");
    }

    public NSBezierPath bezierPathByTrimmingFromLength(Double margin) {
        throw new RuntimeException("not implemented");
    }

    public NSBezierPath bezierPathByTrimmingToLength(int length) {
        throw new RuntimeException("not implemented");
    }

    public NSBezierPath bezierPathByTrimmingToLength(double length) {
        throw new RuntimeException("not implemented");
    }

    public void closePath() {
        throw new RuntimeException("not implemented");
    }

    public NSBezierPathElement elementAtIndex(int inex, NSPoint[] points) {
        throw new RuntimeException("not implemented");
    }

    public int elementCount() {
        throw new RuntimeException("not implemented");
    }

    public NSPoint firstPoint() {
        throw new RuntimeException("not implemented");
    }

    public Object moveToPoint(NSPoint point) {
        throw new RuntimeException("not implemented");
    }

    public static NSBezierPath bezierPath() {
        throw new RuntimeException("not implemented");
    }

    public NSBezierPath bezierPathByInterpolatingPath(double path) {
        throw new RuntimeException("not implemented");
    }

    public void lineToPoint(NSPoint point) {
        throw new RuntimeException("not implemented");
    }

    public NSPoint lastPoint() {
        throw new RuntimeException("not implemented");
    }

    public void setLineWidth(Double width) {
        throw new RuntimeException("not implemented");
    }

    public void setLineWidth(int width) {
        throw new RuntimeException("not implemented");
    }

    public void stroke() {
        throw new RuntimeException("not implemented");
    }

    public static NSBezierPath bezierPathWithRect(Object rect) {
        throw new RuntimeException("not implemented");
    }

    public void setLineDash(Double[] dash, int i, double v) {
        throw new RuntimeException("not implemented");
    }

    public INSGeometry.NSRect bounds() {
        throw new RuntimeException("not implemented");
    }

    public NSBezierPath copy() {
        throw new RuntimeException("not implemented");
    }

    public void fill() {
        throw new RuntimeException("not implemented");
    }

    public static void clipRect(INSGeometry.NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public boolean isPathClosed() {
        throw new RuntimeException("not implemented");
    }

    public NSBezierPath bezierPathByReversingPath() {
        throw new RuntimeException("not implemented");
    }

    public void appendBezierPathRemovingInitialMoveToPoint(NSBezierPath path) {
        throw new RuntimeException("not implemented");
    }

    public NSPoint setAssociatedPoints(NSPoint[] points, Integer ec) {
        throw new RuntimeException("not implemented");
    }

    public NSArray subPaths() {
        throw new RuntimeException("not implemented");
    }

    public boolean isEmpty() {
        throw new RuntimeException("not implemented");
    }

    public void curveToPoint(NSPoint p1, NSPoint p2, NSPoint p3) {
        throw new RuntimeException("not implemented");
    }

    public NSBezierPath bezierPathByRemovingTrailingElements(int i) {
        throw new RuntimeException("not implemented");
    }

    public void setControlPoint(NSPoint point, Integer partcode) {
        throw new RuntimeException("not implemented");
    }

    public NSBezierPath bezierPathByStrippingRedundantElements() {
        throw new RuntimeException("not implemented");
    }

    public void removeAllPoints() {
        throw new RuntimeException("not implemented");
    }

    public void appendBezierPathWithArcWithCenter(NSPoint centre, Double radius, Double startAngle, Double endAngle) {
        throw new RuntimeException("not implemented");
    }

    public Integer partcodeForLastPoint() {
        throw new RuntimeException("not implemented");
    }

    public NSBezierPath scaledPath(Double scale) {
        throw new RuntimeException("not implemented");
    }

    public void appendBezierPath(NSBezierPath path) {
        throw new RuntimeException("not implemented");
    }

    public static Object bezierPathWithCropMarksForRect(INSGeometry.NSRect rect, int i, Double amount) {
        throw new RuntimeException("not implemented");
    }

    public static Object bezierPathWithCropMarksForRect(INSGeometry.NSRect rect, Double amount) {
        throw new RuntimeException("not implemented");
    }

    public static NSBezierPath bezierPathWithOvalInRect(INSGeometry.NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public static NSLayoutManager textOnPathLayoutManager() {
        throw new RuntimeException("not implemented");
    }

    public static Number defaultLineWidth() {
        throw new RuntimeException("not implemented");
    }

    public static void setDefaultLineWidth(Double lineWidth) {
        throw new RuntimeException("not implemented");
    }

    public static void strokeRect(Object pageDimension) {
        throw new RuntimeException("not implemented");
    }

    public static void strokeLineFromPoint(NSPoint a, NSPoint b) {
        throw new RuntimeException("not implemented");
    }

    public static Object pathUnflatteningPolicy() {
        throw new RuntimeException("not implemented");
    }

    public static NSBezierPath bezierPathWithStandardChainLinkFromPoint(NSPoint pa, NSPoint pb) {
        throw new RuntimeException("not implemented");
    }

    public static void setDefaultFlatness(double flatness) {
        defaultFlatness = new Double(flatness);
    }

    public static Number defaultFlatness() {
        return defaultFlatness;
    }
}
