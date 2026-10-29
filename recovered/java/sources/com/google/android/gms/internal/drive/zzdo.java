            package com.google.android.gms.internal.drive;

            import io.sentry.C1697u2;
            import p000.u81;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdo implements u81 {
                private final /* synthetic */ zzdg zzgp;

                public zzdo(zzdk zzdkVar, zzdg zzdgVar) {
/* 1 */             this.zzgp = zzdgVar;
                }

                @Override // p000.u81
                public final /* synthetic */ void notifyListener(Object obj) {
/* 1 */             if (obj == null) {
/* 6 */                 this.zzgp.accept(null);
                    } else {
/* 10 */                C1697u2.m5431g();
                    }
                }

                @Override // p000.u81
                public final void onNotifyListenerFailed() {
                }
            }
