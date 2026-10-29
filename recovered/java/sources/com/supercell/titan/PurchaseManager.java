            package com.supercell.titan;

            import android.content.Intent;
            import com.google.android.gms.internal.play_billing.zzbe;
            import com.google.android.gms.internal.play_billing.zzco;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.internal.play_billing.zzjx;
            import com.google.android.gms.internal.play_billing.zzjz;
            import com.google.android.gms.internal.play_billing.zzkb;
            import com.google.android.gms.internal.play_billing.zzkd;
            import com.google.android.gms.internal.play_billing.zzke;
            import com.google.android.gms.internal.play_billing.zzki;
            import com.google.android.gms.internal.play_billing.zzky;
            import com.google.android.gms.internal.play_billing.zzlb;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Set;
            import java.util.Vector;
            import okhttp3.HttpUrl;
            import p000.C0210cb;
            import p000.C0832d5;
            import p000.C0882ej;
            import p000.C0993hj;
            import p000.C1833kj;
            import p000.C1951n4;
            import p000.dc0;
            import p000.ds0;
            import p000.er0;
            import p000.fs0;
            import p000.g02;
            import p000.if3;
            import p000.kf3;
            import p000.ra2;
            import p000.ru1;
            import p000.ve2;
            import p000.we2;
            import p000.zx1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 280 */   public abstract class PurchaseManager {

                /* JADX INFO: renamed from: n */
                public static PurchaseManagerGoogle f5854n;

                /* JADX INFO: renamed from: h */
                public int f5862h;

                /* JADX INFO: renamed from: k */
                public String f5865k;

                /* JADX INFO: renamed from: m */
                public boolean f5867m;

                /* JADX INFO: renamed from: a */
                public final Vector f5855a = new Vector();

                /* JADX INFO: renamed from: b */
                public final Vector f5856b = new Vector();

                /* JADX INFO: renamed from: c */
                public final Vector f5857c = new Vector();

                /* JADX INFO: renamed from: d */
                public final ArrayList f5858d = new ArrayList();

                /* JADX INFO: renamed from: e */
                public String f5859e = HttpUrl.FRAGMENT_ENCODE_SET;

                /* JADX INFO: renamed from: f */
                public int f5860f = -1;

                /* JADX INFO: renamed from: g */
                public final LinkedHashMap f5861g = new LinkedHashMap();

                /* JADX INFO: renamed from: i */
                public final Vector f5863i = new Vector();

                /* JADX INFO: renamed from: j */
                public final Set f5864j = Collections.synchronizedSet(new HashSet());

                /* JADX INFO: renamed from: l */
                public boolean f5866l = true;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class BillingProductFailed {
                    public int errorCode;
                    public String productID = HttpUrl.FRAGMENT_ENCODE_SET;
                    public String localizedDescription = HttpUrl.FRAGMENT_ENCODE_SET;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Product {

                    /* JADX INFO: renamed from: id */
                    public String f5868id;
                    public ProductType type;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ProductInfo {

                    /* JADX INFO: renamed from: a */
                    public final String f5869a;

                    /* JADX INFO: renamed from: b */
                    public final String f5870b;

                    /* JADX INFO: renamed from: c */
                    public final String f5871c;

                    /* JADX INFO: renamed from: d */
                    public final String f5872d;

                    /* JADX INFO: renamed from: e */
                    public final String f5873e;

                    /* JADX INFO: renamed from: f */
                    public final String f5874f;

                    /* JADX INFO: renamed from: g */
                    public final String f5875g;

                    public ProductInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
/* 4 */                 this.f5869a = str;
/* 6 */                 this.f5870b = str2;
/* 8 */                 this.f5871c = str3;
/* 10 */                this.f5872d = str4;
/* 12 */                this.f5873e = str5;
/* 14 */                this.f5874f = str6;
/* 16 */                this.f5875g = str7;
                    }

                    public String getCurrencyCode() {
/* 1 */                 return this.f5875g;
                    }

                    public String getDescription() {
/* 1 */                 return this.f5869a;
                    }

                    public String getFormattedPrice() {
/* 1 */                 return this.f5874f;
                    }

                    public String getId() {
/* 1 */                 return this.f5871c;
                    }

                    public String getName() {
/* 1 */                 return this.f5870b;
                    }

                    public String getTitle() {
/* 1 */                 return this.f5873e;
                    }

                    public String getType() {
/* 1 */                 return this.f5872d;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum ProductType {
                    IN_APP("inapp"),
                    SUBSCRIPTION("subs");

                    public String name;

                    ProductType(String str) {
/* 4 */                 this.name = str;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class PurchaseInfo {
                    public Object customData;
                    public String receipt = HttpUrl.FRAGMENT_ENCODE_SET;
                    public String productID = HttpUrl.FRAGMENT_ENCODE_SET;
                    public String transactionId = HttpUrl.FRAGMENT_ENCODE_SET;
                    public String signature = HttpUrl.FRAGMENT_ENCODE_SET;
                    public String purchaseToken = HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public PurchaseManager() {
/* 69 */            f5854n = (PurchaseManagerGoogle) this;
                }

                public static void addProduct(String str, boolean z) {
/* 9 */             if (f5854n.f5861g.containsKey(str)) {
/* 34 */                return;
                    }
/* 16 */            ProductType productType = z ? ProductType.SUBSCRIPTION : ProductType.IN_APP;
/* 20 */            LinkedHashMap linkedHashMap = f5854n.f5861g;
/* 24 */            Product product = new Product();
/* 27 */            product.f5868id = str;
/* 29 */            product.type = productType;
/* 31 */            linkedHashMap.put(str, product);
                }

                public static boolean arePaymentsAvailable() {
/* 1 */             PurchaseManagerGoogle purchaseManagerGoogle = f5854n;
                    return purchaseManagerGoogle != null && purchaseManagerGoogle.f5883u.f12818a == 0;
                }

                public static native void billingProductBought(String str, String str2, String str3, String str4, String str5);

                public static native void billingProductCanceled(String str);

                public static native void billingProductFailed(String str, String str2, int i);

                public static native void billingSetMarketplace(String str);

                public static void buyProduct(String str) {
/* 1 */             PurchaseManagerGoogle purchaseManagerGoogle = f5854n;
/* 7 */             if (purchaseManagerGoogle.f5883u.f12818a != 0) {
/* 13 */                AbstractC1245n0.m4889q("PurchaseManagerGoogle", "buyProductImplementation when billingInitResult != OK");
/* 16 */                return;
                    }
/* 23 */            zx1 zx1Var = (zx1) purchaseManagerGoogle.f5880r.get(str);
/* 25 */            int i = 19;
/* 27 */            if (zx1Var == null) {
/* 35 */                ve2 ve2Var = (ve2) purchaseManagerGoogle.f5881s.get(str);
/* 37 */                if (ve2Var == null) {
/* 43 */                    AbstractC1245n0.m4889q("PurchaseManagerGoogle", "buyProductImplementation: cannot find ProductDetails");
/* 46 */                    return;
                        }
/* 51 */                purchaseManagerGoogle.f5882t = ve2Var.m9259a();
                        synchronized (purchaseManagerGoogle) {
/* 58 */                    purchaseManagerGoogle.f5862h++;
                        }
/* 63 */                ra2 ra2Var = new ra2();
/* 71 */                ra2Var.f15958d = new dc0(i);
/* 75 */                ArrayList arrayList = new ArrayList();
/* 78 */                arrayList.add(ve2Var);
/* 81 */                ra2Var.f15957c = arrayList;
/* 83 */                String str2 = purchaseManagerGoogle.f5886x;
/* 85 */                if (str2 != null && !str2.isEmpty()) {
/* 95 */                    ra2Var.f15955a = purchaseManagerGoogle.f5886x;
                        }
/* 107 */               C1833kj c1833kjMo3452d = purchaseManagerGoogle.f5878p.mo3452d(GameApp.getInstance(), ra2Var.m8102b());
/* 113 */               if (c1833kjMo3452d.f12818a != 0) {
/* 117 */                   BillingProductFailed billingProductFailed = new BillingProductFailed();
/* 124 */                   billingProductFailed.productID = ve2Var.m9259a();
/* 128 */                   billingProductFailed.errorCode = c1833kjMo3452d.f12818a;
/* 130 */                   return;
                        }
/* 278 */               return;
                    }
/* 136 */           purchaseManagerGoogle.f5882t = zx1Var.f20367c;
                    synchronized (purchaseManagerGoogle) {
/* 143 */               purchaseManagerGoogle.f5862h++;
                    }
/* 148 */           ra2 ra2Var2 = new ra2();
/* 156 */           ra2Var2.f15958d = new dc0(i);
/* 163 */           C0210cb c0210cb = new C0210cb(9, false);
/* 166 */           c0210cb.f2804b = zx1Var;
/* 172 */           if (zx1Var.m10449a() != null) {
/* 178 */               zx1Var.m10449a().getClass();
/* 185 */               String str3 = zx1Var.m10449a().f19846c;
/* 187 */               if (str3 != null) {
/* 189 */                   c0210cb.f2805c = str3;
                        }
                    }
/* 197 */           zzbe.zzc((zx1) c0210cb.f2804b, "ProductDetails is required for constructing ProductDetailsParams.");
/* 206 */           if (((zx1) c0210cb.f2804b).f20374j != null) {
/* 214 */               zzbe.zzc((String) c0210cb.f2805c, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                    }
/* 231 */           ra2Var2.f15956b = new ArrayList(Collections.singletonList(new C0993hj(c0210cb)));
/* 233 */           String str4 = purchaseManagerGoogle.f5886x;
/* 235 */           if (str4 != null && !str4.isEmpty()) {
/* 245 */               ra2Var2.f15955a = purchaseManagerGoogle.f5886x;
                    }
/* 257 */           C1833kj c1833kjMo3452d2 = purchaseManagerGoogle.f5878p.mo3452d(GameApp.getInstance(), ra2Var2.m8102b());
/* 263 */           if (c1833kjMo3452d2.f12818a != 0) {
/* 267 */               BillingProductFailed billingProductFailed2 = new BillingProductFailed();
/* 272 */               billingProductFailed2.productID = zx1Var.f20367c;
/* 276 */               billingProductFailed2.errorCode = c1833kjMo3452d2.f12818a;
                    }
                }

                public static void cppBillingCreated() {
/* 4 */             f5854n.f5867m = true;
                }

                public static void cppBillingDestroyed() {
/* 4 */             f5854n.f5867m = false;
                }

                public static void dismissTransaction(String str) {
/* 1 */             PurchaseManagerGoogle purchaseManagerGoogle = f5854n;
/* 3 */             Vector vector = purchaseManagerGoogle.f5855a;
/* 5 */             Vector vector2 = purchaseManagerGoogle.f5863i;
/* 7 */             if (str == null || str.isEmpty()) {
/* 77 */                return;
                    }
/* 18 */            purchaseManagerGoogle.f5864j.add(str);
/* 27 */            for (int size = vector2.size() - 1; size >= 0; size--) {
/* 41 */                if (str.equals(((PurchaseInfo) vector2.get(size)).transactionId)) {
/* 43 */                    vector2.remove(size);
                        }
                    }
/* 55 */            for (int size2 = vector.size() - 1; size2 >= 0; size2--) {
/* 69 */                if (str.equals(((PurchaseInfo) vector.get(size2)).transactionId)) {
/* 71 */                    vector.remove(size2);
                        }
                    }
                }

                public static void finishTransaction(String str) {
/* 1 */             PurchaseManagerGoogle purchaseManagerGoogle = f5854n;
/* 3 */             Vector vector = purchaseManagerGoogle.f5863i;
/* 10 */            for (int i = 0; i < vector.size(); i++) {
/* 16 */                PurchaseInfo purchaseInfo = (PurchaseInfo) vector.get(i);
/* 24 */                if (str.equals(purchaseInfo.transactionId)) {
/* 26 */                    vector.remove(i);
/* 33 */                    if (purchaseManagerGoogle.f5883u.f12818a == 0) {
/* 35 */                        String str2 = purchaseInfo.purchaseToken;
/* 37 */                        if (str2 == null) {
/* 62 */                            C1951n4.m6859j("Purchase token must be set");
/* 65 */                            return;
                                }
/* 42 */                        C0832d5 c0832d5 = new C0832d5(4);
/* 45 */                        c0832d5.f6995b = str2;
/* 56 */                        purchaseManagerGoogle.f5878p.mo3450b(c0832d5, new ds0(22));
/* 59 */                        return;
                            }
/* 65 */                    return;
                        }
                    }
/* 73 */            AbstractC1245n0.m4876d("PurchaseManagerGoogle", "Finishing unknown transaction");
                }

                public static ProductInfo getProductDetails(String str) {
/* 3 */             return f5854n.getProductDetailsImplementation(str);
                }

                public static boolean isWaitingForTransaction() {
                    boolean z;
/* 1 */             PurchaseManagerGoogle purchaseManagerGoogle = f5854n;
                    synchronized (purchaseManagerGoogle) {
/* 11 */                z = purchaseManagerGoogle.f5862h > 0;
                    }
/* 20 */            boolean z2 = (!purchaseManagerGoogle.f5863i.isEmpty()) | z;
/* 21 */            if (z2) {
/* 23 */                PurchaseManagerGoogle purchaseManagerGoogle2 = f5854n;
/* 25 */                int i = purchaseManagerGoogle2.f5862h;
/* 29 */                purchaseManagerGoogle2.f5863i.size();
                    }
/* 32 */            return z2;
                }

                public static void refreshPendingPurchases() {
/* 4 */             f5854n.m2742b(false);
                }

                public static void resetActiveTransactions() {
/* 1 */             PurchaseManagerGoogle purchaseManagerGoogle = f5854n;
/* 4 */             purchaseManagerGoogle.f5862h = 0;
/* 10 */            purchaseManagerGoogle.f5855a.addAll(purchaseManagerGoogle.f5863i);
/* 17 */            f5854n.f5863i.clear();
                }

                public static void setAccountId(String str, String str2) {
/* 3 */             String str3 = f5854n.f5865k;
/* 5 */             if (str3 != null ? !str3.equals(str) : str != null) {
/* 20 */                f5854n.f5864j.clear();
/* 25 */                f5854n.f5865k = str;
                    }
/* 29 */            f5854n.f5886x = str;
                }

                public static void startBillingTransactions() {
/* 1 */             PurchaseManagerGoogle purchaseManagerGoogle = f5854n;
/* 5 */             if (purchaseManagerGoogle.f5866l) {
/* 24 */                return;
                    }
/* 8 */             purchaseManagerGoogle.f5866l = true;
/* 14 */            purchaseManagerGoogle.f5855a.addAll(purchaseManagerGoogle.f5863i);
/* 21 */            f5854n.f5863i.clear();
                }

                public static void stopBillingTransactions() {
/* 4 */             f5854n.f5866l = false;
                }

                public static native void updateBillingProductDetails(ProductInfo[] productInfoArr, String str, int i);

                public static void updateDetails() {
                    C1833kj c1833kj;
                    zzkd zzkdVar;
                    zzjz zzjzVar;
                    ArrayList arrayList;
/* 1 */             PurchaseManagerGoogle purchaseManagerGoogle = f5854n;
/* 3 */             C0882ej c0882ej = purchaseManagerGoogle.f5878p;
/* 10 */            if (purchaseManagerGoogle.f5883u.f12818a != 0) {
/* 32 */                AbstractC1245n0.m4889q("PurchaseManagerGoogle", "updateDetailsImplementation() when billingInitResult.getResponseCode() ==" + purchaseManagerGoogle.f5883u.f12818a);
/* 37 */                purchaseManagerGoogle.f5858d.clear();
/* 42 */                purchaseManagerGoogle.f5859e = "No Billing service available";
/* 46 */                int i = purchaseManagerGoogle.f5883u.f12818a;
/* 48 */                if (i == 2 || i == 12) {
/* 62 */                    purchaseManagerGoogle.f5860f = -101;
/* 64 */                    return;
                        } else {
/* 57 */                    purchaseManagerGoogle.f5860f = -100;
/* 59 */                    return;
                        }
                    }
/* 70 */            Object obj = null;
/* 71 */            if (c0882ej.m3451c()) {
/* 89 */                C1833kj c1833kj2 = kf3.f12723a;
/* 98 */                c1833kj = c0882ej.f7722r ? kf3.f12731i : kf3.f12737o;
/* 108 */               if (c1833kj.f12818a != 0) {
/* 110 */                   int i2 = if3.f9580a;
                            try {
/* 112 */                       zzjx zzjxVarZzc = zzjz.zzc();
/* 116 */                       zzke zzkeVarZzc = zzki.zzc();
/* 122 */                       zzkeVarZzc.zzn(c1833kj.f12818a);
/* 127 */                       zzkeVarZzc.zzm(c1833kj.f12819b);
/* 132 */                       zzkeVarZzc.zzo(20);
/* 135 */                       zzjxVarZzc.zza(zzkeVarZzc);
/* 138 */                       zzjxVarZzc.zzn(5);
/* 141 */                       zzky zzkyVarZzc = zzlb.zzc();
/* 145 */                       zzkyVarZzc.zza(10);
/* 154 */                       zzjxVarZzc.zzm((zzlb) zzkyVarZzc.zzf());
/* 161 */                       zzjzVar = (zzjz) zzjxVarZzc.zzf();
                            } catch (Exception e) {
/* 165 */                       zze.zzm("BillingLogger", "Unable to create logging payload", e);
/* 168 */                       zzjzVar = null;
                            }
/* 169 */                   c0882ej.m3459m(zzjzVar);
                        } else {
/* 173 */                   int i3 = if3.f9580a;
                            try {
/* 175 */                       zzkb zzkbVarZzc = zzkd.zzc();
/* 179 */                       zzkbVarZzc.zzn(5);
/* 182 */                       zzky zzkyVarZzc2 = zzlb.zzc();
/* 186 */                       zzkyVarZzc2.zza(10);
/* 195 */                       zzkbVarZzc.zza((zzlb) zzkyVarZzc2.zzf());
/* 202 */                       zzkdVar = (zzkd) zzkbVarZzc.zzf();
                            } catch (Exception e2) {
/* 206 */                       zze.zzm("BillingLogger", "Unable to create logging payload", e2);
/* 209 */                       zzkdVar = null;
                            }
/* 210 */                   c0882ej.m3460n(zzkdVar);
                        }
                    } else {
/* 73 */                c1833kj = kf3.f12732j;
/* 77 */                if (c1833kj.f12818a != 0) {
/* 79 */                    c0882ej.m3470x(2, 5, c1833kj);
                        } else {
/* 84 */                    c0882ej.m3472z(5);
                        }
                    }
/* 213 */           int i4 = c1833kj.f12818a;
/* 215 */           LinkedHashMap linkedHashMap = purchaseManagerGoogle.f5861g;
/* 217 */           if (i4 != 0) {
/* 441 */               Collection<Product> collectionValues = linkedHashMap.values();
/* 449 */               Integer.toString(collectionValues.size());
/* 454 */               List listSingletonList = Collections.singletonList(ProductType.IN_APP);
/* 460 */               ArrayList arrayList2 = new ArrayList();
/* 471 */               for (Product product : collectionValues) {
/* 485 */                   if (listSingletonList.contains(product.type)) {
/* 489 */                       arrayList2.add(product.f5868id);
                            }
                        }
/* 497 */               if (arrayList2.isEmpty()) {
/* 510 */                   arrayList = null;
                        } else {
/* 507 */                   obj = "inapp";
/* 501 */                   arrayList = new ArrayList(arrayList2);
                        }
/* 511 */               if (obj == null) {
/* 542 */                   C1951n4.m6859j("SKU type must be set");
/* 545 */                   return;
                        }
/* 513 */               if (arrayList == null) {
/* 536 */                   C1951n4.m6859j("SKU list must be set");
/* 539 */                   return;
                        }
/* 518 */               we2 we2Var = new we2(0);
/* 521 */               we2Var.f18596c = obj;
/* 523 */               we2Var.f18595b = arrayList;
/* 530 */               c0882ej.mo3454f(we2Var, new C0801h(purchaseManagerGoogle));
/* 533 */               return;
                    }
/* 219 */           Collection<Product> collectionValues2 = linkedHashMap.values();
/* 227 */           Integer.toString(collectionValues2.size());
/* 238 */           List listAsList = Arrays.asList(ProductType.IN_APP, ProductType.SUBSCRIPTION);
/* 248 */           ArrayList<g02> arrayList3 = new ArrayList(collectionValues2.size());
/* 259 */           for (Product product2 : collectionValues2) {
/* 273 */               if (listAsList.contains(product2.type)) {
/* 277 */                   ru1 ru1Var = new ru1();
/* 282 */                   ru1Var.f16297a = product2.f5868id;
/* 286 */                   String str = product2.type.name;
/* 288 */                   ru1Var.f16298b = str;
/* 296 */                   if ("first_party".equals(str)) {
/* 329 */                       C1951n4.m6859j("Serialized doc id must be provided for first party products.");
/* 332 */                       return;
                            } else if (ru1Var.f16297a == null) {
/* 323 */                       C1951n4.m6859j("Product id must be provided.");
/* 326 */                       return;
                            } else {
/* 304 */                       if (ru1Var.f16298b == null) {
/* 317 */                           C1951n4.m6859j("Product type must be provided.");
/* 320 */                           return;
                                }
/* 311 */                       arrayList3.add(new g02(ru1Var));
                            }
                        }
                    }
/* 337 */           er0 er0Var = new er0(11);
/* 344 */           if (!arrayList3.isEmpty()) {
/* 350 */               if (arrayList3.isEmpty()) {
/* 411 */                   C1951n4.m6859j("Product list cannot be empty.");
/* 414 */                   return;
                        }
/* 354 */               HashSet hashSet = new HashSet();
/* 365 */               for (g02 g02Var : arrayList3) {
/* 381 */                   if (!"play_pass_subs".equals(g02Var.f8425b)) {
/* 385 */                       hashSet.add(g02Var.f8425b);
                            }
                        }
/* 394 */               if (hashSet.size() > 1) {
/* 405 */                   C1951n4.m6859j("All products should be of the same product type.");
/* 408 */                   return;
                        }
/* 400 */               er0Var.f7853b = zzco.zzk(arrayList3);
                    }
/* 419 */           if (((zzco) er0Var.f7853b) != null) {
/* 431 */               c0882ej.mo3453e(new fs0(er0Var), new C0800g(purchaseManagerGoogle));
                    } else {
/* 437 */               C1951n4.m6859j("Product list must be set to a non empty list.");
                    }
                }

                public void doSignInAfterGoogleLogin() {
                }

                public String getProductType(String str) {
/* 7 */             Product product = (Product) this.f5861g.get(str);
/* 13 */            return (product != null ? product.type : ProductType.IN_APP).name;
                }

                public int getProductsCount() {
/* 3 */             return this.f5861g.size();
                }

                public void onActivityResult(int i, int i2, Intent intent) {
                }

                public void onDestroy() {
/* 2 */             f5854n = null;
                }

                public void onPause() {
                }

                public void onResume() {
                }

                public void updateBeforeFrame() {
/* 3 */             if (this.f5867m) {
/* 9 */                 if (this.f5859e == null) {
/* 13 */                    this.f5859e = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 22 */                if (!this.f5858d.isEmpty() || !this.f5859e.isEmpty()) {
/* 39 */                    if (this.f5859e.isEmpty()) {
                                synchronized (this.f5858d) {
/* 56 */                            updateBillingProductDetails((ProductInfo[]) this.f5858d.toArray(new ProductInfo[0]), HttpUrl.FRAGMENT_ENCODE_SET, -1);
/* 61 */                            this.f5858d.clear();
                                }
                            } else {
/* 75 */                        updateBillingProductDetails(new ProductInfo[0], this.f5859e, this.f5860f);
                            }
/* 80 */                    this.f5859e = HttpUrl.FRAGMENT_ENCODE_SET;
/* 82 */                    this.f5860f = -1;
                        }
/* 86 */                if (this.f5866l) {
/* 90 */                    int size = this.f5855a.size();
/* 95 */                    for (int i = 0; i < size; i++) {
/* 103 */                       PurchaseInfo purchaseInfo = (PurchaseInfo) this.f5855a.remove(0);
/* 105 */                       if (purchaseInfo != null) {
/* 118 */                           billingProductBought(purchaseInfo.transactionId, purchaseInfo.productID, purchaseInfo.receipt, purchaseInfo.signature, purchaseInfo.purchaseToken);
/* 121 */                           Vector vector = this.f5863i;
/* 131 */                           if (!this.f5864j.contains(purchaseInfo.transactionId)) {
/* 139 */                               for (int i2 = 0; i2 < vector.size(); i2++) {
/* 155 */                                   if (((PurchaseInfo) vector.get(i2)).transactionId.equals(purchaseInfo.transactionId)) {
/* 157 */                                       vector.remove(i2);
                                                break;
                                            }
                                        }
/* 170 */                               if (vector.size() >= 100) {
/* 172 */                                   vector.remove(0);
                                        }
/* 180 */                               for (int i3 = 0; i3 < vector.size(); i3++) {
/* 196 */                                   if (((PurchaseInfo) vector.get(i3)).transactionId.equals(purchaseInfo.transactionId)) {
/* 198 */                                       vector.remove(i3);
                                                break;
                                            }
                                        }
/* 205 */                               vector.add(purchaseInfo);
                                    }
                                }
                            }
/* 213 */                   int size2 = this.f5856b.size();
/* 218 */                   for (int i4 = 0; i4 < size2; i4++) {
/* 226 */                       BillingProductFailed billingProductFailed = (BillingProductFailed) this.f5856b.remove(0);
/* 228 */                       if (billingProductFailed != null) {
/* 237 */                           billingProductFailed(billingProductFailed.productID, billingProductFailed.localizedDescription, billingProductFailed.errorCode);
                                }
                            }
/* 245 */                   int size3 = this.f5857c.size();
/* 250 */                   for (int i5 = 0; i5 < size3; i5++) {
/* 260 */                       billingProductCanceled((String) this.f5857c.remove(0));
                            }
                        }
                    }
                }

/* 281 */       public static void buyProduct(String str, String str2) {
                }
            }
