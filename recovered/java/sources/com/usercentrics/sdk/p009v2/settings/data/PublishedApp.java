            package com.usercentrics.sdk.p009v2.settings.data;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b10;
            import p000.b40;
            import p000.j22;
            import p000.oe0;
            import p000.oz1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class PublishedApp {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: c */
                public static final KSerializer[] f6435c = {null, new b10(j22.m5667a(oz1.class), new oe0("com.usercentrics.sdk.v2.settings.data.PublishedAppPlatform", oz1.values()), new KSerializer[0])};

                /* JADX INFO: renamed from: a */
                public final String f6436a;

                /* JADX INFO: renamed from: b */
                public final oz1 f6437b;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/PublishedApp$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/PublishedApp;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return PublishedApp$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ PublishedApp(int i, String str, oz1 oz1Var) {
/* 4 */             if (3 != (i & 3)) {
/* 20 */                b40.m1214E(i, 3, PublishedApp$$serializer.INSTANCE.getDescriptor());
/* 24 */                throw null;
                    }
/* 9 */             this.f6436a = str;
/* 11 */            this.f6437b = oz1Var;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof PublishedApp)) {
/* 7 */                 return false;
                    }
/* 11 */            PublishedApp publishedApp = (PublishedApp) obj;
                    return Intrinsics.m6216a(this.f6436a, publishedApp.f6436a) && this.f6437b == publishedApp.f6437b;
                }

                public final int hashCode() {
/* 15 */            return this.f6437b.hashCode() + (this.f6436a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "PublishedApp(bundleId=" + this.f6436a + ", platform=" + this.f6437b + ")";
                }
            }
