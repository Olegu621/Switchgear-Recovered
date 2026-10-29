            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    final class zzlf implements zzmg {
                private static final zzlp zzts = new zzlg();
                private final zzlp zztr;

                public zzlf() {
/* 23 */            this(new zzlh(zzkj.zzcv(), zzdv()));
                }

                private static boolean zza(zzlo zzloVar) {
                    return zzloVar.zzec() == zzkk.zze.zzsf;
                }

                private static zzlp zzdv() {
                    try {
/* 18 */                return (zzlp) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                    } catch (Exception unused) {
/* 21 */                return zzts;
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzmg
                public final <T> zzmf<T> zze(Class<T> cls) {
/* 1 */             zzmh.zzg((Class<?>) cls);
/* 6 */             zzlo zzloVarZzc = this.zztr.zzc(cls);
/* 16 */            if (zzloVarZzc.zzed()) {
                        return zzkk.class.isAssignableFrom(cls) ? zzlw.zza(zzmh.zzeo(), zzka.zzcl(), zzloVarZzc.zzee()) : zzlw.zza(zzmh.zzem(), zzka.zzcm(), zzloVarZzc.zzee());
                    }
/* 62 */            if (zzkk.class.isAssignableFrom(cls)) {
                        return zza(zzloVarZzc) ? zzlu.zza(cls, zzloVarZzc, zzma.zzeh(), zzla.zzdu(), zzmh.zzeo(), zzka.zzcl(), zzln.zzea()) : zzlu.zza(cls, zzloVarZzc, zzma.zzeh(), zzla.zzdu(), zzmh.zzeo(), (zzjy<?>) null, zzln.zzea());
                    }
                    return zza(zzloVarZzc) ? zzlu.zza(cls, zzloVarZzc, zzma.zzeg(), zzla.zzdt(), zzmh.zzem(), zzka.zzcm(), zzln.zzdz()) : zzlu.zza(cls, zzloVarZzc, zzma.zzeg(), zzla.zzdt(), zzmh.zzen(), (zzjy<?>) null, zzln.zzdz());
                }

/* 26 */        private zzlf(zzlp zzlpVar) {
/* 28 */            this.zztr = (zzlp) zzkm.zza(zzlpVar, "messageInfoFactory");
                }
            }
