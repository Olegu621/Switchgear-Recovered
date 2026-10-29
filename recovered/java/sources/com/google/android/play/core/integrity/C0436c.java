            package com.google.android.play.core.integrity;

            import p000.f42;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0436c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

                /* JADX INFO: renamed from: a */
                private long f5246a;

                /* JADX INFO: renamed from: b */
                private byte f5247b;

                /* JADX INFO: renamed from: a */
                public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder m2493a(int i) {
/* 6 */             this.f5247b = (byte) (this.f5247b | 2);
/* 8 */             return this;
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
                public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
/* 4 */             C0438d c0438d = null;
/* 5 */             if (this.f5247b == 3) {
/* 53 */                return new C0439e(this.f5246a, 0, c0438d);
                    }
/* 9 */             StringBuilder sb = new StringBuilder();
/* 16 */            if ((this.f5247b & 1) == 0) {
/* 20 */                sb.append(" cloudProjectNumber");
                    }
/* 27 */            if ((this.f5247b & 2) == 0) {
/* 31 */                sb.append(" webViewRequestMode");
                    }
/* 44 */            f42.m3656l("Missing required properties:".concat(sb.toString()));
/* 4 */             return null;
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
                public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
/* 1 */             this.f5246a = j;
/* 8 */             this.f5247b = (byte) (this.f5247b | 1);
/* 10 */            return this;
                }
            }
