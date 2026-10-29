            package com.appsflyer.internal;

            import kotlin.jvm.internal.Intrinsics;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFe1ySDK {
                final String getCurrencyIso4217Code;
                final String getMonetizationNetwork;

                public AFe1ySDK(String str, String str2) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 10 */            this.getMonetizationNetwork = str;
/* 12 */            this.getCurrencyIso4217Code = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof AFe1ySDK)) {
/* 7 */                 return false;
                    }
/* 11 */            AFe1ySDK aFe1ySDK = (AFe1ySDK) obj;
                    return Intrinsics.m6216a(this.getMonetizationNetwork, aFe1ySDK.getMonetizationNetwork) && Intrinsics.m6216a(this.getCurrencyIso4217Code, aFe1ySDK.getCurrencyIso4217Code);
                }

                public final int hashCode() {
/* 15 */            return this.getCurrencyIso4217Code.hashCode() + (this.getMonetizationNetwork.hashCode() * 31);
                }

                public final String toString() {
/* 11 */            return fm0.m3785k("HostConfig(prefix=", this.getMonetizationNetwork, ", host=", this.getCurrencyIso4217Code, ")");
                }
            }
