            package com.supercell.titan;

            import android.content.Intent;
            import p000.RunnableC2166s2;
            
            /* JADX INFO: renamed from: com.supercell.titan.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0803j implements GameApp.OnActivityResultListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ScExternalWebView f6009a;

                public C0803j(ScExternalWebView scExternalWebView) {
/* 4 */             this.f6009a = scExternalWebView;
                }

                @Override // com.supercell.titan.GameApp.OnActivityResultListener
                public final void onActivityResult(int i, int i2, Intent intent) {
/* 4 */             if (i == 41036) {
/* 6 */                 ScExternalWebView scExternalWebView = this.f6009a;
/* 8 */                 scExternalWebView.m2743a();
/* 12 */                scExternalWebView.f5892a = false;
/* 25 */                GameApp.getInstance().runOnView(new RunnableC2166s2(this, 29));
/* 32 */                GameApp.getInstance().removeActivityResultListener(this);
                    }
                }
            }
