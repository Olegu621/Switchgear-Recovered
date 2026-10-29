            package com.supercell.titan;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import p000.C1833kj;
            import p000.ve2;
            
            /* JADX INFO: renamed from: com.supercell.titan.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0801h {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ PurchaseManagerGoogle f6007a;

                public C0801h(PurchaseManagerGoogle purchaseManagerGoogle) {
/* 4 */             this.f6007a = purchaseManagerGoogle;
                }

                /* JADX INFO: renamed from: a */
                public final void m2754a(C1833kj c1833kj, List list) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             if (c1833kj.f12818a == 0) {
/* 10 */                Iterator it = list.iterator();
/* 18 */                while (it.hasNext()) {
/* 24 */                    ve2 ve2Var = (ve2) it.next();
/* 95 */                    PurchaseManager.ProductInfo productInfo = new PurchaseManager.ProductInfo(ve2Var.f18024b.optString("description"), ve2Var.f18024b.optString("title").substring(0, ve2Var.f18024b.optString("title").lastIndexOf("(")), ve2Var.m9259a(), ve2Var.m9260b(), ve2Var.f18024b.optString("title"), ve2Var.f18024b.optString(FirebaseAnalytics.Param.PRICE), ve2Var.f18024b.optString("price_currency_code"));
/* 106 */                   this.f6007a.f5879q.put(ve2Var.m9259a(), productInfo);
/* 117 */                   this.f6007a.f5881s.put(ve2Var.m9259a(), ve2Var);
/* 120 */                   arrayList.add(productInfo);
                        }
                    } else {
/* 152 */               this.f6007a.f5859e = "Google BillingClient querySkuDetailsAsync failed with responseCode:" + c1833kj.f12818a + " message:" + c1833kj.f12819b;
/* 162 */               if (SentryTitan.f5920a.nextInt(100) <= 0) {
/* 168 */                   SentryTitan.m2746b(this.f6007a.f5859e);
                        }
                    }
                    synchronized (this.f6007a.f5858d) {
/* 180 */               this.f6007a.f5858d.addAll(arrayList);
                    }
/* 188 */           this.f6007a.f5858d.toString();
                }
            }
