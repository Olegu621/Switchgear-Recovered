            package p000;

            import android.app.Activity;
            import android.content.Intent;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ob3 extends yb3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Intent f14700a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Activity f14701b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f14702c;

                public ob3(Activity activity, Intent intent, int i) {
/* 1 */             this.f14700a = intent;
/* 3 */             this.f14701b = activity;
/* 5 */             this.f14702c = i;
                }

                @Override // p000.yb3
                /* JADX INFO: renamed from: a */
                public final void mo7130a() {
/* 1 */             Intent intent = this.f14700a;
/* 3 */             if (intent != null) {
/* 9 */                 this.f14701b.startActivityForResult(intent, this.f14702c);
                    }
                }
            }
