            package com.google.android.gms.internal.measurement;

            import android.net.Uri;
            import okhttp3.HttpUrl;
            import p000.f42;
            import p000.ho0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class zzkf {
                final Uri zza;
                final String zzb;
                final String zzc;
                final boolean zzd;
                final boolean zze;

                private zzkf(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, ho0 ho0Var) {
/* 4 */             this.zza = uri;
/* 8 */             this.zzb = HttpUrl.FRAGMENT_ENCODE_SET;
/* 10 */            this.zzc = HttpUrl.FRAGMENT_ENCODE_SET;
/* 12 */            this.zzd = z;
/* 14 */            this.zze = z3;
                }

                public final zzkf zza() {
/* 1 */             String str = this.zzb;
/* 7 */             if (str.isEmpty()) {
/* 22 */                return new zzkf(null, this.zza, str, this.zzc, true, false, this.zze, false, null);
                    }
/* 28 */            f42.m3656l("Cannot set GServices prefix and skip GServices");
/* 31 */            return null;
                }

                public final zzkf zzb() {
/* 16 */            return new zzkf(null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, null);
                }

                public final zzkl zzc(String str, long j) {
/* 1 */             Long lValueOf = Long.valueOf(j);
/* 5 */             int i = zzkl.zzc;
/* 10 */            return new zzkb(this, str, lValueOf, true);
                }

                public final zzkl zzd(String str, boolean z) {
/* 1 */             Boolean boolValueOf = Boolean.valueOf(z);
/* 5 */             int i = zzkl.zzc;
/* 10 */            return new zzkc(this, str, boolValueOf, true);
                }

                public final zzkl zze(String str, double d) {
/* 3 */             Double dValueOf = Double.valueOf(-3.0d);
/* 7 */             int i = zzkl.zzc;
/* 14 */            return new zzkd(this, "measurement.test.double_flag", dValueOf, true);
                }

                public final zzkl zzf(String str, String str2) {
/* 1 */             int i = zzkl.zzc;
/* 6 */             return new zzke(this, str, str2, true);
                }

/* 16 */        public zzkf(Uri uri) {
/* 17 */            this(null, uri, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, null);
                }
            }
