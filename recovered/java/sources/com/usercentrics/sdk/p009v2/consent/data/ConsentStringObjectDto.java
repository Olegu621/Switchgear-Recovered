            package com.usercentrics.sdk.p009v2.consent.data;

            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.b40;
            import p000.ci1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public final class ConsentStringObjectDto {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: c */
                public static final KSerializer[] f6304c = {null, new C0950gd(new C0950gd(new ci1(), 0), 0)};

                /* JADX INFO: renamed from: a */
                public final long f6305a;

                /* JADX INFO: renamed from: b */
                public final List f6306b;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObjectDto$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/consent/data/ConsentStringObjectDto;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return ConsentStringObjectDto$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ ConsentStringObjectDto(int i, long j, List list) {
/* 4 */             if (3 != (i & 3)) {
/* 20 */                b40.m1214E(i, 3, ConsentStringObjectDto$$serializer.INSTANCE.getDescriptor());
/* 24 */                throw null;
                    }
/* 9 */             this.f6305a = j;
/* 11 */            this.f6306b = list;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ConsentStringObjectDto)) {
/* 7 */                 return false;
                    }
/* 11 */            ConsentStringObjectDto consentStringObjectDto = (ConsentStringObjectDto) obj;
                    return this.f6305a == consentStringObjectDto.f6305a && Intrinsics.m6216a(this.f6306b, consentStringObjectDto.f6306b);
                }

                public final int hashCode() {
/* 15 */            return this.f6306b.hashCode() + (Long.hashCode(this.f6305a) * 31);
                }

                public final String toString() {
/* 28 */            return "ConsentStringObjectDto(timestampInMillis=" + this.f6305a + ", vendors=" + this.f6306b + ")";
                }

/* 24 */        public ConsentStringObjectDto(long j, ArrayList arrayList) {
/* 26 */            this.f6305a = j;
/* 27 */            this.f6306b = arrayList;
                }
            }
