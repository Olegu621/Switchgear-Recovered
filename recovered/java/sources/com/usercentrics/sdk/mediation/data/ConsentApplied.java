            package com.usercentrics.sdk.mediation.data;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.b40;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    public final class ConsentApplied {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6082a;

                /* JADX INFO: renamed from: b */
                public final String f6083b;

                /* JADX INFO: renamed from: c */
                public final boolean f6084c;

                /* JADX INFO: renamed from: d */
                public final boolean f6085d;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/mediation/data/ConsentApplied$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/mediation/data/ConsentApplied;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return ConsentApplied$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ ConsentApplied(int i, String str, String str2, boolean z, boolean z2) {
/* 5 */             if (15 != (i & 15)) {
/* 25 */                b40.m1214E(i, 15, ConsentApplied$$serializer.INSTANCE.getDescriptor());
/* 29 */                throw null;
                    }
/* 10 */            this.f6082a = str;
/* 12 */            this.f6083b = str2;
/* 14 */            this.f6084c = z;
/* 16 */            this.f6085d = z2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ConsentApplied)) {
/* 7 */                 return false;
                    }
/* 11 */            ConsentApplied consentApplied = (ConsentApplied) obj;
                    return Intrinsics.m6216a(this.f6082a, consentApplied.f6082a) && Intrinsics.m6216a(this.f6083b, consentApplied.f6083b) && this.f6084c == consentApplied.f6084c && this.f6085d == consentApplied.f6085d;
                }

                public final int hashCode() {
/* 28 */            return Boolean.hashCode(this.f6085d) + AbstractC0886en.m3504h(pm2.m7485h(this.f6082a.hashCode() * 31, 31, this.f6083b), 31, this.f6084c);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("ConsentApplied(name=", this.f6082a, ", templateId=", this.f6083b, ", consent=");
/* 17 */            sbM3514r.append(this.f6084c);
/* 22 */            sbM3514r.append(", mediated=");
/* 27 */            sbM3514r.append(this.f6085d);
/* 32 */            sbM3514r.append(")");
/* 35 */            return sbM3514r.toString();
                }

/* 29 */        public ConsentApplied(String str, String str2, boolean z, boolean z2) {
                    str.getClass();
/* 31 */            this.f6082a = str;
/* 32 */            this.f6083b = str2;
/* 33 */            this.f6084c = z;
/* 34 */            this.f6085d = z2;
                }
            }
