            package com.google.android.gms.internal.drive;

            import p000.ia0;
            import p000.u81;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbq implements u81 {
                private final /* synthetic */ long zzfb;
                private final /* synthetic */ long zzfc;

                public zzbq(zzbp zzbpVar, long j, long j2) {
/* 1 */             this.zzfb = j;
/* 3 */             this.zzfc = j2;
                }

                @Override // p000.u81
                public final /* synthetic */ void notifyListener(Object obj) {
/* 7 */             ((ia0) obj).onProgress(this.zzfb, this.zzfc);
                }

                @Override // p000.u81
                public final void onNotifyListenerFailed() {
                }
            }
