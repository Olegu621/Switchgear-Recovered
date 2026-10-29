            package com.usercentrics.sdk.models.common;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class UserSessionDataCCPA {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6097a;

                /* JADX INFO: renamed from: b */
                public final long f6098b;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/models/common/UserSessionDataCCPA$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/models/common/UserSessionDataCCPA;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UserSessionDataCCPA$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UserSessionDataCCPA(int i, String str, long j) {
/* 4 */             if (3 != (i & 3)) {
/* 20 */                b40.m1214E(i, 3, UserSessionDataCCPA$$serializer.INSTANCE.getDescriptor());
/* 24 */                throw null;
                    }
/* 9 */             this.f6097a = str;
/* 11 */            this.f6098b = j;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UserSessionDataCCPA)) {
/* 7 */                 return false;
                    }
/* 11 */            UserSessionDataCCPA userSessionDataCCPA = (UserSessionDataCCPA) obj;
                    return Intrinsics.m6216a(this.f6097a, userSessionDataCCPA.f6097a) && this.f6098b == userSessionDataCCPA.f6098b;
                }

                public final int hashCode() {
/* 15 */            return Long.hashCode(this.f6098b) + (this.f6097a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "UserSessionDataCCPA(ccpaString=" + this.f6097a + ", timestampInMillis=" + this.f6098b + ")";
                }
            }
