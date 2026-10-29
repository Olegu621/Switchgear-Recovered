            package com.usercentrics.ccpa;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    public final class CCPAData {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final int f6016a;

                /* JADX INFO: renamed from: b */
                public final Boolean f6017b;

                /* JADX INFO: renamed from: c */
                public final Boolean f6018c;

                /* JADX INFO: renamed from: d */
                public final Boolean f6019d;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\r"}, m6176d2 = {"Lcom/usercentrics/ccpa/CCPAData$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/ccpa/CCPAData;", "serializer", "()Lkotlinx/serialization/KSerializer;", HttpUrl.FRAGMENT_ENCODE_SET, "expectedLength", "I", "lspactPosition", "noticeGivenPosition", "optedOutPosition", "versionPosition", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return CCPAData$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ CCPAData(int i, int i2, Boolean bool, Boolean bool2, Boolean bool3) {
/* 5 */             if (15 != (i & 15)) {
/* 25 */                b40.m1214E(i, 15, CCPAData$$serializer.INSTANCE.getDescriptor());
/* 29 */                throw null;
                    }
/* 10 */            this.f6016a = i2;
/* 12 */            this.f6017b = bool;
/* 14 */            this.f6018c = bool2;
/* 16 */            this.f6019d = bool3;
                }

                /* JADX INFO: renamed from: a */
                public final String m2767a() {
                    char c;
                    char c2;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(this.f6016a);
/* 15 */            char c3 = '-';
/* 17 */            Boolean bool = this.f6017b;
/* 19 */            if (bool != null) {
/* 29 */                c = bool.booleanValue() ? 'Y' : 'N';
                    } else {
/* 31 */                c = '-';
                    }
/* 32 */            sb.append(c);
/* 35 */            Boolean bool2 = this.f6018c;
/* 37 */            if (bool2 != null) {
/* 47 */                c2 = bool2.booleanValue() ? 'Y' : 'N';
                    } else {
/* 49 */                c2 = '-';
                    }
/* 50 */            sb.append(c2);
/* 53 */            Boolean bool3 = this.f6019d;
/* 55 */            if (bool3 != null) {
/* 61 */                c3 = bool3.booleanValue() ? 'Y' : 'N';
                    }
/* 65 */            sb.append(c3);
/* 68 */            return sb.toString();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof CCPAData)) {
/* 7 */                 return false;
                    }
/* 11 */            CCPAData cCPAData = (CCPAData) obj;
                    return this.f6016a == cCPAData.f6016a && Intrinsics.m6216a(this.f6017b, cCPAData.f6017b) && Intrinsics.m6216a(this.f6018c, cCPAData.f6018c) && Intrinsics.m6216a(this.f6019d, cCPAData.f6019d);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = Integer.hashCode(this.f6016a) * 31;
/* 10 */            Boolean bool = this.f6017b;
/* 21 */            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
/* 23 */            Boolean bool2 = this.f6018c;
/* 34 */            int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
/* 36 */            Boolean bool3 = this.f6019d;
/* 45 */            return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
                }

                public final String toString() {
/* 48 */            return "CCPAData(version=" + this.f6016a + ", noticeGiven=" + this.f6017b + ", optedOut=" + this.f6018c + ", lspact=" + this.f6019d + ")";
                }

/* 29 */        public CCPAData(int i, Boolean bool, Boolean bool2, Boolean bool3) {
/* 31 */            this.f6016a = i;
/* 32 */            this.f6017b = bool;
/* 33 */            this.f6018c = bool2;
/* 34 */            this.f6019d = bool3;
                }
            }
