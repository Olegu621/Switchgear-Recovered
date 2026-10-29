            package com.usercentrics.sdk.models.common;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.b40;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class UserSessionData {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: f */
                public static final KSerializer[] f6091f = {new C0950gd(UserSessionDataConsent$$serializer.INSTANCE, 0), null, null, null, null};

                /* JADX INFO: renamed from: a */
                public final List f6092a;

                /* JADX INFO: renamed from: b */
                public final String f6093b;

                /* JADX INFO: renamed from: c */
                public final String f6094c;

                /* JADX INFO: renamed from: d */
                public final UserSessionDataTCF f6095d;

                /* JADX INFO: renamed from: e */
                public final UserSessionDataCCPA f6096e;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/models/common/UserSessionData$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/models/common/UserSessionData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UserSessionData$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UserSessionData(int i, List list, String str, String str2, UserSessionDataTCF userSessionDataTCF, UserSessionDataCCPA userSessionDataCCPA) {
/* 5 */             if (31 != (i & 31)) {
/* 27 */                b40.m1214E(i, 31, UserSessionData$$serializer.INSTANCE.getDescriptor());
/* 31 */                throw null;
                    }
/* 10 */            this.f6092a = list;
/* 12 */            this.f6093b = str;
/* 14 */            this.f6094c = str2;
/* 16 */            this.f6095d = userSessionDataTCF;
/* 18 */            this.f6096e = userSessionDataCCPA;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UserSessionData)) {
/* 7 */                 return false;
                    }
/* 11 */            UserSessionData userSessionData = (UserSessionData) obj;
                    return Intrinsics.m6216a(this.f6092a, userSessionData.f6092a) && Intrinsics.m6216a(this.f6093b, userSessionData.f6093b) && Intrinsics.m6216a(this.f6094c, userSessionData.f6094c) && Intrinsics.m6216a(this.f6095d, userSessionData.f6095d) && Intrinsics.m6216a(this.f6096e, userSessionData.f6096e);
                }

                public final int hashCode() {
/* 18 */            int iM7485h = pm2.m7485h(pm2.m7485h(this.f6092a.hashCode() * 31, 31, this.f6093b), 31, this.f6094c);
/* 23 */            UserSessionDataTCF userSessionDataTCF = this.f6095d;
/* 34 */            int iHashCode = (iM7485h + (userSessionDataTCF == null ? 0 : userSessionDataTCF.hashCode())) * 31;
/* 35 */            UserSessionDataCCPA userSessionDataCCPA = this.f6096e;
/* 44 */            return iHashCode + (userSessionDataCCPA != null ? userSessionDataCCPA.hashCode() : 0);
                }

                public final String toString() {
/* 58 */            return "UserSessionData(consents=" + this.f6092a + ", controllerId=" + this.f6093b + ", language=" + this.f6094c + ", tcf=" + this.f6095d + ", ccpa=" + this.f6096e + ")";
                }
            }
