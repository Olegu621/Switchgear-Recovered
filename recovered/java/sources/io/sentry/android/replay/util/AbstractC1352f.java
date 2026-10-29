            package io.sentry.android.replay.util;

            import androidx.compose.ui.Modifier;
            import androidx.compose.ui.geometry.Offset;
            import androidx.compose.ui.geometry.Rect;
            import androidx.compose.ui.graphics.Color;
            import androidx.compose.ui.graphics.ColorProducer;
            import androidx.compose.ui.graphics.painter.Painter;
            import androidx.compose.ui.layout.LayoutCoordinates;
            import androidx.compose.ui.layout.LayoutCoordinatesKt;
            import androidx.compose.ui.layout.ModifierInfo;
            import androidx.compose.ui.node.LayoutNode;
            import io.flutter.embedding.android.KeyboardMap;
            import java.lang.reflect.Field;
            import java.util.List;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.util.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1352f {
                /* JADX INFO: renamed from: a */
                public static final Rect m5037a(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
/* 1 */             layoutCoordinates.getClass();
/* 11 */            LayoutCoordinates layoutCoordinatesFindRootCoordinates = layoutCoordinates2 == null ? LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates) : layoutCoordinates2;
/* 20 */            float f = (int) (layoutCoordinatesFindRootCoordinates.getSize-YbymL2g() >> 32);
/* 32 */            float f2 = (int) (layoutCoordinatesFindRootCoordinates.getSize-YbymL2g() & KeyboardMap.kValueMask);
/* 37 */            Rect rectLocalBoundingBoxOf = layoutCoordinatesFindRootCoordinates.localBoundingBoxOf(layoutCoordinates, true);
/* 41 */            float left = rectLocalBoundingBoxOf.getLeft();
/* 48 */            if (left < 0.0f) {
/* 50 */                left = 0.0f;
                    }
/* 53 */            if (left > f) {
/* 55 */                left = f;
                    }
/* 56 */            float top = rectLocalBoundingBoxOf.getTop();
/* 62 */            if (top < 0.0f) {
/* 64 */                top = 0.0f;
                    }
/* 67 */            if (top > f2) {
/* 69 */                top = f2;
                    }
/* 70 */            float right = rectLocalBoundingBoxOf.getRight();
/* 76 */            if (right < 0.0f) {
/* 78 */                right = 0.0f;
                    }
/* 81 */            if (right <= f) {
/* 84 */                f = right;
                    }
/* 85 */            float bottom = rectLocalBoundingBoxOf.getBottom();
/* 91 */            if (bottom < 0.0f) {
/* 93 */                bottom = 0.0f;
                    }
/* 96 */            if (bottom <= f2) {
/* 99 */                f2 = bottom;
                    }
/* 102 */           if (left == f || top == f2) {
/* 111 */               return new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                    }
/* 132 */           long j = layoutCoordinatesFindRootCoordinates.localToWindow-MK-Hz9U(Offset.constructor-impl((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & KeyboardMap.kValueMask)));
/* 153 */           long j2 = layoutCoordinatesFindRootCoordinates.localToWindow-MK-Hz9U(Offset.constructor-impl((((long) Float.floatToRawIntBits(top)) & KeyboardMap.kValueMask) | (((long) Float.floatToRawIntBits(f)) << 32)));
/* 174 */           long j3 = layoutCoordinatesFindRootCoordinates.localToWindow-MK-Hz9U(Offset.constructor-impl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & KeyboardMap.kValueMask)));
/* 195 */           long j4 = layoutCoordinatesFindRootCoordinates.localToWindow-MK-Hz9U(Offset.constructor-impl((((long) Float.floatToRawIntBits(f2)) & KeyboardMap.kValueMask) | (((long) Float.floatToRawIntBits(left)) << 32)));
/* 202 */           float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 209 */           float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
/* 216 */           float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j4 >> 32));
/* 223 */           float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 >> 32));
/* 235 */           float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
/* 247 */           float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
/* 254 */           float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j & KeyboardMap.kValueMask));
/* 261 */           float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j2 & KeyboardMap.kValueMask));
/* 267 */           float fIntBitsToFloat7 = Float.intBitsToFloat((int) (j4 & KeyboardMap.kValueMask));
/* 274 */           float fIntBitsToFloat8 = Float.intBitsToFloat((int) (j3 & KeyboardMap.kValueMask));
/* 304 */           return new Rect(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
                }

                /* JADX INFO: renamed from: b */
                public static final Painter m5038b(LayoutNode layoutNode) {
/* 1 */             layoutNode.getClass();
/* 4 */             List modifierInfo = layoutNode.getModifierInfo();
/* 8 */             int size = modifierInfo.size();
/* 14 */            for (int i = 0; i < size; i++) {
/* 22 */                Modifier modifier = ((ModifierInfo) modifierInfo.get(i)).getModifier();
/* 40 */                if (StringsKt.m6240z(modifier.getClass().getName(), "Painter", false)) {
                            try {
/* 48 */                        Field declaredField = modifier.getClass().getDeclaredField("painter");
/* 53 */                        declaredField.setAccessible(true);
/* 56 */                        Object obj = declaredField.get(modifier);
/* 62 */                        if (obj instanceof Painter) {
/* 64 */                            return (Painter) obj;
                                }
/* 70 */                        return null;
                            } catch (Throwable unused) {
/* 70 */                        return null;
                            }
                        }
                    }
/* 70 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public static final Color m5039c(LayoutNode layoutNode) {
/* 1 */             layoutNode.getClass();
/* 4 */             List modifierInfo = layoutNode.getModifierInfo();
/* 8 */             int size = modifierInfo.size();
/* 15 */            for (int i = 0; i < size; i++) {
/* 23 */                Modifier modifier = ((ModifierInfo) modifierInfo.get(i)).getModifier();
/* 41 */                if (StringsKt.m6240z(modifier.getClass().getName(), "Text", false)) {
                            try {
/* 49 */                        Field declaredField = modifier.getClass().getDeclaredField("color");
/* 54 */                        declaredField.setAccessible(true);
/* 57 */                        Object obj = declaredField.get(modifier);
/* 68 */                        ColorProducer colorProducer = obj instanceof ColorProducer ? (ColorProducer) obj : null;
/* 69 */                        if (colorProducer == null) {
                                    break;
                                }
/* 75 */                        return Color.box-impl(colorProducer.invoke-0d7_KjU());
                            } catch (Throwable unused) {
                            }
                        }
                    }
/* 14 */            return null;
                }

                /* JADX INFO: renamed from: d */
                public static final android.graphics.Rect m5040d(Rect rect) {
/* 47 */            return new android.graphics.Rect((int) Math.floor(rect.getLeft()), (int) Math.floor(rect.getTop()), (int) Math.ceil(rect.getRight()), (int) Math.ceil(rect.getBottom()));
                }
            }
