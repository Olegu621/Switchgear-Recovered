            package com.supercell.titan;

            import p000.AbstractC2353x2;
            import p000.dp0;
            import p000.v00;
            
            /* JADX INFO: renamed from: com.supercell.titan.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC0798e implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ LocationService f6002a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LocationService f6003b;

                public RunnableC0798e(LocationService locationService, LocationService locationService2) {
/* 4 */             this.f6003b = locationService;
/* 6 */             this.f6002a = locationService2;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             LocationService locationService = this.f6003b;
/* 3 */             GameApp gameApp = locationService.f5823c;
/* 11 */            if (v00.checkSelfPermission(gameApp, "android.permission.ACCESS_FINE_LOCATION") == 0) {
/* 37 */                GameApp.getInstance().runOnUiThread(new dp0(locationService, locationService, 17, false));
                    } else {
/* 15 */                gameApp.addActivityEventListener(this.f6002a);
/* 21 */                AbstractC2353x2.m9683a(gameApp, locationService.f5821a, 1);
                    }
                }
            }
