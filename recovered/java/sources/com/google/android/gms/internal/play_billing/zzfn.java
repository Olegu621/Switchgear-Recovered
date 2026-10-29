            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfn extends zzhk implements zzin {
                private static final zzfn zzb;
                private zzho zzd = zzhk.zzs();

                static {
/* 3 */             zzfn zzfnVar = new zzfn();
/* 6 */             zzb = zzfnVar;
/* 10 */            zzhk.zzx(zzfn.class, zzfnVar);
                }

                private zzfn() {
                }

                public static zzfm zza() {
/* 7 */             return (zzfm) zzb.zzm();
                }

                public static /* synthetic */ void zzc(zzfn zzfnVar, Iterable iterable) {
/* 1 */             zzho zzhoVar = zzfnVar.zzd;
/* 7 */             if (!zzhoVar.zzc()) {
/* 9 */                 int size = zzhoVar.size();
/* 18 */                zzfnVar.zzd = zzhoVar.zzd(size + size);
                    }
/* 22 */            zzfv.zzg(iterable, zzfnVar.zzd);
                }

                @Override // com.google.android.gms.internal.play_billing.zzhk
                public final Object zzd(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 52 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 46 */                return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfl.class});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzfn();
                    }
/* 12 */            zzfo zzfoVar = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzfm(zzfoVar);
                    }
/* 16 */            if (i2 != 5) {
/* 12 */                return null;
                    }
/* 19 */            return zzb;
                }
            }
