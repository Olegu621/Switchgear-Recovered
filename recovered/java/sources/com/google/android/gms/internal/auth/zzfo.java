            package com.google.android.gms.internal.auth;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfo implements zzgi {
                private static final zzfu zza = new zzfm();
                private final zzfu zzb;

                public zzfo() {
                    zzfu zzfuVar;
/* 3 */             zzer zzerVarZza = zzer.zza();
                    try {
/* 24 */                zzfuVar = (zzfu) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                    } catch (Exception unused) {
/* 27 */                zzfuVar = zza;
                    }
/* 38 */            zzfn zzfnVar = new zzfn(zzerVarZza, zzfuVar);
/* 46 */            zzez.zzf(zzfnVar, "messageInfoFactory");
/* 49 */            this.zzb = zzfnVar;
                }

                private static boolean zzb(zzft zzftVar) {
                    return zzftVar.zzc() == 1;
                }

                @Override // com.google.android.gms.internal.auth.zzgi
                public final zzgh zza(Class cls) {
/* 1 */             zzgj.zzg(cls);
/* 6 */             zzft zzftVarZzb = this.zzb.zzb(cls);
/* 16 */            if (zzftVarZzb.zzb()) {
                        return zzeu.class.isAssignableFrom(cls) ? zzga.zzb(zzgj.zzc(), zzen.zzb(), zzftVarZzb.zza()) : zzga.zzb(zzgj.zza(), zzen.zza(), zzftVarZzb.zza());
                    }
/* 62 */            if (zzeu.class.isAssignableFrom(cls)) {
                        return zzb(zzftVarZzb) ? zzfz.zzj(cls, zzftVarZzb, zzgc.zzb(), zzfk.zzd(), zzgj.zzc(), zzen.zzb(), zzfs.zzb()) : zzfz.zzj(cls, zzftVarZzb, zzgc.zzb(), zzfk.zzd(), zzgj.zzc(), null, zzfs.zzb());
                    }
                    return zzb(zzftVarZzb) ? zzfz.zzj(cls, zzftVarZzb, zzgc.zza(), zzfk.zzc(), zzgj.zza(), zzen.zza(), zzfs.zza()) : zzfz.zzj(cls, zzftVarZzb, zzgc.zza(), zzfk.zzc(), zzgj.zzb(), null, zzfs.zza());
                }
            }
