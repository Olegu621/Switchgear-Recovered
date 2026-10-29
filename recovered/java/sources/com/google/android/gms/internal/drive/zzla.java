            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzla {
                private static final zzla zztm;
                private static final zzla zztn;

                static {
/* 3 */             zzlb zzlbVar = null;
/* 7 */             zztm = new zzlc();
/* 14 */            zztn = new zzld();
                }

                private zzla() {
                }

                public static zzla zzdt() {
/* 1 */             return zztm;
                }

                public static zzla zzdu() {
/* 1 */             return zztn;
                }

                public abstract void zza(Object obj, long j);

                public abstract <L> void zza(Object obj, Object obj2, long j);
            }
