            package com.usercentrics.tcf.core.model.gvl;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 32 */    public final class DataRetention {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final Integer f6798a;

                /* JADX INFO: renamed from: b */
                public final RetentionPeriod f6799b;

                /* JADX INFO: renamed from: c */
                public final RetentionPeriod f6800c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/tcf/core/model/gvl/DataRetention$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/tcf/core/model/gvl/DataRetention;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return DataRetention$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ DataRetention(int i, Integer num, RetentionPeriod retentionPeriod, RetentionPeriod retentionPeriod2) {
/* 5 */             if (6 != (i & 6)) {
/* 30 */                b40.m1214E(i, 6, DataRetention$$serializer.INSTANCE.getDescriptor());
/* 33 */                throw null;
                    }
/* 12 */            if ((i & 1) == 0) {
/* 14 */                this.f6798a = null;
                    } else {
/* 17 */                this.f6798a = num;
                    }
/* 19 */            this.f6799b = retentionPeriod;
/* 21 */            this.f6800c = retentionPeriod2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof DataRetention)) {
/* 7 */                 return false;
                    }
/* 11 */            DataRetention dataRetention = (DataRetention) obj;
                    return Intrinsics.m6216a(this.f6798a, dataRetention.f6798a) && Intrinsics.m6216a(this.f6799b, dataRetention.f6799b) && Intrinsics.m6216a(this.f6800c, dataRetention.f6800c);
                }

                public final int hashCode() {
/* 1 */             Integer num = this.f6798a;
/* 7 */             int iHashCode = num == null ? 0 : num.hashCode();
/* 32 */            return this.f6800c.f6824a.hashCode() + ((this.f6799b.f6824a.hashCode() + (iHashCode * 31)) * 31);
                }

                public final String toString() {
/* 38 */            return "DataRetention(stdRetention=" + this.f6798a + ", purposes=" + this.f6799b + ", specialPurposes=" + this.f6800c + ")";
                }

/* 33 */        public DataRetention(Integer num, RetentionPeriod retentionPeriod, RetentionPeriod retentionPeriod2) {
/* 35 */            this.f6798a = num;
/* 36 */            this.f6799b = retentionPeriod;
/* 37 */            this.f6800c = retentionPeriod2;
                }
            }
