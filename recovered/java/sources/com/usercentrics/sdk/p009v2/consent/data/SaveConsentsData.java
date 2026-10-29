            package com.usercentrics.sdk.p009v2.consent.data;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 39 */    public final class SaveConsentsData {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final DataTransferObject f6333a;

                /* JADX INFO: renamed from: b */
                public final ConsentStringObject f6334b;

                /* JADX INFO: renamed from: c */
                public final String f6335c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return SaveConsentsData$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ SaveConsentsData(int i, DataTransferObject dataTransferObject, ConsentStringObject consentStringObject, String str) {
/* 5 */             if (1 != (i & 1)) {
/* 37 */                b40.m1214E(i, 1, SaveConsentsData$$serializer.INSTANCE.getDescriptor());
/* 40 */                throw null;
                    }
/* 10 */            this.f6333a = dataTransferObject;
/* 14 */            if ((i & 2) == 0) {
/* 16 */                this.f6334b = null;
                    } else {
/* 19 */                this.f6334b = consentStringObject;
                    }
/* 23 */            if ((i & 4) == 0) {
/* 25 */                this.f6335c = null;
                    } else {
/* 28 */                this.f6335c = str;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof SaveConsentsData)) {
/* 7 */                 return false;
                    }
/* 11 */            SaveConsentsData saveConsentsData = (SaveConsentsData) obj;
                    return Intrinsics.m6216a(this.f6333a, saveConsentsData.f6333a) && Intrinsics.m6216a(this.f6334b, saveConsentsData.f6334b) && Intrinsics.m6216a(this.f6335c, saveConsentsData.f6335c);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.f6333a.hashCode() * 31;
/* 10 */            ConsentStringObject consentStringObject = this.f6334b;
/* 21 */            int iHashCode2 = (iHashCode + (consentStringObject == null ? 0 : consentStringObject.hashCode())) * 31;
/* 23 */            String str = this.f6335c;
/* 32 */            return iHashCode2 + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SaveConsentsData(dataTransferObject=");
/* 10 */            sb.append(this.f6333a);
/* 15 */            sb.append(", consentStringObject=");
/* 20 */            sb.append(this.f6334b);
/* 25 */            sb.append(", acString=");
/* 32 */            return fm0.m3789o(sb, this.f6335c, ")");
                }

/* 40 */        public SaveConsentsData(DataTransferObject dataTransferObject, ConsentStringObject consentStringObject, String str) {
/* 42 */            this.f6333a = dataTransferObject;
/* 43 */            this.f6334b = consentStringObject;
/* 44 */            this.f6335c = str;
                }
            }
