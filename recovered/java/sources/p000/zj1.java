            package p000;

            import android.graphics.Rect;
            import android.util.SparseArray;
            import android.view.View;
            import android.view.animation.Interpolator;
            import androidx.constraintlayout.utils.widget.MotionLabel;
            import androidx.core.app.NotificationCompat;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Array;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zj1 {

                /* JADX INFO: renamed from: b */
                public final View f20177b;

                /* JADX INFO: renamed from: c */
                public final int f20178c;

                /* JADX INFO: renamed from: j */
                public py0[] f20185j;

                /* JADX INFO: renamed from: k */
                public C2326wc f20186k;

                /* JADX INFO: renamed from: o */
                public int[] f20190o;

                /* JADX INFO: renamed from: p */
                public double[] f20191p;

                /* JADX INFO: renamed from: q */
                public double[] f20192q;

                /* JADX INFO: renamed from: r */
                public String[] f20193r;

                /* JADX INFO: renamed from: s */
                public int[] f20194s;

                /* JADX INFO: renamed from: x */
                public HashMap f20199x;

                /* JADX INFO: renamed from: y */
                public HashMap f20200y;

                /* JADX INFO: renamed from: z */
                public HashMap f20201z;

                /* JADX INFO: renamed from: a */
                public final Rect f20176a = new Rect();

                /* JADX INFO: renamed from: d */
                public boolean f20179d = false;

                /* JADX INFO: renamed from: e */
                public int f20180e = -1;

                /* JADX INFO: renamed from: f */
                public final ik1 f20181f = new ik1();

                /* JADX INFO: renamed from: g */
                public final ik1 f20182g = new ik1();

                /* JADX INFO: renamed from: h */
                public final xj1 f20183h = new xj1();

                /* JADX INFO: renamed from: i */
                public final xj1 f20184i = new xj1();

                /* JADX INFO: renamed from: l */
                public float f20187l = Float.NaN;

                /* JADX INFO: renamed from: m */
                public float f20188m = 0.0f;

                /* JADX INFO: renamed from: n */
                public float f20189n = 1.0f;

                /* JADX INFO: renamed from: t */
                public final float[] f20195t = new float[4];

                /* JADX INFO: renamed from: u */
                public final ArrayList f20196u = new ArrayList();

                /* JADX INFO: renamed from: v */
                public final float[] f20197v = new float[1];

                /* JADX INFO: renamed from: w */
                public final ArrayList f20198w = new ArrayList();

                /* JADX INFO: renamed from: A */
                public int f20169A = -1;

                /* JADX INFO: renamed from: B */
                public int f20170B = -1;

                /* JADX INFO: renamed from: C */
                public View f20171C = null;

                /* JADX INFO: renamed from: D */
                public int f20172D = -1;

                /* JADX INFO: renamed from: E */
                public float f20173E = Float.NaN;

                /* JADX INFO: renamed from: F */
                public Interpolator f20174F = null;

                /* JADX INFO: renamed from: G */
                public boolean f20175G = false;

                public zj1(View view) {
/* 95 */            this.f20177b = view;
/* 101 */           this.f20178c = view.getId();
/* 103 */           view.getLayoutParams();
                }

                /* JADX INFO: renamed from: g */
                public static void m10357g(Rect rect, Rect rect2, int i, int i2, int i3) {
/* 3 */             if (i == 1) {
/* 156 */               int i4 = rect.left + rect.right;
/* 168 */               rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
/* 177 */               rect2.top = i3 - ((rect.height() + i4) / 2);
/* 186 */               rect2.right = rect.width() + rect2.left;
/* 195 */               rect2.bottom = rect.height() + rect2.top;
/* 197 */               return;
                    }
/* 5 */             if (i == 2) {
/* 110 */               int i5 = rect.left + rect.right;
/* 123 */               rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
/* 131 */               rect2.top = (i5 - rect.height()) / 2;
/* 140 */               rect2.right = rect.width() + rect2.left;
/* 149 */               rect2.bottom = rect.height() + rect2.top;
/* 151 */               return;
                    }
/* 8 */             if (i == 3) {
/* 64 */                int i6 = rect.left + rect.right;
/* 76 */                rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
/* 85 */                rect2.top = i3 - ((rect.height() + i6) / 2);
/* 94 */                rect2.right = rect.width() + rect2.left;
/* 103 */               rect2.bottom = rect.height() + rect2.top;
/* 105 */               return;
                    }
/* 11 */            if (i != 4) {
/* 13 */                return;
                    }
/* 18 */            int i7 = rect.left + rect.right;
/* 31 */            rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
/* 39 */            rect2.top = (i7 - rect.height()) / 2;
/* 48 */            rect2.right = rect.width() + rect2.left;
/* 57 */            rect2.bottom = rect.height() + rect2.top;
                }

                /* JADX INFO: renamed from: a */
                public final void m10358a(a31 a31Var) {
/* 3 */             this.f20198w.add(a31Var);
                }

                /* JADX INFO: renamed from: b */
                public final float m10359b(float f, float[] fArr) {
/* 1 */             float f2 = 0.0f;
/* 5 */             if (fArr != null) {
/* 7 */                 fArr[0] = 1.0f;
                    } else {
/* 10 */                float f3 = this.f20189n;
/* 17 */                if (f3 != 1.0d) {
/* 19 */                    float f4 = this.f20188m;
/* 23 */                    if (f < f4) {
/* 25 */                        f = 0.0f;
                            }
/* 28 */                    if (f > f4 && f < 1.0d) {
/* 37 */                        f = Math.min((f - f4) * f3, 1.0f);
                            }
                        }
                    }
/* 43 */            C2131r4 c2131r4 = this.f20181f.f9684a;
/* 51 */            float f5 = Float.NaN;
/* 57 */            for (ik1 ik1Var : this.f20196u) {
/* 65 */                C2131r4 c2131r5 = ik1Var.f9684a;
/* 67 */                if (c2131r5 != null) {
/* 69 */                    float f6 = ik1Var.f9688c;
/* 73 */                    if (f6 < f) {
/* 75 */                        c2131r4 = c2131r5;
/* 76 */                        f2 = f6;
                            } else if (Float.isNaN(f5)) {
/* 84 */                        f5 = ik1Var.f9688c;
                            }
                        }
                    }
/* 87 */            if (c2131r4 == null) {
/* 118 */               return f;
                    }
/* 98 */            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
/* 99 */            double d = (f - f2) / f7;
/* 107 */           float fMo288a = (((float) c2131r4.mo288a(d)) * f7) + f2;
/* 108 */           if (fArr != null) {
/* 115 */               fArr[0] = (float) c2131r4.mo289b(d);
                    }
/* 117 */           return fMo288a;
                }

                /* JADX WARN: Failed to calculate best type for var: r0v4 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r0v5 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r10v0 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r10v0 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r10v1 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r10v2 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r10v4 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r10v5 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r10v6 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r11v0 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r11v1 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r11v2 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r11v3 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v3 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r11v4 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r11v5 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r12v0 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r12v1 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r12v2 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r12v3 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r12v4 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r12v5 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r12v6 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v6 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r13v0 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v0 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r13v1 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r13v2 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r13v3 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r13v4 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r13v5 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v5 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r13v6 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v6 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r1v2 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r1v3 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r26v0 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: float[]
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to calculate best type for var: r4v5 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: float
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /* JADX WARN: Failed to set immutable type for var: r26v0 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: float[]
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException
                 */
                /*  JADX ERROR: Types fix failed
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                    */
                /* JADX INFO: renamed from: c */
                public final void m10360c(double r24, float[] r26, float[] r27) {
                    /*
                        Method dump skipped, instruction units count: 234
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.zj1.m10360c(double, float[], float[]):void");
                }

                /* JADX INFO: renamed from: d */
                public final void m10361d(float f, float f2, float f3, float[] fArr) {
                    double[] dArr;
/* 1 */             float[] fArr2 = this.f20197v;
/* 3 */             float fM10359b = m10359b(f, fArr2);
/* 7 */             py0[] py0VarArr = this.f20185j;
/* 9 */             ik1 ik1Var = this.f20181f;
/* 11 */            int i = 0;
/* 12 */            if (py0VarArr == null) {
/* 98 */                ik1 ik1Var2 = this.f20182g;
/* 104 */               float f4 = ik1Var2.f9690e - ik1Var.f9690e;
/* 109 */               float f5 = ik1Var2.f9691f - ik1Var.f9691f;
/* 114 */               float f6 = ik1Var2.f9692i - ik1Var.f9692i;
/* 121 */               float f7 = (ik1Var2.f9693v - ik1Var.f9693v) + f5;
/* 129 */               fArr[0] = ((f6 + f4) * f2) + ((1.0f - f2) * f4);
/* 136 */               fArr[1] = (f7 * f3) + ((1.0f - f3) * f5);
/* 138 */               return;
                    }
                    double d = fM10359b;
/* 19 */            py0VarArr[0].mo6915k0(d, this.f20192q);
/* 28 */            this.f20185j[0].mo6912g0(d, this.f20191p);
/* 31 */            float f8 = fArr2[0];
                    while (true) {
/* 33 */                dArr = this.f20192q;
/* 36 */                if (i >= dArr.length) {
                            break;
                        }
/* 42 */                dArr[i] = dArr[i] * ((double) f8);
/* 44 */                i++;
                    }
/* 47 */            C2326wc c2326wc = this.f20186k;
/* 49 */            if (c2326wc == null) {
/* 83 */                int[] iArr = this.f20190o;
/* 85 */                double[] dArr2 = this.f20191p;
/* 87 */                ik1Var.getClass();
/* 94 */                ik1.m4571e(f2, f3, fArr, iArr, dArr, dArr2);
/* 97 */                return;
                    }
/* 51 */            double[] dArr3 = this.f20191p;
/* 54 */            if (dArr3.length > 0) {
/* 56 */                c2326wc.mo6912g0(d, dArr3);
/* 63 */                this.f20186k.mo6915k0(d, this.f20192q);
/* 66 */                int[] iArr2 = this.f20190o;
/* 68 */                double[] dArr4 = this.f20192q;
/* 70 */                double[] dArr5 = this.f20191p;
/* 72 */                ik1Var.getClass();
/* 79 */                ik1.m4571e(f2, f3, fArr, iArr2, dArr4, dArr5);
                    }
                }

                /* JADX INFO: renamed from: e */
                public final boolean m10362e(float f, long j, d31 d31Var, View view) {
                    boolean zMo67b;
                    View view2;
                    boolean z;
                    float f2;
                    boolean z2;
                    float f3;
                    float f4;
                    float f5;
                    boolean z3;
/* 3 */             View view3 = view;
/* 5 */             a53 a53Var = null;
/* 8 */             float fM10359b = m10359b(f, null);
/* 12 */            int i = this.f20172D;
/* 17 */            if (i != -1) {
/* 20 */                float f6 = 1.0f / i;
/* 30 */                float fFloor = ((float) Math.floor(fM10359b / f6)) * f6;
/* 32 */                float f7 = (fM10359b % f6) / f6;
/* 39 */                if (!Float.isNaN(this.f20173E)) {
/* 44 */                    f7 = (f7 + this.f20173E) % 1.0f;
                        }
/* 45 */                Interpolator interpolator = this.f20174F;
/* 65 */                fM10359b = ((interpolator != null ? interpolator.getInterpolation(f7) : ((double) f7) > 0.5d ? 1.0f : 0.0f) * f6) + fFloor;
                    }
/* 66 */            HashMap map = this.f20200y;
/* 68 */            if (map != null) {
/* 74 */                Iterator it = map.values().iterator();
/* 82 */                while (it.hasNext()) {
/* 90 */                    ((w43) it.next()).mo8400c(view3, fM10359b);
                        }
                    }
/* 94 */            HashMap map2 = this.f20199x;
/* 97 */            if (map2 != null) {
/* 107 */               a53 a53Var2 = null;
/* 108 */               zMo67b = false;
/* 113 */               for (c53 c53Var : map2.values()) {
/* 123 */                   if (c53Var instanceof a53) {
/* 126 */                       a53Var2 = (a53) c53Var;
                            } else {
/* 137 */                       zMo67b |= c53Var.mo67b(fM10359b, j, d31Var, view3);
/* 138 */                       view3 = view;
                            }
                        }
/* 141 */               a53Var = a53Var2;
                    } else {
/* 143 */               zMo67b = false;
                    }
/* 144 */           py0[] py0VarArr = this.f20185j;
/* 146 */           ik1 ik1Var = this.f20181f;
/* 148 */           if (py0VarArr != null) {
                        double d = fM10359b;
/* 157 */               py0VarArr[0].mo6912g0(d, this.f20191p);
/* 166 */               this.f20185j[0].mo6915k0(d, this.f20192q);
/* 169 */               C2326wc c2326wc = this.f20186k;
/* 171 */               if (c2326wc != null) {
/* 173 */                   double[] dArr = this.f20191p;
/* 175 */                   f2 = 0.0f;
/* 178 */                   if (dArr.length > 0) {
/* 180 */                       c2326wc.mo6912g0(d, dArr);
/* 187 */                       this.f20186k.mo6915k0(d, this.f20192q);
                            }
                        } else {
/* 191 */                   f2 = 0.0f;
                        }
/* 195 */               if (this.f20175G) {
/* 652 */                   view2 = view;
/* 658 */                   z2 = zMo67b;
/* 660 */                   f3 = 2.0f;
                        } else {
/* 197 */                   int[] iArr = this.f20190o;
/* 199 */                   double[] dArr2 = this.f20191p;
/* 201 */                   f3 = 2.0f;
/* 203 */                   double[] dArr3 = this.f20192q;
/* 207 */                   boolean z4 = this.f20179d;
/* 209 */                   float f8 = ik1Var.f9690e;
/* 213 */                   float f9 = ik1Var.f9691f;
/* 215 */                   float f10 = ik1Var.f9692i;
/* 217 */                   int i2 = 1;
/* 219 */                   float f11 = ik1Var.f9693v;
/* 224 */                   if (iArr.length != 0) {
/* 229 */                       f4 = f10;
/* 236 */                       if (ik1Var.f9685a0.length <= iArr[iArr.length - 1]) {
/* 243 */                           int i3 = iArr[iArr.length - 1] + 1;
/* 247 */                           ik1Var.f9685a0 = new double[i3];
/* 251 */                           ik1Var.f9687b0 = new double[i3];
                                }
                            } else {
/* 254 */                       f4 = f10;
                            }
/* 263 */                   Arrays.fill(ik1Var.f9685a0, Double.NaN);
/* 269 */                   for (int i4 = 0; i4 < iArr.length; i4++) {
/* 271 */                       double[] dArr4 = ik1Var.f9685a0;
/* 273 */                       int i5 = iArr[i4];
/* 277 */                       dArr4[i5] = dArr2[i4];
/* 283 */                       ik1Var.f9687b0[i5] = dArr3[i4];
                            }
/* 288 */                   float f12 = Float.NaN;
/* 290 */                   float f13 = f2;
/* 292 */                   float f14 = f13;
/* 293 */                   float f15 = f14;
/* 295 */                   int i6 = 0;
/* 297 */                   float f16 = f4;
/* 299 */                   float f17 = f15;
                            while (true) {
/* 301 */                       double[] dArr5 = ik1Var.f9685a0;
/* 303 */                       f5 = f11;
/* 310 */                       if (i6 >= dArr5.length) {
                                    break;
                                }
/* 318 */                       if (Double.isNaN(dArr5[i6])) {
/* 320 */                           z3 = zMo67b;
                                } else {
/* 343 */                           float f18 = (float) (Double.isNaN(ik1Var.f9685a0[i6]) ? 0.0d : ik1Var.f9685a0[i6] + 0.0d);
/* 346 */                           z3 = zMo67b;
/* 350 */                           float f19 = (float) ik1Var.f9687b0[i6];
/* 353 */                           if (i6 == i2) {
/* 384 */                               f8 = f18;
/* 385 */                               f13 = f19;
                                    } else if (i6 == 2) {
/* 381 */                               f9 = f18;
/* 382 */                               f14 = f19;
                                    } else if (i6 != 3) {
/* 362 */                               if (i6 == 4) {
/* 372 */                                   f11 = f18;
/* 373 */                                   f15 = f19;
                                        } else if (i6 == 5) {
/* 370 */                                   f12 = f18;
                                        }
/* 387 */                               i6++;
/* 389 */                               zMo67b = z3;
/* 391 */                               i2 = 1;
                                    } else {
/* 376 */                               f16 = f18;
/* 378 */                               f17 = f19;
                                    }
                                }
/* 367 */                       f11 = f5;
/* 387 */                       i6++;
/* 389 */                       zMo67b = z3;
/* 391 */                       i2 = 1;
                            }
/* 394 */                   z2 = zMo67b;
/* 396 */                   zj1 zj1Var = ik1Var.f9681X;
/* 398 */                   if (zj1Var != null) {
/* 401 */                       float[] fArr = new float[2];
/* 403 */                       float[] fArr2 = new float[2];
/* 405 */                       zj1Var.m10360c(d, fArr, fArr2);
/* 408 */                       float f20 = fArr[0];
/* 412 */                       float f21 = fArr[1];
/* 414 */                       float f22 = fArr2[0];
/* 416 */                       float f23 = fArr2[1];
                                double d2 = f8;
                                double d3 = f9;
/* 440 */                       float fSin = (float) (((Math.sin(d3) * d2) + ((double) f20)) - ((double) (f16 / 2.0f)));
/* 458 */                       float fCos = (float) ((((double) f21) - (Math.cos(d3) * d2)) - ((double) (f5 / 2.0f)));
                                double d4 = f13;
                                double d5 = f14;
/* 488 */                       float fCos2 = (float) ((Math.cos(d3) * d2 * d5) + (Math.sin(d3) * d4) + ((double) f22));
/* 506 */                       float fSin2 = (float) ((Math.sin(d3) * d2 * d5) + (((double) f23) - (Math.cos(d3) * d4)));
/* 509 */                       if (dArr3.length >= 2) {
/* 512 */                           dArr3[0] = fCos2;
/* 517 */                           dArr3[1] = fSin2;
                                }
/* 523 */                       if (Float.isNaN(f12)) {
/* 544 */                           view2 = view;
                                } else {
/* 532 */                           double degrees = Math.toDegrees(Math.atan2(fSin2, fCos2));
/* 538 */                           view2 = view;
/* 540 */                           view2.setRotation((float) (degrees + ((double) f12)));
                                }
/* 546 */                       f8 = fSin;
/* 547 */                       f9 = fCos;
                            } else {
/* 550 */                       view2 = view;
/* 556 */                       if (!Float.isNaN(f12)) {
/* 581 */                           view2.setRotation((float) (Math.toDegrees(Math.atan2((f15 / 2.0f) + f14, (f17 / 2.0f) + f13)) + ((double) f12) + 0.0d));
                                }
                            }
/* 586 */                   if (view2 instanceof MotionLabel) {
/* 595 */                       ((MotionLabel) view2).m499c(f8, f9, f8 + f16, f9 + f5);
                            } else {
/* 601 */                       float f24 = f8 + 0.5f;
/* 603 */                       int i7 = (int) f24;
/* 604 */                       float f25 = f9 + 0.5f;
/* 606 */                       int i8 = (int) f25;
/* 609 */                       int i9 = (int) (f24 + f16);
/* 612 */                       int i10 = (int) (f25 + f5);
/* 613 */                       int i11 = i9 - i7;
/* 615 */                       int i12 = i10 - i8;
/* 621 */                       if (i11 != view2.getMeasuredWidth() || i12 != view2.getMeasuredHeight() || z4) {
/* 642 */                           view2.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                                }
/* 645 */                       view2.layout(i7, i8, i9, i10);
                            }
/* 649 */                   this.f20179d = false;
                        }
/* 665 */               if (this.f20170B != -1) {
/* 669 */                   if (this.f20171C == null) {
/* 683 */                       this.f20171C = ((View) view2.getParent()).findViewById(this.f20170B);
                            }
/* 685 */                   View view4 = this.f20171C;
/* 687 */                   if (view4 != null) {
/* 701 */                       float bottom = (this.f20171C.getBottom() + view4.getTop()) / f3;
/* 717 */                       float right = (this.f20171C.getRight() + this.f20171C.getLeft()) / f3;
/* 728 */                       if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
/* 746 */                           float left = right - view2.getLeft();
/* 752 */                           float top = bottom - view2.getTop();
/* 753 */                           view2.setPivotX(left);
/* 756 */                           view2.setPivotY(top);
                                }
                            }
                        }
/* 759 */               HashMap map3 = this.f20200y;
/* 761 */               if (map3 != null) {
/* 775 */                   for (w43 w43Var : map3.values()) {
/* 785 */                       if (w43Var instanceof u43) {
/* 787 */                           double[] dArr6 = this.f20192q;
/* 791 */                           if (dArr6.length > 1) {
/* 815 */                               view2.setRotation(((u43) w43Var).m9466a(fM10359b) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                                    }
                                }
                            }
                        }
/* 819 */               if (a53Var != 0) {
/* 821 */                   double[] dArr7 = this.f20192q;
/* 825 */                   double d6 = dArr7[0];
/* 829 */                   double d7 = dArr7[1];
/* 835 */                   a53 a53Var3 = a53Var;
/* 851 */                   view2.setRotation(a53Var3.m1537a(fM10359b, j, d31Var, view2) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
/* 856 */                   z = z2 | a53Var3.f2729d;
                        } else {
/* 859 */                   z = z2;
                        }
/* 861 */               int i13 = 1;
                        while (true) {
/* 862 */                   py0[] py0VarArr2 = this.f20185j;
/* 865 */                   if (i13 >= py0VarArr2.length) {
                                break;
                            }
/* 867 */                   py0 py0Var = py0VarArr2[i13];
/* 869 */                   float[] fArr3 = this.f20195t;
/* 871 */                   py0Var.mo6913h0(d, fArr3);
/* 888 */                   jb1.m5737C((C2088pz) ik1Var.f9682Y.get(this.f20193r[i13 - 1]), view2, fArr3);
/* 891 */                   i13++;
                        }
/* 894 */               xj1 xj1Var = this.f20183h;
/* 898 */               if (xj1Var.f19220b == 0) {
/* 902 */                   if (fM10359b <= f2) {
/* 906 */                       view2.setVisibility(xj1Var.f19222c);
                            } else {
/* 912 */                       xj1 xj1Var2 = this.f20184i;
/* 914 */                       if (fM10359b >= 1065353216) {
/* 918 */                           view2.setVisibility(xj1Var2.f19222c);
                                } else if (xj1Var2.f19222c != xj1Var.f19222c) {
/* 929 */                           view2.setVisibility(0);
                                }
                            }
                        }
                    } else {
/* 933 */               view2 = view;
/* 935 */               boolean z5 = zMo67b;
/* 939 */               float f26 = ik1Var.f9690e;
/* 941 */               ik1 ik1Var2 = this.f20182g;
/* 945 */               float fM3503g = AbstractC0886en.m3503g(ik1Var2.f9690e, f26, fM10359b, f26);
/* 949 */               float f27 = ik1Var.f9691f;
/* 953 */               float fM3503g2 = AbstractC0886en.m3503g(ik1Var2.f9691f, f27, fM10359b, f27);
/* 957 */               float f28 = ik1Var.f9692i;
/* 959 */               float f29 = ik1Var2.f9692i;
/* 961 */               float fM3503g3 = AbstractC0886en.m3503g(f29, f28, fM10359b, f28);
/* 965 */               float f30 = ik1Var.f9693v;
/* 967 */               float f31 = ik1Var2.f9693v;
/* 973 */               float f32 = fM3503g + 0.5f;
/* 975 */               int i14 = (int) f32;
/* 976 */               float f33 = fM3503g2 + 0.5f;
/* 978 */               int i15 = (int) f33;
/* 980 */               int i16 = (int) (f32 + fM3503g3);
/* 982 */               int iM3503g = (int) (f33 + AbstractC0886en.m3503g(f31, f30, fM10359b, f30));
/* 983 */               int i17 = i16 - i14;
/* 985 */               int i18 = iM3503g - i15;
/* 989 */               if (f29 != f28 || f31 != f30 || this.f20179d) {
/* 1009 */                  view2.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
/* 1013 */                  this.f20179d = false;
                        }
/* 1015 */              view2.layout(i14, i15, i16, iM3503g);
/* 1018 */              z = z5;
                    }
/* 1020 */          HashMap map4 = this.f20201z;
/* 1022 */          if (map4 != null) {
/* 1036 */              for (a43 a43Var : map4.values()) {
/* 1046 */                  if (a43Var instanceof y33) {
/* 1050 */                      double[] dArr8 = this.f20192q;
/* 1074 */                      view2.setRotation(((y33) a43Var).m56a(fM10359b) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                            } else {
/* 1082 */                      a43Var.mo58d(view2, fM10359b);
                            }
                        }
                    }
/* 1086 */          return z;
                }

                /* JADX INFO: renamed from: f */
                public final void m10363f(ik1 ik1Var) {
/* 31 */            ik1Var.m4574d((int) this.f20177b.getX(), (int) this.f20177b.getY(), this.f20177b.getWidth(), this.f20177b.getHeight());
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:175:0x0518  */
                /* JADX WARN: Code duplicated, block: B:178:0x053f  */
                /* JADX WARN: Code duplicated, block: B:239:0x06ca A[PHI: r1
  0x06ca: PHI (r1v43 java.lang.String) = (r1v40 java.lang.String), (r1v41 java.lang.String), (r1v42 java.lang.String), (r1v45 java.lang.String) binds: [B:238:0x06c8, B:234:0x06a3, B:229:0x067c, B:225:0x066d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:315:0x0989  */
                /* JADX WARN: Code duplicated, block: B:667:0x0554 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:686:0x0d3d A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:687:0x0d32 A[SYNTHETIC] */
                /* JADX WARN: Failed to find 'out' block for switch in B:510:0x0cc2. Please report as an issue. */
                /* JADX WARN: Instruction removed from duplicated block: B:175:0x0518, please report this as an issue */
                /* JADX INFO: renamed from: h */
                public final void m10364h(long j, int i, int i2) {
                    ArrayList arrayList;
                    HashMap map;
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    HashSet hashSet;
                    String str6;
                    String str7;
                    ik1 ik1Var;
                    Object obj;
                    ik1 ik1Var2;
                    Object obj2;
                    String str8;
                    zj1 zj1Var;
                    int i3;
                    String str9;
                    int i4;
                    C2088pz c2088pz;
                    HashSet hashSet2;
                    String str10;
                    Iterator it;
                    HashMap map2;
                    String str11;
                    byte b;
                    c53 y43Var;
                    z43 z43Var;
                    c53 c53Var;
                    C2088pz c2088pz2;
                    Integer num;
                    byte b2;
                    ArrayList arrayList2;
                    String str12;
                    String str13;
                    String str14;
                    String str15;
                    Iterator it2;
                    String str16;
                    HashSet hashSet3;
                    String str17;
                    ik1 ik1Var3;
                    Object obj3;
                    ik1 ik1Var4;
                    Object obj4;
                    byte b3;
                    byte b4;
                    byte b5;
                    w43 s43Var;
                    C2088pz c2088pz3;
                    String str18;
                    String str19;
                    String str20;
                    String str21;
                    String str22;
                    int iBinarySearch;
                    int i5;
                    float fMin;
                    float fM3503g;
                    zj1 zj1Var2 = this;
/* 1 */             new HashSet();
/* 2 */             HashSet hashSet4 = new HashSet();
/* 3 */             HashSet hashSet5 = new HashSet();
/* 4 */             HashSet<String> hashSet6 = new HashSet();
/* 5 */             HashMap map3 = new HashMap();
/* 6 */             int i6 = zj1Var2.f20169A;
                    ik1 ik1Var5 = zj1Var2.f20181f;
                    if (i6 != -1) {
/* 7 */                 ik1Var5.f9678U = i6;
                    }
/* 8 */             xj1 xj1Var = zj1Var2.f20183h;
                    float f = xj1Var.f19218a;
/* 9 */             xj1 xj1Var2 = zj1Var2.f20184i;
                    String str23 = "alpha";
                    if (xj1.m9972b(f, xj1Var2.f19218a)) {
/* 10 */                hashSet5.add("alpha");
                    }
/* 11 */            if (xj1.m9972b(xj1Var.f19223d, xj1Var2.f19223d)) {
/* 12 */                hashSet5.add("elevation");
                    }
/* 13 */            int i7 = xj1Var.f19222c;
                    int i8 = xj1Var2.f19222c;
                    if (i7 != i8 && xj1Var.f19220b == 0 && (i7 == 0 || i8 == 0)) {
/* 14 */                hashSet5.add("alpha");
                    }
                    String str24 = "rotation";
/* 15 */            if (xj1.m9972b(xj1Var.f19224e, xj1Var2.f19224e)) {
/* 16 */                hashSet5.add("rotation");
                    }
/* 17 */            if (!Float.isNaN(xj1Var.f19217Z) || !Float.isNaN(xj1Var2.f19217Z)) {
/* 18 */                hashSet5.add("transitionPathRotate");
                    }
/* 19 */            boolean zIsNaN = Float.isNaN(xj1Var.f19219a0);
                    String str25 = NotificationCompat.CATEGORY_PROGRESS;
                    if (!zIsNaN || !Float.isNaN(xj1Var2.f19219a0)) {
/* 20 */                hashSet5.add(NotificationCompat.CATEGORY_PROGRESS);
                    }
/* 21 */            if (xj1.m9972b(xj1Var.f19225f, xj1Var2.f19225f)) {
/* 22 */                hashSet5.add("rotationX");
                    }
/* 23 */            if (xj1.m9972b(xj1Var.f19226i, xj1Var2.f19226i)) {
/* 24 */                hashSet5.add("rotationY");
                    }
/* 25 */            if (xj1.m9972b(xj1Var.f19212U, xj1Var2.f19212U)) {
/* 26 */                hashSet5.add("transformPivotX");
                    }
/* 27 */            if (xj1.m9972b(xj1Var.f19213V, xj1Var2.f19213V)) {
/* 28 */                hashSet5.add("transformPivotY");
                    }
                    String str26 = "scaleX";
/* 29 */            if (xj1.m9972b(xj1Var.f19227v, xj1Var2.f19227v)) {
/* 30 */                hashSet5.add("scaleX");
                    }
                    String str27 = "scaleY";
/* 31 */            if (xj1.m9972b(xj1Var.f19228w, xj1Var2.f19228w)) {
/* 32 */                hashSet5.add("scaleY");
                    }
                    Object obj5 = "rotationX";
                    String str28 = "translationX";
/* 33 */            if (xj1.m9972b(xj1Var.f19214W, xj1Var2.f19214W)) {
/* 34 */                hashSet5.add("translationX");
                    }
                    Object obj6 = "rotationY";
                    String str29 = "translationY";
/* 35 */            if (xj1.m9972b(xj1Var.f19215X, xj1Var2.f19215X)) {
/* 36 */                hashSet5.add("translationY");
                    }
/* 37 */            if (xj1.m9972b(xj1Var.f19216Y, xj1Var2.f19216Y)) {
/* 38 */                hashSet5.add("translationZ");
                    }
/* 39 */            ik1 ik1Var6 = zj1Var2.f20182g;
                    ArrayList arrayList3 = zj1Var2.f20196u;
                    ArrayList<a31> arrayList4 = zj1Var2.f20198w;
                    if (arrayList4 != null) {
                        for (a31 a31Var : arrayList4) {
                            String str30 = str28;
/* 41 */                    if (a31Var instanceof s31) {
/* 42 */                        s31 s31Var = (s31) a31Var;
/* 44 */                        ik1 ik1Var7 = new ik1();
                                str20 = str29;
/* 45 */                        ik1Var7.f9686b = 0;
/* 46 */                        ik1Var7.f9694w = Float.NaN;
/* 47 */                        ik1Var7.f9678U = -1;
/* 48 */                        ik1Var7.f9679V = -1;
/* 49 */                        ik1Var7.f9680W = Float.NaN;
/* 50 */                        ik1Var7.f9681X = null;
/* 51 */                        ik1Var7.f9682Y = new LinkedHashMap();
/* 52 */                        ik1Var7.f9683Z = 0;
                                str22 = str25;
/* 53 */                        ik1Var7.f9685a0 = new double[18];
/* 54 */                        ik1Var7.f9687b0 = new double[18];
/* 55 */                        if (ik1Var5.f9679V != -1) {
/* 56 */                            float f2 = s31Var.f72a / 100.0f;
/* 57 */                            ik1Var7.f9688c = f2;
/* 58 */                            ik1Var7.f9686b = s31Var.f16400h;
/* 59 */                            ik1Var7.f9683Z = s31Var.f16405m;
/* 60 */                            float f3 = Float.isNaN(s31Var.f16401i) ? f2 : s31Var.f16401i;
                                    str19 = str26;
/* 61 */                            float f4 = Float.isNaN(s31Var.f16402j) ? f2 : s31Var.f16402j;
                                    str18 = str27;
/* 62 */                            float f5 = ik1Var6.f9692i;
                                    float f6 = ik1Var5.f9692i;
                                    float f7 = f5 - f6;
/* 63 */                            float f8 = ik1Var6.f9693v;
                                    float f9 = ik1Var5.f9693v;
/* 64 */                            ik1Var7.f9689d = ik1Var7.f9688c;
/* 65 */                            ik1Var7.f9692i = (int) ((f7 * f3) + f6);
/* 66 */                            ik1Var7.f9693v = (int) (((f8 - f9) * f4) + f9);
/* 67 */                            int i9 = s31Var.f16405m;
                                    str21 = str24;
/* 68 */                            float f10 = s31Var.f16403k;
                                    if (i9 == 1) {
/* 73 */                                float f11 = Float.isNaN(f10) ? f2 : s31Var.f16403k;
                                        float f12 = ik1Var6.f9690e;
                                        float f13 = ik1Var5.f9690e;
                                        ik1Var7.f9690e = AbstractC0886en.m3503g(f12, f13, f11, f13);
/* 74 */                                if (!Float.isNaN(s31Var.f16404l)) {
                                            f2 = s31Var.f16404l;
                                        }
                                        float f14 = ik1Var6.f9691f;
                                        float f15 = ik1Var5.f9691f;
                                        ik1Var7.f9691f = AbstractC0886en.m3503g(f14, f15, f2, f15);
                                    } else if (i9 != 2) {
/* 69 */                                float f16 = Float.isNaN(f10) ? f2 : s31Var.f16403k;
                                        float f17 = ik1Var6.f9690e;
                                        float f18 = ik1Var5.f9690e;
                                        ik1Var7.f9690e = AbstractC0886en.m3503g(f17, f18, f16, f18);
/* 70 */                                if (!Float.isNaN(s31Var.f16404l)) {
                                            f2 = s31Var.f16404l;
                                        }
                                        float f19 = ik1Var6.f9691f;
                                        float f20 = ik1Var5.f9691f;
                                        ik1Var7.f9691f = AbstractC0886en.m3503g(f19, f20, f2, f20);
                                    } else {
/* 71 */                                if (Float.isNaN(f10)) {
                                            float f21 = ik1Var6.f9690e;
                                            float f22 = ik1Var5.f9690e;
                                            fMin = AbstractC0886en.m3503g(f21, f22, f2, f22);
                                        } else {
                                            fMin = s31Var.f16403k * Math.min(f4, f3);
                                        }
                                        ik1Var7.f9690e = fMin;
/* 72 */                                if (Float.isNaN(s31Var.f16404l)) {
                                            float f23 = ik1Var6.f9691f;
                                            float f24 = ik1Var5.f9691f;
                                            fM3503g = AbstractC0886en.m3503g(f23, f24, f2, f24);
                                        } else {
                                            fM3503g = s31Var.f16404l;
                                        }
                                        ik1Var7.f9691f = fM3503g;
                                    }
/* 75 */                            ik1Var7.f9679V = ik1Var5.f9679V;
/* 76 */                            ik1Var7.f9684a = C2131r4.m8062c(s31Var.f16398f);
/* 77 */                            ik1Var7.f9678U = s31Var.f16399g;
                                } else {
                                    str18 = str27;
                                    str19 = str26;
                                    str21 = str24;
/* 78 */                            int i10 = s31Var.f16405m;
/* 79 */                            int i11 = s31Var.f72a;
                                    if (i10 == 1) {
                                        float f25 = i11 / 100.0f;
/* 129 */                               ik1Var7.f9688c = f25;
/* 130 */                               ik1Var7.f9686b = s31Var.f16400h;
/* 131 */                               float f26 = Float.isNaN(s31Var.f16401i) ? f25 : s31Var.f16401i;
/* 132 */                               float f27 = Float.isNaN(s31Var.f16402j) ? f25 : s31Var.f16402j;
/* 133 */                               float f28 = ik1Var6.f9692i - ik1Var5.f9692i;
/* 134 */                               float f29 = ik1Var6.f9693v - ik1Var5.f9693v;
/* 135 */                               ik1Var7.f9689d = ik1Var7.f9688c;
/* 136 */                               if (!Float.isNaN(s31Var.f16403k)) {
                                            f25 = s31Var.f16403k;
                                        }
/* 137 */                               float f30 = ik1Var5.f9690e;
                                        float f31 = ik1Var5.f9692i;
                                        float f32 = (f31 / 2.0f) + f30;
/* 138 */                               float f33 = ik1Var5.f9691f;
                                        float f34 = ik1Var5.f9693v;
/* 139 */                               float f35 = ((ik1Var6.f9692i / 2.0f) + ik1Var6.f9690e) - f32;
                                        float f36 = ((ik1Var6.f9693v / 2.0f) + ik1Var6.f9691f) - ((f34 / 2.0f) + f33);
                                        float f37 = f35 * f25;
                                        float f38 = f26 * f28;
                                        float f39 = f38 / 2.0f;
/* 141 */                               ik1Var7.f9690e = (int) ((f30 + f37) - f39);
                                        float f40 = f36 * f25;
                                        float f41 = f27 * f29;
                                        float f42 = f41 / 2.0f;
/* 142 */                               ik1Var7.f9691f = (int) ((f33 + f40) - f42);
/* 143 */                               ik1Var7.f9692i = (int) (f31 + f38);
/* 144 */                               ik1Var7.f9693v = (int) (f34 + f41);
/* 145 */                               float f43 = Float.isNaN(s31Var.f16404l) ? 0.0f : s31Var.f16404l;
/* 146 */                               ik1Var7.f9683Z = 1;
/* 147 */                               float f44 = (int) ((ik1Var5.f9690e + f37) - f39);
/* 148 */                               float f45 = (int) ((ik1Var5.f9691f + f40) - f42);
/* 149 */                               ik1Var7.f9690e = f44 + ((-f36) * f43);
/* 150 */                               ik1Var7.f9691f = f45 + (f35 * f43);
/* 151 */                               ik1Var7.f9679V = ik1Var7.f9679V;
/* 152 */                               ik1Var7.f9684a = C2131r4.m8062c(s31Var.f16398f);
/* 153 */                               ik1Var7.f9678U = s31Var.f16399g;
                                    } else if (i10 != 2) {
                                        float f46 = i11 / 100.0f;
/* 80 */                                ik1Var7.f9688c = f46;
/* 81 */                                ik1Var7.f9686b = s31Var.f16400h;
/* 82 */                                float f47 = Float.isNaN(s31Var.f16401i) ? f46 : s31Var.f16401i;
/* 83 */                                float f48 = Float.isNaN(s31Var.f16402j) ? f46 : s31Var.f16402j;
/* 84 */                                float f49 = ik1Var6.f9692i;
                                        float f50 = ik1Var5.f9692i;
                                        float f51 = f49 - f50;
/* 85 */                                float f52 = ik1Var6.f9693v;
                                        float f53 = ik1Var5.f9693v;
                                        float f54 = f52 - f53;
/* 86 */                                ik1Var7.f9689d = ik1Var7.f9688c;
/* 87 */                                float f55 = ik1Var5.f9690e;
                                        float f56 = (f50 / 2.0f) + f55;
/* 88 */                                float f57 = ik1Var5.f9691f;
/* 89 */                                float f58 = ((f49 / 2.0f) + ik1Var6.f9690e) - f56;
/* 90 */                                float f59 = ((f52 / 2.0f) + ik1Var6.f9691f) - ((f53 / 2.0f) + f57);
                                        float f60 = f51 * f47;
                                        float f61 = f60 / 2.0f;
/* 91 */                                ik1Var7.f9690e = (int) (((f58 * f46) + f55) - f61);
                                        float f62 = f54 * f48;
                                        float f63 = f62 / 2.0f;
/* 92 */                                ik1Var7.f9691f = (int) (((f59 * f46) + f57) - f63);
/* 93 */                                ik1Var7.f9692i = (int) (f50 + f60);
/* 94 */                                ik1Var7.f9693v = (int) (f53 + f62);
/* 95 */                                float f64 = Float.isNaN(s31Var.f16403k) ? f46 : s31Var.f16403k;
/* 96 */                                float f65 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                                        float f66 = f64;
/* 97 */                                float f67 = Float.isNaN(s31Var.f16404l) ? f46 : s31Var.f16404l;
/* 98 */                                float f68 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
/* 99 */                                ik1Var7.f9683Z = 0;
/* 100 */                               ik1Var7.f9690e = (int) (((f68 * f59) + ((f66 * f58) + ik1Var5.f9690e)) - f61);
/* 101 */                               ik1Var7.f9691f = (int) (((f59 * f67) + ((f58 * f65) + ik1Var5.f9691f)) - f63);
/* 102 */                               ik1Var7.f9684a = C2131r4.m8062c(s31Var.f16398f);
/* 103 */                               ik1Var7.f9678U = s31Var.f16399g;
                                    } else {
                                        float f69 = i11 / 100.0f;
/* 104 */                               ik1Var7.f9688c = f69;
/* 105 */                               ik1Var7.f9686b = s31Var.f16400h;
/* 106 */                               float f70 = Float.isNaN(s31Var.f16401i) ? f69 : s31Var.f16401i;
/* 107 */                               float f71 = Float.isNaN(s31Var.f16402j) ? f69 : s31Var.f16402j;
/* 108 */                               float f72 = ik1Var6.f9692i;
                                        float f73 = ik1Var5.f9692i;
                                        float f74 = f72 - f73;
/* 109 */                               float f75 = ik1Var6.f9693v;
                                        float f76 = ik1Var5.f9693v;
                                        float f77 = f75 - f76;
/* 110 */                               ik1Var7.f9689d = ik1Var7.f9688c;
/* 111 */                               float f78 = ik1Var5.f9690e;
                                        float f79 = (f73 / 2.0f) + f78;
/* 112 */                               float f80 = ik1Var5.f9691f;
/* 113 */                               float f81 = (f72 / 2.0f) + ik1Var6.f9690e;
/* 114 */                               float f82 = ((f75 / 2.0f) + ik1Var6.f9691f) - ((f76 / 2.0f) + f80);
                                        float f83 = f74 * f70;
/* 115 */                               ik1Var7.f9690e = (int) ((((f81 - f79) * f69) + f78) - (f83 / 2.0f));
                                        float f84 = f77 * f71;
/* 116 */                               ik1Var7.f9691f = (int) (((f82 * f69) + f80) - (f84 / 2.0f));
/* 117 */                               ik1Var7.f9692i = (int) (f73 + f83);
/* 118 */                               ik1Var7.f9693v = (int) (f76 + f84);
/* 119 */                               ik1Var7.f9683Z = 2;
/* 120 */                               if (!Float.isNaN(s31Var.f16403k)) {
/* 122 */                                   ik1Var7.f9690e = (int) (s31Var.f16403k * ((int) (i - ik1Var7.f9692i)));
                                        }
/* 123 */                               if (!Float.isNaN(s31Var.f16404l)) {
/* 125 */                                   ik1Var7.f9691f = (int) (s31Var.f16404l * ((int) (i2 - ik1Var7.f9693v)));
                                        }
/* 126 */                               ik1Var7.f9679V = ik1Var7.f9679V;
/* 127 */                               ik1Var7.f9684a = C2131r4.m8062c(s31Var.f16398f);
/* 128 */                               ik1Var7.f9678U = s31Var.f16399g;
                                    }
/* 154 */                           iBinarySearch = Collections.binarySearch(arrayList3, ik1Var7);
                                    if (iBinarySearch == 0) {
                                        AbstractC1245n0.m4876d("MotionController", " KeyPath position \"" + ik1Var7.f9689d + "\" outside of range");
                                    }
/* 156 */                           arrayList3.add((-iBinarySearch) - 1, ik1Var7);
/* 157 */                           i5 = s31Var.f16397e;
                                    if (i5 != -1) {
/* 158 */                               zj1Var2.f20180e = i5;
                                    }
                                }
/* 154 */                       iBinarySearch = Collections.binarySearch(arrayList3, ik1Var7);
                                if (iBinarySearch == 0) {
                                    AbstractC1245n0.m4876d("MotionController", " KeyPath position \"" + ik1Var7.f9689d + "\" outside of range");
                                }
/* 156 */                       arrayList3.add((-iBinarySearch) - 1, ik1Var7);
/* 157 */                       i5 = s31Var.f16397e;
                                if (i5 != -1) {
/* 158 */                           zj1Var2.f20180e = i5;
                                }
                            } else {
                                str18 = str27;
                                str19 = str26;
                                str20 = str29;
                                str21 = str24;
                                str22 = str25;
/* 159 */                       a31Var.mo46d(map3);
/* 160 */                       a31Var.mo44b(hashSet5);
                            }
                            str28 = str30;
                            str29 = str20;
                            str25 = str22;
                            str26 = str19;
                            str27 = str18;
                            str24 = str21;
                        }
                    }
                    String str31 = str27;
                    String str32 = str26;
                    String str33 = str29;
                    String str34 = str24;
                    String str35 = str25;
                    String str36 = str28;
                    String str37 = "CUSTOM,";
                    String str38 = ",";
/* 161 */           if (hashSet5.isEmpty()) {
                        arrayList = arrayList3;
                        map = map3;
                        str = str33;
                        str2 = str35;
                        str3 = str32;
                        str4 = str31;
                        str5 = str34;
                        hashSet = hashSet5;
                        str6 = "CUSTOM,";
                        str7 = str36;
                        ik1Var = ik1Var5;
                        obj = obj6;
                        ik1Var2 = ik1Var6;
                        obj2 = obj5;
                        str8 = ",";
                    } else {
/* 162 */               zj1Var2.f20200y = new HashMap();
/* 163 */               Iterator it3 = hashSet5.iterator();
                        while (it3.hasNext()) {
                            String str39 = (String) it3.next();
/* 164 */                   if (!str39.startsWith(str37)) {
                                arrayList2 = arrayList3;
                                switch (str39.hashCode()) {
                                    case -1249320806:
                                        str12 = str35;
                                        str13 = str32;
                                        str14 = str31;
                                        str15 = str34;
                                        it2 = it3;
                                        str16 = str33;
                                        hashSet3 = hashSet5;
                                        str17 = str36;
                                        ik1Var3 = ik1Var5;
                                        obj3 = obj6;
                                        ik1Var4 = ik1Var6;
                                        obj4 = obj5;
                                        b3 = str39.equals(obj4) ? (byte) 0 : (byte) -1;
                                        break;
                                    case -1249320805:
                                        str12 = str35;
                                        str13 = str32;
                                        str14 = str31;
                                        str15 = str34;
                                        it2 = it3;
                                        str16 = str33;
                                        hashSet3 = hashSet5;
                                        str17 = str36;
                                        ik1Var3 = ik1Var5;
                                        obj3 = obj6;
                                        if (str39.equals(obj3)) {
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = 1;
                                        } else {
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                        }
                                        break;
                                    case -1225497657:
                                        str12 = str35;
                                        str13 = str32;
                                        str14 = str31;
                                        str15 = str34;
                                        it2 = it3;
                                        str16 = str33;
                                        hashSet3 = hashSet5;
                                        str17 = str36;
                                        if (str39.equals(str17)) {
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = 2;
                                        } else {
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                        }
                                        break;
                                    case -1225497656:
                                        str12 = str35;
                                        str13 = str32;
                                        str14 = str31;
                                        str15 = str34;
                                        it2 = it3;
                                        str16 = str33;
                                        if (str39.equals(str16)) {
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = 3;
                                        } else {
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                        }
                                        break;
                                    case -1225497655:
                                        str12 = str35;
                                        str13 = str32;
                                        str14 = str31;
                                        str15 = str34;
                                        it2 = it3;
                                        if (str39.equals("translationZ")) {
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = 4;
                                        } else {
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                        }
                                        break;
                                    case -1001078227:
                                        str12 = str35;
                                        str13 = str32;
                                        str14 = str31;
                                        str15 = str34;
                                        if (str39.equals(str12)) {
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = 5;
                                        } else {
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                        }
                                        break;
                                    case -908189618:
                                        str13 = str32;
                                        str14 = str31;
                                        str15 = str34;
                                        if (str39.equals(str13)) {
                                            str12 = str35;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = 6;
                                        } else {
                                            str12 = str35;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                        }
                                        break;
                                    case -908189617:
                                        str14 = str31;
                                        str15 = str34;
                                        str12 = str35;
                                        if (str39.equals(str14)) {
                                            str13 = str32;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = 7;
                                        } else {
                                            str13 = str32;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                        }
                                        break;
                                    case -797520672:
                                        str15 = str34;
                                        if (str39.equals("waveVariesBy")) {
                                            str12 = str35;
                                            str13 = str32;
                                            str14 = str31;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = 8;
                                        } else {
                                            str12 = str35;
                                            str13 = str32;
                                            str14 = str31;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                        }
                                        break;
                                    case -760884510:
                                        str15 = str34;
                                        if (str39.equals("transformPivotX")) {
                                            str12 = str35;
                                            str13 = str32;
                                            str14 = str31;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = 9;
                                        } else {
                                            str12 = str35;
                                            str13 = str32;
                                            str14 = str31;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                        }
                                        break;
                                    case -760884509:
                                        str15 = str34;
                                        if (str39.equals("transformPivotY")) {
                                            b4 = 10;
                                            str12 = str35;
                                            str13 = str32;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = b4;
                                            str14 = str31;
                                        }
                                        str12 = str35;
                                        str13 = str32;
                                        str14 = str31;
                                        it2 = it3;
                                        str16 = str33;
                                        hashSet3 = hashSet5;
                                        str17 = str36;
                                        ik1Var3 = ik1Var5;
                                        obj3 = obj6;
                                        ik1Var4 = ik1Var6;
                                        obj4 = obj5;
                                        break;
                                    case -40300674:
                                        str15 = str34;
                                        if (str39.equals(str15)) {
                                            b4 = 11;
                                            str12 = str35;
                                            str13 = str32;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = b4;
                                            str14 = str31;
                                        }
                                        str12 = str35;
                                        str13 = str32;
                                        str14 = str31;
                                        it2 = it3;
                                        str16 = str33;
                                        hashSet3 = hashSet5;
                                        str17 = str36;
                                        ik1Var3 = ik1Var5;
                                        obj3 = obj6;
                                        ik1Var4 = ik1Var6;
                                        obj4 = obj5;
                                        break;
                                    case -4379043:
                                        if (str39.equals("elevation")) {
                                            b5 = 12;
                                            str12 = str35;
                                            str13 = str32;
                                            str14 = str31;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = b5;
                                            str15 = str34;
                                        }
                                        str12 = str35;
                                        str13 = str32;
                                        str14 = str31;
                                        str15 = str34;
                                        it2 = it3;
                                        str16 = str33;
                                        hashSet3 = hashSet5;
                                        str17 = str36;
                                        ik1Var3 = ik1Var5;
                                        obj3 = obj6;
                                        ik1Var4 = ik1Var6;
                                        obj4 = obj5;
                                        break;
                                    case 37232917:
                                        if (str39.equals("transitionPathRotate")) {
                                            b5 = 13;
                                            str12 = str35;
                                            str13 = str32;
                                            str14 = str31;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = b5;
                                            str15 = str34;
                                        }
                                        str12 = str35;
                                        str13 = str32;
                                        str14 = str31;
                                        str15 = str34;
                                        it2 = it3;
                                        str16 = str33;
                                        hashSet3 = hashSet5;
                                        str17 = str36;
                                        ik1Var3 = ik1Var5;
                                        obj3 = obj6;
                                        ik1Var4 = ik1Var6;
                                        obj4 = obj5;
                                        break;
                                    case 92909918:
                                        if (str39.equals("alpha")) {
                                            b5 = 14;
                                            str12 = str35;
                                            str13 = str32;
                                            str14 = str31;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = b5;
                                            str15 = str34;
                                        }
                                        str12 = str35;
                                        str13 = str32;
                                        str14 = str31;
                                        str15 = str34;
                                        it2 = it3;
                                        str16 = str33;
                                        hashSet3 = hashSet5;
                                        str17 = str36;
                                        ik1Var3 = ik1Var5;
                                        obj3 = obj6;
                                        ik1Var4 = ik1Var6;
                                        obj4 = obj5;
                                        break;
                                    case 156108012:
                                        if (str39.equals("waveOffset")) {
                                            b5 = 15;
                                            str12 = str35;
                                            str13 = str32;
                                            str14 = str31;
                                            it2 = it3;
                                            str16 = str33;
                                            hashSet3 = hashSet5;
                                            str17 = str36;
                                            ik1Var3 = ik1Var5;
                                            obj3 = obj6;
                                            ik1Var4 = ik1Var6;
                                            obj4 = obj5;
                                            b3 = b5;
                                            str15 = str34;
                                        }
                                        str12 = str35;
                                        str13 = str32;
                                        str14 = str31;
                                        str15 = str34;
                                        it2 = it3;
                                        str16 = str33;
                                        hashSet3 = hashSet5;
                                        str17 = str36;
                                        ik1Var3 = ik1Var5;
                                        obj3 = obj6;
                                        ik1Var4 = ik1Var6;
                                        obj4 = obj5;
                                        break;
                                    default:
                                        str12 = str35;
                                        str13 = str32;
                                        str14 = str31;
                                        str15 = str34;
                                        it2 = it3;
                                        str16 = str33;
                                        hashSet3 = hashSet5;
                                        str17 = str36;
                                        ik1Var3 = ik1Var5;
                                        obj3 = obj6;
                                        ik1Var4 = ik1Var6;
                                        obj4 = obj5;
                                        break;
                                }
                                switch (b3) {
                                    case 0:
/* 208 */                               s43Var = new s43(5);
                                        break;
                                    case 1:
/* 206 */                               s43Var = new s43(6);
                                        break;
                                    case 2:
/* 204 */                               s43Var = new s43(9);
                                        break;
                                    case 3:
/* 202 */                               s43Var = new s43(10);
                                        break;
                                    case 4:
/* 200 */                               s43Var = new s43(11);
                                        break;
                                    case 5:
/* 197 */                               v43 v43Var = new v43();
/* 198 */                               v43Var.f17864f = false;
                                        s43Var = v43Var;
                                        break;
                                    case 6:
/* 195 */                               s43Var = new s43(7);
                                        break;
                                    case 7:
/* 193 */                               s43Var = new s43(8);
                                        break;
                                    case 8:
/* 191 */                               s43Var = new s43(0);
                                        break;
                                    case 9:
/* 189 */                               s43Var = new s43(2);
                                        break;
                                    case 10:
/* 187 */                               s43Var = new s43(3);
                                        break;
                                    case 11:
/* 185 */                               s43Var = new s43(4);
                                        break;
                                    case 12:
/* 183 */                               s43Var = new s43(1);
                                        break;
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 181 */                               s43Var = new u43();
                                        break;
                                    case 14:
/* 179 */                               s43Var = new s43(0);
                                        break;
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 177 */                               s43Var = new s43(0);
                                        break;
                                    default:
                                        s43Var = null;
                                        break;
                                }
                            } else {
/* 165 */                       SparseArray sparseArray = new SparseArray();
/* 166 */                       String str40 = str39.split(str38)[1];
                                for (a31 a31Var2 : arrayList4) {
                                    ArrayList arrayList5 = arrayList3;
/* 168 */                           HashMap map4 = a31Var2.f75d;
                                    if (map4 != null && (c2088pz3 = (C2088pz) map4.get(str40)) != null) {
/* 170 */                               sparseArray.append(a31Var2.f72a, c2088pz3);
                                    }
                                    arrayList3 = arrayList5;
                                }
                                arrayList2 = arrayList3;
/* 172 */                       t43 t43Var = new t43();
/* 173 */                       String str41 = str39.split(str38)[1];
/* 174 */                       t43Var.f16918f = sparseArray;
                                str12 = str35;
                                str13 = str32;
                                str14 = str31;
                                it2 = it3;
                                str16 = str33;
                                hashSet3 = hashSet5;
                                str17 = str36;
                                ik1Var3 = ik1Var5;
                                obj3 = obj6;
                                ik1Var4 = ik1Var6;
                                obj4 = obj5;
                                s43Var = t43Var;
                                str15 = str34;
                            }
                            if (s43Var != null) {
/* 209 */                       s43Var.f18441e = str39;
/* 210 */                       zj1Var2.f20200y.put(str39, s43Var);
                            }
                            str34 = str15;
                            str31 = str14;
                            str38 = str38;
                            str37 = str37;
                            arrayList3 = arrayList2;
                            obj5 = obj4;
                            str32 = str13;
                            ik1Var6 = ik1Var4;
                            obj6 = obj3;
                            ik1Var5 = ik1Var3;
                            str36 = str17;
                            hashSet5 = hashSet3;
                            str33 = str16;
                            it3 = it2;
                            str35 = str12;
                        }
                        arrayList = arrayList3;
                        str = str33;
                        str2 = str35;
                        str3 = str32;
                        str4 = str31;
                        str5 = str34;
                        hashSet = hashSet5;
                        str6 = str37;
                        str7 = str36;
                        ik1Var = ik1Var5;
                        obj = obj6;
                        ik1Var2 = ik1Var6;
                        obj2 = obj5;
                        str8 = str38;
                        if (arrayList4 != null) {
/* 211 */                   Iterator it4 = arrayList4.iterator();
                            while (it4.hasNext()) {
                                a31 a31Var3 = (a31) it4.next();
/* 212 */                       if (a31Var3 instanceof c31) {
/* 213 */                           HashMap map5 = zj1Var2.f20200y;
                                    c31 c31Var = (c31) a31Var3;
                                    for (String str42 : map5.keySet()) {
                                        Iterator it5 = it4;
                                        HashMap map6 = map5;
/* 215 */                               w43 w43Var = (w43) map5.get(str42);
                                        if (w43Var != null) {
                                            HashMap map7 = map3;
/* 216 */                                   if (!str42.startsWith("CUSTOM")) {
                                                switch (str42.hashCode()) {
                                                    case -1249320806:
                                                        if (str42.equals(obj2)) {
                                                            b2 = 0;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case -1249320805:
                                                        if (str42.equals(obj)) {
                                                            b2 = 1;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case -1225497657:
                                                        if (str42.equals(str7)) {
                                                            b2 = 2;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case -1225497656:
                                                        if (str42.equals(str)) {
                                                            b2 = 3;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case -1225497655:
                                                        if (str42.equals("translationZ")) {
                                                            b2 = 4;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case -1001078227:
                                                        if (str42.equals(str2)) {
                                                            b2 = 5;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case -908189618:
                                                        if (str42.equals(str3)) {
                                                            b2 = 6;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case -908189617:
                                                        if (str42.equals(str4)) {
                                                            b2 = 7;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case -760884510:
                                                        if (str42.equals("transformPivotX")) {
                                                            b2 = 8;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case -760884509:
                                                        if (str42.equals("transformPivotY")) {
                                                            b2 = 9;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case -40300674:
                                                        if (str42.equals(str5)) {
                                                            b2 = 10;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case -4379043:
                                                        if (str42.equals("elevation")) {
                                                            b2 = 11;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case 37232917:
                                                        if (str42.equals("transitionPathRotate")) {
                                                            b2 = 12;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    case 92909918:
                                                        if (str42.equals("alpha")) {
                                                            b2 = 13;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b2 = -1;
                                                        break;
                                                }
                                                switch (b2) {
                                                    case 0:
/* 248 */                                               if (!Float.isNaN(c31Var.f2684i)) {
/* 249 */                                                   w43Var.mo8687b(c31Var.f2684i, c31Var.f72a);
                                                        }
                                                        break;
                                                    case 1:
/* 246 */                                               if (!Float.isNaN(c31Var.f2685j)) {
/* 247 */                                                   w43Var.mo8687b(c31Var.f2685j, c31Var.f72a);
                                                        }
                                                        break;
                                                    case 2:
/* 244 */                                               if (!Float.isNaN(c31Var.f2691p)) {
/* 245 */                                                   w43Var.mo8687b(c31Var.f2691p, c31Var.f72a);
                                                        }
                                                        break;
                                                    case 3:
/* 242 */                                               if (!Float.isNaN(c31Var.f2692q)) {
/* 243 */                                                   w43Var.mo8687b(c31Var.f2692q, c31Var.f72a);
                                                        }
                                                        break;
                                                    case 4:
/* 240 */                                               if (!Float.isNaN(c31Var.f2693r)) {
/* 241 */                                                   w43Var.mo8687b(c31Var.f2693r, c31Var.f72a);
                                                        }
                                                        break;
                                                    case 5:
/* 238 */                                               if (!Float.isNaN(c31Var.f2694s)) {
/* 239 */                                                   w43Var.mo8687b(c31Var.f2694s, c31Var.f72a);
                                                        }
                                                        break;
                                                    case 6:
/* 236 */                                               if (!Float.isNaN(c31Var.f2689n)) {
/* 237 */                                                   w43Var.mo8687b(c31Var.f2689n, c31Var.f72a);
                                                        }
                                                        break;
                                                    case 7:
/* 234 */                                               if (!Float.isNaN(c31Var.f2690o)) {
/* 235 */                                                   w43Var.mo8687b(c31Var.f2690o, c31Var.f72a);
                                                        }
                                                        break;
                                                    case 8:
/* 232 */                                               if (!Float.isNaN(c31Var.f2684i)) {
/* 233 */                                                   w43Var.mo8687b(c31Var.f2686k, c31Var.f72a);
                                                        }
                                                        break;
                                                    case 9:
/* 230 */                                               if (!Float.isNaN(c31Var.f2685j)) {
/* 231 */                                                   w43Var.mo8687b(c31Var.f2687l, c31Var.f72a);
                                                        }
                                                        break;
                                                    case 10:
/* 228 */                                               if (!Float.isNaN(c31Var.f2683h)) {
/* 229 */                                                   w43Var.mo8687b(c31Var.f2683h, c31Var.f72a);
                                                        }
                                                        break;
                                                    case 11:
/* 226 */                                               if (!Float.isNaN(c31Var.f2682g)) {
/* 227 */                                                   w43Var.mo8687b(c31Var.f2682g, c31Var.f72a);
                                                        }
                                                        break;
                                                    case 12:
/* 224 */                                               if (!Float.isNaN(c31Var.f2688m)) {
/* 225 */                                                   w43Var.mo8687b(c31Var.f2688m, c31Var.f72a);
                                                        }
                                                        break;
                                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 222 */                                               if (!Float.isNaN(c31Var.f2681f)) {
/* 223 */                                                   w43Var.mo8687b(c31Var.f2681f, c31Var.f72a);
                                                        }
                                                        break;
                                                }
                                            } else {
/* 218 */                                       C2088pz c2088pz4 = (C2088pz) c31Var.f75d.get(str42.substring(7));
                                                if (c2088pz4 != null) {
/* 220 */                                           ((t43) w43Var).f16918f.append(c31Var.f72a, c2088pz4);
                                                }
                                            }
                                            map3 = map7;
                                        }
                                        it4 = it5;
                                        map5 = map6;
                                    }
                                }
                                map3 = map3;
                                it4 = it4;
                            }
                        }
                        HashMap map8 = map3;
/* 250 */               xj1Var.m9973a(0, zj1Var2.f20200y);
/* 251 */               xj1Var2.m9973a(100, zj1Var2.f20200y);
/* 252 */               Iterator it6 = zj1Var2.f20200y.keySet().iterator();
                        while (it6.hasNext()) {
                            String str43 = (String) it6.next();
                            HashMap map9 = map8;
/* 255 */                   int iIntValue = (!map9.containsKey(str43) || (num = (Integer) map9.get(str43)) == null) ? 0 : num.intValue();
                            Iterator it7 = it6;
/* 256 */                   w43 w43Var2 = (w43) zj1Var2.f20200y.get(str43);
                            if (w43Var2 != null) {
/* 257 */                       w43Var2.mo8688d(iIntValue);
                            }
                            map8 = map9;
                            it6 = it7;
                        }
                        map = map8;
                    }
/* 258 */           if (hashSet4.isEmpty()) {
                        zj1Var = zj1Var2;
                    } else {
/* 259 */               if (zj1Var2.f20199x == null) {
/* 260 */                   zj1Var2.f20199x = new HashMap();
                        }
/* 261 */               Iterator it8 = hashSet4.iterator();
                        while (it8.hasNext()) {
                            String str44 = (String) it8.next();
/* 262 */                   if (!zj1Var2.f20199x.containsKey(str44)) {
                                String str45 = str6;
/* 263 */                       if (str44.startsWith(str45)) {
                                    it = it8;
/* 264 */                           SparseArray sparseArray2 = new SparseArray();
                                    str6 = str45;
                                    str11 = str8;
                                    map2 = map;
/* 265 */                           String str46 = str44.split(str11)[1];
                                    for (a31 a31Var4 : arrayList4) {
                                        Object obj7 = obj2;
/* 267 */                               HashMap map10 = a31Var4.f75d;
                                        if (map10 != null && (c2088pz2 = (C2088pz) map10.get(str46)) != null) {
/* 269 */                                   sparseArray2.append(a31Var4.f72a, c2088pz2);
                                        }
                                        obj2 = obj7;
                                    }
/* 271 */                           z43 z43Var2 = new z43();
/* 272 */                           z43Var2.f19935i = new SparseArray();
/* 273 */                           z43Var2.f19933g = str44.split(str11)[1];
/* 274 */                           z43Var2.f19934h = sparseArray2;
                                    obj2 = obj2;
                                    z43Var = z43Var2;
                                } else {
                                    it = it8;
                                    Object obj8 = obj2;
                                    map2 = map;
                                    str6 = str45;
                                    str11 = str8;
                                    switch (str44.hashCode()) {
                                        case -1249320806:
                                            obj2 = obj8;
                                            b = str44.equals(obj2) ? (byte) 0 : (byte) -1;
                                            break;
                                        case -1249320805:
                                            if (str44.equals(obj)) {
                                                obj2 = obj8;
                                                b = 1;
                                            } else {
                                                obj2 = obj8;
                                            }
                                            break;
                                        case -1225497657:
                                            if (str44.equals(str7)) {
                                                obj2 = obj8;
                                                b = 2;
                                            } else {
                                                obj2 = obj8;
                                            }
                                            break;
                                        case -1225497656:
                                            if (str44.equals(str)) {
                                                obj2 = obj8;
                                                b = 3;
                                            } else {
                                                obj2 = obj8;
                                            }
                                            break;
                                        case -1225497655:
                                            if (str44.equals("translationZ")) {
                                                obj2 = obj8;
                                                b = 4;
                                            } else {
                                                obj2 = obj8;
                                            }
                                            break;
                                        case -1001078227:
                                            if (str44.equals(str2)) {
                                                obj2 = obj8;
                                                b = 5;
                                            } else {
                                                obj2 = obj8;
                                            }
                                            break;
                                        case -908189618:
                                            if (str44.equals(str3)) {
                                                obj2 = obj8;
                                                b = 6;
                                            } else {
                                                obj2 = obj8;
                                            }
                                            break;
                                        case -908189617:
                                            if (str44.equals(str4)) {
                                                obj2 = obj8;
                                                b = 7;
                                            } else {
                                                obj2 = obj8;
                                            }
                                            break;
                                        case -40300674:
                                            if (str44.equals(str5)) {
                                                obj2 = obj8;
                                                b = 8;
                                            } else {
                                                obj2 = obj8;
                                            }
                                            break;
                                        case -4379043:
                                            if (str44.equals("elevation")) {
                                                obj2 = obj8;
                                                b = 9;
                                            } else {
                                                obj2 = obj8;
                                            }
                                            break;
                                        case 37232917:
                                            if (str44.equals("transitionPathRotate")) {
                                                b = 10;
                                                obj2 = obj8;
                                            } else {
                                                obj2 = obj8;
                                            }
                                            break;
                                        case 92909918:
                                            if (str44.equals(str23)) {
                                                b = 11;
                                                obj2 = obj8;
                                            } else {
                                                obj2 = obj8;
                                            }
                                            break;
                                        default:
                                            obj2 = obj8;
                                            break;
                                    }
                                    switch (b) {
                                        case 0:
/* 300 */                                   y43Var = new y43(3);
                                            str23 = str23;
/* 301 */                                   y43Var.f2730e = j;
                                            c53Var = y43Var;
                                            break;
                                        case 1:
/* 298 */                                   y43Var = new y43(4);
                                            str23 = str23;
/* 301 */                                   y43Var.f2730e = j;
                                            c53Var = y43Var;
                                            break;
                                        case 2:
/* 296 */                                   y43Var = new y43(7);
                                            str23 = str23;
/* 301 */                                   y43Var.f2730e = j;
                                            c53Var = y43Var;
                                            break;
                                        case 3:
/* 294 */                                   y43Var = new y43(8);
                                            str23 = str23;
/* 301 */                                   y43Var.f2730e = j;
                                            c53Var = y43Var;
                                            break;
                                        case 4:
/* 292 */                                   y43Var = new y43(9);
                                            str23 = str23;
/* 301 */                                   y43Var.f2730e = j;
                                            c53Var = y43Var;
                                            break;
                                        case 5:
/* 289 */                                   b53 b53Var = new b53();
/* 290 */                                   b53Var.f2232g = false;
                                            y43Var = b53Var;
                                            str23 = str23;
/* 301 */                                   y43Var.f2730e = j;
                                            c53Var = y43Var;
                                            break;
                                        case 6:
/* 287 */                                   y43Var = new y43(5);
                                            str23 = str23;
/* 301 */                                   y43Var.f2730e = j;
                                            c53Var = y43Var;
                                            break;
                                        case 7:
/* 285 */                                   y43Var = new y43(6);
                                            str23 = str23;
/* 301 */                                   y43Var.f2730e = j;
                                            c53Var = y43Var;
                                            break;
                                        case 8:
/* 283 */                                   y43Var = new y43(2);
                                            str23 = str23;
/* 301 */                                   y43Var.f2730e = j;
                                            c53Var = y43Var;
                                            break;
                                        case 9:
/* 281 */                                   y43Var = new y43(1);
                                            str23 = str23;
/* 301 */                                   y43Var.f2730e = j;
                                            c53Var = y43Var;
                                            break;
                                        case 10:
/* 279 */                                   y43Var = new a53();
                                            str23 = str23;
/* 301 */                                   y43Var.f2730e = j;
                                            c53Var = y43Var;
                                            break;
                                        case 11:
/* 277 */                                   y43Var = new y43(0);
                                            str23 = str23;
/* 301 */                                   y43Var.f2730e = j;
                                            c53Var = y43Var;
                                            break;
                                        default:
                                            z43Var = null;
                                            break;
                                    }
                                    if (c53Var == null) {
                                        zj1Var2 = this;
                                        str23 = str23;
                                        str8 = str11;
                                        it8 = it;
                                        map = map2;
                                    } else {
/* 302 */                               c53Var.f2727b = str44;
/* 303 */                               this.f20199x.put(str44, c53Var);
                                        zj1Var2 = this;
                                        str23 = str23;
                                        it8 = it;
                                        str7 = str7;
                                        map = map2;
                                        str5 = str5;
                                        str8 = str11;
                                    }
                                }
                                c53Var = z43Var;
                                if (c53Var == null) {
                                    zj1Var2 = this;
                                    str23 = str23;
                                    str8 = str11;
                                    it8 = it;
                                    map = map2;
                                } else {
/* 302 */                           c53Var.f2727b = str44;
/* 303 */                           this.f20199x.put(str44, c53Var);
                                    zj1Var2 = this;
                                    str23 = str23;
                                    it8 = it;
                                    str7 = str7;
                                    map = map2;
                                    str5 = str5;
                                    str8 = str11;
                                }
                            }
                        }
                        zj1Var = zj1Var2;
                        HashMap map11 = map;
                        if (arrayList4 != null) {
                            for (a31 a31Var5 : arrayList4) {
                            }
                        }
                        for (String str47 : zj1Var.f20199x.keySet()) {
                            HashMap map12 = map11;
/* 308 */                   ((c53) zj1Var.f20199x.get(str47)).mo1538c(map12.containsKey(str47) ? ((Integer) map12.get(str47)).intValue() : 0);
                            map11 = map12;
                        }
                    }
/* 309 */           int size = arrayList.size();
                    int i12 = size + 2;
                    ik1[] ik1VarArr = new ik1[i12];
/* 310 */           ik1VarArr[0] = ik1Var;
/* 311 */           ik1VarArr[size + 1] = ik1Var2;
/* 312 */           if (arrayList.size() > 0 && zj1Var.f20180e == -1) {
/* 313 */               zj1Var.f20180e = 0;
                    }
/* 314 */           Iterator it9 = arrayList.iterator();
                    int i13 = 1;
                    while (it9.hasNext()) {
/* 315 */               ik1VarArr[i13] = (ik1) it9.next();
                        i13++;
                    }
/* 316 */           HashSet hashSet7 = new HashSet();
                    for (String str48 : ik1Var2.f9682Y.keySet()) {
                        ik1 ik1Var8 = ik1Var;
/* 318 */               if (ik1Var8.f9682Y.containsKey(str48)) {
                            str10 = str6;
                            hashSet2 = hashSet;
                            if (!hashSet2.contains(str10 + str48)) {
/* 320 */                       hashSet7.add(str48);
                            }
                        } else {
                            hashSet2 = hashSet;
                            str10 = str6;
                        }
                        ik1Var = ik1Var8;
                        hashSet = hashSet2;
                        str6 = str10;
                    }
/* 321 */           String[] strArr = (String[]) hashSet7.toArray(new String[0]);
                    zj1Var.f20193r = strArr;
/* 322 */           zj1Var.f20194s = new int[strArr.length];
                    int i14 = 0;
                    while (true) {
/* 323 */               String[] strArr2 = zj1Var.f20193r;
                        if (i14 < strArr2.length) {
/* 324 */                   String str49 = strArr2[i14];
/* 325 */                   zj1Var.f20194s[i14] = 0;
                            for (int i15 = 0; i15 < i12; i15++) {
/* 326 */                       if (ik1VarArr[i15].f9682Y.containsKey(str49) && (c2088pz = (C2088pz) ik1VarArr[i15].f9682Y.get(str49)) != null) {
/* 328 */                           int[] iArr = zj1Var.f20194s;
                                    iArr[i14] = c2088pz.m7620c() + iArr[i14];
                                    break;
                                }
                            }
                            i14++;
                        } else {
/* 329 */                   boolean z = ik1VarArr[0].f9678U != -1;
/* 330 */                   int length = 18 + strArr2.length;
                            boolean[] zArr = new boolean[length];
                            for (int i16 = 1; i16 < i12; i16++) {
/* 331 */                       ik1 ik1Var9 = ik1VarArr[i16];
                                ik1 ik1Var10 = ik1VarArr[i16 - 1];
/* 333 */                       boolean zM4570b = ik1.m4570b(ik1Var9.f9690e, ik1Var10.f9690e);
/* 334 */                       boolean zM4570b2 = ik1.m4570b(ik1Var9.f9691f, ik1Var10.f9691f);
/* 335 */                       zArr[0] = zArr[0] | ik1.m4570b(ik1Var9.f9689d, ik1Var10.f9689d);
                                boolean z2 = zM4570b | zM4570b2 | z;
/* 336 */                       zArr[1] = zArr[1] | z2;
/* 337 */                       zArr[2] = z2 | zArr[2];
/* 338 */                       zArr[3] = zArr[3] | ik1.m4570b(ik1Var9.f9692i, ik1Var10.f9692i);
                                zArr[4] = ik1.m4570b(ik1Var9.f9693v, ik1Var10.f9693v) | zArr[4];
                            }
                            int i17 = 0;
                            for (int i18 = 1; i18 < length; i18++) {
/* 340 */                       if (zArr[i18]) {
                                    i17++;
                                }
                            }
/* 341 */                   zj1Var.f20190o = new int[i17];
/* 342 */                   int iMax = Math.max(2, i17);
/* 343 */                   zj1Var.f20191p = new double[iMax];
/* 344 */                   zj1Var.f20192q = new double[iMax];
                            int i19 = 0;
                            for (int i20 = 1; i20 < length; i20++) {
/* 345 */                       if (zArr[i20]) {
/* 346 */                           zj1Var.f20190o[i19] = i20;
                                    i19++;
                                }
                            }
                            int[] iArr2 = {i12, zj1Var.f20190o.length};
                            Class cls = Double.TYPE;
                            double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
/* 348 */                   double[] dArr2 = new double[i12];
                            int i21 = 0;
                            while (i21 < i12) {
/* 349 */                       ik1 ik1Var11 = ik1VarArr[i21];
                                double[] dArr3 = dArr[i21];
                                int[] iArr3 = zj1Var.f20190o;
                                ik1[] ik1VarArr2 = ik1VarArr;
                                int i22 = 6;
/* 351 */                       float[] fArr = {ik1Var11.f9689d, ik1Var11.f9690e, ik1Var11.f9691f, ik1Var11.f9692i, ik1Var11.f9693v, ik1Var11.f9694w};
                                int i23 = 0;
                                int i24 = 0;
/* 352 */                       while (i23 < iArr3.length) {
/* 353 */                           int i25 = iArr3[i23];
                                    if (i25 < i22) {
/* 354 */                               dArr3[i24] = fArr[i25];
                                        i24++;
                                    }
                                    i23++;
                                    i22 = 6;
                                }
/* 355 */                       dArr2[i21] = ik1VarArr2[i21].f9688c;
                                i21++;
                                ik1VarArr = ik1VarArr2;
                            }
                            ik1[] ik1VarArr3 = ik1VarArr;
                            int i26 = 0;
                            while (true) {
/* 356 */                       int[] iArr4 = zj1Var.f20190o;
                                if (i26 < iArr4.length) {
/* 357 */                           if (iArr4[i26] < 6) {
/* 359 */                               String strM3789o = fm0.m3789o(new StringBuilder(), ik1.f9677c0[zj1Var.f20190o[i26]], " [");
                                        for (int i27 = 0; i27 < i12; i27++) {
                                            StringBuilder sbM3512p = AbstractC0886en.m3512p(strM3789o);
/* 360 */                                   sbM3512p.append(dArr[i27][i26]);
                                            strM3789o = sbM3512p.toString();
                                        }
                                    }
                                    i26++;
                                } else {
/* 361 */                           zj1Var.f20185j = new py0[zj1Var.f20193r.length + 1];
                                    int i28 = 0;
                                    while (true) {
/* 362 */                               String[] strArr3 = zj1Var.f20193r;
                                        if (i28 >= strArr3.length) {
/* 385 */                                   zj1Var.f20185j[0] = py0.m7597V(zj1Var.f20180e, dArr2, dArr);
/* 386 */                                   if (ik1VarArr3[0].f9678U != -1) {
/* 387 */                                       int[] iArr5 = new int[i12];
/* 388 */                                       double[] dArr4 = new double[i12];
                                                double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i12, 2);
                                                for (int i29 = 0; i29 < i12; i29++) {
/* 390 */                                           ik1 ik1Var12 = ik1VarArr3[i29];
                                                    iArr5[i29] = ik1Var12.f9678U;
/* 391 */                                           dArr4[i29] = ik1Var12.f9688c;
/* 392 */                                           double[] dArr6 = dArr5[i29];
                                                    dArr6[0] = ik1Var12.f9690e;
/* 393 */                                           dArr6[1] = ik1Var12.f9691f;
                                                }
/* 395 */                                       zj1Var.f20186k = new C2326wc(iArr5, dArr4, dArr5);
                                            }
/* 396 */                                   zj1Var.f20201z = new HashMap();
                                            if (arrayList4 != null) {
                                                for (String str50 : hashSet6) {
/* 398 */                                           a43 a43VarM55c = a43.m55c(str50);
                                                    if (a43VarM55c != null) {
/* 399 */                                               a43VarM55c.f83b = str50;
/* 400 */                                               zj1Var.f20201z.put(str50, a43VarM55c);
                                                    }
                                                }
                                                for (a31 a31Var6 : arrayList4) {
                                                }
/* 402 */                                       Iterator it10 = zj1Var.f20201z.values().iterator();
                                                while (it10.hasNext()) {
/* 403 */                                           ((a43) it10.next()).m59e();
                                                }
                                                return;
                                            }
                                            return;
                                        }
/* 363 */                               String str51 = strArr3[i28];
                                        int i30 = 0;
                                        int i31 = 0;
                                        double[] dArr7 = null;
                                        double[][] dArr8 = null;
                                        while (i30 < i12) {
/* 366 */                                   if (ik1VarArr3[i30].f9682Y.containsKey(str51)) {
                                                if (dArr8 == null) {
/* 367 */                                           dArr7 = new double[i12];
/* 370 */                                           C2088pz c2088pz5 = (C2088pz) ik1VarArr3[i30].f9682Y.get(str51);
                                                    dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i12, c2088pz5 == null ? 0 : c2088pz5.m7620c());
                                                }
/* 373 */                                       ik1 ik1Var13 = ik1VarArr3[i30];
                                                dArr7[i31] = ik1Var13.f9688c;
/* 374 */                                       double[] dArr9 = dArr8[i31];
/* 375 */                                       C2088pz c2088pz6 = (C2088pz) ik1Var13.f9682Y.get(str51);
                                                if (c2088pz6 != null) {
/* 376 */                                           if (c2088pz6.m7620c() == 1) {
/* 377 */                                               dArr9[0] = c2088pz6.m7618a();
                                                    } else {
/* 378 */                                               int iM7620c = c2088pz6.m7620c();
/* 379 */                                               float[] fArr2 = new float[iM7620c];
/* 380 */                                               c2088pz6.m7619b(fArr2);
                                                        int i32 = 0;
                                                        int i33 = 0;
                                                        while (i32 < iM7620c) {
/* 381 */                                                   dArr9[i33] = fArr2[i32];
                                                            i32++;
                                                            str51 = str51;
                                                            i33++;
                                                            i28 = i28;
                                                            i30 = i30;
                                                        }
                                                    }
                                                }
                                                i3 = i28;
                                                str9 = str51;
                                                i4 = i30;
                                                i31++;
                                            } else {
                                                i3 = i28;
                                                str9 = str51;
                                                i4 = i30;
                                            }
                                            i30 = i4 + 1;
                                            str51 = str9;
                                            i28 = i3;
                                        }
                                        int i34 = i28;
/* 382 */                               double[] dArrCopyOf = Arrays.copyOf(dArr7, i31);
/* 383 */                               double[][] dArr10 = (double[][]) Arrays.copyOf(dArr8, i31);
                                        int i35 = i34 + 1;
/* 384 */                               zj1Var.f20185j[i35] = py0.m7597V(zj1Var.f20180e, dArrCopyOf, dArr10);
                                        i28 = i35;
                                    }
                                }
                            }
                        }
                    }
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(" start: x: ");
/* 8 */             ik1 ik1Var = this.f20181f;
/* 12 */            sb.append(ik1Var.f9690e);
/* 17 */            sb.append(" y: ");
/* 22 */            sb.append(ik1Var.f9691f);
/* 27 */            sb.append(" end: x: ");
/* 30 */            ik1 ik1Var2 = this.f20182g;
/* 34 */            sb.append(ik1Var2.f9690e);
/* 37 */            sb.append(" y: ");
/* 42 */            sb.append(ik1Var2.f9691f);
/* 45 */            return sb.toString();
                }
            }
