            package com.google.android.play.core.integrity;

            import com.google.android.gms.tasks.SuccessContinuation;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.Tasks;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.az */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0413az implements StandardIntegrityManager {

                /* JADX INFO: renamed from: a */
                private final C0428bn f5198a;

                /* JADX INFO: renamed from: b */
                private final C0434bt f5199b;

                public C0413az(C0428bn c0428bn, C0434bt c0434bt) {
/* 4 */             this.f5198a = c0428bn;
/* 6 */             this.f5199b = c0434bt;
                }

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Task m2470a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l) throws Exception {
/* 1 */             final long jMo2445b = prepareIntegrityTokenRequest.mo2445b();
/* 5 */             final long jLongValue = l.longValue();
/* 9 */             prepareIntegrityTokenRequest.mo2444a();
/* 14 */            final C0434bt c0434bt = this.f5199b;
/* 16 */            final int i = 0;
/* 20 */            return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(jMo2445b, jLongValue, i) { // from class: com.google.android.play.core.integrity.bs

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ long f5242b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ long f5243c;

                        @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
                        public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
/* 9 */                     return this.f5241a.m2492a(this.f5242b, this.f5243c, 0, standardIntegrityTokenRequest);
                        }
                    });
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager
                public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
/* 1 */             long jMo2445b = prepareIntegrityTokenRequest.mo2445b();
/* 5 */             prepareIntegrityTokenRequest.mo2444a();
/* 20 */            return this.f5198a.m2491e(jMo2445b, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        public final Task then(Object obj) {
/* 7 */                     return this.f5196a.m2470a(prepareIntegrityTokenRequest, (Long) obj);
                        }
                    });
                }
            }
