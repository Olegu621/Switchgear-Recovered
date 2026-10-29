            package com.google.android.recaptcha.internal;

            import java.lang.reflect.Method;
            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.Locale;
            import okhttp3.internal.http2.Http2Connection;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzvl {
                public static final /* synthetic */ int zza = 0;
                private static final ThreadLocal zzb;

                static {
/* 1 */             zzur zzurVarZzi = zzut.zzi();
/* 10 */            zzurVarZzi.zzf(-62135596800L);
/* 14 */            zzurVarZzi.zze(0);
/* 23 */            zzur zzurVarZzi2 = zzut.zzi();
/* 32 */            zzurVarZzi2.zzf(253402300799L);
/* 38 */            zzurVarZzi2.zze(999999999);
/* 47 */            zzur zzurVarZzi3 = zzut.zzi();
/* 53 */            zzurVarZzi3.zzf(0L);
/* 56 */            zzurVarZzi3.zze(0);
/* 70 */            zzb = new zzvk();
/* 74 */            zzd("now");
/* 79 */            zzd("getEpochSecond");
/* 84 */            zzd("getNano");
                }

                public static zzut zza(zzut zzutVar) {
/* 1 */             long jZzg = zzutVar.zzg();
/* 5 */             boolean zZze = zze(jZzg);
/* 9 */             int iZzf = zzutVar.zzf();
/* 13 */            if (zZze && iZzf >= 0 && iZzf < 1000000000) {
/* 22 */                return zzutVar;
                    }
/* 41 */            C1951n4.m6859j(zzmg.zza("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(jZzg), Integer.valueOf(iZzf)));
/* 44 */            return null;
                }

                public static zzut zzb(long j) {
/* 3 */             long jZza = j / 1000;
/* 9 */             if (!zze(jZza)) {
/* 78 */                C1951n4.m6859j(zzmg.zza("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(jZza)));
/* 81 */                return null;
                    }
/* 16 */            int i = (int) ((j % 1000) * 1000000);
/* 23 */            if (i <= -1000000000 || i >= 1000000000) {
/* 30 */                jZza = zzps.zza(jZza, i / Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
/* 34 */                i %= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                    }
/* 35 */            if (i < 0) {
/* 37 */                i += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
/* 40 */                jZza = zzps.zzb(jZza, 1L);
                    }
/* 44 */            zzur zzurVarZzi = zzut.zzi();
/* 48 */            zzurVarZzi.zzf(jZza);
/* 51 */            zzurVarZzi.zze(i);
/* 58 */            zzut zzutVar = (zzut) zzurVarZzi.zzk();
/* 60 */            zza(zzutVar);
/* 63 */            return zzutVar;
                }

                public static String zzc(zzut zzutVar) {
                    String str;
/* 1 */             zza(zzutVar);
/* 4 */             long jZzg = zzutVar.zzg();
/* 8 */             int iZzf = zzutVar.zzf();
/* 14 */            StringBuilder sb = new StringBuilder();
/* 37 */            sb.append(((SimpleDateFormat) zzb.get()).format(new Date(jZzg * 1000)));
/* 40 */            if (iZzf != 0) {
/* 44 */                sb.append(".");
/* 52 */                if (iZzf % 1000000 == 0) {
/* 67 */                    str = String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iZzf / 1000000));
                        } else {
/* 107 */                   str = iZzf % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iZzf / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iZzf));
                        }
/* 111 */               sb.append(str);
                    }
/* 116 */           sb.append("Z");
/* 119 */           return sb.toString();
                }

                private static Method zzd(String str) {
                    try {
/* 8 */                 return Class.forName("java.time.Instant").getMethod(str, null);
                    } catch (Exception unused) {
/* 1 */                 return null;
                    }
                }

                private static boolean zze(long j) {
                    return j >= -62135596800L && j <= 253402300799L;
                }
            }
