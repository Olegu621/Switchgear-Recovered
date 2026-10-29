            package com.usercentrics.sdk.p009v2.settings.data;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import okio.Segment;
            import p000.AbstractC0886en;
            import p000.C0950gd;
            import p000.InterfaceC0972gz;
            import p000.b40;
            import p000.fm0;
            import p000.nd0;
            import p000.pm2;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ServiceConsentTemplate implements InterfaceC0972gz {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: l */
                public static final KSerializer[] f6446l = {null, null, null, null, null, null, null, new C0950gd(SubConsentTemplate$$serializer.INSTANCE, 0), null, new C0950gd(vh2.f18183a, 0), null};

                /* JADX INFO: renamed from: a */
                public final Boolean f6447a;

                /* JADX INFO: renamed from: b */
                public final Boolean f6448b;

                /* JADX INFO: renamed from: c */
                public final String f6449c;

                /* JADX INFO: renamed from: d */
                public final String f6450d;

                /* JADX INFO: renamed from: e */
                public final String f6451e;

                /* JADX INFO: renamed from: f */
                public final String f6452f;

                /* JADX INFO: renamed from: g */
                public final boolean f6453g;

                /* JADX INFO: renamed from: h */
                public final List f6454h;

                /* JADX INFO: renamed from: i */
                public final Boolean f6455i;

                /* JADX INFO: renamed from: j */
                public final List f6456j;

                /* JADX INFO: renamed from: k */
                public final Boolean f6457k;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/ServiceConsentTemplate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return ServiceConsentTemplate$$serializer.INSTANCE;
                    }
                }

                public ServiceConsentTemplate(int i, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, boolean z, List list, Boolean bool3, List list2, Boolean bool4) {
/* 6 */             if (76 != (i & 76)) {
/* 98 */                b40.m1214E(i, 76, ServiceConsentTemplate$$serializer.INSTANCE.getDescriptor());
/* 101 */               throw null;
                    }
/* 13 */            if ((i & 1) == 0) {
/* 15 */                this.f6447a = null;
                    } else {
/* 18 */                this.f6447a = bool;
                    }
/* 22 */            if ((i & 2) == 0) {
/* 24 */                this.f6448b = null;
                    } else {
/* 27 */                this.f6448b = bool2;
                    }
/* 29 */            this.f6449c = str;
/* 31 */            this.f6450d = str2;
/* 35 */            if ((i & 16) == 0) {
/* 37 */                this.f6451e = null;
                    } else {
/* 40 */                this.f6451e = str3;
                    }
/* 44 */            if ((i & 32) == 0) {
/* 46 */                this.f6452f = null;
                    } else {
/* 49 */                this.f6452f = str4;
                    }
/* 51 */            this.f6453g = z;
/* 55 */            if ((i & 128) == 0) {
/* 59 */                this.f6454h = nd0.f14189a;
                    } else {
/* 62 */                this.f6454h = list;
                    }
/* 66 */            if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
/* 68 */                this.f6455i = null;
                    } else {
/* 71 */                this.f6455i = bool3;
                    }
/* 75 */            if ((i & NotificationCompat.FLAG_GROUP_SUMMARY) == 0) {
/* 77 */                this.f6456j = null;
                    } else {
/* 80 */                this.f6456j = list2;
                    }
/* 84 */            if ((i & Segment.SHARE_MINIMUM) == 0) {
/* 86 */                this.f6457k = null;
                    } else {
/* 89 */                this.f6457k = bool4;
                    }
                }

                @Override // p000.InterfaceC0972gz
                /* JADX INFO: renamed from: a */
                public final boolean mo2820a() {
/* 1 */             return this.f6453g;
                }

                @Override // p000.InterfaceC0972gz
                /* JADX INFO: renamed from: b */
                public final String mo2821b() {
/* 1 */             return this.f6449c;
                }

                @Override // p000.InterfaceC0972gz
                /* JADX INFO: renamed from: c */
                public final String mo2822c() {
/* 1 */             return this.f6451e;
                }

                @Override // p000.InterfaceC0972gz
                /* JADX INFO: renamed from: d */
                public final Boolean mo2823d() {
/* 1 */             return this.f6447a;
                }

                @Override // p000.InterfaceC0972gz
                /* JADX INFO: renamed from: e */
                public final String mo2824e() {
/* 1 */             return this.f6450d;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ServiceConsentTemplate)) {
/* 7 */                 return false;
                    }
/* 11 */            ServiceConsentTemplate serviceConsentTemplate = (ServiceConsentTemplate) obj;
                    return Intrinsics.m6216a(this.f6447a, serviceConsentTemplate.f6447a) && Intrinsics.m6216a(this.f6448b, serviceConsentTemplate.f6448b) && Intrinsics.m6216a(this.f6449c, serviceConsentTemplate.f6449c) && Intrinsics.m6216a(this.f6450d, serviceConsentTemplate.f6450d) && Intrinsics.m6216a(this.f6451e, serviceConsentTemplate.f6451e) && Intrinsics.m6216a(this.f6452f, serviceConsentTemplate.f6452f) && this.f6453g == serviceConsentTemplate.f6453g && Intrinsics.m6216a(this.f6454h, serviceConsentTemplate.f6454h) && Intrinsics.m6216a(this.f6455i, serviceConsentTemplate.f6455i) && Intrinsics.m6216a(this.f6456j, serviceConsentTemplate.f6456j) && Intrinsics.m6216a(this.f6457k, serviceConsentTemplate.f6457k);
                }

                @Override // p000.InterfaceC0972gz
                public final String getDescription() {
/* 1 */             return this.f6452f;
                }

                public final int hashCode() {
/* 2 */             Boolean bool = this.f6447a;
/* 14 */            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
/* 15 */            Boolean bool2 = this.f6448b;
/* 35 */            int iM7485h = pm2.m7485h(pm2.m7485h((iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f6449c), 31, this.f6450d);
/* 39 */            String str = this.f6451e;
/* 50 */            int iHashCode2 = (iM7485h + (str == null ? 0 : str.hashCode())) * 31;
/* 51 */            String str2 = this.f6452f;
/* 71 */            int iM1861b = AbstractC0298j.m1861b(AbstractC0886en.m3504h((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f6453g), 31, this.f6454h);
/* 75 */            Boolean bool3 = this.f6455i;
/* 86 */            int iHashCode3 = (iM1861b + (bool3 == null ? 0 : bool3.hashCode())) * 31;
/* 87 */            List list = this.f6456j;
/* 98 */            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
/* 99 */            Boolean bool4 = this.f6457k;
/* 108 */           return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ServiceConsentTemplate(isDeactivated=");
/* 10 */            sb.append(this.f6447a);
/* 15 */            sb.append(", defaultConsentStatus=");
/* 20 */            sb.append(this.f6448b);
/* 25 */            sb.append(", templateId=");
/* 36 */            fm0.m3796v(sb, this.f6449c, ", version=", this.f6450d, ", categorySlug=");
/* 47 */            fm0.m3796v(sb, this.f6451e, ", description=", this.f6452f, ", isHidden=");
/* 52 */            sb.append(this.f6453g);
/* 57 */            sb.append(", subConsents=");
/* 62 */            sb.append(this.f6454h);
/* 67 */            sb.append(", isAutoUpdateAllowed=");
/* 72 */            sb.append(this.f6455i);
/* 77 */            sb.append(", legalBasisList=");
/* 82 */            sb.append(this.f6456j);
/* 87 */            sb.append(", disableLegalBasis=");
/* 92 */            sb.append(this.f6457k);
/* 97 */            sb.append(")");
/* 100 */           return sb.toString();
                }
            }
