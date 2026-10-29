            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: bh */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0180bh implements InterfaceC2560zq {

                /* JADX INFO: renamed from: a */
                public final C0019ah[] f2422a;

                public C0180bh(C0019ah[] c0019ahArr) {
/* 4 */             this.f2422a = c0019ahArr;
                }

                @Override // p000.InterfaceC2560zq
                /* JADX INFO: renamed from: a */
                public final void mo1354a(Throwable th) {
/* 1 */             m1355b();
                }

                /* JADX INFO: renamed from: b */
                public final void m1355b() {
/* 5 */             for (C0019ah c0019ah : this.f2422a) {
/* 9 */                 e90 e90Var = c0019ah.f255w;
/* 11 */                if (e90Var == null) {
/* 21 */                    Intrinsics.m6220e("handle");
/* 25 */                    throw null;
                        }
/* 13 */                e90Var.dispose();
                    }
                }

                public final String toString() {
/* 18 */            return "DisposeHandlersOnCancel[" + this.f2422a + ']';
                }
            }
