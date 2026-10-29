            package p000;

            import android.util.Range;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Objects;
            
            /* JADX INFO: renamed from: jr */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1803jr {

                /* JADX INFO: renamed from: h */
                public static final C1888lf f12438h = new C1888lf("camerax.core.captureConfig.rotation", Integer.TYPE, null);

                /* JADX INFO: renamed from: i */
                public static final C1888lf f12439i = new C1888lf("camerax.core.captureConfig.jpegQuality", Integer.class, null);

                /* JADX INFO: renamed from: j */
                public static final C1888lf f12440j = new C1888lf("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);

                /* JADX INFO: renamed from: a */
                public final ArrayList f12441a;

                /* JADX INFO: renamed from: b */
                public final nq1 f12442b;

                /* JADX INFO: renamed from: c */
                public final int f12443c;

                /* JADX INFO: renamed from: d */
                public final List f12444d;

                /* JADX INFO: renamed from: e */
                public final boolean f12445e;

                /* JADX INFO: renamed from: f */
                public final nm2 f12446f;

                /* JADX INFO: renamed from: g */
                public final InterfaceC2188so f12447g;

                public C1803jr(ArrayList arrayList, nq1 nq1Var, int i, ArrayList arrayList2, boolean z, nm2 nm2Var, InterfaceC2188so interfaceC2188so) {
/* 4 */             this.f12441a = arrayList;
/* 6 */             this.f12442b = nq1Var;
/* 8 */             this.f12443c = i;
/* 14 */            this.f12444d = Collections.unmodifiableList(arrayList2);
/* 16 */            this.f12445e = z;
/* 18 */            this.f12446f = nm2Var;
/* 20 */            this.f12447g = interfaceC2188so;
                }

                /* JADX INFO: renamed from: a */
                public final int m5892a() {
/* 6 */             Object objMo7025e = 0;
                    try {
/* 10 */                objMo7025e = this.f12442b.mo7025e(zy2.f20393P);
                    } catch (IllegalArgumentException unused) {
                    }
/* 14 */            Integer num = (Integer) objMo7025e;
/* 16 */            Objects.requireNonNull(num);
/* 19 */            return num.intValue();
                }

                /* JADX INFO: renamed from: b */
                public final int m5893b() {
/* 6 */             Object objMo7025e = 0;
                    try {
/* 10 */                objMo7025e = this.f12442b.mo7025e(zy2.f20394Q);
                    } catch (IllegalArgumentException unused) {
                    }
/* 14 */            Integer num = (Integer) objMo7025e;
/* 16 */            Objects.requireNonNull(num);
/* 19 */            return num.intValue();
                }
            }
