            package com.usercentrics.sdk.models.settings;

            import androidx.core.app.NotificationCompat;
            import com.usercentrics.sdk.AdTechProvider;
            import com.usercentrics.sdk.UserDecision;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsCategory;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFFeature;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialPurpose;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFStack;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C1987o3;
            import p000.C2085pw;
            import p000.InterfaceC2071pi;
            import p000.f42;
            import p000.fm0;
            import p000.hl2;
            import p000.jl2;
            import p000.jp0;
            import p000.kl2;
            import p000.ll2;
            import p000.m61;
            import p000.ml2;
            import p000.nd0;
            import p000.ou1;
            import p000.xa2;
            import p000.ya2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0015\u0010\u001cJ\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u0015\u0010\u001fJ\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u0015\u0010\"J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b\u0015\u0010%J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b\u0015\u0010(J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b\u0015\u0010+J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b\u0015\u0010.J!\u00103\u001a\b\u0012\u0004\u0012\u0002020/2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u0002052\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/¢\u0006\u0004\b6\u00107¨\u00068"}, m6176d2 = {"com/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "serviceId", HttpUrl.FRAGMENT_ENCODE_SET, "isTCFDecision", "(Ljava/lang/String;)Z", "Lhl2;", "tcfServiceType", "(Ljava/lang/String;)Lhl2;", "isGDPRDecision", "Lpi;", "serviceType", "matchesServiceType", "(Ljava/lang/String;Lpi;)Z", "actualServiceId", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;", "category", "id", "(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;)Ljava/lang/String;", "Lm61;", NotificationCompat.CATEGORY_SERVICE, "(Lm61;)Ljava/lang/String;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;", "vendor", "(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;)Ljava/lang/String;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;", "stack", "(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;)Ljava/lang/String;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;", "specialFeature", "(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;)Ljava/lang/String;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;", "purpose", "(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;)Ljava/lang/String;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;", "specialPurpose", "(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;)Ljava/lang/String;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature;", "feature", "(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature;)Ljava/lang/String;", "Lcom/usercentrics/sdk/AdTechProvider;", "adTechProvider", "(Lcom/usercentrics/sdk/AdTechProvider;)Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "Lou1;", "userDecisions", "Lcom/usercentrics/sdk/UserDecision;", "userDecisionsGDPR", "(Ljava/util/List;)Ljava/util/List;", "Lml2;", "userDecisionsTCF", "(Ljava/util/List;)Lml2;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
/* 3 */     public final class ServicesIdStrategy$Companion {
                public /* synthetic */ ServicesIdStrategy$Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */             this();
                }

                private final String actualServiceId(String serviceId) {
/* 9 */             List listM6235K = StringsKt.m6235K(serviceId, new char[]{'='});
/* 17 */            if (1 <= C2085pw.m7565d(listM6235K)) {
/* 23 */                return (String) listM6235K.get(1);
                    }
/* 28 */            f42.m3656l("invalid id");
/* 31 */            return null;
                }

                private final boolean isGDPRDecision(String serviceId) {
/* 8 */             for (jp0 jp0Var : jp0.values()) {
/* 18 */                if (ya2.Companion.matchesServiceType(serviceId, jp0Var)) {
/* 20 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                private final boolean isTCFDecision(String serviceId) {
                    return tcfServiceType(serviceId) != null;
                }

                private final boolean matchesServiceType(String serviceId, InterfaceC2071pi serviceType) {
/* 6 */             return C1852e.m6263m(serviceId, serviceType.getPrefix(), false);
                }

                private final hl2 tcfServiceType(String serviceId) {
/* 7 */             for (hl2 hl2Var : hl2.values()) {
/* 17 */                if (ya2.Companion.matchesServiceType(serviceId, hl2Var)) {
/* 19 */                    return hl2Var;
                        }
                    }
/* 23 */            return null;
                }

                /* JADX INFO: renamed from: id */
                public final String m2778id(UsercentricsCategory category) {
/* 1 */             category.getClass();
/* 4 */             jp0[] jp0VarArr = jp0.f12415b;
/* 10 */            return AbstractC0886en.m3507k("Category=", category.f6533a);
                }

                public final List<UserDecision> userDecisionsGDPR(List<ou1> userDecisions) {
/* 1 */             userDecisions.getClass();
/* 6 */             ArrayList<ou1> arrayList = new ArrayList();
/* 17 */            for (Object obj : userDecisions) {
/* 34 */                if (ya2.Companion.isGDPRDecision(((ou1) obj).f14901a)) {
/* 36 */                    arrayList.add(obj);
                        }
                    }
/* 42 */            ArrayList arrayList2 = new ArrayList();
/* 53 */            for (ou1 ou1Var : arrayList) {
/* 69 */                Boolean bool = (Boolean) ou1Var.f14902b.get("consent");
/* 91 */                UserDecision userDecision = bool != null ? new UserDecision(ya2.Companion.actualServiceId(ou1Var.f14901a), bool.booleanValue()) : null;
/* 92 */                if (userDecision != null) {
/* 94 */                    arrayList2.add(userDecision);
                        }
                    }
/* 98 */            return arrayList2;
                }

                public final ml2 userDecisionsTCF(List<ou1> userDecisions) {
/* 1 */             userDecisions.getClass();
/* 6 */             ArrayList<ou1> arrayList = new ArrayList();
/* 17 */            for (Object obj : userDecisions) {
/* 34 */                if (ya2.Companion.isTCFDecision(((ou1) obj).f14901a)) {
/* 36 */                    arrayList.add(obj);
                        }
                    }
/* 44 */            if (arrayList.isEmpty()) {
/* 48 */                nd0 nd0Var = nd0.f14189a;
/* 50 */                return new ml2(nd0Var, nd0Var, nd0Var, nd0Var);
                    }
/* 56 */            ArrayList arrayList2 = new ArrayList();
/* 61 */            ArrayList arrayList3 = new ArrayList();
/* 66 */            ArrayList arrayList4 = new ArrayList();
/* 71 */            ArrayList arrayList5 = new ArrayList();
/* 82 */            for (ou1 ou1Var : arrayList) {
/* 90 */                ServicesIdStrategy$Companion servicesIdStrategy$Companion = ya2.Companion;
/* 92 */                String str = ou1Var.f14901a;
/* 94 */                Map map = ou1Var.f14902b;
/* 100 */               int i = Integer.parseInt(servicesIdStrategy$Companion.actualServiceId(str));
/* 106 */               hl2 hl2VarTcfServiceType = servicesIdStrategy$Companion.tcfServiceType(ou1Var.f14901a);
/* 120 */               int i2 = hl2VarTcfServiceType == null ? -1 : xa2.f19008a[hl2VarTcfServiceType.ordinal()];
/* 127 */               if (i2 == 1) {
/* 219 */                   arrayList4.add(new ll2(i, (Boolean) map.get("consent"), (Boolean) map.get("legitimateInterest")));
                        } else if (i2 == 2) {
/* 189 */                   Boolean bool = (Boolean) map.get("consent");
/* 191 */                   kl2 kl2Var = new kl2();
/* 194 */                   kl2Var.f12874a = i;
/* 196 */                   kl2Var.f12875b = bool;
/* 198 */                   arrayList3.add(kl2Var);
                        } else if (i2 == 3) {
/* 179 */                   arrayList2.add(new jl2(i, (Boolean) map.get("consent"), (Boolean) map.get("legitimateInterest")));
                        } else if (i2 == 4) {
/* 145 */                   Boolean bool2 = (Boolean) map.get("consent");
/* 158 */                   arrayList5.add(new C1987o3(i, bool2 != null ? bool2.booleanValue() : false));
                        }
                    }
/* 226 */           return new ml2(arrayList2, arrayList3, arrayList4, arrayList5);
                }

/* 4 */         private ServicesIdStrategy$Companion() {
                }

                /* JADX INFO: renamed from: id */
/* 14 */        public final String m2779id(m61 service) {
                    service.getClass();
/* 15 */            jp0[] jp0VarArr = jp0.f12415b;
/* 18 */            return AbstractC0886en.m3507k("Service=", service.f13580f);
                }

                /* JADX INFO: renamed from: id */
/* 18 */        public final String m2777id(TCFVendor vendor) {
                    vendor.getClass();
/* 19 */            hl2[] hl2VarArr = hl2.f9135b;
/* 22 */            return fm0.m3781g(vendor.f6209d, "TCFVendor=");
                }

                /* JADX INFO: renamed from: id */
/* 22 */        public final String m2776id(TCFStack stack) {
                    stack.getClass();
/* 23 */            hl2[] hl2VarArr = hl2.f9135b;
/* 26 */            return fm0.m3781g(stack.f6201b, "TCFStack=");
                }

                /* JADX INFO: renamed from: id */
/* 26 */        public final String m2774id(TCFSpecialFeature specialFeature) {
                    specialFeature.getClass();
/* 27 */            hl2[] hl2VarArr = hl2.f9135b;
/* 30 */            return fm0.m3781g(specialFeature.f6188c, "TCFSpecialFeature=");
                }

                /* JADX INFO: renamed from: id */
/* 30 */        public final String m2773id(TCFPurpose purpose) {
                    purpose.getClass();
/* 31 */            hl2[] hl2VarArr = hl2.f9135b;
/* 34 */            return fm0.m3781g(purpose.f6176c, "TCFPurpose=");
                }

                /* JADX INFO: renamed from: id */
/* 34 */        public final String m2775id(TCFSpecialPurpose specialPurpose) {
                    specialPurpose.getClass();
/* 35 */            hl2[] hl2VarArr = hl2.f9135b;
/* 38 */            return fm0.m3781g(specialPurpose.f6197c, "TCFSpecialPurpose=");
                }

                /* JADX INFO: renamed from: id */
/* 38 */        public final String m2772id(TCFFeature feature) {
                    feature.getClass();
/* 39 */            hl2[] hl2VarArr = hl2.f9135b;
/* 42 */            return fm0.m3781g(feature.f6171c, "TCFFeature=");
                }

                /* JADX INFO: renamed from: id */
/* 42 */        public final String m2771id(AdTechProvider adTechProvider) {
                    adTechProvider.getClass();
/* 43 */            hl2[] hl2VarArr = hl2.f9135b;
/* 46 */            return fm0.m3781g(adTechProvider.f6022a, "AdTechProvider=");
                }
            }
