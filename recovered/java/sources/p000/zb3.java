            package p000;

            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.api.internal.BasePendingResult;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zb3 extends BasePendingResult {

                /* JADX INFO: renamed from: a */
                public final Status f20065a;

                public zb3(Status status) {
/* 2 */             super(null);
/* 5 */             this.f20065a = status;
                }

                @Override // com.google.android.gms.common.api.internal.BasePendingResult
                public final p42 createFailedResult(Status status) {
/* 1 */             return this.f20065a;
                }
            }
