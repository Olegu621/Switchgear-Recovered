            package com.google.android.play.core.integrity;

            import java.util.Set;
            import p000.fm0;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0442h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

                /* JADX INFO: renamed from: a */
                private final String f5251a;

                /* JADX INFO: renamed from: b */
                private final Set f5252b;

                public /* synthetic */ C0442h(String str, Set set, C0441g c0441g) {
/* 4 */             this.f5251a = str;
/* 6 */             this.f5252b = set;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest) {
/* 10 */                StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
/* 12 */                String str = this.f5251a;
/* 14 */                if (str != null ? str.equals(standardIntegrityTokenRequest.requestHash()) : standardIntegrityTokenRequest.requestHash() == null) {
/* 43 */                    if (this.f5252b.equals(standardIntegrityTokenRequest.verdictOptOut())) {
/* 1 */                         return true;
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             String str = this.f5251a;
/* 22 */            return this.f5252b.hashCode() ^ (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003);
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
                public final String requestHash() {
/* 1 */             return this.f5251a;
                }

                public final String toString() {
/* 20 */            return fm0.m3791q(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.f5251a, ", verdictOptOut=", this.f5252b.toString(), "}");
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
                public final Set<Integer> verdictOptOut() {
/* 1 */             return this.f5252b;
                }
            }
