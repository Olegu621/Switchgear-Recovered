            package com.google.android.recaptcha.internal;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import android.net.NetworkCapabilities;
            import android.os.Build;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            import kotlin.Pair;
            import p000.oc1;
            import p000.qd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzch {
                public zzch() {
/* 6 */             new ConcurrentHashMap();
/* 9 */             zzb();
                }

                public static final Set zza(Context context) {
                    try {
/* 3 */                 LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 8 */                 Object systemService = context.getSystemService("connectivity");
/* 12 */                systemService.getClass();
/* 15 */                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
/* 21 */                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
/* 26 */                if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
/* 36 */                    linkedHashSet.add(zzvs.TRANSPORT_WIFI);
                        }
/* 39 */                if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
/* 50 */                    linkedHashSet.add(zzvs.TRANSPORT_CELLULAR);
                        }
/* 53 */                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
/* 64 */                    linkedHashSet.add(zzvs.TRANSPORT_VPN);
                        }
/* 67 */                if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
/* 78 */                    linkedHashSet.add(zzvs.TRANSPORT_ETHERNET);
                        }
/* 81 */                if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
/* 93 */                    linkedHashSet.add(zzvs.NET_CAPABILITY_VALIDATED);
                        }
/* 96 */                return linkedHashSet;
                    } catch (Exception unused) {
/* 97 */                return qd0.f15493a;
                    }
                }

                private static final Map zzb() {
/* 217 */           LinkedHashMap linkedHashMapM7132f = oc1.m7132f(new Pair(0, zzvs.NET_CAPABILITY_MMS), new Pair(1, zzvs.NET_CAPABILITY_SUPL), new Pair(2, zzvs.NET_CAPABILITY_DUN), new Pair(3, zzvs.NET_CAPABILITY_FOTA), new Pair(4, zzvs.NET_CAPABILITY_IMS), new Pair(5, zzvs.NET_CAPABILITY_CBS), new Pair(6, zzvs.NET_CAPABILITY_WIFI_P2P), new Pair(7, zzvs.NET_CAPABILITY_IA), new Pair(8, zzvs.NET_CAPABILITY_RCS), new Pair(9, zzvs.NET_CAPABILITY_XCAP), new Pair(10, zzvs.NET_CAPABILITY_EIMS), new Pair(11, zzvs.NET_CAPABILITY_NOT_METERED), new Pair(12, zzvs.NET_CAPABILITY_INTERNET), new Pair(13, zzvs.NET_CAPABILITY_NOT_RESTRICTED), new Pair(14, zzvs.NET_CAPABILITY_TRUSTED), new Pair(15, zzvs.NET_CAPABILITY_NOT_VPN));
/* 229 */           linkedHashMapM7132f.put(17, zzvs.NET_CAPABILITY_CAPTIVE_PORTAL);
/* 240 */           linkedHashMapM7132f.put(16, zzvs.NET_CAPABILITY_VALIDATED);
/* 243 */           int i = Build.VERSION.SDK_INT;
/* 247 */           if (i >= 28) {
/* 257 */               linkedHashMapM7132f.put(18, zzvs.NET_CAPABILITY_NOT_ROAMING);
/* 268 */               linkedHashMapM7132f.put(19, zzvs.NET_CAPABILITY_FOREGROUND);
/* 279 */               linkedHashMapM7132f.put(20, zzvs.NET_CAPABILITY_NOT_CONGESTED);
/* 290 */               linkedHashMapM7132f.put(21, zzvs.NET_CAPABILITY_NOT_SUSPENDED);
                    }
/* 295 */           if (i >= 29) {
/* 305 */               linkedHashMapM7132f.put(23, zzvs.NET_CAPABILITY_MCX);
                    }
/* 310 */           if (i >= 30) {
/* 320 */               linkedHashMapM7132f.put(25, zzvs.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
                    }
/* 325 */           if (i >= 31) {
/* 335 */               linkedHashMapM7132f.put(32, zzvs.NET_CAPABILITY_HEAD_UNIT);
/* 344 */               linkedHashMapM7132f.put(29, zzvs.NET_CAPABILITY_ENTERPRISE);
                    }
/* 349 */           if (i >= 33) {
/* 359 */               linkedHashMapM7132f.put(35, zzvs.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
/* 370 */               linkedHashMapM7132f.put(34, zzvs.NET_CAPABILITY_PRIORITIZE_LATENCY);
/* 379 */               linkedHashMapM7132f.put(33, zzvs.NET_CAPABILITY_MMTEL);
                    }
/* 382 */           return linkedHashMapM7132f;
                }
            }
