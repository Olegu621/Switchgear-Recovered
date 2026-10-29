            package com.usercentrics.sdk;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.b10;
            import p000.bn1;
            import p000.j22;
            import p000.l03;
            import p000.oe0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class UsercentricsOptions {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: k */
                public static final KSerializer[] f6047k = {null, null, null, null, new b10(j22.m5667a(l03.class), new oe0("com.usercentrics.sdk.models.common.UsercentricsLoggerLevel", l03.values()), new KSerializer[0]), null, null, null, null, new b10(j22.m5667a(bn1.class), new oe0("com.usercentrics.sdk.models.common.NetworkMode", bn1.values()), new KSerializer[0])};

                /* JADX INFO: renamed from: a */
                public String f6048a;

                /* JADX INFO: renamed from: b */
                public String f6049b;

                /* JADX INFO: renamed from: c */
                public String f6050c;

                /* JADX INFO: renamed from: d */
                public long f6051d;

                /* JADX INFO: renamed from: e */
                public l03 f6052e;

                /* JADX INFO: renamed from: f */
                public String f6053f;

                /* JADX INFO: renamed from: g */
                public boolean f6054g;

                /* JADX INFO: renamed from: h */
                public UsercentricsDomains f6055h;

                /* JADX INFO: renamed from: i */
                public long f6056i;

                /* JADX INFO: renamed from: j */
                public bn1 f6057j;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/UsercentricsOptions$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/UsercentricsOptions;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UsercentricsOptions$$serializer.INSTANCE;
                    }
                }

                public UsercentricsOptions(String str, String str2, String str3, long j, l03 l03Var, String str4, boolean z, UsercentricsDomains usercentricsDomains, long j2) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 7 */             str3.getClass();
/* 10 */            l03Var.getClass();
/* 13 */            str4.getClass();
/* 19 */            this.f6048a = str;
/* 21 */            this.f6049b = str2;
/* 23 */            this.f6050c = str3;
/* 25 */            this.f6051d = j;
/* 27 */            this.f6052e = l03Var;
/* 29 */            this.f6053f = str4;
/* 31 */            this.f6054g = z;
/* 33 */            this.f6055h = usercentricsDomains;
/* 35 */            this.f6056i = j2;
/* 39 */            this.f6057j = bn1.f2548a;
/* 49 */            this.f6048a = StringsKt.m6239O(str).toString();
/* 59 */            this.f6049b = StringsKt.m6239O(str2).toString();
/* 71 */            this.f6053f = StringsKt.m6239O(this.f6053f).toString();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && UsercentricsOptions.class == obj.getClass()) {
/* 17 */                UsercentricsOptions usercentricsOptions = (UsercentricsOptions) obj;
/* 27 */                if (Intrinsics.m6216a(this.f6048a, usercentricsOptions.f6048a) && Intrinsics.m6216a(this.f6049b, usercentricsOptions.f6049b) && Intrinsics.m6216a(this.f6050c, usercentricsOptions.f6050c) && this.f6051d == usercentricsOptions.f6051d && this.f6052e == usercentricsOptions.f6052e && Intrinsics.m6216a(this.f6053f, usercentricsOptions.f6053f) && this.f6054g == usercentricsOptions.f6054g && Intrinsics.m6216a(this.f6055h, usercentricsOptions.f6055h) && this.f6056i == usercentricsOptions.f6056i && this.f6057j == usercentricsOptions.f6057j) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 46 */            int iM3504h = AbstractC0886en.m3504h(pm2.m7485h((this.f6052e.hashCode() + ((Long.hashCode(this.f6051d) + pm2.m7485h(pm2.m7485h(this.f6048a.hashCode() * 31, 31, this.f6049b), 31, this.f6050c)) * 31)) * 31, 31, this.f6053f), 31, this.f6054g);
/* 50 */            UsercentricsDomains usercentricsDomains = this.f6055h;
/* 76 */            return this.f6057j.hashCode() + ((Long.hashCode(this.f6056i) + ((iM3504h + (usercentricsDomains != null ? usercentricsDomains.hashCode() : 0)) * 31)) * 31);
                }
            }
