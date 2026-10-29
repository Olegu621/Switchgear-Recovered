            package com.pichillilorenzo.flutter_inappwebview_android.proxy;

            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.lang.reflect.Array;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.Executor;
            import p000.C1823k9;
            import p000.C1951n4;
            import p000.b73;
            import p000.d73;
            import p000.i13;
            import p000.jz1;
            import p000.lz1;
            import p000.mz1;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ProxyManager extends ChannelDelegateImpl {
                protected static final String LOG_TAG = "ProxyManager";
                public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_proxycontroller";
                public static lz1 proxyController;
                public InAppWebViewFlutterPlugin plugin;

                public ProxyManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 10 */            super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
/* 13 */            this.plugin = inAppWebViewFlutterPlugin;
                }

                private void clearProxyOverride(final MethodChannel.Result result) {
/* 1 */             lz1 lz1Var = proxyController;
/* 3 */             if (lz1Var != null) {
/* 7 */                 Executor executor = new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.3
                            @Override // java.util.concurrent.Executor
                            public void execute(Runnable runnable) {
/* 1 */                         runnable.run();
                            }
                        };
/* 12 */                Runnable runnable = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.4
                            @Override // java.lang.Runnable
                            public void run() {
/* 5 */                         result.success(Boolean.TRUE);
                            }
                        };
/* 15 */                mz1 mz1Var = (mz1) lz1Var;
/* 23 */                if (!b73.f2289E.mo97b()) {
/* 47 */                    throw b73.m1295a();
                        }
/* 27 */                if (mz1Var.f14075a == null) {
/* 35 */                    mz1Var.f14075a = d73.f7038a.getProxyController();
                        }
/* 39 */                mz1Var.f14075a.clearProxyOverride(runnable, executor);
                    }
                }

                public static void init() {
/* 3 */             if (proxyController == null && xe2.m9786x("PROXY_OVERRIDE")) {
/* 17 */                if (xe2.m9786x("PROXY_OVERRIDE")) {
/* 21 */                    proxyController = i13.f9402e;
                        } else {
/* 26 */                    C1951n4.m6866q("Proxy override not supported");
                        }
                    }
                }

                private void setProxyOverride(ProxySettings proxySettings, final MethodChannel.Result result) {
/* 3 */             if (proxyController != null) {
/* 7 */                 ArrayList arrayList = new ArrayList();
/* 12 */                ArrayList arrayList2 = new ArrayList();
/* 17 */                Iterator<String> it = proxySettings.bypassRules.iterator();
/* 25 */                while (it.hasNext()) {
/* 33 */                    arrayList2.add(it.next());
                        }
/* 39 */                Iterator<String> it2 = proxySettings.directs.iterator();
/* 47 */                while (it2.hasNext()) {
/* 62 */                    arrayList.add(new jz1(it2.next(), "direct://"));
                        }
/* 76 */                for (ProxyRuleExt proxyRuleExt : proxySettings.proxyRules) {
/* 88 */                    if (proxyRuleExt.getSchemeFilter() != null) {
/* 103 */                       arrayList.add(new jz1(proxyRuleExt.getSchemeFilter(), proxyRuleExt.getUrl()));
                            } else {
/* 118 */                       arrayList.add(new jz1("*", proxyRuleExt.getUrl()));
                            }
                        }
/* 122 */               Boolean bool = proxySettings.bypassSimpleHostnames;
/* 124 */               if (bool != null && bool.booleanValue()) {
/* 134 */                   arrayList2.add("<local>");
                        }
/* 137 */               Boolean bool2 = proxySettings.removeImplicitRules;
/* 139 */               if (bool2 != null && bool2.booleanValue()) {
/* 149 */                   arrayList2.add("<-loopback>");
                        }
/* 173 */               boolean zBooleanValue = (proxySettings.reverseBypassEnabled == null || !xe2.m9786x("PROXY_OVERRIDE_REVERSE_BYPASS")) ? false : proxySettings.reverseBypassEnabled.booleanValue();
/* 174 */               lz1 lz1Var = proxyController;
/* 178 */               Executor executor = new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.1
                            @Override // java.util.concurrent.Executor
                            public void execute(Runnable runnable) {
/* 1 */                         runnable.run();
                            }
                        };
/* 183 */               Runnable runnable = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.2
                            @Override // java.lang.Runnable
                            public void run() {
/* 5 */                         result.success(Boolean.TRUE);
                            }
                        };
/* 186 */               mz1 mz1Var = (mz1) lz1Var;
/* 188 */               mz1Var.getClass();
/* 191 */               C1823k9 c1823k9 = b73.f2289E;
/* 193 */               C1823k9 c1823k10 = b73.f2295K;
/* 195 */               List listUnmodifiableList = Collections.unmodifiableList(arrayList);
/* 218 */               String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, listUnmodifiableList.size(), 2);
/* 225 */               for (int i = 0; i < listUnmodifiableList.size(); i++) {
/* 237 */                   strArr[i][0] = ((jz1) listUnmodifiableList.get(i)).f12548a;
/* 249 */                   strArr[i][1] = ((jz1) listUnmodifiableList.get(i)).f12549b;
                        }
/* 265 */               String[] strArr2 = (String[]) Collections.unmodifiableList(arrayList2).toArray(new String[0]);
/* 271 */               if (c1823k9.mo97b() && !zBooleanValue) {
/* 277 */                   if (mz1Var.f14075a == null) {
/* 285 */                       mz1Var.f14075a = d73.f7038a.getProxyController();
                            }
/* 289 */                   mz1Var.f14075a.setProxyOverride(strArr, strArr2, runnable, executor);
                        } else {
/* 297 */                   if (!c1823k9.mo97b() || !c1823k10.mo97b()) {
/* 327 */                       throw b73.m1295a();
                            }
/* 307 */                   if (mz1Var.f14075a == null) {
/* 315 */                       mz1Var.f14075a = d73.f7038a.getProxyController();
                            }
/* 319 */                   mz1Var.f14075a.setProxyOverride(strArr, strArr2, runnable, executor, zBooleanValue);
                        }
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.plugin = null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             init();
/* 4 */             String str = methodCall.method;
/* 6 */             str.getClass();
/* 15 */            if (str.equals("clearProxyOverride")) {
/* 63 */                if (proxyController != null) {
/* 65 */                    clearProxyOverride(result);
/* 68 */                    return;
                        } else {
/* 71 */                    result.success(Boolean.FALSE);
/* 74 */                    return;
                        }
                    }
/* 23 */            if (!str.equals("setProxyOverride")) {
/* 25 */                result.notImplemented();
/* 28 */                return;
                    }
/* 31 */            if (proxyController == null) {
/* 57 */                result.success(Boolean.FALSE);
/* 60 */                return;
                    }
/* 39 */            HashMap map = (HashMap) methodCall.argument("settings");
/* 43 */            ProxySettings proxySettings = new ProxySettings();
/* 46 */            if (map != null) {
/* 48 */                proxySettings.parse2((Map<String, Object>) map);
                    }
/* 51 */            setProxyOverride(proxySettings, result);
                }
            }
