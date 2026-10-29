            package com.google.android.gms.internal.auth;

            import android.net.Uri;
            import okhttp3.HttpUrl;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public final class zzcz {
                final String zza;
                final Uri zzb;
                final String zzc;
                final String zzd;
                final boolean zze;
                final boolean zzf;
                final boolean zzg;
                final boolean zzh;
                final zzdg zzi;

                private zzcz(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, zzdg zzdgVar) {
/* 5 */             this.zza = null;
/* 7 */             this.zzb = uri;
/* 11 */            this.zzc = HttpUrl.FRAGMENT_ENCODE_SET;
/* 13 */            this.zzd = HttpUrl.FRAGMENT_ENCODE_SET;
/* 15 */            this.zze = z;
/* 18 */            this.zzf = false;
/* 20 */            this.zzg = z3;
/* 22 */            this.zzh = false;
/* 24 */            this.zzi = null;
                }

                public final zzcz zza() {
/* 16 */            return new zzcz(null, this.zzb, this.zzc, this.zzd, this.zze, false, true, false, null);
                }

                public final zzcz zzb() {
/* 7 */             if (this.zzc.isEmpty()) {
/* 24 */                return new zzcz(null, this.zzb, this.zzc, this.zzd, true, false, this.zzg, false, null);
                    }
/* 30 */            f42.m3656l("Cannot set GServices prefix and skip GServices");
/* 33 */            return null;
                }

                public final zzdc zzc(String str, double d) {
/* 10 */            return new zzcx(this, str, Double.valueOf(0.0d), true);
                }

                public final zzdc zzd(String str, long j) {
/* 8 */             return new zzcv(this, str, Long.valueOf(j), true);
                }

                public final zzdc zze(String str, boolean z) {
/* 8 */             return new zzcw(this, str, Boolean.valueOf(z), true);
                }

                public final zzdc zzf(String str, Object obj, zzhu zzhuVar) {
/* 10 */            return new zzcy(this, "getTokenRefactor__blocked_packages", obj, true, zzhuVar, null);
                }

/* 26 */        public zzcz(Uri uri) {
/* 27 */            this(null, uri, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, null);
                }
            }
