            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import com.appsflyer.AFLogger;
            import com.appsflyer.attribution.AppsFlyerRequestListener;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFe1dSDK extends AFe1fSDK<String> {
                private final String component2;
                private final AFc1oSDK equals;
                private final AFk1vSDK toString;

                public AFe1dSDK(AFd1zSDK aFd1zSDK, String str, AFk1vSDK aFk1vSDK) {
/* 11 */            super(AFe1pSDK.IMPRESSIONS, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, str);
/* 14 */            this.component2 = str;
/* 16 */            this.toString = aFk1vSDK;
/* 22 */            this.equals = aFd1zSDK.AFAdRevenueData();
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AFd1hSDK<String> AFAdRevenueData(String str) {
/* 1 */             AFd1nSDK aFd1nSDK = ((AFe1fSDK) this).component4;
/* 5 */             String strAreAllFieldsValid = this.equals.areAllFieldsValid();
/* 9 */             boolean monetizationNetwork = AFk1wSDK.getMonetizationNetwork(strAreAllFieldsValid);
/* 13 */            String string = this.component2;
/* 15 */            if (!monetizationNetwork) {
/* 36 */                string = Uri.parse(string).buildUpon().appendQueryParameter("advertising_id", strAreAllFieldsValid).build().toString();
                    }
/* 58 */            return (AFd1hSDK) AFd1nSDK.getMediationNetwork(new Object[]{aFd1nSDK, string}, 1535622589, -1535622589, System.identityHashCode(aFd1nSDK));
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final AppsFlyerRequestListener component2() {
/* 1 */             return null;
                }

                @Override // com.appsflyer.internal.AFe1fSDK
                public final boolean copydefault() {
/* 1 */             return false;
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final void getCurrencyIso4217Code() {
/* 1 */             super.getCurrencyIso4217Code();
/* 4 */             AFe1wSDK<Result> aFe1wSDK = ((AFe1fSDK) this).areAllFieldsValid;
/* 6 */             if (aFe1wSDK != 0) {
/* 8 */                 int statusCode = aFe1wSDK.getStatusCode();
/* 15 */                if (statusCode == 200) {
/* 142 */                   StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
/* 147 */                   sb.append(this.component2);
/* 154 */                   AFLogger.afInfoLog(sb.toString(), false);
/* 157 */                   return;
                        }
/* 19 */                if (statusCode != 301 && statusCode != 302) {
/* 29 */                    StringBuilder sb2 = new StringBuilder("call to ");
/* 34 */                    sb2.append(this.component2);
/* 39 */                    sb2.append(" failed: ");
/* 42 */                    sb2.append(statusCode);
/* 49 */                    AFLogger.afInfoLog(sb2.toString());
/* 52 */                    return;
                        }
/* 57 */                StringBuilder sb3 = new StringBuilder("Cross promotion redirection success: ");
/* 62 */                sb3.append(this.component2);
/* 69 */                AFLogger.afInfoLog(sb3.toString(), false);
/* 74 */                String revenue = aFe1wSDK.getRevenue("Location");
/* 78 */                AFk1vSDK aFk1vSDK = this.toString;
/* 80 */                if (aFk1vSDK == null || revenue == null) {
/* 157 */                   return;
                        }
/* 84 */                aFk1vSDK.getCurrencyIso4217Code = revenue;
/* 88 */                Context context = aFk1vSDK.getMonetizationNetwork.get();
/* 94 */                if (context != null) {
                            try {
/* 98 */                        if (aFk1vSDK.getCurrencyIso4217Code != null) {
/* 119 */                           context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFk1vSDK.getCurrencyIso4217Code)).setFlags(268435456));
                                }
                            } catch (Exception e) {
/* 134 */                       AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e)), e);
                            }
                        }
                    }
                }

                @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
                public final boolean getMonetizationNetwork() {
/* 1 */             return false;
                }
            }
