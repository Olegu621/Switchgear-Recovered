            package com.google.android.gms.internal.auth;

            import com.google.android.gms.auth.api.proxy.ProxyResponse;
            import com.google.android.gms.common.api.Status;
            import p000.p42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     final class zzbu implements p42 {
                private final Status zza;
                private ProxyResponse zzb;

                public zzbu(ProxyResponse proxyResponse) {
/* 4 */             this.zzb = proxyResponse;
/* 8 */             this.zza = Status.f3440e;
                }

                public final ProxyResponse getResponse() {
/* 1 */             return this.zzb;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.zza;
                }

/* 10 */        public zzbu(Status status) {
                    this.zza = status;
                }
            }
