            package com.google.android.gms.internal.drive;

            import p000.ia0;
            import p000.v81;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbp implements ia0 {
                private final v81 zzfa;

                public zzbp(v81 v81Var) {
/* 4 */             this.zzfa = v81Var;
                }

                @Override // p000.ia0
                public final void onProgress(long j, long j2) {
/* 11 */            this.zzfa.m9229a(new zzbq(this, j, j2));
                }
            }
