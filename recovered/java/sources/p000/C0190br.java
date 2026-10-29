            package p000;

            import android.graphics.Typeface;
            
            /* JADX INFO: renamed from: br */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0190br extends kb1 {

                /* JADX INFO: renamed from: e */
                public final Typeface f2575e;

                /* JADX INFO: renamed from: f */
                public final InterfaceC0153ar f2576f;

                /* JADX INFO: renamed from: i */
                public boolean f2577i;

                public C0190br(InterfaceC0153ar interfaceC0153ar, Typeface typeface) {
/* 4 */             this.f2575e = typeface;
/* 6 */             this.f2576f = interfaceC0153ar;
                }

                @Override // p000.kb1
                /* JADX INFO: renamed from: M */
                public final void mo1411M(int i) {
/* 3 */             if (this.f2577i) {
/* 12 */                return;
                    }
/* 9 */             this.f2576f.mo1150r(this.f2575e);
                }

                @Override // p000.kb1
                /* JADX INFO: renamed from: N */
                public final void mo1412N(Typeface typeface, boolean z) {
/* 3 */             if (this.f2577i) {
/* 10 */                return;
                    }
/* 7 */             this.f2576f.mo1150r(typeface);
                }
            }
