            package com.usercentrics.tcf.core.model.gvl;

            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.az0;
            import p000.b40;
            import p000.rt0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class GvlDataRetention {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: d */
                public static final KSerializer[] f6813d;

                /* JADX INFO: renamed from: a */
                public final Integer f6814a;

                /* JADX INFO: renamed from: b */
                public final Map f6815b;

                /* JADX INFO: renamed from: c */
                public final Map f6816c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return GvlDataRetention$$serializer.INSTANCE;
                    }
                }

                static {
/* 10 */            vh2 vh2Var = vh2.f18183a;
/* 12 */            az0 az0Var = az0.f2143a;
/* 35 */            f6813d = new KSerializer[]{null, new rt0(vh2Var, az0Var, 1), new rt0(vh2Var, az0Var, 1)};
                }

                public /* synthetic */ GvlDataRetention(int i, Integer num, Map map, Map map2) {
/* 5 */             if (6 != (i & 6)) {
/* 30 */                b40.m1214E(i, 6, GvlDataRetention$$serializer.INSTANCE.getDescriptor());
/* 33 */                throw null;
                    }
/* 12 */            if ((i & 1) == 0) {
/* 14 */                this.f6814a = null;
                    } else {
/* 17 */                this.f6814a = num;
                    }
/* 19 */            this.f6815b = map;
/* 21 */            this.f6816c = map2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof GvlDataRetention)) {
/* 7 */                 return false;
                    }
/* 11 */            GvlDataRetention gvlDataRetention = (GvlDataRetention) obj;
                    return Intrinsics.m6216a(this.f6814a, gvlDataRetention.f6814a) && Intrinsics.m6216a(this.f6815b, gvlDataRetention.f6815b) && Intrinsics.m6216a(this.f6816c, gvlDataRetention.f6816c);
                }

                public final int hashCode() {
/* 1 */             Integer num = this.f6814a;
/* 7 */             int iHashCode = num == null ? 0 : num.hashCode();
/* 28 */            return this.f6816c.hashCode() + ((this.f6815b.hashCode() + (iHashCode * 31)) * 31);
                }

                public final String toString() {
/* 38 */            return "GvlDataRetention(stdRetention=" + this.f6814a + ", purposes=" + this.f6815b + ", specialPurposes=" + this.f6816c + ")";
                }
            }
