            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lj2 {

                /* JADX INFO: renamed from: a */
                public final int f13318a;

                /* JADX INFO: renamed from: b */
                public final Matrix f13319b;

                /* JADX INFO: renamed from: c */
                public final boolean f13320c;

                /* JADX INFO: renamed from: d */
                public final Rect f13321d;

                /* JADX INFO: renamed from: e */
                public final boolean f13322e;

                /* JADX INFO: renamed from: f */
                public final int f13323f;

                /* JADX INFO: renamed from: g */
                public final C2069pg f13324g;

                /* JADX INFO: renamed from: h */
                public int f13325h;

                /* JADX INFO: renamed from: i */
                public int f13326i;

                /* JADX INFO: renamed from: k */
                public rj2 f13328k;

                /* JADX INFO: renamed from: l */
                public kj2 f13329l;

                /* JADX INFO: renamed from: j */
                public boolean f13327j = false;

                /* JADX INFO: renamed from: m */
                public final HashSet f13330m = new HashSet();

                /* JADX INFO: renamed from: n */
                public boolean f13331n = false;

                /* JADX INFO: renamed from: o */
                public final ArrayList f13332o = new ArrayList();

                public lj2(int i, int i2, C2069pg c2069pg, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
/* 23 */            this.f13323f = i;
/* 25 */            this.f13318a = i2;
/* 27 */            this.f13324g = c2069pg;
/* 29 */            this.f13319b = matrix;
/* 31 */            this.f13320c = z;
/* 33 */            this.f13321d = rect;
/* 35 */            this.f13326i = i3;
/* 37 */            this.f13325h = i4;
/* 39 */            this.f13322e = z2;
/* 48 */            this.f13329l = new kj2(c2069pg.f15102a, i2);
                }

                /* JADX INFO: renamed from: a */
                public final void m6461a() {
/* 7 */             de3.m3028j("Edge is already closed.", !this.f13331n);
                }

                /* JADX INFO: renamed from: b */
                public final void m6462b() {
/* 1 */             pg3.m7423a();
/* 6 */             this.f13329l.mo2951a();
/* 10 */            this.f13331n = true;
                }

                /* JADX INFO: renamed from: c */
                public final rj2 m6463c(boolean z) {
/* 1 */             pg3.m7423a();
/* 4 */             m6461a();
/* 9 */             C2069pg c2069pg = this.f13324g;
/* 17 */            int i = 0;
/* 21 */            rj2 rj2Var = new rj2(c2069pg.f15102a, z, c2069pg.f15103b, new fj2(this, i));
                    try {
/* 24 */                uw0 uw0Var = rj2Var.f16130j;
/* 26 */                kj2 kj2Var = this.f13329l;
/* 28 */                Objects.requireNonNull(kj2Var);
/* 40 */                if (kj2Var.m6121g(uw0Var, new gj2(kj2Var, i))) {
/* 57 */                    w11.m9453w(kj2Var.f7030e).mo3676a(new hj2(uw0Var, i), pg3.m7428g());
                        }
/* 63 */                this.f13328k = rj2Var;
/* 65 */                m6465e();
/* 68 */                return rj2Var;
                    } catch (c70 e) {
/* 81 */                throw new AssertionError("Surface is somehow already closed", e);
                    } catch (RuntimeException e2) {
/* 69 */                rj2Var.m8191b();
/* 72 */                throw e2;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m6464d() {
                    boolean z;
/* 1 */             pg3.m7423a();
/* 4 */             m6461a();
/* 7 */             kj2 kj2Var = this.f13329l;
/* 9 */             kj2Var.getClass();
/* 12 */            pg3.m7423a();
/* 17 */            if (kj2Var.f12827q == null) {
                        synchronized (kj2Var.f7026a) {
/* 22 */                    z = kj2Var.f7028c;
                        }
/* 25 */                if (!z) {
/* 74 */                    return;
                        }
                    }
/* 32 */            this.f13327j = false;
/* 36 */            this.f13329l.mo2951a();
/* 50 */            this.f13329l = new kj2(this.f13324g.f15102a, this.f13318a);
/* 54 */            Iterator it = this.f13330m.iterator();
/* 62 */            while (it.hasNext()) {
/* 70 */                ((Runnable) it.next()).run();
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m6465e() {
                    C2076pn c2076pn;
                    nt0 nt0Var;
/* 1 */             pg3.m7423a();
/* 18 */            C2292vg c2292vg = new C2292vg(this.f13321d, this.f13326i, this.f13325h, this.f13320c, this.f13319b, this.f13322e);
/* 21 */            rj2 rj2Var = this.f13328k;
/* 23 */            if (rj2Var != null) {
                        synchronized (rj2Var.f16121a) {
/* 28 */                    rj2Var.f16131k = c2292vg;
/* 30 */                    c2076pn = rj2Var.f16132l;
/* 32 */                    nt0Var = rj2Var.f16133m;
                        }
/* 35 */                if (c2076pn != null && nt0Var != null) {
/* 45 */                    nt0Var.execute(new nj2(c2076pn, c2292vg, 0));
                        }
                    }
/* 55 */            Iterator it = this.f13332o.iterator();
/* 63 */            while (it.hasNext()) {
/* 71 */                ((c00) it.next()).accept(c2292vg);
                    }
                }
            }
