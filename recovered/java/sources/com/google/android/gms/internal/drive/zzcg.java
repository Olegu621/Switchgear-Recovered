            package com.google.android.gms.internal.drive;

            import com.google.android.gms.common.api.Status;
            import p000.p42;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzcg extends zzau<Object> {
                private final /* synthetic */ zzcb zzfk;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzcg(zzcb zzcbVar, tr0 tr0Var) {
/* 3 */             super(tr0Var);
/* 1 */             this.zzfk = zzcbVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.common.api.internal.BasePendingResult
                public /* synthetic */ p42 createFailedResult(Status status) {
/* 6 */             return new zzcf(this.zzfk, status, null, 0 == true ? 1 : 0);
                }
            }
