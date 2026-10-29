            package p000;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class f11 implements cp1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7964a;

                public /* synthetic */ f11(int i) {
/* 1 */             this.f7964a = i;
                }

                @Override // p000.td0
                /* JADX INFO: renamed from: a */
                public final void mo3633a(Object obj, Object obj2) {
                    switch (this.f7964a) {
                        case 0:
/* 82 */                    throw new wd0("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
                        case 1:
/* 34 */                    Map.Entry entry = (Map.Entry) obj;
/* 36 */                    dp1 dp1Var = (dp1) obj2;
/* 44 */                    dp1Var.mo3171a(fz1.f8404g, entry.getKey());
/* 53 */                    dp1Var.mo3171a(fz1.f8405h, entry.getValue());
/* 56 */                    return;
                        default:
/* 33 */                    throw new wd0("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
                    }
                }
            }
