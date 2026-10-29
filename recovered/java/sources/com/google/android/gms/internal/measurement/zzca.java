            package com.google.android.gms.internal.measurement;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzca {
                static final zzca zza;
                public static final /* synthetic */ int zzb = 0;

                static {
/* 3 */             zzbt zzbtVar = new zzbt();
/* 8 */             zzbtVar.zza(HttpUrl.FRAGMENT_ENCODE_SET);
/* 12 */            zzbtVar.zzb(false);
/* 16 */            zzbtVar.zzd(1);
/* 19 */            zzbtVar.zze(1);
/* 22 */            zzbtVar.zzc();
/* 27 */            zzbt zzbtVar2 = new zzbt();
/* 30 */            zzbtVar2.zza(HttpUrl.FRAGMENT_ENCODE_SET);
/* 33 */            zzbtVar2.zzb(false);
/* 37 */            zzbtVar2.zzd(4);
/* 40 */            zzbtVar2.zze(1);
/* 47 */            zza = zzbtVar2.zzc();
/* 51 */            zzbt zzbtVar3 = new zzbt();
/* 54 */            zzbtVar3.zza(HttpUrl.FRAGMENT_ENCODE_SET);
/* 57 */            zzbtVar3.zzb(false);
/* 61 */            zzbtVar3.zzd(2);
/* 64 */            zzbtVar3.zze(1);
/* 67 */            zzbtVar3.zzc();
                }

                public abstract String zza();

                public abstract boolean zzb();

                public abstract zzbr zzc();

                public abstract zzbs zzd();

                public abstract int zze();

                public abstract int zzf();
            }
