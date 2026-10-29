            package p000;

            import android.os.Looper;
            import android.util.AndroidRuntimeException;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ag2 {

                /* JADX INFO: renamed from: n */
                public static final kb0 f229n = new kb0();

                /* JADX INFO: renamed from: o */
                public static final kb0 f230o = new kb0();

                /* JADX INFO: renamed from: p */
                public static final kb0 f231p = new kb0();

                /* JADX INFO: renamed from: q */
                public static final kb0 f232q = new kb0();

                /* JADX INFO: renamed from: r */
                public static final kb0 f233r = new kb0();

                /* JADX INFO: renamed from: s */
                public static final kb0 f234s = new kb0();

                /* JADX INFO: renamed from: a */
                public float f235a;

                /* JADX INFO: renamed from: b */
                public float f236b;

                /* JADX INFO: renamed from: c */
                public boolean f237c;

                /* JADX INFO: renamed from: d */
                public final z70 f238d;

                /* JADX INFO: renamed from: e */
                public final y70 f239e;

                /* JADX INFO: renamed from: f */
                public boolean f240f;

                /* JADX INFO: renamed from: g */
                public long f241g;

                /* JADX INFO: renamed from: h */
                public final float f242h;

                /* JADX INFO: renamed from: i */
                public final ArrayList f243i;

                /* JADX INFO: renamed from: j */
                public final ArrayList f244j;

                /* JADX INFO: renamed from: k */
                public bg2 f245k;

                /* JADX INFO: renamed from: l */
                public float f246l;

                /* JADX INFO: renamed from: m */
                public boolean f247m;

                public ag2(z70 z70Var) {
/* 1 */             y70 y70Var = z70.f19957b0;
/* 7 */             this.f235a = 0.0f;
/* 12 */            this.f236b = Float.MAX_VALUE;
/* 15 */            this.f237c = false;
/* 17 */            this.f240f = false;
/* 21 */            this.f241g = 0L;
/* 28 */            this.f243i = new ArrayList();
/* 35 */            this.f244j = new ArrayList();
/* 37 */            this.f238d = z70Var;
/* 39 */            this.f239e = y70Var;
/* 43 */            if (y70Var == f231p || y70Var == f232q || y70Var == f233r) {
/* 83 */                this.f242h = 0.1f;
                    } else if (y70Var == f234s || y70Var == f229n || y70Var == f230o) {
/* 77 */                this.f242h = 0.00390625f;
                    } else {
/* 74 */                this.f242h = 1.0f;
                    }
/* 86 */            this.f245k = null;
/* 88 */            this.f246l = Float.MAX_VALUE;
/* 90 */            this.f247m = false;
                }

                /* JADX INFO: renamed from: a */
                public final void m271a(float f) {
/* 3 */             this.f239e.getClass();
/* 10 */            z70 z70Var = this.f238d;
/* 12 */            z70Var.f19961Z = f / 10000.0f;
/* 14 */            z70Var.invalidateSelf();
/* 17 */            int i = 0;
                    while (true) {
/* 18 */                ArrayList arrayList = this.f244j;
/* 24 */                if (i >= arrayList.size()) {
/* 46 */                    for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 52 */                        if (arrayList.get(size) == null) {
/* 54 */                            arrayList.remove(size);
                                }
                            }
/* 60 */                    return;
                        }
/* 30 */                if (arrayList.get(i) != null) {
/* 39 */                    throw pm2.m7486i(i, arrayList);
                        }
/* 32 */                i++;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m272b() {
/* 9 */             if (this.f245k.f2412b <= 0.0d) {
/* 39 */                C1951n4.m6866q("Spring animations can only come to an end when there is damping");
                    } else {
/* 19 */                if (Looper.myLooper() != Looper.getMainLooper()) {
/* 36 */                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                        }
/* 23 */                if (this.f240f) {
/* 26 */                    this.f247m = true;
                        }
                    }
                }
            }
