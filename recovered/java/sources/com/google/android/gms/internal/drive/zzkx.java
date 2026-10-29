            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzkx {
                private static final zzjx zzng = zzjx.zzci();
                private zzjc zzth;
                private volatile zzlq zzti;
                private volatile zzjc zztj;

                private final zzlq zzh(zzlq zzlqVar) {
/* 3 */             if (this.zzti == null) {
                        synchronized (this) {
/* 8 */                     if (this.zzti == null) {
                                try {
/* 14 */                            this.zzti = zzlqVar;
/* 18 */                            this.zztj = zzjc.zznq;
                                } catch (zzkq unused) {
/* 21 */                            this.zzti = zzlqVar;
/* 25 */                            this.zztj = zzjc.zznq;
                                }
                            }
                        }
                    }
/* 31 */            return this.zzti;
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzkx)) {
/* 9 */                 return false;
                    }
/* 11 */            zzkx zzkxVar = (zzkx) obj;
/* 13 */            zzlq zzlqVar = this.zzti;
/* 15 */            zzlq zzlqVar2 = zzkxVar.zzti;
/* 17 */            if (zzlqVar == null && zzlqVar2 == null) {
/* 29 */                return zzbl().equals(zzkxVar.zzbl());
                    }
/* 34 */            if (zzlqVar == null || zzlqVar2 == null) {
                        return zzlqVar != null ? zzlqVar.equals(zzkxVar.zzh(zzlqVar.zzda())) : zzh(zzlqVar2.zzda()).equals(zzlqVar2);
                    }
/* 38 */            return zzlqVar.equals(zzlqVar2);
                }

                public int hashCode() {
/* 1 */             return 1;
                }

                public final zzjc zzbl() {
/* 3 */             if (this.zztj != null) {
/* 5 */                 return this.zztj;
                    }
                    synchronized (this) {
                        try {
/* 11 */                    if (this.zztj != null) {
/* 13 */                        return this.zztj;
                            }
/* 21 */                    if (this.zzti == null) {
/* 25 */                        this.zztj = zzjc.zznq;
                            } else {
/* 34 */                        this.zztj = this.zzti.zzbl();
                            }
/* 36 */                    return this.zztj;
                        } catch (Throwable th) {
/* 41 */                    throw th;
                        }
                    }
                }

                public final int zzcx() {
/* 3 */             if (this.zztj != null) {
/* 7 */                 return this.zztj.size();
                    }
/* 14 */            if (this.zzti != null) {
/* 18 */                return this.zzti.zzcx();
                    }
/* 23 */            return 0;
                }

                public final zzlq zzi(zzlq zzlqVar) {
/* 1 */             zzlq zzlqVar2 = this.zzti;
/* 4 */             this.zzth = null;
/* 6 */             this.zztj = null;
/* 8 */             this.zzti = zzlqVar;
/* 10 */            return zzlqVar2;
                }
            }
