            package com.google.android.play.core.integrity;

            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.am */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0400am extends IntegrityTokenRequest.Builder {

                /* JADX INFO: renamed from: a */
                private String f5177a;

                /* JADX INFO: renamed from: b */
                private Long f5178b;

                @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
                public final IntegrityTokenRequest build() {
/* 1 */             String str = this.f5177a;
/* 3 */             C0401an c0401an = null;
/* 4 */             if (str != null) {
/* 10 */                return new C0402ao(str, this.f5178b, c0401an, c0401an);
                    }
/* 16 */            f42.m3656l("Missing required properties: nonce");
/* 3 */             return null;
                }

                @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
                public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
/* 5 */             this.f5178b = Long.valueOf(j);
/* 7 */             return this;
                }

                @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
                public final IntegrityTokenRequest.Builder setNonce(String str) {
/* 1 */             if (str != null) {
/* 3 */                 this.f5177a = str;
/* 5 */                 return this;
                    }
/* 8 */             C1951n4.m6868s("Null nonce");
/* 11 */            return null;
                }
            }
