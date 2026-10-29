            package com.google.android.gms.internal.drive;

            import android.util.Log;
            import com.google.android.gms.common.api.Status;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.mr0;
            import p000.p42;
            import p000.q42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbl implements q42 {
                public zzbl(zzbi zzbiVar) {
                }

                @Override // p000.q42
                public final void onResult(p42 p42Var) {
/* 1 */             Status status = (Status) p42Var;
/* 7 */             if (status.m2006D1()) {
/* 50 */                return;
                    }
/* 1 */             mr0 mr0Var = zzbi.zzbz;
/* 20 */            if (Log.isLoggable(mr0Var.f13983a, 6)) {
/* 22 */                String str = mr0Var.f13984b;
/* 34 */                String strConcat = "Error discarding contents, status: " + status;
/* 38 */                if (str != null) {
/* 41 */                    strConcat = str.concat(strConcat);
                        }
/* 47 */                AbstractC1245n0.m4876d("DriveContentsImpl", strConcat);
                    }
                }
            }
