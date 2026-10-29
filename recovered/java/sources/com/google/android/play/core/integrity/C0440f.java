            package com.google.android.play.core.integrity;

            import java.util.Set;
            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0440f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {

                /* JADX INFO: renamed from: a */
                private String f5249a;

                /* JADX INFO: renamed from: b */
                private Set f5250b;

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
                public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
/* 1 */             Set set = this.f5250b;
/* 3 */             C0441g c0441g = null;
/* 4 */             if (set != null) {
/* 10 */                return new C0442h(this.f5249a, set, c0441g);
                    }
/* 16 */            f42.m3656l("Missing required properties: verdictOptOut");
/* 3 */             return null;
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
                public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(String str) {
/* 1 */             this.f5249a = str;
/* 3 */             return this;
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
                public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setVerdictOptOut(Set<Integer> set) {
/* 1 */             if (set != null) {
/* 3 */                 this.f5250b = set;
/* 5 */                 return this;
                    }
/* 8 */             C1951n4.m6868s("Null verdictOptOut");
/* 11 */            return null;
                }
            }
