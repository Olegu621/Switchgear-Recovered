            package com.usercentrics.sdk.services.tcf.interfaces;

            import kotlin.Metadata;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b10;
            import p000.b40;
            import p000.j22;
            import p000.l42;
            import p000.oe0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public final class TCFVendorRestriction {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: c */
                public static final KSerializer[] f6229c = {null, new b10(j22.m5667a(l42.class), new oe0("com.usercentrics.tcf.core.model.RestrictionType", l42.values()), new KSerializer[0])};

                /* JADX INFO: renamed from: a */
                public final int f6230a;

                /* JADX INFO: renamed from: b */
                public final l42 f6231b;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return TCFVendorRestriction$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ TCFVendorRestriction(int i, int i2, l42 l42Var) {
/* 4 */             if (3 != (i & 3)) {
/* 20 */                b40.m1214E(i, 3, TCFVendorRestriction$$serializer.INSTANCE.getDescriptor());
/* 24 */                throw null;
                    }
/* 9 */             this.f6230a = i2;
/* 11 */            this.f6231b = l42Var;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof TCFVendorRestriction)) {
/* 7 */                 return false;
                    }
/* 11 */            TCFVendorRestriction tCFVendorRestriction = (TCFVendorRestriction) obj;
                    return this.f6230a == tCFVendorRestriction.f6230a && this.f6231b == tCFVendorRestriction.f6231b;
                }

                public final int hashCode() {
/* 15 */            return this.f6231b.hashCode() + (Integer.hashCode(this.f6230a) * 31);
                }

                public final String toString() {
/* 28 */            return "TCFVendorRestriction(purposeId=" + this.f6230a + ", restrictionType=" + this.f6231b + ")";
                }

/* 24 */        public TCFVendorRestriction(int i, l42 l42Var) {
/* 26 */            this.f6230a = i;
/* 27 */            this.f6231b = l42Var;
                }
            }
