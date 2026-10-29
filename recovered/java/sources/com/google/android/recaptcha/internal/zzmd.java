            package com.google.android.recaptcha.internal;

            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzmd {
                public static void zza(boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             f42.m3649e();
                }

                public static void zzb(boolean z, Object obj) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 6 */             C1951n4.m6859j((String) obj);
                }

                public static void zzc(boolean z, String str, char c) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 16 */            C1951n4.m6859j(zzmg.zza(str, Character.valueOf(c)));
                }

                public static void zzd(int i, int i2, int i3) {
                    String strZzf;
/* 1 */             if (i < 0 || i2 < i || i2 > i3) {
/* 11 */                if (i < 0 || i > i3) {
/* 48 */                    strZzf = zzf(i, i3, "start index");
                        } else {
/* 41 */                    strZzf = (i2 < 0 || i2 > i3) ? zzf(i2, i3, "end index") : zzmg.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                        }
/* 55 */                throw new IndexOutOfBoundsException(strZzf);
                    }
                }

                public static void zze(boolean z, Object obj) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 6 */             f42.m3656l((String) obj);
                }

                private static String zzf(int i, int i2, String str) {
                    return i < 0 ? zzmg.zza("%s (%s) must not be negative", str, Integer.valueOf(i)) : zzmg.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
                }
            }
