            package io.sentry.android.replay.viewhierarchy;

            import android.view.View;
            import androidx.compose.ui.geometry.Rect;
            import androidx.compose.ui.graphics.Color;
            import androidx.compose.ui.graphics.ColorKt;
            import androidx.compose.ui.graphics.painter.Painter;
            import androidx.compose.ui.layout.LayoutCoordinates;
            import androidx.compose.ui.layout.LayoutCoordinatesKt;
            import androidx.compose.ui.node.LayoutNode;
            import androidx.compose.ui.semantics.AccessibilityAction;
            import androidx.compose.ui.semantics.SemanticsActions;
            import androidx.compose.ui.semantics.SemanticsConfiguration;
            import androidx.compose.ui.semantics.SemanticsConfigurationKt;
            import androidx.compose.ui.semantics.SemanticsProperties;
            import androidx.compose.ui.text.TextLayoutInput;
            import androidx.compose.ui.text.TextLayoutResult;
            import androidx.compose.ui.text.TextStyle;
            import androidx.compose.ui.unit.TextUnit;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.android.replay.AbstractC1374z;
            import io.sentry.android.replay.util.AbstractC1352f;
            import io.sentry.android.replay.util.C1347a;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.CopyOnWriteArraySet;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import p000.AbstractC2211ta;
            import p000.p51;
            import p000.r51;
            import p000.v51;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1364b {

                /* JADX INFO: renamed from: a */
                public static final p51 f10681a = r51.m8064a(v51.f17866b, C1363a.f10680a);

                /* JADX INFO: renamed from: b */
                public static boolean f10682b;

                /* JADX INFO: renamed from: c */
                public static WeakReference f10683c;

                /* JADX INFO: renamed from: a */
                public static AbstractC1370h m5043a(LayoutNode layoutNode, AbstractC1370h abstractC1370h, boolean z, AbstractC2211ta abstractC2211ta, ILogger iLogger) {
                    TextLayoutInput layoutInput;
                    TextStyle style;
                    TextLayoutInput layoutInput2;
                    TextStyle style2;
                    AccessibilityAction accessibilityAction;
                    Function1 function1;
/* 8 */             if (!layoutNode.isPlaced() || !layoutNode.isAttached()) {
/* 7 */                 return null;
                    }
/* 16 */            if (z) {
/* 31 */                f10683c = new WeakReference(LayoutCoordinatesKt.findRootCoordinates(layoutNode.getCoordinates()));
                    }
/* 33 */            LayoutCoordinates coordinates = layoutNode.getCoordinates();
/* 37 */            WeakReference weakReference = f10683c;
/* 49 */            Rect rectM5037a = AbstractC1352f.m5037a(coordinates, weakReference != null ? (LayoutCoordinates) weakReference.get() : null);
/* 54 */            boolean z2 = false;
                    try {
/* 56 */                SemanticsConfiguration semanticsConfigurationM5046d = m5046d(layoutNode);
/* 108 */               boolean z3 = !AbstractC1365c.m5051c(layoutNode) && (semanticsConfigurationM5046d == null || !semanticsConfigurationM5046d.contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) && rectM5037a.getBottom() - rectM5037a.getTop() > 0.0f && rectM5037a.getRight() - rectM5037a.getLeft() > 0.0f;
/* 140 */               boolean z4 = (semanticsConfigurationM5046d != null && semanticsConfigurationM5046d.contains(SemanticsActions.INSTANCE.getSetText())) || (semanticsConfigurationM5046d != null && semanticsConfigurationM5046d.contains(SemanticsProperties.INSTANCE.getEditableText()));
/* 141 */               if ((semanticsConfigurationM5046d != null && semanticsConfigurationM5046d.contains(SemanticsProperties.INSTANCE.getText())) || z4) {
/* 168 */                   boolean z5 = z3 && m5047e(semanticsConfigurationM5046d, false, abstractC2211ta);
/* 171 */                   ArrayList arrayList = new ArrayList();
/* 174 */                   if (semanticsConfigurationM5046d != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfigurationM5046d, SemanticsActions.INSTANCE.getGetTextLayoutResult())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                            }
/* 208 */                   TextLayoutResult textLayoutResult = (TextLayoutResult) CollectionsKt.firstOrNull(arrayList);
/* 233 */                   Color colorM5039c = (textLayoutResult == null || (layoutInput2 = textLayoutResult.getLayoutInput()) == null || (style2 = layoutInput2.getStyle()) == null) ? null : Color.box-impl(style2.getColor-0d7_KjU());
/* 234 */                   if (colorM5039c != null && colorM5039c.unbox-impl() == 16) {
/* 246 */                       colorM5039c = AbstractC1352f.m5039c(layoutNode);
                            }
/* 273 */                   TextUnit textUnit = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null || (style = layoutInput.getStyle()) == null) ? null : TextUnit.box-impl(style.getFontSize-XSAIIZE());
/* 305 */                   C1347a c1347a = (textLayoutResult == null || z4 || (textUnit != null ? TextUnit.equals-impl0(textUnit.unbox-impl(), TextUnit.Companion.getUnspecified-XSAIIZE()) : false)) ? null : new C1347a(textLayoutResult);
/* 319 */                   Integer numValueOf = colorM5039c != null ? Integer.valueOf(ColorKt.toArgb-8_81llA(colorM5039c.unbox-impl()) | (-16777216)) : null;
/* 323 */                   rectM5037a.getLeft();
/* 326 */                   rectM5037a.getTop();
/* 348 */                   return new C1369g(c1347a, numValueOf, 0, 0, layoutNode.getWidth(), layoutNode.getHeight(), abstractC1370h.f10693c, abstractC1370h, z5, z3, AbstractC1352f.m5040d(rectM5037a));
                        }
/* 352 */               Painter painterM5038b = AbstractC1352f.m5038b(layoutNode);
/* 356 */               if (painterM5038b == null) {
/* 436 */                   if (z3 && m5047e(semanticsConfigurationM5046d, false, abstractC2211ta)) {
/* 444 */                       z2 = true;
                            }
/* 447 */                   rectM5037a.getLeft();
/* 450 */                   rectM5037a.getTop();
/* 469 */                   return new C1366d(layoutNode.getWidth(), layoutNode.getHeight(), abstractC1370h.f10693c, abstractC1370h, z2, z3, AbstractC1352f.m5040d(rectM5037a));
                        }
/* 368 */               boolean z6 = z3 && m5047e(semanticsConfigurationM5046d, true, abstractC2211ta);
/* 369 */               rectM5037a.getLeft();
/* 372 */               rectM5037a.getTop();
/* 376 */               int width = layoutNode.getWidth();
/* 381 */               int height = layoutNode.getHeight();
/* 386 */               float f = abstractC1370h.f10693c;
/* 388 */               if (z6) {
/* 394 */                   String name = painterM5038b.getClass().getName();
/* 404 */                   if (!StringsKt.m6240z(name, "Vector", false) && !StringsKt.m6240z(name, "Color", false) && !StringsKt.m6240z(name, "Brush", false)) {
/* 422 */                       z2 = true;
                            }
                        }
/* 431 */               return new C1367e(width, height, f, abstractC1370h, z2, z3, AbstractC1352f.m5040d(rectM5037a));
                    } catch (Throwable th) {
/* 477 */               if (!f10682b) {
/* 479 */                   f10682b = true;
/* 489 */                   iLogger.mo4670b(EnumC1553m5.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
                        }
/* 504 */               if ("true".equalsIgnoreCase(System.getProperty("io.sentry.replay.compose.fail-fast"))) {
/* 569 */                   throw th;
                        }
/* 508 */               rectM5037a.getLeft();
/* 511 */               rectM5037a.getTop();
/* 565 */               return new C1366d(layoutNode.getWidth(), layoutNode.getHeight(), abstractC1370h.f10693c, abstractC1370h, true, !AbstractC1365c.m5051c(layoutNode) && rectM5037a.getBottom() - rectM5037a.getTop() > 0.0f && rectM5037a.getRight() - rectM5037a.getLeft() > 0.0f, AbstractC1352f.m5040d(rectM5037a));
                    }
                }

                /* JADX INFO: renamed from: b */
                public static boolean m5044b(View view, AbstractC1370h abstractC1370h, AbstractC2211ta abstractC2211ta, ILogger iLogger) {
/* 1 */             abstractC2211ta.getClass();
/* 4 */             iLogger.getClass();
/* 18 */            StringsKt.m6240z(view.getClass().getName(), "AndroidComposeView", false);
/* 17 */            return false;
                }

                /* JADX INFO: renamed from: c */
                public static String m5045c(boolean z, SemanticsConfiguration semanticsConfiguration) {
/* 1 */             if (z) {
/* 3 */                 return "android.widget.ImageView";
                    }
/* 6 */             if (semanticsConfiguration != null) {
                        return (semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getText()) || semanticsConfiguration.contains(SemanticsActions.INSTANCE.getSetText()) || semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getEditableText())) ? "android.widget.TextView" : "android.view.View";
                    }
