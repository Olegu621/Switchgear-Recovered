            package p000;

            import android.content.Intent;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vb3 extends yb3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Intent f17957a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ e71 f17958b;

                public vb3(Intent intent, e71 e71Var) {
/* 1 */             this.f17957a = intent;
/* 3 */             this.f17958b = e71Var;
                }

                @Override // p000.yb3
                /* JADX INFO: renamed from: a */
                public final void mo7130a() {
/* 1 */             Intent intent = this.f17957a;
/* 3 */             if (intent != null) {
/* 8 */                 this.f17958b.startActivityForResult(intent, 2);
                    }
                }
            }
