            package com.supercell.titan;

            import java.util.ArrayList;
            import java.util.Iterator;
            import p000.C1833kj;
            import p000.zx1;
            
            /* JADX INFO: renamed from: com.supercell.titan.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0800g {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ PurchaseManagerGoogle f6006a;

                public C0800g(PurchaseManagerGoogle purchaseManagerGoogle) {
/* 4 */             this.f6006a = purchaseManagerGoogle;
                }

                /* JADX INFO: renamed from: a */
                public final void m2753a(C1833kj c1833kj, ArrayList arrayList) {
/* 3 */             ArrayList arrayList2 = new ArrayList();
/* 8 */             if (c1833kj.f12818a == 0) {
/* 10 */                Iterator it = arrayList.iterator();
/* 18 */                while (it.hasNext()) {
/* 24 */                    zx1 zx1Var = (zx1) it.next();
/* 50 */                    PurchaseManager.ProductInfo productInfo = new PurchaseManager.ProductInfo(zx1Var.f20371g, zx1Var.f20370f, zx1Var.f20367c, zx1Var.f20368d, zx1Var.f20369e, zx1Var.m10449a().f19844a, zx1Var.m10449a().f19845b);
/* 59 */                    this.f6006a.f5879q.put(zx1Var.f20367c, productInfo);
/* 68 */                    this.f6006a.f5880r.put(zx1Var.f20367c, zx1Var);
/* 71 */                    arrayList2.add(productInfo);
                        }
                    } else {
/* 97 */                String str = "Google BillingClient queryProductDetailsAsync failed with responseCode:" + c1833kj.f12818a + " message:" + c1833kj.f12819b;
/* 103 */               this.f6006a.f5859e = str;
/* 113 */               if (SentryTitan.f5920a.nextInt(1000) <= 0) {
/* 115 */                   SentryTitan.m2746b(str);
                        }
                    }
                    synchronized (this.f6006a.f5858d) {
/* 127 */               this.f6006a.f5858d.addAll(arrayList2);
                    }
/* 135 */           this.f6006a.f5858d.toString();
                }
            }
