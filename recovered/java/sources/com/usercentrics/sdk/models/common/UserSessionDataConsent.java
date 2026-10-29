            package com.usercentrics.sdk.models.common;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class UserSessionDataConsent {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final boolean f6099a;

                /* JADX INFO: renamed from: b */
                public final String f6100b;

                /* JADX INFO: renamed from: c */
                public final long f6101c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/models/common/UserSessionDataConsent$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/models/common/UserSessionDataConsent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UserSessionDataConsent$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UserSessionDataConsent(int i, long j, String str, boolean z) {
/* 4 */             if (7 != (i & 7)) {
/* 22 */                b40.m1214E(i, 7, UserSessionDataConsent$$serializer.INSTANCE.getDescriptor());
/* 26 */                throw null;
                    }
/* 9 */             this.f6099a = z;
/* 11 */            this.f6100b = str;
/* 13 */            this.f6101c = j;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UserSessionDataConsent)) {
/* 7 */                 return false;
                    }
/* 11 */            UserSessionDataConsent userSessionDataConsent = (UserSessionDataConsent) obj;
                    return this.f6099a == userSessionDataConsent.f6099a && Intrinsics.m6216a(this.f6100b, userSessionDataConsent.f6100b) && this.f6101c == userSessionDataConsent.f6101c;
                }

                public final int hashCode() {
/* 22 */            return Long.hashCode(this.f6101c) + pm2.m7485h(Boolean.hashCode(this.f6099a) * 31, 31, this.f6100b);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("UserSessionDataConsent(status=");
/* 10 */            sb.append(this.f6099a);
/* 15 */            sb.append(", templateId=");
/* 20 */            sb.append(this.f6100b);
/* 25 */            sb.append(", timestampInMillis=");
/* 32 */            return fm0.m3787m(sb, this.f6101c, ")");
                }
            }
