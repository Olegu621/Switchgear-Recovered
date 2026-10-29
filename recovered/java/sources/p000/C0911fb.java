            package p000;

            import androidx.appcompat.widget.AppCompatSpinner;
            
            /* JADX INFO: renamed from: fb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0911fb extends em0 {

                /* JADX INFO: renamed from: U */
                public final /* synthetic */ C1884lb f8057U;

                /* JADX INFO: renamed from: V */
                public final /* synthetic */ AppCompatSpinner f8058V;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0911fb(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, C1884lb c1884lb) {
/* 5 */             super(appCompatSpinner2);
/* 1 */             this.f8058V = appCompatSpinner;
/* 3 */             this.f8057U = c1884lb;
                }

                @Override // p000.em0
                /* JADX INFO: renamed from: b */
                public final vd2 mo1200b() {
/* 1 */             return this.f8057U;
                }

                @Override // p000.em0
                /* JADX INFO: renamed from: c */
                public final boolean mo1201c() {
/* 1 */             AppCompatSpinner appCompatSpinner = this.f8058V;
/* 11 */            if (appCompatSpinner.getInternalPopup().mo4138a()) {
/* 26 */                return true;
                    }
/* 23 */            appCompatSpinner.f527f.mo4147m(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
/* 26 */            return true;
                }
            }
