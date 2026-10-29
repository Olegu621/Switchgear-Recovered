            package p000;

            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cb2 implements db2 {

                /* JADX INFO: renamed from: a */
                public final AtomicBoolean f2818a = new AtomicBoolean(false);

                /* JADX INFO: renamed from: b */
                public final db2 f2819b;

                public cb2(db2 db2Var) {
/* 12 */            this.f2819b = db2Var;
                }

                @Override // p000.db2
                /* JADX INFO: renamed from: a */
                public final void mo1608a(fb2 fb2Var) {
/* 7 */             if (this.f2818a.get()) {
/* 14 */                return;
                    }
/* 11 */            this.f2819b.mo1608a(fb2Var);
                }

                /* JADX INFO: renamed from: b */
                public final void m1609b() {
/* 4 */             this.f2818a.set(true);
                }
            }
