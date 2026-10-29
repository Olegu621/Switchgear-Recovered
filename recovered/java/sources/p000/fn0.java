            package p000;

            import android.graphics.Rect;
            import android.transition.Transition;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fn0 extends Transition.EpicenterCallback {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8289a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Rect f8290b;

                public /* synthetic */ fn0(int i, Rect rect) {
/* 1 */             this.f8289a = i;
/* 3 */             this.f8290b = rect;
                }

                @Override // android.transition.Transition.EpicenterCallback
                public final Rect onGetEpicenter(Transition transition) {
/* 1 */             int i = this.f8289a;
/* 3 */             Rect rect = this.f8290b;
                    switch (i) {
                        case 0:
/* 15 */                    return rect;
                        default:
/* 12 */                    if (rect.isEmpty()) {
/* 14 */                        return null;
                            }
/* 15 */                    return rect;
                    }
                }
            }
