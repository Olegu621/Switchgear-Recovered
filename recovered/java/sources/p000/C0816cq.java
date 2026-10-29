            package p000;

            import android.content.Context;
            import android.os.Build;
            import android.os.Handler;
            import android.util.ArrayMap;
            
            /* JADX INFO: renamed from: cq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0816cq {

                /* JADX INFO: renamed from: a */
                public final C0210cb f6873a;

                /* JADX INFO: renamed from: b */
                public final ArrayMap f6874b = new ArrayMap(4);

                public C0816cq(C0210cb c0210cb) {
/* 12 */            this.f6873a = c0210cb;
                }

                /* JADX INFO: renamed from: a */
                public static C0816cq m2830a(Context context, Handler handler) {
                    C0210cb c0852dq;
/* 3 */             int i = Build.VERSION.SDK_INT;
/* 8 */             if (i >= 30) {
/* 12 */                c0852dq = new C0926fq(context, null);
                    } else if (i >= 29) {
/* 22 */                c0852dq = new C0889eq(context, null);
                    } else {
/* 43 */                c0852dq = i >= 28 ? new C0852dq(context, null) : new C0210cb(context, new C0963gq(handler));
                    }
/* 47 */            return new C0816cq(c0852dq);
                }

                /* JADX INFO: renamed from: b */
                public final C0962gp m2831b(String str) {
                    C0962gp c0962gp;
                    synchronized (this.f6874b) {
/* 10 */                c0962gp = (C0962gp) this.f6874b.get(str);
/* 12 */                if (c0962gp == null) {
                            try {
/* 22 */                        C0962gp c0962gp2 = new C0962gp(this.f6873a.mo1596s(str), str);
/* 27 */                        this.f6874b.put(str, c0962gp2);
/* 30 */                        c0962gp = c0962gp2;
                            } catch (AssertionError e) {
/* 44 */                        throw new C1897lo(e.getMessage(), e);
                            }
                        }
                    }
/* 46 */            return c0962gp;
                }
            }
