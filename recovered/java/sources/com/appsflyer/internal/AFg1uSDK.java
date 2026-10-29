            package com.appsflyer.internal;

            import android.content.Context;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface AFg1uSDK {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class AFa1zSDK {
                    final String AFAdRevenueData;
                    final float getMonetizationNetwork;

                    public AFa1zSDK(float f, String str) {
/* 4 */                 this.getMonetizationNetwork = f;
/* 6 */                 this.AFAdRevenueData = str;
                    }

                    public final boolean equals(Object obj) {
/* 2 */                 if (this == obj) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(obj instanceof AFa1zSDK)) {
/* 7 */                     return false;
                        }
/* 11 */                AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
                        return Float.compare(this.getMonetizationNetwork, aFa1zSDK.getMonetizationNetwork) == 0 && Intrinsics.m6216a(this.AFAdRevenueData, aFa1zSDK.AFAdRevenueData);
                    }

                    public final int hashCode() {
/* 7 */                 int iHashCode = Float.hashCode(this.getMonetizationNetwork) * 31;
/* 9 */                 String str = this.AFAdRevenueData;
/* 19 */                return iHashCode + (str == null ? 0 : str.hashCode());
                    }

                    public final String toString() {
/* 28 */                return "BatteryData(level=" + this.getMonetizationNetwork + ", charging=" + this.AFAdRevenueData + ")";
                    }
                }

                AFa1zSDK getCurrencyIso4217Code(Context context);
            }
