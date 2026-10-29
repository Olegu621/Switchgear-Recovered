            package com.google.android.gms.internal.common;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import p000.C1951n4;
            import p000.f42;
            import p000.fm0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzr {
                public static void zza(boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             f42.m3664t();
                }

                public static int zzb(int i, int i2, String str) {
                    String strZza;
/* 1 */             if (i >= 0 && i < i2) {
/* 6 */                 return i;
                    }
/* 11 */            if (i < 0) {
/* 70 */                strZza = zzx.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
                    } else {
/* 13 */                if (i2 < 0) {
/* 36 */                    C1951n4.m6859j(fm0.m3788n(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
/* 39 */                    return 0;
                        }
/* 55 */                strZza = zzx.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 77 */            throw new IndexOutOfBoundsException(strZza);
                }

                public static int zzc(int i, int i2, String str) {
/* 1 */             if (i >= 0 && i <= i2) {
/* 5 */                 return i;
                    }
/* 12 */            s80.m8425f(zze(i, i2, FirebaseAnalytics.Param.INDEX));
/* 15 */            return 0;
                }

                public static void zzd(int i, int i2, int i3) {
                    String strZze;
/* 1 */             if (i < 0 || i2 < i || i2 > i3) {
/* 11 */                if (i < 0 || i > i3) {
/* 48 */                    strZze = zze(i, i3, "start index");
                        } else {
/* 41 */                    strZze = (i2 < 0 || i2 > i3) ? zze(i2, i3, "end index") : zzx.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                        }
/* 55 */                throw new IndexOutOfBoundsException(strZze);
                    }
                }

                private static String zze(int i, int i2, String str) {
/* 1 */             if (i < 0) {
/* 13 */                return zzx.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
                    }
/* 18 */            if (i2 >= 0) {
/* 34 */                return zzx.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 60 */            C1951n4.m6859j(fm0.m3788n(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
/* 63 */            return null;
                }
            }
