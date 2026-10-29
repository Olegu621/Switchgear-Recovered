            package com.google.android.gms.internal.fido;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import p000.C1951n4;
            import p000.f42;
            import p000.fm0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzas {
                public static int zza(int i, int i2, String str) {
                    String strZza;
/* 1 */             if (i >= 0 && i < i2) {
/* 6 */                 return i;
                    }
/* 11 */            if (i < 0) {
/* 55 */                strZza = zzat.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
                    } else {
/* 13 */                if (i2 < 0) {
/* 21 */                    C1951n4.m6859j(fm0.m3781g(i2, "negative size: "));
/* 24 */                    return 0;
                        }
/* 40 */                strZza = zzat.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 62 */            throw new IndexOutOfBoundsException(strZza);
                }

                public static int zzb(int i, int i2, String str) {
/* 1 */             if (i >= 0 && i <= i2) {
/* 5 */                 return i;
                    }
/* 12 */            s80.m8425f(zzf(i, i2, FirebaseAnalytics.Param.INDEX));
/* 15 */            return 0;
                }

                public static void zzc(boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             f42.m3649e();
                }

                public static void zzd(boolean z, String str, char c) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 16 */            C1951n4.m6859j(zzat.zza(str, Character.valueOf(c)));
                }

                public static void zze(int i, int i2, int i3) {
                    String strZzf;
/* 1 */             if (i < 0 || i2 < i || i2 > i3) {
/* 11 */                if (i < 0 || i > i3) {
/* 48 */                    strZzf = zzf(i, i3, "start index");
                        } else {
/* 41 */                    strZzf = (i2 < 0 || i2 > i3) ? zzf(i2, i3, "end index") : zzat.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                        }
/* 55 */                throw new IndexOutOfBoundsException(strZzf);
                    }
                }

                private static String zzf(int i, int i2, String str) {
/* 1 */             if (i < 0) {
/* 13 */                return zzat.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
                    }
/* 18 */            if (i2 >= 0) {
/* 34 */                return zzat.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 45 */            C1951n4.m6859j(fm0.m3781g(i2, "negative size: "));
/* 48 */            return null;
                }
            }
