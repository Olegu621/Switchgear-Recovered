            package com.google.android.recaptcha.internal;

            import okhttp3.internal.http2.Http2Connection;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzvj {
                static {
/* 1 */             zzrt zzrtVarZzi = zzrv.zzi();
/* 10 */            zzrtVarZzi.zzf(-315576000000L);
/* 16 */            zzrtVarZzi.zze(-999999999);
/* 25 */            zzrt zzrtVarZzi2 = zzrv.zzi();
/* 34 */            zzrtVarZzi2.zzf(315576000000L);
/* 40 */            zzrtVarZzi2.zze(999999999);
/* 49 */            zzrt zzrtVarZzi3 = zzrv.zzi();
/* 55 */            zzrtVarZzi3.zzf(0L);
/* 59 */            zzrtVarZzi3.zze(0);
                }

                public static zzrv zza(long j) {
/* 6 */             int i = (int) (j % 1000000000);
/* 7 */             long jZza = j / 1000000000;
/* 14 */            if (i <= -1000000000 || i >= 1000000000) {
/* 21 */                jZza = zzps.zza(jZza, i / Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
/* 25 */                i %= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                    }
/* 30 */            if (jZza > 0 && i < 0) {
/* 34 */                i += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
/* 37 */                jZza--;
                    }
/* 40 */            if (jZza < 0 && i > 0) {
/* 44 */                i -= 1000000000;
/* 47 */                jZza++;
                    }
/* 48 */            zzrt zzrtVarZzi = zzrv.zzi();
/* 52 */            zzrtVarZzi.zzf(jZza);
/* 55 */            zzrtVarZzi.zze(i);
/* 62 */            zzrv zzrvVar = (zzrv) zzrtVarZzi.zzk();
/* 64 */            long jZzg = zzrvVar.zzg();
/* 68 */            int iZzf = zzrvVar.zzf();
/* 79 */            if (jZzg >= -315576000000L && jZzg <= 315576000000L && iZzf >= -999999999 && iZzf < 1000000000 && ((jZzg >= 0 && iZzf >= 0) || (jZzg <= 0 && iZzf <= 0))) {
/* 110 */               return zzrvVar;
                    }
/* 129 */           C1951n4.m6859j(zzmg.zza("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(jZzg), Integer.valueOf(iZzf)));
/* 132 */           return null;
                }
            }
