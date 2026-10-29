            package com.supercell.titan;

            import android.content.Context;
            
            /* JADX INFO: renamed from: com.supercell.titan.m */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0806m implements BackgroundObserver.Listener {
                @Override // com.supercell.titan.BackgroundObserver.Listener
                public final void onBackground(Context context) {
/* 2 */             TitanApplication.f5938c = false;
/* 6 */             if (TitanApplication.nativeLibrariesLoaded) {
/* 8 */                 GameApp.nOnAppStop();
                    }
                }

                @Override // com.supercell.titan.BackgroundObserver.Listener
                public final void onForeground(Context context) {
/* 2 */             TitanApplication.f5938c = true;
/* 6 */             if (TitanApplication.nativeLibrariesLoaded) {
/* 8 */                 GameApp.nOnAppStart();
                    }
                }
            }
