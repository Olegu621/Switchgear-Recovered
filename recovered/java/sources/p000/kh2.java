            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class kh2 implements db2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ lh2 f12769a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f12770b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f12771c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ zy2 f12772d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C2069pg f12773e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ C2069pg f12774f;

                public /* synthetic */ kh2(lh2 lh2Var, String str, String str2, zy2 zy2Var, C2069pg c2069pg, C2069pg c2069pg2) {
/* 4 */             this.f12769a = lh2Var;
/* 6 */             this.f12770b = str;
/* 8 */             this.f12771c = str2;
/* 10 */            this.f12772d = zy2Var;
/* 12 */            this.f12773e = c2069pg;
/* 14 */            this.f12774f = c2069pg2;
                }

                @Override // p000.db2
                /* JADX INFO: renamed from: a */
                public final void mo1608a(fb2 fb2Var) {
/* 1 */             lh2 lh2Var = this.f12769a;
/* 7 */             if (lh2Var.m9655b() == null) {
/* 63 */                return;
                    }
/* 10 */            lh2Var.m6435B();
/* 27 */            lh2Var.m9653A(lh2Var.m6436C(this.f12770b, this.f12771c, this.f12772d, this.f12773e, this.f12774f));
/* 30 */            lh2Var.m9664n();
/* 33 */            s53 s53Var = lh2Var.f13283p;
/* 35 */            s53Var.getClass();
/* 38 */            pg3.m7423a();
/* 43 */            Iterator it = s53Var.f16439a.iterator();
/* 51 */            while (it.hasNext()) {
/* 59 */                s53Var.mo8066b((wy2) it.next());
                    }
                }
            }
