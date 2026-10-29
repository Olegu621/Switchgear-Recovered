            package com.google.android.play.core.integrity;

            import android.os.Bundle;
            import p000.C1020i9;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0443i implements InterfaceC0445k {
                @Override // com.google.android.play.core.integrity.InterfaceC0445k
                /* JADX INFO: renamed from: a */
                public final C1020i9 mo2494a(Bundle bundle) {
/* 3 */             int i = bundle.getInt("error");
/* 8 */             if (i == 0) {
/* 7 */                 return null;
                    }
/* 13 */            return new IntegrityServiceException(i, null);
                }
            }
