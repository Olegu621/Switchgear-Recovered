            package p000;

            import io.flutter.embedding.android.FlutterView;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class dl0 implements c00 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7294a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f7295b;

                public /* synthetic */ dl0(Object obj, int i) {
/* 1 */             this.f7294a = i;
/* 3 */             this.f7295b = obj;
                }

                @Override // p000.c00
                public final void accept(Object obj) {
/* 1 */             int i = this.f7294a;
/* 3 */             Object obj2 = this.f7295b;
                    switch (i) {
                        case 0:
/* 90 */                    ((FlutterView) obj2).setWindowInfoListenerDisplayFeatures((q83) obj);
                            break;
                        case 1:
/* 18 */                    C2292vg c2292vg = (C2292vg) obj;
/* 32 */                    for (Map.Entry entry : ((Map) obj2).entrySet()) {
/* 50 */                        int i2 = c2292vg.f18047b - ((C0916fg) entry.getKey()).f8197f;
/* 59 */                        if (((C0916fg) entry.getKey()).f8198g) {
/* 61 */                            i2 = -i2;
                                }
/* 62 */                        int iM2876f = cr2.m2876f(i2);
/* 70 */                        lj2 lj2Var = (lj2) entry.getValue();
/* 72 */                        lj2Var.getClass();
/* 81 */                        pg3.m7443w(new ij2(lj2Var, iM2876f, -1));
                            }
                            break;
                        default:
/* 12 */                    ((xx1) obj2).mo6629e((q83) obj);
                            break;
                    }
                }
            }
