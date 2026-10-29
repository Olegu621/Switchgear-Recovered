            package com.google.android.gms.internal.drive;

            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 42 */    final class zzlm implements zzll {
                @Override // com.google.android.gms.internal.drive.zzll
                public final int zzb(int i, Object obj, Object obj2) {
/* 1 */             zzlk zzlkVar = (zzlk) obj;
/* 8 */             if (zzlkVar.isEmpty()) {
/* 7 */                 return 0;
                    }
/* 15 */            Iterator it = zzlkVar.entrySet().iterator();
/* 23 */            if (!it.hasNext()) {
/* 7 */                 return 0;
                    }
/* 30 */            Map.Entry entry = (Map.Entry) it.next();
/* 32 */            entry.getKey();
/* 35 */            entry.getValue();
/* 43 */            throw new NoSuchMethodError();
                }

                @Override // com.google.android.gms.internal.drive.zzll
                public final Map<?, ?> zzh(Object obj) {
/* 1 */             return (zzlk) obj;
                }

                @Override // com.google.android.gms.internal.drive.zzll
                public final Map<?, ?> zzi(Object obj) {
/* 1 */             return (zzlk) obj;
                }

                @Override // com.google.android.gms.internal.drive.zzll
                public final boolean zzj(Object obj) {
                    return !((zzlk) obj).isMutable();
                }

                @Override // com.google.android.gms.internal.drive.zzll
                public final Object zzk(Object obj) {
/* 4 */             ((zzlk) obj).zzbp();
/* 7 */             return obj;
                }

                @Override // com.google.android.gms.internal.drive.zzll
                public final Object zzl(Object obj) {
/* 5 */             return zzlk.zzdw().zzdx();
                }

                @Override // com.google.android.gms.internal.drive.zzll
                public final zzlj<?, ?> zzm(Object obj) {
/* 6 */             throw new NoSuchMethodError();
                }

                @Override // com.google.android.gms.internal.drive.zzll
/* 43 */        public final Object zzb(Object obj, Object obj2) {
/* 44 */            zzlk zzlkVarZzdx = (zzlk) obj;
/* 45 */            zzlk zzlkVar = (zzlk) obj2;
/* 46 */            if (!zzlkVar.isEmpty()) {
/* 47 */                if (!zzlkVarZzdx.isMutable()) {
/* 48 */                    zzlkVarZzdx = zzlkVarZzdx.zzdx();
                        }
/* 49 */                zzlkVarZzdx.zza(zzlkVar);
                    }
                    return zzlkVarZzdx;
                }
            }
