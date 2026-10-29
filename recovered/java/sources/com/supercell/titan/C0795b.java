            package com.supercell.titan;

            import android.content.Intent;
            
            /* JADX INFO: renamed from: com.supercell.titan.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0795b implements GameApp.OnActivityResultListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ GameApp.ShowStorePageListener f5991a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ GameApp f5992b;

                public C0795b(GameApp gameApp, GameApp.ShowStorePageListener showStorePageListener) {
/* 4 */             this.f5992b = gameApp;
/* 6 */             this.f5991a = showStorePageListener;
                }

                @Override // com.supercell.titan.GameApp.OnActivityResultListener
                public final void onActivityResult(int i, int i2, Intent intent) {
/* 4 */             if (i == 990001) {
/* 6 */                 GameApp gameApp = this.f5992b;
/* 8 */                 gameApp.removeActivityResultListener(this);
/* 14 */                gameApp.f5785w0.set(false);
/* 20 */                this.f5991a.onCompletion(true);
                    }
                }
            }