/* 47 */            return "android.view.View";
                }

                /* JADX INFO: renamed from: d */
                public static final SemanticsConfiguration m5046d(LayoutNode layoutNode) {
/* 1 */             layoutNode.getClass();
                    try {
/* 4 */                 return layoutNode.getSemanticsConfiguration();
                    } catch (Throwable th) {
/* 10 */                p51 p51Var = f10681a;
/* 18 */                if (((Method) p51Var.getValue()) == null) {
/* 37 */                    throw th;
                        }
/* 24 */                Method method = (Method) p51Var.getValue();
/* 26 */                method.getClass();
/* 34 */                return (SemanticsConfiguration) method.invoke(layoutNode, null);
                    }
                }

                /* JADX INFO: renamed from: e */
                public static boolean m5047e(SemanticsConfiguration semanticsConfiguration, boolean z, AbstractC2211ta abstractC2211ta) {
/* 12 */            String str = semanticsConfiguration != null ? (String) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, AbstractC1374z.f10710a) : null;
/* 20 */            if (Intrinsics.m6216a(str, "unmask")) {
/* 22 */                abstractC2211ta.mo4870r();
/* 19 */                return false;
                    }
/* 32 */            if (Intrinsics.m6216a(str, "mask")) {
/* 34 */                abstractC2211ta.mo4870r();
/* 37 */                return true;
                    }
