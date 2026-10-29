            package com.usercentrics.sdk.models.common;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.az0;
            import p000.b40;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class UserSessionDataTCF {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: d */
                public static final KSerializer[] f6102d = {null, new C0950gd(az0.f2143a, 0), null};

                /* JADX INFO: renamed from: a */
                public final String f6103a;

                /* JADX INFO: renamed from: b */
                public final List f6104b;

                /* JADX INFO: renamed from: c */
                public final String f6105c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/models/common/UserSessionDataTCF$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/models/common/UserSessionDataTCF;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UserSessionDataTCF$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UserSessionDataTCF(int i, String str, String str2, List list) {
/* 4 */             if (7 != (i & 7)) {
/* 22 */                b40.m1214E(i, 7, UserSessionDataTCF$$serializer.INSTANCE.getDescriptor());
/* 26 */                throw null;
                    }
/* 9 */             this.f6103a = str;
/* 11 */            this.f6104b = list;
/* 13 */            this.f6105c = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UserSessionDataTCF)) {
/* 7 */                 return false;
                    }
/* 11 */            UserSessionDataTCF userSessionDataTCF = (UserSessionDataTCF) obj;
                    return Intrinsics.m6216a(this.f6103a, userSessionDataTCF.f6103a) && Intrinsics.m6216a(this.f6104b, userSessionDataTCF.f6104b) && Intrinsics.m6216a(this.f6105c, userSessionDataTCF.f6105c);
                }

                public final int hashCode() {
/* 22 */            return this.f6105c.hashCode() + AbstractC0298j.m1861b(this.f6103a.hashCode() * 31, 31, this.f6104b);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("UserSessionDataTCF(tcString=");
/* 10 */            sb.append(this.f6103a);
/* 15 */            sb.append(", vendorsDisclosed=");
/* 20 */            sb.append(this.f6104b);
/* 25 */            sb.append(", acString=");
/* 32 */            return fm0.m3789o(sb, this.f6105c, ")");
                }
            }
