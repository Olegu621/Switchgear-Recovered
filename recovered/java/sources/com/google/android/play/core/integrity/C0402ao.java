            package com.google.android.play.core.integrity;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.ao */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0402ao extends IntegrityTokenRequest {

                /* JADX INFO: renamed from: a */
                private final String f5179a;

                /* JADX INFO: renamed from: b */
                private final Long f5180b;

                /* JADX INFO: renamed from: c */
                private final Object f5181c = null;

                public /* synthetic */ C0402ao(String str, Long l, Object obj, C0401an c0401an) {
/* 4 */             this.f5179a = str;
/* 6 */             this.f5180b = l;
                }

                /* JADX INFO: renamed from: a */
                private static boolean m2463a() {
/* 1 */             return true;
                }

                @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
                public final Long cloudProjectNumber() {
/* 1 */             return this.f5180b;
                }

                /* JADX WARN: Code duplicated, block: B:14:0x0024  */
                public final boolean equals(Object obj) {
                    boolean z;
                    Long l;
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof IntegrityTokenRequest) {
/* 11 */                IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
/* 23 */                if (!this.f5179a.equals(integrityTokenRequest.nonce()) || ((l = this.f5180b) != null ? !l.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() != null)) {
/* 37 */                    z = false;
                        } else {
/* 35 */                    z = true;
                        }
                    } else {
/* 37 */                z = false;
                    }
/* 52 */            if ((obj instanceof C0402ao) && m2463a()) {
                        return z;
                    }
/* 64 */            return z;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.f5179a.hashCode() ^ 1000003;
/* 11 */            Long l = this.f5180b;
/* 22 */            int iHashCode2 = (l == null ? 0 : l.hashCode()) ^ (iHashCode * 1000003);
                    return m2463a() ? iHashCode2 * 1000003 : iHashCode2;
                }

                @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
                public final String nonce() {
/* 1 */             return this.f5179a;
                }

                public final String toString() {
/* 23 */            String strConcat = "IntegrityTokenRequest{nonce=" + this.f5179a + ", cloudProjectNumber=" + this.f5180b;
/* 31 */            if (m2463a()) {
/* 35 */                strConcat = strConcat.concat(", network=null");
                    }
/* 41 */            return strConcat.concat("}");
                }
            }
