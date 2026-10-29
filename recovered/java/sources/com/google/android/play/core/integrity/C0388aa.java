            package com.google.android.play.core.integrity;

            import com.google.android.gms.tasks.Task;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.aa */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0388aa implements IntegrityManager {

                /* JADX INFO: renamed from: a */
                private final C0397aj f5149a;

                public C0388aa(C0397aj c0397aj) {
/* 4 */             this.f5149a = c0397aj;
                }

                @Override // com.google.android.play.core.integrity.IntegrityManager
                public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
/* 3 */             return this.f5149a.m2462c(integrityTokenRequest);
                }
            }
