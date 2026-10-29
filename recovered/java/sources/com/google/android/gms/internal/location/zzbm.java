            package com.google.android.gms.internal.location;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import org.checkerframework.checker.nullness.compatqual.NullableDecl;
            import p000.ds0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbm {
                public static int zza(int i, int i2, @NullableDecl String str) {
                    String strZza;
/* 1 */             if (i >= 0 && i < i2) {
/* 6 */                 return i;
                    }
/* 11 */            if (i < 0) {
/* 53 */                strZza = zzbn.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
                    } else {
/* 13 */                if (i2 < 0) {
/* 19 */                    ds0.m3189f(26, "negative size: ", i2);
/* 22 */                    return 0;
                        }
/* 38 */                strZza = zzbn.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 60 */            throw new IndexOutOfBoundsException(strZza);
                }

                public static int zzb(int i, int i2, @NullableDecl String str) {
/* 1 */             if (i >= 0 && i <= i2) {
/* 5 */                 return i;
                    }
/* 12 */            s80.m8425f(zzd(i, i2, FirebaseAnalytics.Param.INDEX));
/* 15 */            return 0;
                }

                public static void zzc(int i, int i2, int i3) {
                    String strZzd;
/* 1 */             if (i < 0 || i2 < i || i2 > i3) {
/* 11 */                if (i < 0 || i > i3) {
/* 48 */                    strZzd = zzd(i, i3, "start index");
                        } else {
/* 41 */                    strZzd = (i2 < 0 || i2 > i3) ? zzd(i2, i3, "end index") : zzbn.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                        }
/* 55 */                throw new IndexOutOfBoundsException(strZzd);
                    }
                }

                private static String zzd(int i, int i2, @NullableDecl String str) {
/* 1 */             if (i < 0) {
/* 13 */                return zzbn.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
                    }
/* 18 */            if (i2 >= 0) {
/* 34 */                return zzbn.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 43 */            ds0.m3189f(26, "negative size: ", i2);
/* 46 */            return null;
                }
            }
