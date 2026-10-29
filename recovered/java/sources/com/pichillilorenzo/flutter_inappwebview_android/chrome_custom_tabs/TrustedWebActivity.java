            package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

            import android.content.Intent;
            import android.graphics.Color;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.IBinder;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Map;
            import p000.C1951n4;
            import p000.bs2;
            import p000.cs2;
            import p000.ds2;
            import p000.i30;
            import p000.o30;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class TrustedWebActivity extends ChromeCustomTabsActivity {
                protected static final String LOG_TAG = "TrustedWebActivity";
                public ds2 builder;

                private void prepareCustomTabs() {
/* 3 */             String str = this.customSettings.toolbarBackgroundColor;
/* 7 */             Integer numValueOf = null;
/* 30 */            Integer numValueOf2 = (str == null || str.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.toolbarBackgroundColor) | (-16777216));
/* 33 */            String str2 = this.customSettings.navigationBarColor;
/* 57 */            Integer numValueOf3 = (str2 == null || str2.isEmpty()) ? null : Integer.valueOf((-16777216) | Color.parseColor(this.customSettings.navigationBarColor));
/* 60 */            String str3 = this.customSettings.navigationBarDividerColor;
/* 83 */            Integer numValueOf4 = (str3 == null || str3.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.navigationBarDividerColor));
/* 86 */            String str4 = this.customSettings.secondaryToolbarColor;
/* 88 */            if (str4 != null && !str4.isEmpty()) {
/* 104 */               numValueOf = Integer.valueOf(Color.parseColor(this.customSettings.secondaryToolbarColor));
                    }
/* 110 */           i30 i30Var = this.builder.f7399b;
/* 112 */           i30Var.getClass();
/* 117 */           Bundle bundle = new Bundle();
/* 120 */           if (numValueOf2 != null) {
/* 128 */               bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", numValueOf2.intValue());
                    }
/* 131 */           if (numValueOf != null) {
/* 139 */               bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", numValueOf.intValue());
                    }
/* 142 */           if (numValueOf3 != null) {
/* 150 */               bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", numValueOf3.intValue());
                    }
/* 153 */           if (numValueOf4 != null) {
/* 161 */               bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", numValueOf4.intValue());
                    }
/* 164 */           i30Var.f9436e = bundle;
/* 168 */           List<String> list = this.customSettings.additionalTrustedOrigins;
/* 170 */           if (list != null && !list.isEmpty()) {
/* 184 */               this.builder.f7400c = this.customSettings.additionalTrustedOrigins;
                    }
/* 186 */           ChromeCustomTabsSettings chromeCustomTabsSettings = this.customSettings;
/* 188 */           bs2 bs2Var = chromeCustomTabsSettings.displayMode;
/* 190 */           if (bs2Var != null) {
/* 194 */               this.builder.f7401d = bs2Var;
                    }
/* 204 */           this.builder.f7402e = chromeCustomTabsSettings.screenOrientation.intValue();
                }

                private void prepareCustomTabsIntent(cs2 cs2Var) {
/* 1 */             Intent intent = cs2Var.f6899a;
/* 5 */             String str = this.customSettings.packageName;
/* 7 */             if (str != null) {
/* 9 */                 intent.setPackage(str);
                    } else {
/* 17 */                intent.setPackage(CustomTabsHelper.getPackageNameToUse(this));
                    }
/* 28 */            if (this.customSettings.keepAliveEnabled.booleanValue()) {
/* 30 */                CustomTabsHelper.addKeepAliveExtra(this, intent);
                    }
/* 41 */            if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
/* 43 */                if (intent == null) {
/* 49 */                    intent = new Intent("android.intent.action.VIEW");
                        }
/* 54 */                intent.addFlags(268435456);
/* 60 */                intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity
                public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
/* 3 */             if (this.customTabsSession == null) {
/* 5 */                 return;
                    }
/* 6 */             Uri uri = Uri.parse(str);
/* 10 */            mayLaunchUrl(str, list);
/* 18 */            this.builder = new ds2(uri);
/* 20 */            prepareCustomTabs();
/* 23 */            ds2 ds2Var = this.builder;
/* 25 */            o30 o30Var = this.customTabsSession;
/* 27 */            i30 i30Var = ds2Var.f7399b;
/* 29 */            if (o30Var == null) {
/* 142 */               C1951n4.m6868s("CustomTabsSession is required for launching a TWA");
/* 145 */               return;
                    }
/* 31 */            Intent intent = i30Var.f9432a;
/* 39 */            intent.setPackage(o30Var.f14602d.getPackageName());
/* 44 */            IBinder iBinderAsBinder = o30Var.f14601c.asBinder();
/* 50 */            Bundle bundle = new Bundle();
/* 55 */            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinderAsBinder);
/* 58 */            intent.putExtras(bundle);
/* 65 */            Intent intent2 = i30Var.m4451a().f12036a;
/* 69 */            intent2.setData(ds2Var.f7398a);
/* 75 */            intent2.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
/* 80 */            if (ds2Var.f7400c != null) {
/* 91 */                intent2.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(ds2Var.f7400c));
                    }
/* 94 */            List list2 = Collections.EMPTY_LIST;
/* 104 */           intent2.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", ds2Var.f7401d.mo1159c());
/* 111 */           intent2.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", ds2Var.f7402e);
/* 116 */           cs2 cs2Var = new cs2(intent2);
/* 119 */           prepareCustomTabsIntent(cs2Var);
/* 136 */           CustomTabActivityHelper.openTrustedWebActivity(this, cs2Var, uri, map, str2 != null ? Uri.parse(str2) : null, 100);
                }
            }
