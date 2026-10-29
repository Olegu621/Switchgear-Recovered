            package com.usercentrics.sdk.services.tcf.interfaces;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public final class IdAndConsent {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final int f6154a;

                /* JADX INFO: renamed from: b */
                public final Boolean f6155b;

                /* JADX INFO: renamed from: c */
                public final Boolean f6156c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndConsent$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndConsent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return IdAndConsent$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ IdAndConsent(int i, int i2, Boolean bool, Boolean bool2) {
/* 4 */             if (7 != (i & 7)) {
/* 22 */                b40.m1214E(i, 7, IdAndConsent$$serializer.INSTANCE.getDescriptor());
/* 26 */                throw null;
                    }
/* 9 */             this.f6154a = i2;
/* 11 */            this.f6155b = bool;
/* 13 */            this.f6156c = bool2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IdAndConsent)) {
/* 7 */                 return false;
                    }
/* 11 */            IdAndConsent idAndConsent = (IdAndConsent) obj;
                    return this.f6154a == idAndConsent.f6154a && Intrinsics.m6216a(this.f6155b, idAndConsent.f6155b) && Intrinsics.m6216a(this.f6156c, idAndConsent.f6156c);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = Integer.hashCode(this.f6154a) * 31;
/* 10 */            Boolean bool = this.f6155b;
/* 21 */            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
/* 23 */            Boolean bool2 = this.f6156c;
/* 32 */            return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
                }

                public final String toString() {
/* 38 */            return "IdAndConsent(id=" + this.f6154a + ", consent=" + this.f6155b + ", legitimateInterestConsent=" + this.f6156c + ")";
                }

/* 26 */        public IdAndConsent(int i, Boolean bool, Boolean bool2) {
/* 28 */            this.f6154a = i;
/* 29 */            this.f6155b = bool;
/* 30 */            this.f6156c = bool2;
                }
            }
