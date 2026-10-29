            package p000;

            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.graphics.ColorFilter;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import java.io.IOException;
            import org.xmlpull.v1.XmlPullParser;
            import org.xmlpull.v1.XmlPullParserException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class s90 {
                /* JADX INFO: renamed from: a */
                public static void m8441a(Drawable drawable, Resources.Theme theme) {
/* 1 */             drawable.applyTheme(theme);
                }

                /* JADX INFO: renamed from: b */
                public static boolean m8442b(Drawable drawable) {
/* 1 */             return drawable.canApplyTheme();
                }

                /* JADX INFO: renamed from: c */
                public static ColorFilter m8443c(Drawable drawable) {
/* 1 */             return drawable.getColorFilter();
                }

                /* JADX INFO: renamed from: d */
                public static void m8444d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
/* 1 */             drawable.inflate(resources, xmlPullParser, attributeSet, theme);
                }

                /* JADX INFO: renamed from: e */
                public static void m8445e(Drawable drawable, float f, float f2) {
/* 1 */             drawable.setHotspot(f, f2);
                }

                /* JADX INFO: renamed from: f */
                public static void m8446f(Drawable drawable, int i, int i2, int i3, int i4) {
/* 1 */             drawable.setHotspotBounds(i, i2, i3, i4);
                }

                /* JADX INFO: renamed from: g */
                public static void m8447g(Drawable drawable, int i) {
/* 1 */             drawable.setTint(i);
                }

                /* JADX INFO: renamed from: h */
                public static void m8448h(Drawable drawable, ColorStateList colorStateList) {
/* 1 */             drawable.setTintList(colorStateList);
                }

                /* JADX INFO: renamed from: i */
                public static void m8449i(Drawable drawable, PorterDuff.Mode mode) {
/* 1 */             drawable.setTintMode(mode);
                }
            }
