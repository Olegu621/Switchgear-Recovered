            package p000;

            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vj3 extends ak3 {

                /* JADX INFO: renamed from: b */
                public static final vj3 f18227b = new vj3(bk3.f2495a);

                /* JADX INFO: renamed from: a */
                public final AtomicReference f18228a;

                public vj3(ak3 ak3Var) {
/* 9 */             this.f18228a = new AtomicReference(ak3Var);
                }

                @Override // p000.ak3
                /* JADX INFO: renamed from: a */
                public final void mo300a(String str, boolean z) {
/* 1 */             Level level = Level.WARNING;
/* 11 */            ((ak3) this.f18228a.get()).mo300a(str, z);
                }

                @Override // p000.ak3
                /* JADX INFO: renamed from: b */
                public final kk3 mo301b() {
/* 9 */             return ((ak3) this.f18228a.get()).mo301b();
                }

                @Override // p000.ak3
                /* JADX INFO: renamed from: c */
                public final kb1 mo302c() {
/* 9 */             return ((ak3) this.f18228a.get()).mo302c();
                }
            }
