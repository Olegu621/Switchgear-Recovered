            package com.supercell.titan;
            
            /* JADX INFO: renamed from: com.supercell.titan.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0802i implements GameApp.ActivityEventListener {

                /* JADX INFO: renamed from: a */
                public final RequestPermissionListener f6008a;

                public C0802i(RequestPermissionListener requestPermissionListener) {
/* 4 */             this.f6008a = requestPermissionListener;
                }

                @Override // com.supercell.titan.GameApp.ActivityEventListener
                public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
/* 4 */             if (i == 980002) {
/* 6 */                 GameApp gameApp = GameApp.getInstance();
/* 11 */                boolean z = false;
/* 12 */                if (iArr.length > 0 && iArr[0] == 0) {
/* 18 */                    z = true;
                        }
/* 21 */                this.f6008a.onPermissionResult(z);
/* 24 */                gameApp.removeActivityEventListener(this);
                    }
                }
            }