/* 39 */            String strM5045c = m5045c(z, semanticsConfiguration);
/* 51 */            if (((CopyOnWriteArraySet) abstractC2211ta.f17001b).contains(strM5045c)) {
/* 19 */                return false;
                    }
/* 58 */            return ((CopyOnWriteArraySet) abstractC2211ta.f17000a).contains(strM5045c);
                }

                /* JADX INFO: renamed from: f */
                public static void m5048f(LayoutNode layoutNode, AbstractC1370h abstractC1370h, boolean z, AbstractC2211ta abstractC2211ta, ILogger iLogger) {
/* 1 */             List listM5049a = AbstractC1365c.m5049a(layoutNode);
/* 9 */             if (listM5049a.isEmpty()) {
/* 11 */                return;
                    }
/* 18 */            ArrayList arrayList = new ArrayList(listM5049a.size());
/* 21 */            int size = listM5049a.size();
/* 27 */            for (int i = 0; i < size; i++) {
/* 33 */                LayoutNode layoutNode2 = (LayoutNode) listM5049a.get(i);
/* 35 */                AbstractC1370h abstractC1370hM5043a = m5043a(layoutNode2, abstractC1370h, z, abstractC2211ta, iLogger);
/* 39 */                if (abstractC1370hM5043a != null) {
/* 41 */                    arrayList.add(abstractC1370hM5043a);
/* 44 */                    m5048f(layoutNode2, abstractC1370hM5043a, false, abstractC2211ta, iLogger);
                        }
                    }
/* 50 */            abstractC1370h.f10697g = arrayList;
                }
            }
