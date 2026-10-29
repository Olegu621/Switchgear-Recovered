            package com.supercell.p007id.scid_plugin;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import com.google.android.gms.internal.play_billing.zze;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.AbstractC0846dj;
            import p000.C0218cj;
            import p000.C0882ej;
            import p000.C0956gj;
            import p000.C1833kj;
            import p000.C2076pn;
            import p000.InterfaceC0919fj;
            import p000.ds0;
            import p000.ec0;
            import p000.kf3;
            import p000.m42;
            import p000.o42;
            import p000.ol3;
            import p000.yd3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/PlayStoreCountryObserver;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/content/Context;", "context", "Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;", "callback", "<init>", "(Landroid/content/Context;Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;)V", HttpUrl.FRAGMENT_ENCODE_SET, "isPlayStoreInstalled", "(Landroid/content/Context;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "queryBillingConfig", "(Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;)V", "disconnect", "()V", "Landroid/content/Context;", "Lcom/supercell/id/scid_plugin/PlayStoreCountryCallback;", "Ldj;", "billingClient", "Ldj;", "Companion", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class PlayStoreCountryObserver {
                private static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
                private AbstractC0846dj billingClient;
                private final PlayStoreCountryCallback callback;
                private final Context context;

                public PlayStoreCountryObserver(Context context, PlayStoreCountryCallback playStoreCountryCallback) {
/* 1 */             context.getClass();
/* 4 */             playStoreCountryCallback.getClass();
/* 10 */            this.context = context;
/* 12 */            this.callback = playStoreCountryCallback;
/* 18 */            if (!isPlayStoreInstalled(context)) {
/* 81 */                playStoreCountryCallback.onError("ScidPlugin: Can't retrieve AppStore country as Google play store is not installed");
/* 84 */                return;
                    }
                    try {
/* 22 */                C0218cj c0218cj = new C0218cj(context);
/* 32 */                c0218cj.f2932b = new ec0(23);
/* 41 */                c0218cj.f2933c = new ds0(20);
/* 43 */                C0882ej c0882ejM1696a = c0218cj.m1696a();
/* 47 */                this.billingClient = c0882ejM1696a;
/* 54 */                c0882ejM1696a.mo3455g(new InterfaceC0919fj() { // from class: com.supercell.id.scid_plugin.PlayStoreCountryObserver.2
                            @Override // p000.InterfaceC0919fj
                            public void onBillingServiceDisconnected() {
                            }

                            @Override // p000.InterfaceC0919fj
                            public void onBillingSetupFinished(C1833kj billingResult) {
/* 1 */                         billingResult.getClass();
/* 4 */                         int i = billingResult.f12818a;
/* 6 */                         PlayStoreCountryObserver playStoreCountryObserver = PlayStoreCountryObserver.this;
/* 8 */                         if (i == 0) {
/* 1 */                             playStoreCountryObserver.queryBillingConfig(playStoreCountryObserver.callback);
/* 17 */                            return;
                                }
/* 38 */                        playStoreCountryObserver.callback.onError("Failed to set up billingClient: " + billingResult.f12819b);
                            }
                        });
                    } catch (Exception e) {
/* 75 */                this.callback.onError("ScidPlugin: Failed to get app store country " + e);
                    }
                }

                private final boolean isPlayStoreInstalled(Context context) {
                    try {
/* 12 */                ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(GOOGLE_PLAY_STORE_PACKAGE, 0).applicationInfo;
/* 14 */                if (applicationInfo != null) {
/* 16 */                    return applicationInfo.enabled;
                        }
/* 1 */                 return false;
                    } catch (PackageManager.NameNotFoundException unused) {
/* 1 */                 return false;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void queryBillingConfig(PlayStoreCountryCallback callback) {
/* 1 */             AbstractC0846dj abstractC0846dj = this.billingClient;
/* 3 */             if (abstractC0846dj != null) {
/* 9 */                 C2076pn c2076pn = new C2076pn(9, callback, this);
/* 12 */                C0882ej c0882ej = (C0882ej) abstractC0846dj;
/* 23 */                if (!c0882ej.m3451c()) {
/* 27 */                    zze.zzl("BillingClient", "Service disconnected.");
/* 30 */                    C1833kj c1833kj = kf3.f12732j;
/* 33 */                    c0882ej.m3470x(2, 13, c1833kj);
/* 36 */                    c2076pn.m7497g(c1833kj, null);
/* 39 */                    return;
                        }
/* 42 */                if (!c0882ej.f7723s) {
/* 46 */                    zze.zzl("BillingClient", "Current client doesn't support get billing config.");
/* 49 */                    C1833kj c1833kj2 = kf3.f12738p;
/* 53 */                    c0882ej.m3470x(32, 13, c1833kj2);
/* 56 */                    c2076pn.m7497g(c1833kj2, null);
/* 59 */                    return;
                        }
/* 87 */                if (C0882ej.m3447h(new yd3(4, c0882ej, c2076pn), 30000L, new ol3(c0882ej, c2076pn, 6, false), c0882ej.m3467u(), c0882ej.m3458l()) == null) {
/* 89 */                    C1833kj c1833kjM3456i = c0882ej.m3456i();
/* 95 */                    c0882ej.m3470x(25, 13, c1833kjM3456i);
/* 98 */                    c2076pn.m7497g(c1833kjM3456i, null);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void queryBillingConfig$lambda$1(PlayStoreCountryCallback playStoreCountryCallback, PlayStoreCountryObserver playStoreCountryObserver, C1833kj c1833kj, C0956gj c0956gj) {
/* 1 */             c1833kj.getClass();
/* 6 */             if (c1833kj.f12818a == 0) {
/* 14 */                playStoreCountryCallback.onCountryRetrieved(c0956gj != null ? c0956gj.f8631a : null);
/* 17 */                playStoreCountryObserver.disconnect();
                    } else {
/* 37 */                playStoreCountryCallback.onError("Failed to retrieve billing config: " + c1833kj.f12819b);
                    }
                }

                public final void disconnect() {
                    try {
/* 1 */                 m42 m42Var = o42.f14612b;
/* 3 */                 AbstractC0846dj abstractC0846dj = this.billingClient;
/* 5 */                 if (abstractC0846dj != null) {
/* 7 */                     abstractC0846dj.mo3135a();
                        }
                    } catch (Throwable unused) {
/* 11 */                m42 m42Var2 = o42.f14612b;
                    }
/* 14 */            this.billingClient = null;
                }
            }
