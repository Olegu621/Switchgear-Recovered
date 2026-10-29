            package com.google.android.play.core.integrity;

            import p000.fm0;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0439e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

                /* JADX INFO: renamed from: a */
                private final long f5248a;

                public /* synthetic */ C0439e(long j, int i, C0438d c0438d) {
/* 4 */             this.f5248a = j;
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
                /* JADX INFO: renamed from: a */
                public final int mo2444a() {
/* 1 */             return 0;
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
                /* JADX INFO: renamed from: b */
                public final long mo2445b() {
/* 1 */             return this.f5248a;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) {
/* 10 */                StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
/* 20 */                if (this.f5248a == prepareIntegrityTokenRequest.mo2445b()) {
/* 22 */                    prepareIntegrityTokenRequest.mo2444a();
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             long j = this.f5248a;
/* 13 */            return (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
                }

                public final String toString() {
/* 12 */            return fm0.m3787m(new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="), this.f5248a, ", webViewRequestMode=0}");
                }
            }
