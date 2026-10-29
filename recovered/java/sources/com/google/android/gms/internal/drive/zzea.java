            package com.google.android.gms.internal.drive;

            import com.google.android.gms.common.api.Status;
            import p000.p42;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     abstract class zzea extends zzau<Object> {
                private zzea(zzdp zzdpVar, tr0 tr0Var) {
/* 1 */             super(tr0Var);
                }

                @Override // com.google.android.gms.common.api.internal.BasePendingResult
                public /* synthetic */ p42 createFailedResult(Status status) {
/* 4 */             return new zzdz(status, null);
                }

/* 4 */         public /* synthetic */ zzea(zzdp zzdpVar, tr0 tr0Var, zzdq zzdqVar) {
/* 5 */             this(zzdpVar, tr0Var);
                }
            }
