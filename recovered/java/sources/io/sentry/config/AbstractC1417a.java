            package io.sentry.config;

            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Bitmap;
            import android.graphics.Matrix;
            import android.graphics.Point;
            import android.graphics.Rect;
            import android.graphics.drawable.BitmapDrawable;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.GradientDrawable;
            import android.graphics.drawable.InsetDrawable;
            import android.graphics.drawable.VectorDrawable;
            import android.os.Build;
            import android.os.Process;
            import android.text.Layout;
            import android.view.KeyEvent;
            import android.view.SurfaceView;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.widget.AbsListView;
            import android.widget.ImageView;
            import android.widget.ScrollView;
            import android.widget.TextView;
            import androidx.core.view.ScrollingView;
            import io.sentry.AbstractC1552m4;
            import io.sentry.AbstractC1635q4;
            import io.sentry.C1431e;
            import io.sentry.C1666s6;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1489i3;
            import io.sentry.InterfaceC1525k1;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.core.internal.gestures.C1199a;
            import io.sentry.android.core.internal.gestures.C1207i;
            import io.sentry.android.replay.AbstractC1320g0;
            import io.sentry.android.replay.R$id;
            import io.sentry.android.replay.viewhierarchy.AbstractC1364b;
            import io.sentry.android.replay.viewhierarchy.AbstractC1370h;
            import io.sentry.android.replay.viewhierarchy.C1366d;
            import io.sentry.android.replay.viewhierarchy.C1367e;
            import io.sentry.android.replay.viewhierarchy.C1368f;
            import io.sentry.android.replay.viewhierarchy.C1369g;
            import io.sentry.clientreport.C1411a;
            import io.sentry.instrumentation.file.C1496c;
            import io.sentry.instrumentation.file.C1498e;
            import io.sentry.instrumentation.file.C1500g;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.internal.gestures.C1507b;
            import io.sentry.internal.gestures.EnumC1506a;
            import io.sentry.protocol.C1596d0;
            import io.sentry.protocol.C1599f;
            import io.sentry.protocol.C1608j0;
            import io.sentry.protocol.C1621r;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1712k;
            import io.sentry.util.AbstractC1714m;
            import io.sentry.util.AbstractC1717p;
            import io.sentry.vendor.AbstractC1729a;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.FileDescriptor;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.ref.WeakReference;
            import java.lang.reflect.Field;
            import java.math.BigDecimal;
            import java.math.BigInteger;
            import java.math.RoundingMode;
            import java.nio.BufferUnderflowException;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.util.AbstractMap;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.GregorianCalendar;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.SimpleTimeZone;
            import java.util.UUID;
            import java.util.concurrent.CopyOnWriteArraySet;
            import kotlin.Pair;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import okio.Segment;
            import okio.Utf8;
            import p000.AbstractC0886en;
            import p000.AbstractC2211ta;
            import p000.C1951n4;
            import p000.p51;
            
            /* JADX INFO: renamed from: io.sentry.config.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1417a {
                /* JADX INFO: renamed from: a */
                public static String m5163a(String str) {
                    try {
/* 18 */                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new BigInteger("10".concat(str), 16).toByteArray());
/* 22 */                byteBufferWrap.get();
/* 91 */                return String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap.getShort()), Integer.valueOf(byteBufferWrap.getInt()));
                    } catch (NumberFormatException | BufferUnderflowException unused) {
/* 96 */                return null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static FileInputStream m5164b(File file, FileInputStream fileInputStream) {
                    return AbstractC1552m4.m5357b().mo5092l().isTracingEnabled() ? new C1498e(C1498e.m5283c(file, fileInputStream)) : fileInputStream;
                }

                /* JADX INFO: renamed from: c */
                public static FileInputStream m5165c(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
/* 13 */            if (!AbstractC1552m4.m5357b().mo5092l().isTracingEnabled()) {
/* 66 */                return fileInputStream;
                    }
/* 34 */            InterfaceC1525k1 interfaceC1525k1Mo5093m = AbstractC1712k.f11736a ? AbstractC1552m4.m5357b().mo5093m() : AbstractC1552m4.m5357b().mo5087g();
/* 62 */            return new C1498e(new C1496c(null, interfaceC1525k1Mo5093m != null ? interfaceC1525k1Mo5093m.mo4735p("file.read") : null, fileInputStream, AbstractC1552m4.m5357b().mo5092l()), fileDescriptor);
                }

                /* JADX INFO: renamed from: d */
                public static FileOutputStream m5166d(File file, FileOutputStream fileOutputStream, boolean z) {
                    return AbstractC1552m4.m5357b().mo5092l().isTracingEnabled() ? new C1500g(C1500g.m5284c(file, fileOutputStream, z)) : fileOutputStream;
                }

                /* JADX INFO: renamed from: e */
                public static FileOutputStream m5167e(FileOutputStream fileOutputStream, File file) {
                    return AbstractC1552m4.m5357b().mo5092l().isTracingEnabled() ? new C1500g(C1500g.m5284c(file, fileOutputStream, false)) : fileOutputStream;
                }

                /* JADX INFO: renamed from: f */
                public static boolean m5168f(AbstractC1635q4 abstractC1635q4, String str, InterfaceC1489i3 interfaceC1489i3, ILogger iLogger) {
/* 5 */             int i = 8;
/* 7 */             int i2 = 2;
/* 8 */             int i3 = 0;
                    switch (str) {
                        case "debug_meta":
/* 346 */                   abstractC1635q4.f11514Y = (C1599f) interfaceC1489i3.mo5230K0(iLogger, new C1411a(i));
/* 9 */                     return true;
                        case "server_name":
/* 332 */                   abstractC1635q4.f11511V = interfaceC1489i3.mo5231M();
/* 9 */                     return true;
                        case "contexts":
/* 324 */                   abstractC1635q4.f11517b.mo5316l(C1411a.m5149c(interfaceC1489i3, iLogger));
/* 9 */                     return true;
                        case "environment":
/* 315 */                   abstractC1635q4.f11522i = interfaceC1489i3.mo5231M();
/* 9 */                     return true;
                        case "breadcrumbs":
/* 308 */                   abstractC1635q4.f11513X = interfaceC1489i3.mo5239h1(iLogger, new C1431e(i3));
/* 9 */                     return true;
                        case "sdk":
/* 296 */                   abstractC1635q4.f11518c = (C1624u) interfaceC1489i3.mo5230K0(iLogger, new C1411a(21));
/* 9 */                     return true;
                        case "dist":
/* 280 */                   abstractC1635q4.f11512W = interfaceC1489i3.mo5231M();
/* 9 */                     return true;
                        case "tags":
/* 273 */                   abstractC1635q4.f11520e = AbstractC1704c.m5459n((Map) interfaceC1489i3.mo5232R0());
/* 9 */                     return true;
                        case "user":
/* 260 */                   abstractC1635q4.f11524w = (C1608j0) interfaceC1489i3.mo5230K0(iLogger, new C1596d0(i2));
/* 9 */                     return true;
                        case "extra":
/* 246 */                   abstractC1635q4.f11515Z = AbstractC1704c.m5459n((Map) interfaceC1489i3.mo5232R0());
/* 9 */                     return true;
                        case "event_id":
/* 233 */                   abstractC1635q4.f11516a = (C1626w) interfaceC1489i3.mo5230K0(iLogger, new C1411a(23));
/* 9 */                     return true;
                        case "release":
/* 217 */                   abstractC1635q4.f11521f = interfaceC1489i3.mo5231M();
/* 9 */                     return true;
                        case "request":
/* 210 */                   abstractC1635q4.f11519d = (C1621r) interfaceC1489i3.mo5230K0(iLogger, new C1411a(19));
/* 9 */                     return true;
                        case "platform":
/* 194 */                   abstractC1635q4.f11523v = interfaceC1489i3.mo5231M();
/* 9 */                     return true;
                        default:
/* 8 */                     return false;
                    }
                }

                /* JADX INFO: renamed from: g */
                public static BigDecimal m5169g(double d) {
/* 8 */             return BigDecimal.valueOf(d).setScale(6, RoundingMode.DOWN);
                }

                /* JADX WARN: Code duplicated, block: B:61:0x0131  */
                /* JADX INFO: renamed from: h */
                public static C1507b m5170h(SentryAndroidOptions sentryAndroidOptions, View view, float f, float f2, EnumC1506a enumC1506a) {
                    String strM5177o;
                    C1507b c1507b;
/* 3 */             List<C1199a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
/* 9 */             ArrayDeque arrayDeque = new ArrayDeque();
/* 23 */            arrayDeque.add(new C1207i(view, f, f2));
/* 26 */            C1507b c1507b2 = null;
/* 31 */            while (!arrayDeque.isEmpty()) {
/* 37 */                C1207i c1207i = (C1207i) arrayDeque.poll();
/* 39 */                View view2 = c1207i.f10101a;
/* 41 */                float f3 = c1207i.f10103c;
/* 43 */                float f4 = c1207i.f10102b;
/* 45 */                int width = view2.getWidth();
/* 49 */                int height = view2.getHeight();
/* 56 */                if (f4 >= 0.0f && f4 <= width && f3 >= 0.0f && f3 <= height) {
/* 74 */                    if (view2 instanceof ViewGroup) {
/* 77 */                        ViewGroup viewGroup = (ViewGroup) view2;
/* 79 */                        int scrollX = viewGroup.getScrollX();
/* 83 */                        int scrollY = viewGroup.getScrollY();
/* 92 */                        for (int i = 0; i < viewGroup.getChildCount(); i++) {
/* 94 */                            View childAt = viewGroup.getChildAt(i);
/* 98 */                            if (childAt != null) {
/* 107 */                               float left = (scrollX + f4) - childAt.getLeft();
/* 115 */                               float top = (scrollY + f3) - childAt.getTop();
/* 116 */                               Matrix matrix = childAt.getMatrix();
/* 120 */                               if (matrix != null && !matrix.isIdentity()) {
/* 132 */                                   Matrix matrix2 = new Matrix();
/* 139 */                                   if (matrix.invert(matrix2)) {
/* 142 */                                       float[] fArr = {left, top};
/* 149 */                                       matrix2.mapPoints(fArr);
/* 152 */                                       float f5 = fArr[0];
/* 154 */                                       top = fArr[1];
/* 156 */                                       left = f5;
                                            }
                                        }
/* 165 */                               arrayDeque.add(new C1207i(childAt, left, top));
                                    }
                                }
                            }
/* 182 */                   for (int i2 = 0; i2 < gestureTargetLocators.size(); i2++) {
/* 184 */                       C1199a c1199a = gestureTargetLocators.get(i2);
/* 190 */                       c1199a.getClass();
/* 193 */                       EnumC1506a enumC1506a2 = EnumC1506a.CLICKABLE;
/* 195 */                       if (enumC1506a == enumC1506a2 && view2.isClickable() && view2.getVisibility() == 0) {
/* 209 */                           String strM5177o2 = m5177o(view2);
/* 213 */                           if (strM5177o2 == null) {
/* 306 */                               c1507b = null;
                                    } else {
/* 222 */                               c1507b = new C1507b(view2, m5173k(view2), strM5177o2);
                                    }
                                } else if (enumC1506a != EnumC1506a.SCROLLABLE) {
/* 306 */                           c1507b = null;
                                } else if (((!((Boolean) c1199a.f10069a.m5471a()).booleanValue() ? false : ScrollingView.class.isAssignableFrom(view2.getClass())) || AbsListView.class.isAssignableFrom(view2.getClass()) || ScrollView.class.isAssignableFrom(view2.getClass())) && view2.getVisibility() == 0 && (strM5177o = m5177o(view2)) != null) {
/* 302 */                           c1507b = new C1507b(view2, m5173k(view2), strM5177o);
                                } else {
/* 306 */                           c1507b = null;
                                }
/* 307 */                       if (c1507b != null) {
/* 309 */                           if (enumC1506a == enumC1506a2) {
/* 311 */                               c1507b2 = c1507b;
                                    } else if (enumC1506a == EnumC1506a.SCROLLABLE) {
/* 317 */                               return c1507b;
                                    }
                                }
                            }
                        }
                    }
/* 322 */           return c1507b2;
                }

                /* JADX WARN: Code duplicated, block: B:113:0x01e5  */
                /* JADX WARN: Code duplicated, block: B:132:0x0110 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:133:0x012e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:134:0x012e A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:135:0x0127 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
                /* JADX WARN: Code duplicated, block: B:37:0x00af  */
                /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
                /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
                /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
                /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
                /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
                /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
                /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
                /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
                /* JADX WARN: Code duplicated, block: B:54:0x0100  */
                /* JADX WARN: Code duplicated, block: B:57:0x010b A[LOOP:0: B:53:0x00fe->B:57:0x010b, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:60:0x011d  */
                /* JADX WARN: Code duplicated, block: B:63:0x0129 A[LOOP:1: B:59:0x011b->B:63:0x0129, LOOP_END] */
                /* JADX INFO: renamed from: i */
                public static AbstractC1370h m5171i(View view, AbstractC1370h abstractC1370h, AbstractC2211ta abstractC2211ta) {
                    Pair pair;
                    boolean z;
                    boolean z2;
                    Drawable drawable;
                    Bitmap bitmap;
                    int extendedPaddingTop;
                    Object tag;
                    String str;
                    Class<?> superclass;
                    CopyOnWriteArraySet copyOnWriteArraySet;
                    Class<?> superclass2;
                    CopyOnWriteArraySet copyOnWriteArraySet2;
                    String lowerCase;
/* 1 */             abstractC2211ta.getClass();
/* 10 */            if (view.isAttachedToWindow() && view.getWindowVisibility() == 0) {
/* 26 */                Object parent = view;
                        while (true) {
/* 29 */                    if (!(parent instanceof View)) {
/* 83 */                        Rect rect = new Rect();
/* 101 */                       pair = new Pair(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
                                break;
                            }
/* 45 */                    float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
/* 47 */                    View view2 = (View) parent;
/* 55 */                    if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
/* 77 */                        pair = new Pair(Boolean.FALSE, null);
                                break;
                            }
/* 68 */                    parent = view2.getParent();
                        }
                    } else {
/* 22 */                pair = new Pair(Boolean.FALSE, null);
                    }
/* 117 */           boolean zBooleanValue = ((Boolean) pair.f12908a).booleanValue();
/* 124 */           Rect rect2 = (Rect) pair.f12909b;
/* 128 */           if (zBooleanValue) {
/* 130 */               Object tag2 = view.getTag();
/* 141 */               String str2 = tag2 instanceof String ? (String) tag2 : null;
/* 142 */               if (str2 != null) {
/* 146 */                   String lowerCase2 = str2.toLowerCase(Locale.ROOT);
/* 150 */                   lowerCase2.getClass();
/* 159 */                   if (StringsKt.m6240z(lowerCase2, "sentry-unmask", false)) {
/* 176 */                       abstractC2211ta.mo4870r();
/* 303 */                       z = false;
                            } else {
/* 174 */                       if (Intrinsics.m6216a(view.getTag(R$id.sentry_privacy), "unmask")) {
/* 176 */                           abstractC2211ta.mo4870r();
                                } else {
/* 181 */                           tag = view.getTag();
/* 187 */                           if (tag instanceof String) {
/* 189 */                               str = (String) tag;
                                    } else {
/* 192 */                               str = null;
                                    }
/* 193 */                           if (str != null) {
/* 197 */                               lowerCase = str.toLowerCase(Locale.ROOT);
/* 201 */                               lowerCase.getClass();
/* 210 */                               if (StringsKt.m6240z(lowerCase, "sentry-mask", false)) {
/* 227 */                                   abstractC2211ta.mo4870r();
                                        } else if (Intrinsics.m6216a(view.getTag(R$id.sentry_privacy), "mask")) {
/* 227 */                                   abstractC2211ta.mo4870r();
                                        } else {
/* 235 */                                   if (view.getParent() != null) {
/* 241 */                                       view.getParent().getClass();
                                            }
/* 244 */                                   superclass = view.getClass();
/* 250 */                                   copyOnWriteArraySet = (CopyOnWriteArraySet) abstractC2211ta.f17001b;
/* 252 */                                   copyOnWriteArraySet.getClass();
                                            while (true) {
/* 255 */                                       if (superclass != null) {
/* 273 */                                           superclass2 = view.getClass();
/* 279 */                                           copyOnWriteArraySet2 = (CopyOnWriteArraySet) abstractC2211ta.f17000a;
/* 281 */                                           copyOnWriteArraySet2.getClass();
                                                    while (true) {
/* 284 */                                               if (superclass2 != null) {
/* 294 */                                                   if (copyOnWriteArraySet2.contains(superclass2.getName())) {
/* 298 */                                                       superclass2 = superclass2.getSuperclass();
                                                            }
                                                        }
                                                    }
                                                } else if (copyOnWriteArraySet.contains(superclass.getName())) {
/* 268 */                                           superclass = superclass.getSuperclass();
                                                }
                                            }
                                        }
/* 296 */                               z = true;
                                    } else {
/* 225 */                               if (Intrinsics.m6216a(view.getTag(R$id.sentry_privacy), "mask")) {
/* 227 */                                   abstractC2211ta.mo4870r();
                                        } else {
/* 235 */                                   if (view.getParent() != null) {
/* 241 */                                       view.getParent().getClass();
                                            }
/* 244 */                                   superclass = view.getClass();
/* 250 */                                   copyOnWriteArraySet = (CopyOnWriteArraySet) abstractC2211ta.f17001b;
/* 252 */                                   copyOnWriteArraySet.getClass();
                                            while (true) {
/* 255 */                                       if (superclass != null) {
/* 273 */                                           superclass2 = view.getClass();
/* 279 */                                           copyOnWriteArraySet2 = (CopyOnWriteArraySet) abstractC2211ta.f17000a;
/* 281 */                                           copyOnWriteArraySet2.getClass();
                                                    while (true) {
/* 284 */                                               if (superclass2 != null) {
/* 294 */                                                   if (copyOnWriteArraySet2.contains(superclass2.getName())) {
/* 298 */                                                       superclass2 = superclass2.getSuperclass();
                                                            }
                                                        }
                                                    }
                                                } else if (copyOnWriteArraySet.contains(superclass.getName())) {
/* 268 */                                           superclass = superclass.getSuperclass();
                                                }
                                            }
                                        }
/* 296 */                               z = true;
                                    }
                                }
/* 303 */                       z = false;
                            }
                        } else {
/* 174 */                   if (Intrinsics.m6216a(view.getTag(R$id.sentry_privacy), "unmask")) {
/* 176 */                       abstractC2211ta.mo4870r();
                            } else {
/* 181 */                       tag = view.getTag();
/* 187 */                       if (tag instanceof String) {
/* 189 */                           str = (String) tag;
                                } else {
/* 192 */                           str = null;
                                }
/* 193 */                       if (str != null) {
/* 197 */                           lowerCase = str.toLowerCase(Locale.ROOT);
/* 201 */                           lowerCase.getClass();
/* 210 */                           if (StringsKt.m6240z(lowerCase, "sentry-mask", false)) {
/* 227 */                               abstractC2211ta.mo4870r();
                                    } else if (Intrinsics.m6216a(view.getTag(R$id.sentry_privacy), "mask")) {
/* 227 */                               abstractC2211ta.mo4870r();
                                    } else {
/* 235 */                               if (view.getParent() != null) {
/* 241 */                                   view.getParent().getClass();
                                        }
/* 244 */                               superclass = view.getClass();
/* 250 */                               copyOnWriteArraySet = (CopyOnWriteArraySet) abstractC2211ta.f17001b;
/* 252 */                               copyOnWriteArraySet.getClass();
                                        while (true) {
/* 255 */                                   if (superclass != null) {
/* 273 */                                       superclass2 = view.getClass();
/* 279 */                                       copyOnWriteArraySet2 = (CopyOnWriteArraySet) abstractC2211ta.f17000a;
/* 281 */                                       copyOnWriteArraySet2.getClass();
                                                while (true) {
/* 284 */                                           if (superclass2 != null) {
/* 294 */                                               if (copyOnWriteArraySet2.contains(superclass2.getName())) {
/* 298 */                                                   superclass2 = superclass2.getSuperclass();
                                                        }
                                                    }
                                                }
                                            } else if (copyOnWriteArraySet.contains(superclass.getName())) {
/* 268 */                                       superclass = superclass.getSuperclass();
                                            }
                                        }
                                    }
/* 296 */                           z = true;
                                } else {
/* 225 */                           if (Intrinsics.m6216a(view.getTag(R$id.sentry_privacy), "mask")) {
/* 227 */                               abstractC2211ta.mo4870r();
                                    } else {
/* 235 */                               if (view.getParent() != null) {
/* 241 */                                   view.getParent().getClass();
                                        }
/* 244 */                               superclass = view.getClass();
/* 250 */                               copyOnWriteArraySet = (CopyOnWriteArraySet) abstractC2211ta.f17001b;
/* 252 */                               copyOnWriteArraySet.getClass();
                                        while (true) {
/* 255 */                                   if (superclass != null) {
/* 273 */                                       superclass2 = view.getClass();
/* 279 */                                       copyOnWriteArraySet2 = (CopyOnWriteArraySet) abstractC2211ta.f17000a;
/* 281 */                                       copyOnWriteArraySet2.getClass();
                                                while (true) {
/* 284 */                                           if (superclass2 != null) {
/* 294 */                                               if (copyOnWriteArraySet2.contains(superclass2.getName())) {
/* 298 */                                                   superclass2 = superclass2.getSuperclass();
                                                        }
                                                    }
                                                }
                                            } else if (copyOnWriteArraySet.contains(superclass.getName())) {
/* 268 */                                       superclass = superclass.getSuperclass();
                                            }
                                        }
                                    }
/* 296 */                           z = true;
                                }
                            }
/* 303 */                   z = false;
                        }
                    } else {
/* 303 */               z = false;
                    }
/* 306 */           if (view instanceof TextView) {
/* 309 */               TextView textView = (TextView) view;
/* 311 */               Layout layout = textView.getLayout();
/* 320 */               C1666s6 c1666s6 = layout != null ? new C1666s6(layout, 4) : null;
/* 330 */               int currentTextColor = textView.getCurrentTextColor() | (-16777216);
/* 332 */               int totalPaddingLeft = textView.getTotalPaddingLeft();
                        try {
/* 336 */                   extendedPaddingTop = textView.getTotalPaddingTop();
                        } catch (NullPointerException unused) {
/* 341 */                   extendedPaddingTop = textView.getExtendedPaddingTop();
                        }
/* 345 */               textView.getX();
/* 348 */               textView.getY();
/* 351 */               float f = 0.0f;
/* 352 */               int width = textView.getWidth();
/* 356 */               int i = extendedPaddingTop;
/* 357 */               int height = textView.getHeight();
/* 361 */               if (abstractC1370h != null) {
/* 363 */                   f = abstractC1370h.f10693c;
                        }
/* 381 */               return new C1369g(c1666s6, Integer.valueOf(currentTextColor), totalPaddingLeft, i, width, height, textView.getElevation() + f, abstractC1370h, z, zBooleanValue, rect2);
                    }
/* 386 */           boolean z3 = z;
/* 389 */           if (!(view instanceof ImageView)) {
/* 501 */               if (!(view instanceof SurfaceView)) {
/* 553 */                   view.getX();
/* 556 */                   view.getY();
/* 579 */                   return new C1366d(view.getWidth(), view.getHeight(), (abstractC1370h != null ? abstractC1370h.f10693c : 0.0f) + view.getElevation(), abstractC1370h, z3, zBooleanValue, rect2);
                        }
/* 508 */               WeakReference weakReference = new WeakReference(view);
/* 512 */               SurfaceView surfaceView = (SurfaceView) view;
/* 514 */               surfaceView.getX();
/* 517 */               surfaceView.getY();
/* 547 */               return new C1368f(weakReference, surfaceView.getWidth(), surfaceView.getHeight(), surfaceView.getElevation() + (abstractC1370h != null ? abstractC1370h.f10693c : 0.0f), abstractC1370h, z3, zBooleanValue, rect2);
                    }
/* 392 */           ImageView imageView = (ImageView) view;
/* 394 */           imageView.getX();
/* 397 */           imageView.getY();
/* 400 */           int width2 = imageView.getWidth();
/* 405 */           int height2 = imageView.getHeight();
/* 419 */           float elevation = imageView.getElevation() + (abstractC1370h != null ? abstractC1370h.f10693c : 0.0f);
/* 420 */           if (!z3 || (drawable = imageView.getDrawable()) == null) {
/* 486 */               z2 = false;
                    } else {
/* 448 */               if (!(drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) && (!(drawable instanceof BitmapDrawable) || ((bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10))) {
/* 484 */                   z2 = true;
                        } else {
/* 486 */                   z2 = false;
                        }
                    }
/* 493 */           return new C1367e(width2, height2, elevation, abstractC1370h, z2, zBooleanValue, rect2);
                }

                /* JADX INFO: renamed from: j */
                public static String m5172j() {
/* 7 */             byte[] bArr = new byte[16];
/* 9 */             AbstractC1714m.m5481a().m5479b(bArr);
/* 17 */            byte b = (byte) (bArr[6] & 15);
/* 18 */            bArr[6] = b;
/* 23 */            bArr[6] = (byte) (b | 64);
/* 31 */            byte b2 = (byte) (bArr[8] & Utf8.REPLACEMENT_BYTE);
/* 32 */            bArr[8] = b2;
/* 37 */            bArr[8] = (byte) (b2 | 128);
/* 39 */            long j = 0;
/* 42 */            long j2 = 0;
/* 43 */            for (int i = 0; i < 8; i++) {
/* 51 */                j2 = (j2 << 8) | ((long) (bArr[i] & 255));
                    }
/* 56 */            for (int i2 = 8; i2 < 16; i2++) {
/* 64 */                j = (j << 8) | ((long) (bArr[i2] & 255));
                    }
/* 73 */            return AbstractC1717p.m5488b(new UUID(j2, j));
                }

                /* JADX INFO: renamed from: k */
                public static String m5173k(KeyEvent.Callback callback) {
/* 1 */             if (callback == null) {
/* 3 */                 return null;
                    }
/* 9 */             String canonicalName = callback.getClass().getCanonicalName();
                    return canonicalName != null ? canonicalName : callback.getClass().getSimpleName();
                }

                /* JADX INFO: renamed from: l */
                public static Date m5174l(String str) {
                    try {
/* 7 */                 return new Date(AbstractC1729a.m5496h(str));
                    } catch (IllegalArgumentException unused) {
/* 17 */                C1951n4.m6859j(AbstractC0886en.m3507k("timestamp is not ISO format ", str));
/* 20 */                return null;
                    }
                }

                /* JADX INFO: renamed from: m */
                public static Date m5175m(String str) {
                    try {
/* 23 */                return new Date(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
                    } catch (NumberFormatException unused) {
/* 33 */                C1951n4.m6859j(AbstractC0886en.m3507k("timestamp is not millis format ", str));
/* 36 */                return null;
                    }
                }

                /* JADX INFO: renamed from: n */
                public static final Window m5176n(View view) throws IllegalAccessException {
                    Field field;
/* 1 */             view.getClass();
/* 4 */             p51 p51Var = AbstractC1320g0.f10532a;
/* 6 */             View rootView = view.getRootView();
/* 10 */            rootView.getClass();
/* 19 */            Class cls = (Class) AbstractC1320g0.f10532a.getValue();
/* 21 */            if (cls == null || !cls.isInstance(rootView) || (field = (Field) AbstractC1320g0.f10533b.getValue()) == null) {
/* 49 */                return null;
                    }
/* 39 */            Object obj = field.get(rootView);
/* 43 */            obj.getClass();
/* 46 */            return (Window) obj;
                }

                /* JADX INFO: renamed from: o */
                public static String m5177o(View view) {
/* 1 */             int id = view.getId();
/* 7 */             if (id != -1 && (((-16777216) & id) != 0 || (16777215 & id) == 0)) {
/* 25 */                Resources resources = view.getContext().getResources();
/* 29 */                if (resources == null) {
/* 31 */                    return HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        try {
/* 34 */                    return resources.getResourceEntryName(id);
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
/* 6 */             return null;
                }

                /* JADX INFO: renamed from: q */
                public static String m5178q(long j) {
/* 26 */            if (j < -12219292800000L) {
/* 37 */                GregorianCalendar gregorianCalendar = new GregorianCalendar(new SimpleTimeZone(0, "UTC"));
/* 40 */                gregorianCalendar.setTimeInMillis(j);
/* 45 */                StringBuilder sb = new StringBuilder(24);
/* 52 */                AbstractC1729a.m5494f(sb, gregorianCalendar.get(1), 4);
/* 55 */                sb.append('-');
/* 63 */                AbstractC1729a.m5494f(sb, gregorianCalendar.get(2) + 1, 2);
/* 66 */                sb.append('-');
/* 73 */                AbstractC1729a.m5494f(sb, gregorianCalendar.get(5), 2);
/* 76 */                sb.append('T');
/* 85 */                AbstractC1729a.m5494f(sb, gregorianCalendar.get(11), 2);
/* 88 */                sb.append(':');
/* 97 */                AbstractC1729a.m5494f(sb, gregorianCalendar.get(12), 2);
/* 100 */               sb.append(':');
/* 109 */               AbstractC1729a.m5494f(sb, gregorianCalendar.get(13), 2);
/* 112 */               sb.append('.');
/* 121 */               AbstractC1729a.m5494f(sb, gregorianCalendar.get(14), 3);
/* 126 */               sb.append('Z');
/* 129 */               return sb.toString();
                    }
/* 137 */           long jM5493e = AbstractC1729a.m5493e(j, 86400000L);
/* 149 */           int iM5493e = (int) (j - (AbstractC1729a.m5493e(j, 86400000L) * 86400000));
/* 153 */           long j2 = jM5493e + 719468;
/* 160 */           long jM5493e2 = AbstractC1729a.m5493e(j2, 146097L);
/* 167 */           int i = (int) (j2 - (146097 * jM5493e2));
/* 184 */           int i2 = (((i / 36524) + (i - (i / 1460))) - (i / 146096)) / 365;
/* 195 */           int i3 = (int) ((jM5493e2 * 400) + ((long) i2));
/* 204 */           int i4 = i - (((i2 / 4) + (i2 * 365)) - (i2 / 100));
/* 208 */           int i5 = ((i4 * 5) + 2) / 153;
/* 215 */           int i6 = (i4 - (((i5 * 153) + 2) / 5)) + 1;
/* 222 */           int i7 = i5 < 10 ? i5 + 3 : i5 - 9;
/* 231 */           int[] iArr = {i3 + (i7 <= 2 ? 1 : 0), i7, i6};
/* 238 */           int i8 = iM5493e / 3600000;
/* 241 */           int i9 = iM5493e - (3600000 * i8);
/* 245 */           int i10 = i9 / 60000;
/* 248 */           int i11 = i9 - (60000 * i10);
/* 249 */           int i12 = i11 / 1000;
/* 256 */           StringBuilder sb2 = new StringBuilder(24);
/* 261 */           AbstractC1729a.m5494f(sb2, iArr[0], 4);
/* 264 */           sb2.append('-');
/* 269 */           AbstractC1729a.m5494f(sb2, iArr[1], 2);
/* 272 */           sb2.append('-');
/* 277 */           AbstractC1729a.m5494f(sb2, iArr[2], 2);
/* 280 */           sb2.append('T');
/* 283 */           AbstractC1729a.m5494f(sb2, i8, 2);
/* 286 */           sb2.append(':');
/* 289 */           AbstractC1729a.m5494f(sb2, i10, 2);
/* 292 */           sb2.append(':');
/* 295 */           AbstractC1729a.m5494f(sb2, i12, 2);
/* 300 */           sb2.append('.');
/* 303 */           AbstractC1729a.m5494f(sb2, i11 - (i12 * 1000), 3);
/* 308 */           sb2.append('Z');
/* 311 */           return sb2.toString();
                }

                /* JADX INFO: renamed from: r */
                public static boolean m5179r(Context context) {
/* 3 */             AbstractC1704c.m5462q(context, "The application context is required.");
                    return context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
                }

                /* JADX INFO: renamed from: t */
                public static byte[] m5180t(InputStream inputStream) throws IOException {
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 8 */                 byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                        while (true) {
/* 11 */                    int i = inputStream.read(bArr, 0, Segment.SHARE_MINIMUM);
/* 16 */                    if (i == -1) {
/* 24 */                        byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 28 */                        byteArrayOutputStream.close();
/* 31 */                        return byteArray;
                            }
/* 18 */                    byteArrayOutputStream.write(bArr, 0, i);
                        }
                    } catch (Throwable th) {
                        try {
/* 32 */                    byteArrayOutputStream.close();
                        } catch (Throwable th2) {
/* 37 */                    th.addSuppressed(th2);
                        }
/* 40 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: u */
                public static void m5181u(AbstractC1635q4 abstractC1635q4, C1505c c1505c, ILogger iLogger) {
/* 3 */             if (abstractC1635q4.f11516a != null) {
/* 7 */                 c1505c.m5291p("event_id");
/* 12 */                c1505c.m5297v(iLogger, abstractC1635q4.f11516a);
                    }
/* 17 */            c1505c.m5291p("contexts");
/* 22 */            c1505c.m5297v(iLogger, abstractC1635q4.f11517b);
/* 27 */            if (abstractC1635q4.f11518c != null) {
/* 31 */                c1505c.m5291p("sdk");
/* 36 */                c1505c.m5297v(iLogger, abstractC1635q4.f11518c);
                    }
/* 41 */            if (abstractC1635q4.f11519d != null) {
/* 45 */                c1505c.m5291p("request");
/* 50 */                c1505c.m5297v(iLogger, abstractC1635q4.f11519d);
                    }
/* 53 */            AbstractMap abstractMap = abstractC1635q4.f11520e;
/* 55 */            if (abstractMap != null && !abstractMap.isEmpty()) {
/* 65 */                c1505c.m5291p("tags");
/* 70 */                c1505c.m5297v(iLogger, abstractC1635q4.f11520e);
                    }
/* 75 */            if (abstractC1635q4.f11521f != null) {
/* 79 */                c1505c.m5291p("release");
/* 84 */                c1505c.m5300y(abstractC1635q4.f11521f);
                    }
/* 89 */            if (abstractC1635q4.f11522i != null) {
/* 93 */                c1505c.m5291p("environment");
/* 98 */                c1505c.m5300y(abstractC1635q4.f11522i);
                    }
/* 103 */           if (abstractC1635q4.f11523v != null) {
/* 107 */               c1505c.m5291p("platform");
/* 112 */               c1505c.m5300y(abstractC1635q4.f11523v);
                    }
/* 117 */           if (abstractC1635q4.f11524w != null) {
/* 121 */               c1505c.m5291p("user");
/* 126 */               c1505c.m5297v(iLogger, abstractC1635q4.f11524w);
                    }
/* 131 */           if (abstractC1635q4.f11511V != null) {
/* 135 */               c1505c.m5291p("server_name");
/* 140 */               c1505c.m5300y(abstractC1635q4.f11511V);
                    }
/* 145 */           if (abstractC1635q4.f11512W != null) {
/* 149 */               c1505c.m5291p("dist");
/* 154 */               c1505c.m5300y(abstractC1635q4.f11512W);
                    }
/* 157 */           List list = abstractC1635q4.f11513X;
/* 159 */           if (list != null && !list.isEmpty()) {
/* 169 */               c1505c.m5291p("breadcrumbs");
/* 174 */               c1505c.m5297v(iLogger, abstractC1635q4.f11513X);
                    }
/* 179 */           if (abstractC1635q4.f11514Y != null) {
/* 183 */               c1505c.m5291p("debug_meta");
/* 188 */               c1505c.m5297v(iLogger, abstractC1635q4.f11514Y);
                    }
/* 191 */           AbstractMap abstractMap2 = abstractC1635q4.f11515Z;
/* 193 */           if (abstractMap2 == null || abstractMap2.isEmpty()) {
/* 211 */               return;
                    }
/* 203 */           c1505c.m5291p("extra");
/* 208 */           c1505c.m5297v(iLogger, abstractC1635q4.f11515Z);
                }

                /* JADX INFO: renamed from: v */
                public static final void m5182v(View view, AbstractC1370h abstractC1370h, AbstractC2211ta abstractC2211ta, ILogger iLogger, List list) {
/* 1 */             abstractC2211ta.getClass();
/* 4 */             iLogger.getClass();
/* 9 */             if ((view instanceof ViewGroup) && !AbstractC1364b.m5044b(view, abstractC1370h, abstractC2211ta, iLogger)) {
/* 19 */                ViewGroup viewGroup = (ViewGroup) view;
/* 25 */                if (viewGroup.getChildCount() == 0) {
/* 27 */                    return;
                        }
/* 34 */                ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
/* 37 */                int childCount = viewGroup.getChildCount();
/* 42 */                for (int i = 0; i < childCount; i++) {
/* 44 */                    View childAt = viewGroup.getChildAt(i);
/* 48 */                    if (childAt != null) {
/* 50 */                        viewGroup.indexOfChild(childAt);
/* 53 */                        AbstractC1370h abstractC1370hM5171i = m5171i(childAt, abstractC1370h, abstractC2211ta);
/* 57 */                        arrayList.add(abstractC1370hM5171i);
/* 60 */                        if (list != null && (abstractC1370hM5171i instanceof C1368f) && abstractC1370hM5171i.f10695e) {
/* 70 */                            list.add(abstractC1370hM5171i);
                                }
/* 73 */                        m5182v(childAt, abstractC1370hM5171i, abstractC2211ta, iLogger, list);
                            }
                        }
/* 79 */                abstractC1370h.f10697g = arrayList;
                    }
                }

                /* JADX INFO: renamed from: p */
                public abstract int mo5183p();

                /* JADX INFO: renamed from: s */
                public abstract boolean mo5184s();
            }
