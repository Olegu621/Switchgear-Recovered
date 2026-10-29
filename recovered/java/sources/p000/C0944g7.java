            package p000;

            import co.ab180.airbridge.Airbridge;
            
            /* JADX INFO: renamed from: g7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0944g7 extends dg1 {

                /* JADX INFO: renamed from: c */
                public final String f8504c;

                /* JADX INFO: renamed from: d */
                public final i03 f8505d;

                public C0944g7(i03 i03Var) {
/* 3 */             super("AirBridge", i03Var);
/* 6 */             this.f8504c = "AirBridge";
/* 8 */             this.f8505d = i03Var;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: a */
                public final boolean mo3058a(boolean z, g13 g13Var) {
/* 1 */             g13Var.getClass();
                    try {
/* 6 */                 Class.forName("co.ab180.airbridge.Airbridge");
/* 9 */                 if (z) {
/* 11 */                    Airbridge.startTracking();
/* 20 */                    return true;
                        }
/* 17 */                Airbridge.stopTracking();
/* 20 */                return true;
                    } catch (Exception e) {
/* 22 */                m3063f(e);
/* 25 */                return false;
                    }
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: c */
                public final i03 mo3060c() {
/* 1 */             return this.f8505d;
                }

                @Override // p000.dg1
                /* JADX INFO: renamed from: d */
                public final String mo3061d() {
/* 1 */             return this.f8504c;
                }
            }
