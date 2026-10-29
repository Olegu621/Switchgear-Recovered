            package com.google.android.gms.internal.measurement;

            import java.io.IOException;
            import okhttp3.HttpUrl;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzne {
                private final zznd zza;

                private zzne(zzos zzosVar, Object obj, zzos zzosVar2, Object obj2) {
/* 11 */            this.zza = new zznd(zzosVar, HttpUrl.FRAGMENT_ENCODE_SET, zzosVar2, HttpUrl.FRAGMENT_ENCODE_SET);
                }

                public static zzne zza(zzos zzosVar, Object obj, zzos zzosVar2, Object obj2) {
/* 5 */             return new zzne(zzosVar, HttpUrl.FRAGMENT_ENCODE_SET, zzosVar2, HttpUrl.FRAGMENT_ENCODE_SET);
                }

                public static void zzb(zzll zzllVar, zznd zzndVar, Object obj, Object obj2) throws IOException {
/* 4 */             zzlv.zzf(zzllVar, zzndVar.zza, 1, obj);
/* 10 */            zzlv.zzf(zzllVar, zzndVar.zzc, 2, obj2);
                }

                public static int zzc(zznd zzndVar, Object obj, Object obj2) {
/* 15 */            return zzlv.zzh(zzndVar.zza, 1, obj) + zzlv.zzh(zzndVar.zzc, 2, obj2);
                }

                public final int zzd(int i, Object obj, Object obj2) {
/* 1 */             zznd zzndVar = this.zza;
/* 5 */             int iZzz = zzll.zzz(i << 3);
/* 9 */             int iZzc = zzc(zzndVar, obj, obj2);
/* 13 */            return pm2.m7493p(iZzc, iZzc, iZzz);
                }

                public final zznd zze() {
/* 1 */             return this.zza;
                }
            }
