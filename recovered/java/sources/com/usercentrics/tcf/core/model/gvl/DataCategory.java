            package com.usercentrics.tcf.core.model.gvl;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class DataCategory {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final int f6795a;

                /* JADX INFO: renamed from: b */
                public final String f6796b;

                /* JADX INFO: renamed from: c */
                public final String f6797c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/tcf/core/model/gvl/DataCategory$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/tcf/core/model/gvl/DataCategory;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return DataCategory$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ DataCategory(String str, int i, int i2, String str2) {
/* 4 */             if (7 != (i & 7)) {
/* 22 */                b40.m1214E(i, 7, DataCategory$$serializer.INSTANCE.getDescriptor());
/* 26 */                throw null;
                    }
/* 9 */             this.f6795a = i2;
/* 11 */            this.f6796b = str;
/* 13 */            this.f6797c = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof DataCategory)) {
/* 7 */                 return false;
                    }
/* 11 */            DataCategory dataCategory = (DataCategory) obj;
                    return this.f6795a == dataCategory.f6795a && Intrinsics.m6216a(this.f6796b, dataCategory.f6796b) && Intrinsics.m6216a(this.f6797c, dataCategory.f6797c);
                }

                public final int hashCode() {
/* 22 */            return this.f6797c.hashCode() + pm2.m7485h(Integer.hashCode(this.f6795a) * 31, 31, this.f6796b);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("DataCategory(id=");
/* 10 */            sb.append(this.f6795a);
/* 15 */            sb.append(", name=");
/* 20 */            sb.append(this.f6796b);
/* 25 */            sb.append(", description=");
/* 32 */            return fm0.m3789o(sb, this.f6797c, ")");
                }
            }
