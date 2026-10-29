            package p000;

            import java.lang.ref.WeakReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class uv0 implements bm0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17729a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f17730b;

                public /* synthetic */ uv0(Object obj, int i) {
/* 1 */             this.f17729a = i;
/* 3 */             this.f17730b = obj;
                }

                @Override // p000.bm0
                /* JADX INFO: renamed from: b */
                public final void mo1394b(cm0 cm0Var) {
                    bm0 bm0Var;
/* 1 */             int i = this.f17729a;
/* 3 */             Object obj = this.f17730b;
                    switch (i) {
                        case 0:
/* 54 */                    wv0 wv0Var = (wv0) ((WeakReference) ((vv0) obj).f18364e).get();
/* 56 */                    if (wv0Var != null) {
/* 67 */                        wv0Var.f18831e0.execute(new RunnableC2166s2(wv0Var, 25));
/* 70 */                        return;
                            }
/* 70 */                    return;
                        default:
/* 8 */                     C1767ir c1767ir = (C1767ir) obj;
                            synchronized (c1767ir.f11910c) {
                                try {
/* 15 */                            int i2 = c1767ir.f11908a - 1;
/* 17 */                            c1767ir.f11908a = i2;
/* 21 */                            if (c1767ir.f11909b && i2 == 0) {
/* 25 */                                c1767ir.close();
                                    }
/* 33 */                            bm0Var = (bm0) c1767ir.f11913f;
                                } catch (Throwable th) {
/* 43 */                            throw th;
                                }
                                break;
                            }
/* 36 */                    if (bm0Var != null) {
/* 38 */                        bm0Var.mo1394b(cm0Var);
/* 41 */                        return;
                            }
/* 41 */                    return;
                    }
                }
            }
