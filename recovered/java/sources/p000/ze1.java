            package p000;

            import java.util.Map;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ze1 extends AbstractC1910m0 implements kf1 {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f20125b;

                /* JADX INFO: renamed from: c */
                public boolean f20126c;

                public /* synthetic */ ze1(int i) {
/* 1 */             this.f20125b = i;
                }

                @Override // p000.kf1
                /* JADX INFO: renamed from: a */
                public final void mo3758a(if1 if1Var) {
                    switch (this.f20125b) {
                        case 0:
/* 21 */                    if1Var.f9568d = Boolean.valueOf(this.f20126c);
                            break;
                        default:
/* 12 */                    if1Var.f9575k = Boolean.valueOf(this.f20126c);
                            break;
                    }
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
                    switch (this.f20125b) {
                        case 0:
/* 37 */                    return nc1.m6963d(new Pair("fullscreen", Boolean.valueOf(this.f20126c)));
                        default:
/* 19 */                    return nc1.m6963d(new Pair("pictureInPicture", Boolean.valueOf(this.f20126c)));
                    }
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
                    switch (this.f20125b) {
                        case 0:
/* 15 */                    return mn0.m6697m("fullscreen_change");
                        default:
/* 8 */                     return mn0.m6697m("picture_in_picture_change");
                    }
                }
            }
