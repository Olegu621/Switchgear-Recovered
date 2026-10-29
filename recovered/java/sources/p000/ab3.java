            package p000;

            import com.google.android.gms.internal.base.zau;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ab3 implements InterfaceC1793jh {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ur0 f171a;

                public ab3(ur0 ur0Var) {
/* 4 */             this.f171a = ur0Var;
                }

                @Override // p000.InterfaceC1793jh
                /* JADX INFO: renamed from: a */
                public final void mo149a(boolean z) {
/* 3 */             zau zauVar = this.f171a.f17695n;
/* 14 */            zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z)));
                }
            }
