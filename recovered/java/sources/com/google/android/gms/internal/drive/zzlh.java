            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzlh implements zzlp {
                private zzlp[] zztt;

                public zzlh(zzlp... zzlpVarArr) {
/* 4 */             this.zztt = zzlpVarArr;
                }

                @Override // com.google.android.gms.internal.drive.zzlp
                public final boolean zzb(Class<?> cls) {
/* 6 */             for (zzlp zzlpVar : this.zztt) {
/* 14 */                if (zzlpVar.zzb(cls)) {
/* 16 */                    return true;
                        }
                    }
/* 4 */             return false;
                }

                @Override // com.google.android.gms.internal.drive.zzlp
                public final zzlo zzc(Class<?> cls) {
/* 5 */             for (zzlp zzlpVar : this.zztt) {
/* 13 */                if (zzlpVar.zzb(cls)) {
/* 15 */                    return zzlpVar.zzc(cls);
                        }
                    }
/* 25 */            String name = cls.getName();
/* 50 */            throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
                }
            }
