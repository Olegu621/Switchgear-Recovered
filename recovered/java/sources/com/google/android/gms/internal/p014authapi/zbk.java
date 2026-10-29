            package com.google.android.gms.internal.p014authapi;

            import com.google.android.gms.common.api.Status;
            import p000.InterfaceC0992hi;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zbk extends zbd {
                private final InterfaceC0992hi zba;

                public zbk(InterfaceC0992hi interfaceC0992hi) {
/* 4 */             this.zba = interfaceC0992hi;
                }

                @Override // com.google.android.gms.internal.p014authapi.zbd, com.google.android.gms.internal.p014authapi.zbs
                public final void zbc(Status status) {
/* 3 */             this.zba.setResult(status);
                }
            }
