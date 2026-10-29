            package com.google.android.recaptcha.internal;

            import java.util.UUID;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhh {
                private final String zza;
                private final String zzb = UUID.randomUUID().toString();
                private final int zzc;

                public zzhh(String str, int i) {
/* 4 */             this.zza = str;
/* 6 */             this.zzc = i;
                }

                public final String zza() {
/* 1 */             return this.zzb;
                }

                public final String zzb() {
/* 1 */             return this.zza;
                }

                public final int zzc() {
/* 1 */             return this.zzc;
                }
            }
