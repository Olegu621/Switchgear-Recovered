            package p000;

            import io.sentry.C1697u2;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qm2 implements bm0 {

                /* JADX INFO: renamed from: b */
                public ra2 f15655b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f15656c;

                /* JADX INFO: renamed from: a */
                public final ArrayDeque f15654a = new ArrayDeque();

                /* JADX INFO: renamed from: d */
                public boolean f15657d = false;

                public qm2(zb0 zb0Var) {
/* 14 */            pg3.m7423a();
/* 22 */            this.f15656c = new ArrayList();
                }

                /* JADX INFO: renamed from: a */
                public final void m7951a() {
/* 1 */             pg3.m7423a();
/* 10 */            new C1898lp("Camera is closed.", 2, null);
/* 13 */            ArrayDeque arrayDeque = this.f15654a;
/* 15 */            Iterator it = arrayDeque.iterator();
/* 23 */            if (it.hasNext()) {
/* 58 */                throw fm0.m3780f(it);
                    }
/* 25 */            arrayDeque.clear();
/* 35 */            Iterator it2 = new ArrayList(this.f15656c).iterator();
/* 43 */            if (it2.hasNext()) {
/* 50 */                pm2.m7490m(it2.next());
/* 53 */                throw null;
                    }
                }

                @Override // p000.bm0
                /* JADX INFO: renamed from: b */
                public final void mo1394b(cm0 cm0Var) {
/* 11 */            pg3.m7436o().execute(new f72(this, 3));
                }

                /* JADX INFO: renamed from: c */
                public final void m7952c() {
                    int iMo3812g;
/* 1 */             pg3.m7423a();
/* 6 */             if (this.f15657d) {
/* 71 */                return;
                    }
/* 9 */             ra2 ra2Var = this.f15655b;
/* 11 */            ra2Var.getClass();
/* 14 */            pg3.m7423a();
/* 19 */            C0210cb c0210cb = (C0210cb) ra2Var.f15956b;
/* 21 */            c0210cb.getClass();
/* 24 */            pg3.m7423a();
/* 38 */            de3.m3028j("The ImageReader is not initialized.", ((C1767ir) c0210cb.f2804b) != null);
/* 43 */            C1767ir c1767ir = (C1767ir) c0210cb.f2804b;
                    synchronized (c1767ir.f11910c) {
/* 58 */                iMo3812g = ((ow0) c1767ir.f11911d).mo3812g() - c1767ir.f11908a;
                    }
/* 60 */            if (iMo3812g == 0 || this.f15654a.poll() == null) {
/* 71 */                return;
                    }
/* 72 */            C1697u2.m5431g();
                }
            }
