            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.TimeUnit;
            import kotlin.Unit;
            import p000.C1951n4;
            import p000.c10;
            import p000.i13;
            import p000.k50;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzip implements zzik {
                private final y10 zza;
                private final zzjb zzb;
                private final zzkt zzc;
                private final Map zzd;

                public zzip(y10 y10Var, zzjb zzjbVar, zzkt zzktVar, Map map) {
/* 4 */             this.zza = y10Var;
/* 6 */             this.zzb = zzjbVar;
/* 8 */             this.zzc = zzktVar;
/* 10 */            this.zzd = map;
                }

                public static final /* synthetic */ void zzf(zzip zzipVar, zzzu zzzuVar, zziz zzizVar) throws zzdm {
/* 1 */             zzmf zzmfVarZzb = zzmf.zzb();
/* 5 */             int iZza = zzizVar.zza();
/* 23 */            zzjt zzjtVar = (zzjt) zzipVar.zzd.get(Integer.valueOf(zzzuVar.zzf()));
/* 25 */            if (zzjtVar == null) {
/* 101 */               C1697u2.m5433i(5, 2, null);
/* 104 */               return;
                    }
/* 27 */            int iZzg = zzzuVar.zzg();
/* 42 */            zzzt[] zzztVarArr = (zzzt[]) zzzuVar.zzj().toArray(new zzzt[0]);
/* 51 */            zzjtVar.zza(iZzg, zzizVar, (zzzt[]) Arrays.copyOf(zzztVarArr, zzztVarArr.length));
/* 59 */            if (iZza == zzizVar.zza()) {
/* 66 */                zzizVar.zzg(zzizVar.zza() + 1);
                    }
/* 69 */            zzmfVarZzb.zzf();
/* 74 */            long jZza = zzmfVarZzb.zza(TimeUnit.MICROSECONDS);
/* 78 */            int i = zzco.zza;
/* 80 */            int iZzk = zzzuVar.zzk();
/* 84 */            if (iZzk != 1) {
/* 88 */                zzco.zza(iZzk - 2, jZza);
                    } else {
/* 94 */                C1951n4.m6859j("Can't get the number of an unknown enum value.");
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final Object zzg(List list, zziz zzizVar, c10 c10Var) throws Throwable {
/* 7 */             Object objM5966c = k50.m5966c(new zzim(zzizVar, list, this, null), c10Var);
                    return objM5966c == z10.f19902a ? objM5966c : Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final Object zzh(Exception exc, zziz zzizVar, c10 c10Var) throws Throwable {
/* 7 */             Object objM5966c = k50.m5966c(new zzin(exc, zzizVar, this, null), c10Var);
                    return objM5966c == z10.f19902a ? objM5966c : Unit.f12910a;
                }

                @Override // com.google.android.recaptcha.internal.zzik
                public final void zza(String str) {
/* 17 */            i13.m4443w(this.zza, null, new zzio(new zziz(this.zzb), this, str, null), 3);
                }
            }
