            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.common.internal.ICancelToken;
            import p000.t81;
            import p000.w81;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzg implements w81 {
                private final t81 zzcy;
                private ICancelToken zzcz = null;

                public zzg(t81 t81Var) {
/* 7 */             this.zzcy = t81Var;
                }

                public final boolean cancel() {
/* 1 */             ICancelToken iCancelToken = this.zzcz;
/* 3 */             if (iCancelToken == null) {
/* 10 */                return false;
                    }
                    try {
/* 5 */                 iCancelToken.cancel();
/* 8 */                 return true;
                    } catch (RemoteException unused) {
/* 10 */                return false;
                    }
                }

                public final void setCancelToken(ICancelToken iCancelToken) {
/* 1 */             this.zzcz = iCancelToken;
                }

                public final t81 zzad() {
/* 1 */             return this.zzcy;
                }
            }
