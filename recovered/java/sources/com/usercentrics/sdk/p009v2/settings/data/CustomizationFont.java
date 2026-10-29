            package com.usercentrics.sdk.p009v2.settings.data;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class CustomizationFont {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6427a;

                /* JADX INFO: renamed from: b */
                public final Integer f6428b;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/CustomizationFont$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/CustomizationFont;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return CustomizationFont$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ CustomizationFont(String str, int i, Integer num) {
/* 7 */             if ((i & 1) == 0) {
/* 9 */                 this.f6427a = null;
                    } else {
/* 12 */                this.f6427a = str;
                    }
/* 16 */            if ((i & 2) == 0) {
/* 18 */                this.f6428b = null;
                    } else {
/* 21 */                this.f6428b = num;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof CustomizationFont)) {
/* 7 */                 return false;
                    }
/* 11 */            CustomizationFont customizationFont = (CustomizationFont) obj;
                    return Intrinsics.m6216a(this.f6427a, customizationFont.f6427a) && Intrinsics.m6216a(this.f6428b, customizationFont.f6428b);
                }

                public final int hashCode() {
/* 2 */             String str = this.f6427a;
/* 12 */            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 14 */            Integer num = this.f6428b;
/* 23 */            return iHashCode + (num != null ? num.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "CustomizationFont(family=" + this.f6427a + ", size=" + this.f6428b + ")";
                }
            }
