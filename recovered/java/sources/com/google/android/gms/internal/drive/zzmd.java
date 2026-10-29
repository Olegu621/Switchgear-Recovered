            package com.google.android.gms.internal.drive;

            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentMap;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzmd {
                private static final zzmd zzuw = new zzmd();
                private final ConcurrentMap<Class<?>, zzmf<?>> zzuy = new ConcurrentHashMap();
                private final zzmg zzux = new zzlf();

                private zzmd() {
                }

                public static zzmd zzej() {
/* 1 */             return zzuw;
                }

                public final <T> zzmf<T> zzf(Class<T> cls) {
/* 3 */             zzkm.zza(cls, "messageType");
/* 12 */            zzmf<T> zzmfVarZze = (zzmf) this.zzuy.get(cls);
/* 14 */            if (zzmfVarZze == null) {
/* 18 */                zzmfVarZze = this.zzux.zze(cls);
/* 22 */                zzkm.zza(cls, "messageType");
/* 27 */                zzkm.zza(zzmfVarZze, "schema");
/* 36 */                zzmf<T> zzmfVar = (zzmf) this.zzuy.putIfAbsent(cls, zzmfVarZze);
/* 38 */                if (zzmfVar != null) {
/* 40 */                    return zzmfVar;
                        }
                    }
/* 41 */            return zzmfVarZze;
                }

                public final <T> zzmf<T> zzq(T t) {
/* 5 */             return zzf(t.getClass());
                }
            }
