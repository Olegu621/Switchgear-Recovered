            package com.google.android.gms.internal.drive;

            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import okhttp3.internal.http2.Settings;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public class zzjx {
                private static volatile boolean zzol;
                private static volatile zzjx zzon;
                private final Map<zza, zzkk.zzd<?, ?>> zzop;
                private static final Class<?> zzom = zzch();
                static final zzjx zzoo = new zzjx(true);

                public static final class zza {
                    private final int number;
                    private final Object object;

                    public zza(Object obj, int i) {
/* 4 */                 this.object = obj;
/* 6 */                 this.number = i;
                    }

                    public final boolean equals(Object obj) {
/* 4 */                 if (!(obj instanceof zza)) {
/* 3 */                     return false;
                        }
/* 7 */                 zza zzaVar = (zza) obj;
                        return this.object == zzaVar.object && this.number == zzaVar.number;
                    }

                    public final int hashCode() {
/* 13 */                return (System.identityHashCode(this.object) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.number;
                    }
                }

                public zzjx() {
/* 9 */             this.zzop = new HashMap();
                }

                public static zzjx zzcg() {
/* 3 */             return zzki.zza(zzjx.class);
                }

                private static Class<?> zzch() {
                    try {
/* 3 */                 return Class.forName("com.google.protobuf.Extension");
                    } catch (ClassNotFoundException unused) {
/* 8 */                 return null;
                    }
                }

                public static zzjx zzci() {
/* 1 */             return zzjw.zzcf();
                }

                public static zzjx zzcj() {
                    zzjx zzjxVarZzcg;
/* 1 */             zzjx zzjxVar = zzon;
/* 3 */             if (zzjxVar != null) {
/* 25 */                return zzjxVar;
                    }
                    synchronized (zzjx.class) {
                        try {
/* 8 */                     zzjxVarZzcg = zzon;
/* 10 */                    if (zzjxVarZzcg == null) {
/* 12 */                        zzjxVarZzcg = zzjw.zzcg();
/* 16 */                        zzon = zzjxVarZzcg;
                            }
                        } catch (Throwable th) {
/* 24 */                    throw th;
                        }
                    }
/* 22 */            return zzjxVarZzcg;
                }

                public final <ContainingType extends zzlq> zzkk.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
/* 12 */            return (zzkk.zzd) this.zzop.get(new zza(containingtype, i));
                }

/* 11 */        private zzjx(boolean z) {
/* 13 */            this.zzop = Collections.EMPTY_MAP;
                }
            }
