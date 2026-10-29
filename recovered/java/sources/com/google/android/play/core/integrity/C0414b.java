            package com.google.android.play.core.integrity;

            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0414b extends AbstractC0431bq {

                /* JADX INFO: renamed from: a */
                private String f5200a;

                /* JADX INFO: renamed from: b */
                private AbstractC0461y f5201b;

                @Override // com.google.android.play.core.integrity.AbstractC0431bq
                /* JADX INFO: renamed from: a */
                public final AbstractC0431bq mo2471a(AbstractC0461y abstractC0461y) {
/* 1 */             this.f5201b = abstractC0461y;
/* 3 */             return this;
                }

                @Override // com.google.android.play.core.integrity.AbstractC0431bq
                /* JADX INFO: renamed from: b */
                public final AbstractC0431bq mo2472b(String str) {
/* 1 */             if (str != null) {
/* 3 */                 this.f5200a = str;
/* 5 */                 return this;
                    }
/* 8 */             C1951n4.m6868s("Null token");
/* 11 */            return null;
                }

                @Override // com.google.android.play.core.integrity.AbstractC0431bq
                /* JADX INFO: renamed from: c */
                public final C0432br mo2473c() {
                    AbstractC0461y abstractC0461y;
/* 1 */             String str = this.f5200a;
/* 3 */             if (str != null && (abstractC0461y = this.f5201b) != null) {
/* 12 */                return new C0432br(str, abstractC0461y);
                    }
/* 18 */            StringBuilder sb = new StringBuilder();
/* 23 */            if (this.f5200a == null) {
/* 27 */                sb.append(" token");
                    }
/* 32 */            if (this.f5201b == null) {
/* 36 */                sb.append(" integrityDialogWrapper");
                    }
/* 49 */            f42.m3656l("Missing required properties:".concat(sb.toString()));
/* 52 */            return null;
                }
            }
