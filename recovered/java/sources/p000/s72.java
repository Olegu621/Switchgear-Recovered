            package p000;

            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class s72 {

                /* JADX INFO: renamed from: a */
                public final s72 f16462a;

                /* JADX INFO: renamed from: b */
                public final Object f16463b = new Object();

                /* JADX INFO: renamed from: c */
                public boolean f16464c;

                public s72(s72 s72Var) {
/* 4 */             this.f16462a = s72Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m8418a() {
                    Unit unit;
                    synchronized (this.f16463b) {
                        try {
/* 6 */                     if (this.f16464c) {
/* 8 */                         s72 s72Var = this.f16462a;
/* 10 */                        if (s72Var != null) {
/* 12 */                            s72Var.m8418a();
/* 15 */                            unit = Unit.f12910a;
                                } else {
/* 20 */                            unit = null;
                                }
/* 21 */                        if (unit == null) {
/* 27 */                            hu0.m4325T("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                                }
                            } else {
/* 35 */                        hu0.m4315H0("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                            }
/* 39 */                    this.f16464c = false;
                        } catch (Throwable th) {
/* 44 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m8419b() {
                    synchronized (this.f16463b) {
                    }
                }
            }
