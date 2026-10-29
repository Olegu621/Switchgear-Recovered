            package com.google.android.gms.internal.auth;

            import com.google.android.gms.common.api.Status;
            import okhttp3.HttpUrl;
            import p000.kb1;
            import p000.p42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class zzbv implements p42 {
                private final Status zza;
                private final String zzb;

                public zzbv(Status status) {
/* 4 */             kb1.m6061n(status);
/* 7 */             this.zza = status;
/* 11 */            this.zzb = HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public final String getSpatulaHeader() {
/* 1 */             return this.zzb;
                }

                @Override // p000.p42
                public final Status getStatus() {
/* 1 */             return this.zza;
                }

/* 13 */        public zzbv(String str) {
                    kb1.m6061n(str);
                    this.zzb = str;
/* 15 */            this.zza = Status.f3440e;
                }
            }
