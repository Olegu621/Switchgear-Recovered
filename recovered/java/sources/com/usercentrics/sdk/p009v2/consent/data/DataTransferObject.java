            package com.usercentrics.sdk.p009v2.consent.data;

            import com.appsflyer.internal.AbstractC0298j;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.C2122qw;
            import p000.b40;
            import p000.fm0;
            import p000.h50;
            import p000.kz2;
            import p000.m61;
            import p000.mz2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 30 */    public final class DataTransferObject {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: f */
                public static final KSerializer[] f6315f = {null, null, null, new C0950gd(DataTransferObjectService$$serializer.INSTANCE, 0), null};

                /* JADX INFO: renamed from: a */
                public final String f6316a;

                /* JADX INFO: renamed from: b */
                public final DataTransferObjectConsent f6317b;

                /* JADX INFO: renamed from: c */
                public final DataTransferObjectSettings f6318c;

                /* JADX INFO: renamed from: d */
                public final List f6319d;

                /* JADX INFO: renamed from: e */
                public final long f6320e;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/consent/data/DataTransferObject;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    /* JADX INFO: renamed from: a */
                    public static DataTransferObject m2817a(Companion companion, UsercentricsSettings usercentricsSettings, String str, List list, kz2 kz2Var, mz2 mz2Var) {
/* 1 */                 companion.getClass();
/* 4 */                 str.getClass();
/* 7 */                 list.getClass();
/* 10 */                String str2 = usercentricsSettings.f6704d;
/* 14 */                DataTransferObjectConsent dataTransferObjectConsent = new DataTransferObjectConsent(kz2Var, mz2Var);
/* 25 */                ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 28 */                Iterator it = list.iterator();
/* 36 */                while (it.hasNext()) {
/* 42 */                    m61 m61Var = (m61) it.next();
/* 61 */                    arrayList.add(new DataTransferObjectService(m61Var.f13590p.f9466b, m61Var.f13580f, m61Var.f13582h, m61Var.f13587m, m61Var.f13593s));
                        }
/* 89 */                return new DataTransferObject(dataTransferObjectConsent, new DataTransferObjectSettings(usercentricsSettings.f6710j, str, str2, usercentricsSettings.f6703c), arrayList, new h50().m4115c() / 1000);
                    }

                    public final KSerializer serializer() {
/* 1 */                 return DataTransferObject$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ DataTransferObject(int i, String str, DataTransferObjectConsent dataTransferObjectConsent, DataTransferObjectSettings dataTransferObjectSettings, List list, long j) {
/* 5 */             if (31 != (i & 31)) {
/* 27 */                b40.m1214E(i, 31, DataTransferObject$$serializer.INSTANCE.getDescriptor());
/* 31 */                throw null;
                    }
/* 10 */            this.f6316a = str;
/* 12 */            this.f6317b = dataTransferObjectConsent;
/* 14 */            this.f6318c = dataTransferObjectSettings;
/* 16 */            this.f6319d = list;
/* 18 */            this.f6320e = j;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof DataTransferObject)) {
/* 7 */                 return false;
                    }
/* 11 */            DataTransferObject dataTransferObject = (DataTransferObject) obj;
                    return Intrinsics.m6216a(this.f6316a, dataTransferObject.f6316a) && Intrinsics.m6216a(this.f6317b, dataTransferObject.f6317b) && Intrinsics.m6216a(this.f6318c, dataTransferObject.f6318c) && Intrinsics.m6216a(this.f6319d, dataTransferObject.f6319d) && this.f6320e == dataTransferObject.f6320e;
                }

                public final int hashCode() {
/* 38 */            return Long.hashCode(this.f6320e) + AbstractC0298j.m1861b((this.f6318c.hashCode() + ((this.f6317b.hashCode() + (this.f6316a.hashCode() * 31)) * 31)) * 31, 31, this.f6319d);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("DataTransferObject(applicationVersion=");
/* 10 */            sb.append(this.f6316a);
/* 15 */            sb.append(", consent=");
/* 20 */            sb.append(this.f6317b);
/* 25 */            sb.append(", settings=");
/* 30 */            sb.append(this.f6318c);
/* 35 */            sb.append(", services=");
/* 40 */            sb.append(this.f6319d);
/* 45 */            sb.append(", timestampInSeconds=");
/* 52 */            return fm0.m3787m(sb, this.f6320e, ")");
                }

/* 31 */        public DataTransferObject(DataTransferObjectConsent dataTransferObjectConsent, DataTransferObjectSettings dataTransferObjectSettings, ArrayList arrayList, long j) {
/* 33 */            this.f6316a = "2.24.4";
/* 34 */            this.f6317b = dataTransferObjectConsent;
/* 35 */            this.f6318c = dataTransferObjectSettings;
/* 36 */            this.f6319d = arrayList;
/* 37 */            this.f6320e = j;
                }
            }
