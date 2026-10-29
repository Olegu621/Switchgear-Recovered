            package com.usercentrics.sdk.p008ui.color;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.b40;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    public final class UsercentricsShadedColor {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6236a;

                /* JADX INFO: renamed from: b */
                public final String f6237b;

                /* JADX INFO: renamed from: c */
                public final String f6238c;

                /* JADX INFO: renamed from: d */
                public final String f6239d;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UsercentricsShadedColor$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UsercentricsShadedColor(int i, String str, String str2, String str3, String str4) {
/* 5 */             if (15 != (i & 15)) {
/* 25 */                b40.m1214E(i, 15, UsercentricsShadedColor$$serializer.INSTANCE.getDescriptor());
/* 29 */                throw null;
                    }
/* 10 */            this.f6236a = str;
/* 12 */            this.f6237b = str2;
/* 14 */            this.f6238c = str3;
/* 16 */            this.f6239d = str4;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UsercentricsShadedColor)) {
/* 7 */                 return false;
                    }
/* 11 */            UsercentricsShadedColor usercentricsShadedColor = (UsercentricsShadedColor) obj;
                    return Intrinsics.m6216a(this.f6236a, usercentricsShadedColor.f6236a) && Intrinsics.m6216a(this.f6237b, usercentricsShadedColor.f6237b) && Intrinsics.m6216a(this.f6238c, usercentricsShadedColor.f6238c) && Intrinsics.m6216a(this.f6239d, usercentricsShadedColor.f6239d);
                }

                public final int hashCode() {
/* 28 */            return this.f6239d.hashCode() + pm2.m7485h(pm2.m7485h(this.f6236a.hashCode() * 31, 31, this.f6237b), 31, this.f6238c);
                }

                public final String toString() {
/* 23 */            return fm0.m3791q(AbstractC0886en.m3514r("UsercentricsShadedColor(color100=", this.f6236a, ", color80=", this.f6237b, ", color16="), this.f6238c, ", color2=", this.f6239d, ")");
                }

/* 29 */        public UsercentricsShadedColor(String str, String str2, String str3, String str4) {
/* 31 */            this.f6236a = str;
/* 32 */            this.f6237b = str2;
/* 33 */            this.f6238c = str3;
/* 34 */            this.f6239d = str4;
                }
            }
