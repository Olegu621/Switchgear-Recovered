            package com.supercell.titan;

            import android.text.TextUtils;
            import com.google.android.gms.internal.play_billing.zzco;
            import com.google.android.gms.internal.play_billing.zze;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.Objects;
            import okhttp3.HttpUrl;
            import p000.C0218cj;
            import p000.C0882ej;
            import p000.C1795jj;
            import p000.C1833kj;
            import p000.C2357x6;
            import p000.dp0;
            import p000.ec0;
            import p000.fs0;
            import p000.kf3;
            import p000.ts0;
            import p000.yd3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PurchaseManagerGoogle extends PurchaseManager {
                public static final int PURCHASE_REQUEST_CODE = 10000004;

                /* JADX INFO: renamed from: o */
                public final fs0 f5877o;

                /* JADX INFO: renamed from: p */
                public final C0882ej f5878p;

                /* JADX INFO: renamed from: q */
                public final HashMap f5879q;

                /* JADX INFO: renamed from: r */
                public final HashMap f5880r;

                /* JADX INFO: renamed from: s */
                public final HashMap f5881s;

                /* JADX INFO: renamed from: t */
                public String f5882t;

                /* JADX INFO: renamed from: u */
                public C1833kj f5883u;

                /* JADX INFO: renamed from: v */
                public boolean f5884v;

                /* JADX INFO: renamed from: w */
                public boolean f5885w;

                /* JADX INFO: renamed from: x */
                public String f5886x;

                public PurchaseManagerGoogle(GameApp gameApp, String str) {
/* 8 */             fs0 fs0Var = new fs0(this, 8);
/* 11 */            this.f5877o = fs0Var;
/* 19 */            C0218cj c0218cj = new C0218cj(GameApp.getInstance());
/* 22 */            c0218cj.f2933c = fs0Var;
/* 31 */            c0218cj.f2932b = new ec0(23);
/* 33 */            C0882ej c0882ejM1696a = c0218cj.m1696a();
/* 37 */            this.f5878p = c0882ejM1696a;
/* 44 */            this.f5879q = new HashMap();
/* 51 */            this.f5880r = new HashMap();
/* 58 */            this.f5881s = new HashMap();
/* 62 */            this.f5882t = HttpUrl.FRAGMENT_ENCODE_SET;
/* 65 */            this.f5884v = false;
/* 67 */            this.f5885w = false;
/* 69 */            this.f5886x = HttpUrl.FRAGMENT_ENCODE_SET;
/* 71 */            C1795jj c1795jjM6120a = C1833kj.m6120a();
/* 76 */            c1795jjM6120a.f12324a = 3;
/* 80 */            c1795jjM6120a.f12325b = "onBillingServiceDisconnected";
/* 86 */            this.f5883u = c1795jjM6120a.m5841a();
/* 93 */            c0882ejM1696a.mo3455g(new ts0(this));
                }

                /* JADX INFO: renamed from: a */
                public static void m2741a(PurchaseManagerGoogle purchaseManagerGoogle, C1833kj c1833kj) {
/* 9 */             if (SentryTitan.f5920a.nextInt(1000) <= 0) {
/* 11 */                Locale locale = Locale.US;
/* 39 */                SentryTitan.m2746b("Google BillingClient billing result was unhandled with code: " + c1833kj.f12818a + " and message: " + c1833kj.f12819b);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m2742b(boolean z) {
/* 3 */             if (this.f5884v) {
/* 7 */                 if (this.f5885w || !z) {
/* 15 */                    if (this.f5883u.f12818a != 0) {
/* 136 */                       AbstractC1245n0.m4889q("PurchaseManagerGoogle", "getPendingPurchases() billingInitResult != BillingClient.BillingResponseCode.OK");
/* 139 */                       return;
                            }
/* 17 */                    fs0 fs0Var = this.f5877o;
/* 19 */                    Objects.requireNonNull(fs0Var);
/* 26 */                    C2357x6 c2357x6 = new C2357x6(fs0Var, 13);
/* 29 */                    C0882ej c0882ej = this.f5878p;
/* 31 */                    c0882ej.getClass();
/* 40 */                    if (!c0882ej.m3451c()) {
/* 42 */                        C1833kj c1833kj = kf3.f12732j;
/* 45 */                        c0882ej.m3470x(2, 9, c1833kj);
/* 52 */                        c2357x6.m9714g(c1833kj, zzco.zzl());
                            } else {
/* 62 */                        if (TextUtils.isEmpty("inapp")) {
/* 68 */                            zze.zzl("BillingClient", "Please provide a valid product type.");
/* 71 */                            C1833kj c1833kj2 = kf3.f12728f;
/* 75 */                            c0882ej.m3470x(50, 9, c1833kj2);
/* 82 */                            c2357x6.m9714g(c1833kj2, zzco.zzl());
/* 85 */                            return;
                                }
/* 113 */                       if (C0882ej.m3447h(new yd3(0, c0882ej, c2357x6), 30000L, new dp0(23, c0882ej, c2357x6), c0882ej.m3467u(), c0882ej.m3458l()) == null) {
/* 115 */                           C1833kj c1833kjM3456i = c0882ej.m3456i();
/* 121 */                           c0882ej.m3470x(25, 9, c1833kjM3456i);
/* 128 */                           c2357x6.m9714g(c1833kjM3456i, zzco.zzl());
                                }
                            }
                        }
                    }
                }

                @Override // com.supercell.titan.PurchaseManager
                public void doSignInAfterGoogleLogin() {
                }

                public PurchaseManager.ProductInfo getProductDetailsImplementation(String str) {
/* 7 */             PurchaseManager.ProductInfo productInfo = (PurchaseManager.ProductInfo) this.f5879q.get(str);
/* 9 */             Objects.toString(productInfo);
/* 12 */            return productInfo;
                }

                public boolean isBillingAvailable() {
/* 3 */             return this.f5878p.m3451c();
                }

                @Override // com.supercell.titan.PurchaseManager
                public void onDestroy() {
/* 1 */             super.onDestroy();
                }

                @Override // com.supercell.titan.PurchaseManager
                public void onPause() {
/* 1 */             super.onPause();
/* 5 */             this.f5885w = false;
                }

                @Override // com.supercell.titan.PurchaseManager
                public void onResume() {
/* 1 */             super.onResume();
/* 5 */             this.f5885w = true;
/* 7 */             m2742b(true);
                }
            }
