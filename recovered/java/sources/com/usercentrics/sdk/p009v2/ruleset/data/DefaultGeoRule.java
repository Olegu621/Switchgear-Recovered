            package com.usercentrics.sdk.p009v2.ruleset.data;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class DefaultGeoRule {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6360a;

                /* JADX INFO: renamed from: b */
                public final boolean f6361b;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/ruleset/data/DefaultGeoRule$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/ruleset/data/DefaultGeoRule;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return DefaultGeoRule$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ DefaultGeoRule(int i, String str, boolean z) {
/* 4 */             if (3 != (i & 3)) {
/* 20 */                b40.m1214E(i, 3, DefaultGeoRule$$serializer.INSTANCE.getDescriptor());
/* 24 */                throw null;
                    }
/* 9 */             this.f6360a = str;
/* 11 */            this.f6361b = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof DefaultGeoRule)) {
/* 7 */                 return false;
                    }
/* 11 */            DefaultGeoRule defaultGeoRule = (DefaultGeoRule) obj;
                    return Intrinsics.m6216a(this.f6360a, defaultGeoRule.f6360a) && this.f6361b == defaultGeoRule.f6361b;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.f6361b) + (this.f6360a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "DefaultGeoRule(settingsId=" + this.f6360a + ", noShow=" + this.f6361b + ")";
                }
            }
