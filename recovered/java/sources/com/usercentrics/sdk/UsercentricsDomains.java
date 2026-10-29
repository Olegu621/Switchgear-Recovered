            package com.usercentrics.sdk;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.b40;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 30 */    public final class UsercentricsDomains {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6042a;

                /* JADX INFO: renamed from: b */
                public final String f6043b;

                /* JADX INFO: renamed from: c */
                public final String f6044c;

                /* JADX INFO: renamed from: d */
                public final String f6045d;

                /* JADX INFO: renamed from: e */
                public final String f6046e;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/UsercentricsDomains$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/UsercentricsDomains;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UsercentricsDomains$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UsercentricsDomains(int i, String str, String str2, String str3, String str4, String str5) {
/* 5 */             if (31 != (i & 31)) {
/* 27 */                b40.m1214E(i, 31, UsercentricsDomains$$serializer.INSTANCE.getDescriptor());
/* 31 */                throw null;
                    }
/* 10 */            this.f6042a = str;
/* 12 */            this.f6043b = str2;
/* 14 */            this.f6044c = str3;
/* 16 */            this.f6045d = str4;
/* 18 */            this.f6046e = str5;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m2770a() {
/* 1 */             String str = this.f6042a;
/* 8 */             if (!StringsKt.m6228D(str)) {
/* 10 */                String str2 = this.f6043b;
/* 16 */                if (!StringsKt.m6228D(str2)) {
/* 18 */                    String str3 = this.f6044c;
/* 24 */                    if (!StringsKt.m6228D(str3)) {
/* 26 */                        String str4 = this.f6045d;
/* 32 */                        if (!StringsKt.m6228D(str4)) {
/* 34 */                            String str5 = this.f6046e;
/* 40 */                            if (!StringsKt.m6228D(str5) && !StringsKt.m6240z(str, "usercentrics.eu", false) && !StringsKt.m6240z(str2, "usercentrics.eu", false) && !StringsKt.m6240z(str3, "usercentrics.eu", false) && !StringsKt.m6240z(str4, "usercentrics.eu", false) && !StringsKt.m6240z(str5, "usercentrics.eu", false)) {
/* 74 */                                return true;
                                    }
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UsercentricsDomains)) {
/* 7 */                 return false;
                    }
/* 11 */            UsercentricsDomains usercentricsDomains = (UsercentricsDomains) obj;
                    return Intrinsics.m6216a(this.f6042a, usercentricsDomains.f6042a) && Intrinsics.m6216a(this.f6043b, usercentricsDomains.f6043b) && Intrinsics.m6216a(this.f6044c, usercentricsDomains.f6044c) && Intrinsics.m6216a(this.f6045d, usercentricsDomains.f6045d) && Intrinsics.m6216a(this.f6046e, usercentricsDomains.f6046e);
                }

                public final int hashCode() {
/* 34 */            return this.f6046e.hashCode() + pm2.m7485h(pm2.m7485h(pm2.m7485h(this.f6042a.hashCode() * 31, 31, this.f6043b), 31, this.f6044c), 31, this.f6045d);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("UsercentricsDomains(aggregatorCdnUrl=", this.f6042a, ", cdnUrl=", this.f6043b, ", analyticsUrl=");
/* 23 */            fm0.m3796v(sbM3514r, this.f6044c, ", saveConsentsUrl=", this.f6045d, ", getConsentsUrl=");
/* 30 */            return fm0.m3789o(sbM3514r, this.f6046e, ")");
                }

/* 31 */        public UsercentricsDomains(String str, String str2, String str3, String str4, String str5) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    str4.getClass();
                    str5.getClass();
/* 33 */            this.f6042a = str;
/* 34 */            this.f6043b = str2;
/* 35 */            this.f6044c = str3;
/* 36 */            this.f6045d = str4;
/* 37 */            this.f6046e = str5;
                }
            }
